package com.shoptruongcr.model.request;

import com.shoptruongcr.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColorRequestDTO extends BaseDTO {

    private Long colorNo;
    private String colorCode;
    private String colorName;
    private String image;
}
