package com.example.FirstDemoKotlin.DTO

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class CountryStatisticDTO(
        @JsonProperty("Country")
        val name: String,
        @JsonProperty("CountryCode")
        val countryCode: Int,
        @JsonProperty("NewConfirmed")
        val newConfirmed: Int,
        @JsonProperty("TotalConfirmed")
        val totalConfirmed: Int,
        @JsonProperty("NewDeaths")
        val newDeaths: Int,
        @JsonProperty("NewRecovered")
        val newRecovered: Int,
        @JsonProperty("TotalRecovered")
        val totalRecovered: Int,
        @JsonProperty("Date")
        val date: String
) {
        @Id
        @GeneratedValue
        val id: Long = TODO("initialize me")
}
