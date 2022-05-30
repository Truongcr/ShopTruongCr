package com.shoptruongcr.repository;

import com.shoptruongcr.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("select p from Product p where p.productCode = :productCode")
    Product findByProductCode(String productCode);
}
