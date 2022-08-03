package com.webshop.shipping.entity

import org.hibernate.Session
import org.hibernate.tuple.ValueGenerator
import java.util.*

class UuidGenerator : ValueGenerator<UUID> {
    override fun generateValue(session: Session?, owner: Any?): UUID {
        return UUID.randomUUID()
    }

}
