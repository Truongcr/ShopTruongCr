package com.shoptruongcr.repository;

import com.shoptruongcr.entity.product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {

    @Query("select pt " +
            "from ProductType pt " +
            "where pt.product.productNo = :productNo")
    List<ProductType> findAllByProductNo(long productNo);

    @Query("select pt " +
            " from ProductType pt" +
            " where pt.product.productNo = :productNo" +
            " and pt.typeNo = :typeNo"
    )
    Optional<ProductType> findAllByProductNoAndTypeNo(Long productNo , Long typeNo);


    //
//    ProductType findByProductNo(Long productNo);
}
