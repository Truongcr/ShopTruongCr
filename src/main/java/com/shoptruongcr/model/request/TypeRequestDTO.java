package com.shoptruongcr.model.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeRequestDTO {

    private Long typeNo;
    private String typeCode;
    private String typeName;
}
