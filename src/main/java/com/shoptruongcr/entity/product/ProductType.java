package com.shoptruongcr.entity.product;

import com.shoptruongcr.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name="product_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_type_no")
    private Long productTypeNo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_no")
    private Product product;

    @Column(name="type_name")
    private String typeName;

    @Column(name="type_no")
    private Long typeNo;

    @Column(name="price")
    private BigDecimal price;
}
