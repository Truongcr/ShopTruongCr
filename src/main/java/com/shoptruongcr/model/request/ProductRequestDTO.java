package com.shoptruongcr.model.request;

import com.shoptruongcr.dto.CategoryDTO;
import com.shoptruongcr.entity.Category;
import com.shoptruongcr.model.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequestDTO extends BaseDTO {
    private Long productNo;
    private String productCode;
    private String productName;
    private String productContent;
    private CategoryRequestDTO category;
    private List<ProductColorDTO> productColorDTOList;
    private List<ProductTypeDTO> productTypeDTOList;

}