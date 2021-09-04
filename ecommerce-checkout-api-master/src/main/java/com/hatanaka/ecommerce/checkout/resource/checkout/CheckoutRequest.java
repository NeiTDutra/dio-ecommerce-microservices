package com.hatanaka.ecommerce.checkout.resource.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String address;
    private String address2;
    private String country;
    private String state;
    private String zip;
    private Boolean sameAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String ccName;
    private String ccNumber;
    private String ccExpiration;
    private String ccCvv;
}
