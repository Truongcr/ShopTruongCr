package com.shoptruongcr.entity;

import com.shoptruongcr.entity.product.Product;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CART")
public class Cart extends BaseEntity{

    @Column(name = "CART_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_NO")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="CART_PRODUCT",
            joinColumns = @JoinColumn(name = "CART_NO"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_NO"))
    private Set<Product> productEntitySet = new HashSet<>();

}
