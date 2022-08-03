package com.webshop.shipping.facade

import com.webshop.shipping.entity.Shipping
import com.webshop.shipping.model.ShippingDto
import com.webshop.shipping.service.ShippingService
import org.springframework.stereotype.Component

@Component
class ShippingFacade(val shippingService: ShippingService) {

    fun getAllShipping(): MutableIterable<Shipping> {
        return shippingService.getAllShipping()
    }

    fun shippingToDtoTransformer(shipping: Shipping): ShippingDto {
        return ShippingDto(
                shipping.uuid.toString(),
                shipping.city,
                shipping.street,
                shipping.streetNumber,
                shipping.status
        )
    }
}