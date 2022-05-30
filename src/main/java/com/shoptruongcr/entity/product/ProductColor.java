package com.shoptruongcr.entity.product;

import com.shoptruongcr.entity.Category;
import com.shoptruongcr.entity.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="product_color")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_color_no")
    private Long productColorNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_no")
    private Product product;

    @Column(name="color_no")
    private Long colorNo;

    @Column(name = "image")
    private String image;

    @Column(name = "color_name")
    private String colorName;
}
