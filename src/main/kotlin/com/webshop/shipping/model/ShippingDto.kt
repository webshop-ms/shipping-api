package com.webshop.shipping.model

import com.webshop.shipping.entity.ShippingStatus
import java.util.*

class ShippingDto(
        val id: UUID?,
        val zip: Int,
        val city: String,
        val street: String,
        val streetNumber: Int,
        val status: ShippingStatus,
)