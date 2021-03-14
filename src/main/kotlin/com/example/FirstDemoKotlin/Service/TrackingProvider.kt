package com.example.FirstDemoKotlin.Service


interface TrackingProvider {
    val DATA_PROVIDER_URL: String
        get() = "https://api.covid19api.com/summary"

    fun getCoronavirusData() : String?

}