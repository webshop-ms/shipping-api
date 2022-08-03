package com.webshop.shipping.service

import com.webshop.shipping.dao.ShippingDao
import com.webshop.shipping.entity.Shipping
import org.springframework.stereotype.Service

@Service
class ShippingServiceImpl(val shippingDao: ShippingDao) : ShippingService {

    override fun getAllShipping(): MutableIterable<Shipping> {
        return shippingDao.getAllShipping()
    }

}
