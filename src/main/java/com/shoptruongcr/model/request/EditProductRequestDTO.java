package com.shoptruongcr.model.request;

import com.shoptruongcr.entity.Category;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditProductRequestDTO {
    private Long productNo;
    private String productCode;
    private String productName;
    private String productContent;
    private String categoryName;
    private Long colorNo;
    private String colorName;
    private String image;
    private Long typeNo;
    private String typeName;
    private BigDecimal price;
    private String createdBy;
}
