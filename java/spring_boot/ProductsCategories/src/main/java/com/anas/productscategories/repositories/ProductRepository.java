package com.anas.productscategories.repositories;


import com.anas.productscategories.models.Category;
import com.anas.productscategories.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{


    @Query("SELECT p.categories  FROM Product p where p.id = :id")
    List<Category> findCategoriesByProductId(@Param("id") Long id);

    @Query("SELECT c FROM Category c WHERE c NOT IN " + "(SELECT p.categories FROM Product WHERE p.id = :id)")
    List<Category> findCategoriesNotInProductId(@Param("id") Long id);

}
