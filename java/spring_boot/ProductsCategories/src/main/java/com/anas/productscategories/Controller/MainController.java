package com.anas.productscategories.Controller;


import com.anas.productscategories.models.Category;
import com.anas.productscategories.models.Product;
import com.anas.productscategories.services.CategoryServices;
import com.anas.productscategories.services.ProductServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    CategoryServices categoryServ;

    @Autowired
    ProductServices productServ;


    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("products",productServ.getAllProducts());
        model.addAttribute("categories",categoryServ.getAllCategories());
        return "home.jsp";
    }


    @GetMapping("/addProduct")
    public String NewProduct(@ModelAttribute("product") Product product){
        return "product.jsp";
    }


    @PostMapping("/products/new")
    public String newProduct(@Valid @ModelAttribute("product") Product product, BindingResult result){
        if (result.hasErrors()){
            return "product.jsp";
        }
        else{
            productServ.saveProduct(product);
            return "redirect:/";
        }
    }


    @GetMapping("/addcategory")
    public String addCategory(@ModelAttribute("category")Category category){
        return "Category.jsp";
    }


    @PostMapping("/category/new")
    public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult result){
        if (result.hasErrors()){
            return "category.jsp";
        }
        else{
            categoryServ.saveCategory(category);
            return "redirect:/";
        }
    }


    @GetMapping("/products/{id}")
    public String doProducts(@PathVariable("id")Long id ,Model model){
        model.addAttribute("product",productServ.getProduct(id));
        model.addAttribute("categoriesNot",categoryServ.getAllCategoryForNotBroduct(productServ.getProduct(id)));
        model.addAttribute("categories",categoryServ.getAllCategoryForBroduct(productServ.getProduct(id)));
        return "productPage.jsp";
    }


    @PostMapping("/products/{id}/addCategory")
    public String addCategoryForItem(@PathVariable("id") Long id, @RequestParam("category") Long Cat_id,Model model){
        model.addAttribute("categoriesNot",categoryServ.getAllCategoryForNotBroduct(productServ.getProduct(id)));
        model.addAttribute("categories",categoryServ.getAllCategoryForBroduct(productServ.getProduct(id)));
        model.addAttribute("product",productServ.getProduct(id));
        if (Cat_id == 0){
            return "productPage.jsp";
        }
        else{
        Category cat = categoryServ.getCategoryById(Cat_id);
        Product trueProduct = productServ.getProduct(id);
        trueProduct.getCategories().add(cat);
        productServ.saveProduct(trueProduct);
        return "redirect:/products/"+ id ;
        }
    }


    @GetMapping("/category/{id}")
    public String doCroduct(@PathVariable("id")Long id,Model model){
        Category category = categoryServ.getCategoryById(id);
        model.addAttribute("category",category);
        model.addAttribute("productnot",productServ.getAllProductNotForCategory(category));
        model.addAttribute("product",productServ.getAllProductForCategory(category));
        return "CategoryPage.jsp";

    }


    @PostMapping("/category/{id}/addProduct")
    public String addProductToCategory(@PathVariable("id") Long id , Model model , @RequestParam("product") Long Pro_id){
        Category category = categoryServ.getCategoryById(id);
        model.addAttribute("category",category);
        model.addAttribute("productnot",productServ.getAllProductNotForCategory(category));
        model.addAttribute("product",productServ.getAllProductForCategory(category));
        if (Pro_id == 0){
            return "CategoryPage.jsp";
        }
        else{
            Product product = productServ.getProduct(id);
            category.getProducts().add(product);
            categoryServ.saveCategory(category);
            return "redirect:/category/"+ id ;
        }

    }
}
