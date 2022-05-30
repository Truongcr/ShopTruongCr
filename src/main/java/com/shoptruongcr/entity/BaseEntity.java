package com.shoptruongcr.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity {

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="CREATED_ON")
    private LocalDateTime createdOn;

    @Column(name="MODIFIED_BY")
    private String modifiedBy;

    @Column(name="MODIFIED_ON")
    private LocalDateTime modifiedOn;

    @Column(name="IS_DELETED")
    private String isDeleted;
}
