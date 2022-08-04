package com.webshop.shipping.controller

import com.webshop.shipping.facade.ShippingFacade
import com.webshop.shipping.model.ShippingDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/shippings")
class ShippingController(val shippingFacade: ShippingFacade) {

    @GetMapping()
    fun getAllShipping(): ResponseEntity<MutableList<ShippingDto>> {
        val dtos: MutableList<ShippingDto> = shippingFacade.getAllShipping()
        return ResponseEntity(dtos, HttpStatus.OK)
    }

    @PostMapping
    fun createShipping(@RequestBody shippingDto: ShippingDto): ResponseEntity<Void> {
        shippingFacade.createShipping(shippingDto)
        return ResponseEntity(HttpStatus.CREATED)
    }
}