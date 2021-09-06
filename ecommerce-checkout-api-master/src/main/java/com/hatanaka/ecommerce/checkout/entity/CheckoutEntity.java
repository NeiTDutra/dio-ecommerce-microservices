package com.hatanaka.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
public class CheckoutEntity {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String code;
}
