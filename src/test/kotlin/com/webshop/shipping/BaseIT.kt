package com.webshop.shipping

import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.DynamicPropertyRegistry
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@ActiveProfiles("test")
@Testcontainers
open class BaseIT {

    companion object {

        @JvmField
        @Container
        val mysql: MySQLContainer<*> = MySQLContainer("mysql:latest")

        @JvmStatic
        fun mysqlProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.datasource.url") { mysql.getJdbcUrl() }
            registry.add("spring.datasource.username") { mysql.getUsername() }
            registry.add("spring.datasource.password") { mysql.getPassword() }
        }
    }

}