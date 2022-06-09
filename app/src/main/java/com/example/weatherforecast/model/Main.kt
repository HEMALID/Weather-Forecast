package com.example.weatherforecast.model

data class Main(
    val feels_like: Double,
    val gmd_level: Double,
    val humidity: Int,
    val pressure: Double,
    val sea_level: Double,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)