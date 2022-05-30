package com.shoptruongcr.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseDTO {

    private LocalDateTime createdOn;
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime modifiedOn;
    private String isDeleted;
}
