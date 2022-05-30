package com.shoptruongcr.model.response;

import com.shoptruongcr.model.BaseDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeResponseDTO extends BaseDTO {

    private String typeCode;
    private String typeName;
}
