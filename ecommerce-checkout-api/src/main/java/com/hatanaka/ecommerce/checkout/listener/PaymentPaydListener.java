package com.hatanaka.ecommerce.checkout.listener;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import com.hatanaka.ecommerce.checkout.repository.CheckoutRepository;
import com.hatanaka.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaydListener {

    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event) {

        final CheckoutEntity checkoutEntity = checkoutRepository
                .findByCode(event.getCheckoutCode().toString())
                .orElseThrow();

        checkoutEntity.setStatus(CheckoutEntity.Status.APROVED);
        checkoutRepository.save(checkoutEntity);
    }
}
