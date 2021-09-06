package com.hatanaka.ecommerce.checkout.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;
}
