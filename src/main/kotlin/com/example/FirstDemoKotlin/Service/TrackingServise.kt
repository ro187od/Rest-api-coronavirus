package com.example.FirstDemoKotlin.Service

import com.example.FirstDemoKotlin.DTO.CountryStatisticDTO

interface TrackingServise {

    fun getContriesStatus(): Array<CountryStatisticDTO>

}
