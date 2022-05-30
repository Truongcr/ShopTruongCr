package com.shoptruongcr.entity.product;

import com.shoptruongcr.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="PRODUCT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCT_NO")
    private Long productNo;

    @Column(name="PRODUCT_CODE")
    private String productCode;

    @Column(name="PRODUCT_NAME")
    private String productName;

    @Column(name="PRICE")
    private String price;

    @Column(name="PRODUCT_CONTENT")
    private String productContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_no")
    private Category category;

    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private List<ProductColor> productColorList;

    @OneToMany(mappedBy = "product" , fetch = FetchType.LAZY)
    private List<ProductType> productTypeList;


}
