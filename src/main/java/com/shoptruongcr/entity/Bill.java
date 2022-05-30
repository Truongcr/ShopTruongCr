package com.shoptruongcr.entity;

import javax.persistence.*;

@Entity
@Table(name="BILL")
public class Bill extends BaseEntity {

    @Column(name = "BILL_NO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billNo;

    @Column(name = "BILL_CODE")
    private String billCode;

    @Column(name = "CONTENT")
    private String content;

}
