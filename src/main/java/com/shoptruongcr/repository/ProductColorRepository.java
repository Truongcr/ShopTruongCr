package com.shoptruongcr.repository;

import com.shoptruongcr.entity.product.Product;
import com.shoptruongcr.entity.product.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ProductColorRepository extends JpaRepository<ProductColor,Long> {
    @Query("Select pc from ProductColor pc where pc.product.productNo = :productNo"
    )
    List<ProductColor> findAllByProductNo(Long productNo);

//
    @Query("Select pc" +
            " from ProductColor pc" +
            " where pc.product.productNo = :productNo" +
            " and pc.colorNo = :colorNo"
    )
    Optional<ProductColor> findAllByProductNoAndColorNo(Long productNo, Long colorNo);
//
//    @Query(" select pc from ProductColor pc where pc.product.productNo = (:productNo) limit 1"
//    )
//    ProductColor findByProductNo(Long productNo);
}
