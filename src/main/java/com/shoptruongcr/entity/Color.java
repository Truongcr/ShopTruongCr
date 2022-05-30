package com.shoptruongcr.entity;

//import com.shoptruongcr.entity.product.Product;
//import com.shoptruongcr.entity.product.ProductCategory;
//import com.shoptruongcr.entity.product.ProductColor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table
@Entity(name = "COLOR")
@Getter
@Setter
public class Color extends BaseEntity{

    @Column(name = "COLOR_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long colorNo;

    @Column(name = "COLOR_CODE")
    private String colorCode;

    @Column(name = "COLOR_NAME")
    private String colorName;

    @Column(name = "COLOR_IMAGE")
    private String image;

//    @OneToMany(mappedBy = "color" , fetch = FetchType.LAZY)
//    private List<ProductColor> productColorList;

}
