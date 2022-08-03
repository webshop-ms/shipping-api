package com.webshop.shipping.facade

import com.webshop.shipping.entity.Shipping
import com.webshop.shipping.service.ShippingService
import org.springframework.stereotype.Component

@Component
class ShippingFacade(val shippingService: ShippingService) {

    fun getAllShipping(): MutableIterable<Shipping> {
        return shippingService.getAllShipping()
    }
}