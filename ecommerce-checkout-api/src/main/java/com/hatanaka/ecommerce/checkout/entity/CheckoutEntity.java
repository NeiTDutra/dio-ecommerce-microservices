package com.hatanaka.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@NoArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public enum Status {
        CREATED,
        APROVED
    }
}
