package com.webshop.shipping.dao

import com.webshop.shipping.repository.ShippingRepository
import org.springframework.stereotype.Service

@Service
class ShippingDaoImpl(shippingRepository: ShippingRepository) : ShippingDao {
}