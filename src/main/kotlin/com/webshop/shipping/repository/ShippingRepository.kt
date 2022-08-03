package com.webshop.shipping.repository

import com.webshop.shipping.entity.Shipping
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ShippingRepository : CrudRepository<Shipping, Long> {
}