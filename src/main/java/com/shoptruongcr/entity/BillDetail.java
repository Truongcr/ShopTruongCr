package com.shoptruongcr.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "BILL_DETAIL")
public class BillDetail extends BaseEntity{

    @Column(name = "BILL_DETAIL_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billDetailNo;

    @Column(name = "BILL_DETAIL_CODE")
    private String billDetailCode;

    @Column(name = "DESCRIPTION")
    private String description;
}
