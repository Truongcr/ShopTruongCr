package com.shoptruongcr.entity;

import com.shoptruongcr.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="category")
@Getter
@Setter
public class Category extends BaseEntity{

    @Column(name = "category_no")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryNo;

    @Column(name = "CATEGORY_CODE")
    private String categoryCode;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY)
    private List<Product> product;

}
