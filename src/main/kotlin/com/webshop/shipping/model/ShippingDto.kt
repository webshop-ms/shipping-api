package com.webshop.shipping.model

import com.webshop.shipping.entity.ShippingStatus

class ShippingDto(
        val id: String?,
        val city: String,
        val street: String,
        val streetNumber: Int,
        val status: ShippingStatus,
)