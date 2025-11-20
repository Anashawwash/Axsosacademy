package com.anas.productscategories.services;

import com.anas.productscategories.models.Category;
import com.anas.productscategories.models.Product;
import com.anas.productscategories.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepo;




    public void saveProduct(Product product){
        productRepo.save(product);
    }


    public Iterable<Product> getAllProducts(){
        return productRepo.findAll();
    }


    public Product getProduct(Long id){
        return productRepo.findById(id).get();
    }

}
