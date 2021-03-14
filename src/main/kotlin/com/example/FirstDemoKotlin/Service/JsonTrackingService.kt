package com.example.FirstDemoKotlin.Service

import com.example.FirstDemoKotlin.DTO.CoronavirusDTO
import com.example.FirstDemoKotlin.DTO.CountryStatisticDTO
import org.springframework.stereotype.Service
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import java.net.URL


@Service
class JsonTrackingService(val objectMapper: ObjectMapper) : TrackingServise{
//    private val trackingProvider: TrackingProvider = DefaultTrackingProvider(restTemplate = RestTemplate())

    override fun getContriesStatus(): Array<CountryStatisticDTO> {
        val jsonURL: URL = URL("https://api.covid19api.com/summary")
        var coronavirusDTO:  CoronavirusDTO? = null

        try {
            coronavirusDTO = objectMapper.readValue(jsonURL, CoronavirusDTO::class.java)
        } catch (e: JsonProcessingException){
            e.printStackTrace();
        }

        if (coronavirusDTO != null) {
            return coronavirusDTO.countryStatisticDTO
        }
        return emptyArray()
    }
}
