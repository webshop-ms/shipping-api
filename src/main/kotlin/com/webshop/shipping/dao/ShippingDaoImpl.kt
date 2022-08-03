package com.webshop.shipping.dao

import com.webshop.shipping.entity.Shipping
import com.webshop.shipping.repository.ShippingRepository
import org.springframework.stereotype.Service

@Service
class ShippingDaoImpl(val shippingRepository: ShippingRepository) : ShippingDao {

    override fun getAllShipping(): MutableIterable<Shipping> {
        return shippingRepository.findAll()
    }
}