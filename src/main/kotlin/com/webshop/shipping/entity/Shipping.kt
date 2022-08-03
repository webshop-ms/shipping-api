package com.webshop.shipping.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "shippings")
class Shipping(
        val zip: Int,
        val city: String,
        val street: String,
        val streetNumber: Int,
        val status: ShippingStatus,
        id: Int,
        uuid: UUID
) : Identity(id, uuid)