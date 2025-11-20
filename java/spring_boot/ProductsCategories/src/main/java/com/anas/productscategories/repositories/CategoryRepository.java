package com.anas.productscategories.repositories;


import com.anas.productscategories.models.Category;
import com.anas.productscategories.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{


    List<Category> findByproductsNotContaining(Product product);


    List<Category> findByproductsContaining(Product product);

    
}
