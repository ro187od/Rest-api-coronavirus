package com.example.FirstDemoKotlin

import com.example.FirstDemoKotlin.DTO.CountryStatisticDTO
import com.example.FirstDemoKotlin.Service.JsonTrackingService
import com.fasterxml.jackson.databind.json.JsonMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CoronaController{

    private val service: JsonTrackingService = JsonTrackingService(objectMapper = JsonMapper())

    @GetMapping("/start")
    fun getContriesStatus(): Array<CountryStatisticDTO>{
        val service:JsonTrackingService = this.service
        return service.getContriesStatus()
    }
}