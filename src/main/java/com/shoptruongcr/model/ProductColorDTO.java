package com.shoptruongcr.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductColorDTO {

    private Long colorNo;
    private String colorCode;
    private String colorName;
    private String image;
}
