package com.shoptruongcr.model.request;

import com.shoptruongcr.model.BaseDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryRequestDTO extends BaseDTO {

    private Long categoryNo;
    private String categoryCode;
    private String categoryName;
}
