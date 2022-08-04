package com.webshop.shipping.entity

import org.hibernate.annotations.GenerationTime
import org.hibernate.annotations.GeneratorType
import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@MappedSuperclass
// TODO add lombok gradle
// @EqualsAndHashCode(onlyExplicitlyIncluded = true)
abstract class Identity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        // @EqualsAndHashCode.Include
        var id: Int? = null,

        @Column(name = "uuid", unique = true, updatable = false)
        @GeneratorType(type = UuidGenerator::class, `when` = GenerationTime.INSERT)
        @Type(type = "uuid-char")
        var uuid: UUID? = null

)