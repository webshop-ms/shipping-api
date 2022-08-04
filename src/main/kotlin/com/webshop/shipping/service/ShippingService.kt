package com.webshop.shipping.service

import com.webshop.shipping.entity.Shipping

interface ShippingService {
    fun getAllShipping(): MutableIterable<Shipping>
    fun createShipping(shipping: Shipping)
}