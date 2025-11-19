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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
            categoryServ.saveProduct(category);
            return "redirect:/";
        }
    }





}
