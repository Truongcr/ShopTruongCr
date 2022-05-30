package com.shoptruongcr.model;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO extends BaseDTO{

    private Long typeNo;
    private Long categoryNo;
    private Long colorNo;
    private String typeName;
    private String categoryName;
    private String colorName;
    private BigDecimal price;
}
