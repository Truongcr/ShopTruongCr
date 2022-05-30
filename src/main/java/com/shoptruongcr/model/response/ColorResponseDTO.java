package com.shoptruongcr.model.response;

import com.shoptruongcr.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColorResponseDTO extends BaseDTO {

    private String colorCode;
    private String colorName;
    private String image;

}
