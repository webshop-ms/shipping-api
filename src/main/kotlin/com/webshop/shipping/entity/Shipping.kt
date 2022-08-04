package com.webshop.shipping.entity

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "shippings")
class Shipping(
        @Type(type = "uuid-char")
        var orderId: UUID,
        var zip: Int,
        var city: String,
        var street: String,
        var streetNumber: Int,
        @Enumerated(EnumType.STRING)
        var status: ShippingStatus
) : Identity()