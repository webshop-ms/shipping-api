package com.webshop.shipping.facade

import com.webshop.shipping.entity.Shipping
import com.webshop.shipping.model.ShippingDto
import com.webshop.shipping.service.ShippingService
import org.springframework.stereotype.Component

@Component
class ShippingFacade(val shippingService: ShippingService) {

    fun getAllShipping(): MutableList<ShippingDto> {
        val shippings: MutableIterable<Shipping> = shippingService.getAllShipping()
        val dtos: MutableList<ShippingDto> = shippings.map(this::shippingToDtoTransformer).toMutableList()
        return dtos
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

    fun createShipping(shippingDto: ShippingDto) {
        shippingService.createShipping(shippingDtoToEntity(shippingDto))
    }

    // TODO("dto transformation")
    fun shippingDtoToEntity(shippingDto: ShippingDto): Shipping {
        throw UnsupportedOperationException()
    }
}