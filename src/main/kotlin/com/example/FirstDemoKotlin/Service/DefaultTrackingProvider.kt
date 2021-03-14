package com.example.FirstDemoKotlin.Service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject


@Service
class DefaultTrackingProvider(val restTemplate: RestTemplate) : TrackingProvider {

    override fun getCoronavirusData(): String {
        return restTemplate.getForObject(DATA_PROVIDER_URL, String::class)

    }
}