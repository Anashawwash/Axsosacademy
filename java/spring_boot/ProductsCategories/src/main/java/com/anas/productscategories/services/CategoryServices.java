package com.anas.productscategories.services;


import com.anas.productscategories.models.Category;
import com.anas.productscategories.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepo;



    public void saveProduct(Category category){
        categoryRepo.save(category);
    }


    public Iterable<Category> getAllCategories(){
        return categoryRepo.findAll();
    }
}

