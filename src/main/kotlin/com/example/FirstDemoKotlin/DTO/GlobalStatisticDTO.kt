package com.example.FirstDemoKotlin.DTO

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class GlobalStatisticDTO (
    @JsonProperty("NewConfirmed")
    val newConfirmed: Int,
    @JsonProperty("TotalConfirmed")
    val totalConfirmed: String,
    @JsonProperty("NewDeaths")
    val newDeaths: Int,
    @JsonProperty("TotalDeaths")
    val totalDeaths: Int,
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
