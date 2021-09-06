package com.hatanaka.ecommerce.checkout.service;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import com.hatanaka.ecommerce.checkout.repository.CheckoutRepository;
import com.hatanaka.ecommerce.checkout.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    // private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        // checkoutRepository.
        return Optional.empty();
    }
}
