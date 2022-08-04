package com.webshop.shipping.controller

import com.webshop.shipping.BaseIT
import org.hamcrest.Matchers
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class ShippingControllerIT(@Autowired val mockMvc: MockMvc) : BaseIT() {

    @Test
    @DisplayName("Retrieve all shippings")
    fun testGetAllShippings() {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/shippings"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(Matchers.hasSize<Any>(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].city").value("Tiszakecske"))
    }
}