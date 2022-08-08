package com.webshop.shipping.controller

import com.webshop.shipping.BaseIT
import org.hamcrest.Matchers
import org.json.JSONObject
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.jdbc.Sql
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

    @Test
    @DisplayName("Save new Shipping")
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = ["/remove-shipping.sql"])
    fun testSaveNewShipping() {
        val requestBody =
                JSONObject("""{
                    "orderId": "c39626ac-07a1-4cd6-9acd-2cb4f3508b00",
                    "zip": 2750,
                    "city": "Dabas",
                    "street": "Bajcsy ut",
                    "streetNumber": 5,
                    "status": "WAITING"}"""
                )

        mockMvc.perform(MockMvcRequestBuilders.post("/api/shippings")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody.toString()))
                .andExpect(MockMvcResultMatchers.status().isCreated)
    }


}