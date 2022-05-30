package com.shoptruongcr.model.response;

import com.shoptruongcr.model.BaseDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponseDTO extends BaseDTO {

    private String categoryCode;
    private String categoryName;
}
