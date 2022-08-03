package com.webshop.shipping.service

import com.webshop.shipping.dao.ShippingDao
import org.springframework.stereotype.Service

@Service
class ShippingServiceImpl(shippingDao: ShippingDao) : ShippingService {
}