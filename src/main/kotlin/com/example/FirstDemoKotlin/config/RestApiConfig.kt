package com.example.FirstDemoKotlin.config

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestApiConfig {

    @Bean
    fun getTrackingTemplate(): RestTemplate{
        val builder = RestTemplateBuilder()
        return builder.build()
    }

    @Bean
    fun getObjectMapper(): ObjectMapper {
        jacksonObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        jacksonObjectMapper().registerModule(KotlinModule())
        return jacksonObjectMapper()
    }
}