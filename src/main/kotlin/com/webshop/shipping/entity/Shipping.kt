package com.webshop.shipping.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "shippings")
class Shipping(
        var zip: Int,
        var city: String,
        var street: String,
        var streetNumber: Int,
        var status: ShippingStatus
) : Identity()