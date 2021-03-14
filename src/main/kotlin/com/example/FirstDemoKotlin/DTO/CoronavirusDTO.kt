package com.example.FirstDemoKotlin.DTO

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
data class CoronavirusDTO(
        @JsonProperty("Global")
        @OneToOne
        val globalStatisticDTO: GlobalStatisticDTO,
        @JsonProperty("Countries")
        @OneToOne
        @Autowired
        val countryStatisticDTO: Array<CountryStatisticDTO>) {
        @Id
        @GeneratedValue
        val id: Long = TODO("initialize me")
}