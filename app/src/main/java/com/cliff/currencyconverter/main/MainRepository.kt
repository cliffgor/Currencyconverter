package com.cliff.currencyconverter.main

import com.cliff.currencyconverter.data.models.CurrencyResponse
import com.cliff.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}