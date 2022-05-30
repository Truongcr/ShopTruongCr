package com.shoptruongcr.entity;


//import com.shoptruongcr.entity.product.Product;
//import com.shoptruongcr.entity.product.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TYPE")
@Getter
@Setter
public class Type extends BaseEntity{

    @Column(name = "TYPE_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeNo;

    @Column(name="TYPE_CODE")
    private String typeCode;

    @Column(name="TYPE_NAME")
    private String typeName;

}
