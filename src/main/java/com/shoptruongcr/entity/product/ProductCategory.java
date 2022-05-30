//package com.shoptruongcr.entity.product;
//
//import com.shoptruongcr.entity.BaseEntity;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name  = "product_category")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProductCategory extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "product_category_no")
//    private Long productCategoryNo;
//
//    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
//    private List<Product> product;
//
//    @Column(name="category_no")
//    private Long categoryNo;
//
//}
