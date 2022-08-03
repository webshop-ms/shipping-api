package com.webshop.shipping.dao

import com.webshop.shipping.entity.Shipping

interface ShippingDao {

    fun getAllShipping(): MutableIterable<Shipping>

}