package com.shoptruongcr.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryTypeColorPriceDTO {
    private String categoryName;
    private String typeName;
    private String colorName;
    private BigDecimal price;
}
