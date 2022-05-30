package com.shoptruongcr.model;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductTypeDTO {
    private Long typeNo;
    private String typeCode;
    private String typeName;
    private BigDecimal price;
}
