package com.shoptruongcr.model.response;

import com.shoptruongcr.model.BaseDTO;
import com.shoptruongcr.model.CategoryTypeColorPriceDTO;
import com.shoptruongcr.model.ProductColorDTO;
import com.shoptruongcr.model.ProductTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO extends BaseDTO {
    private Long productNo;
    private String productCode;
    private String productName;
    private String productContent;
    private String categoryName;
    private String colorName;
    private String image;
    private String typeName;
    private BigDecimal price;
}
