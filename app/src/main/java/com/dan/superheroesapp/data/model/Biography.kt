package com.dan.superheroesapp.data.model

import com.google.gson.annotations.SerializedName

data class Biography(
    val alias: List<String>,
    val alignment: String,
    @SerializedName("alter-egos") val alterEgos: String,
    @SerializedName("first-appearance") val firstAppearance: String,
    @SerializedName("full-name") val fullName: String,
    @SerializedName("place-of-birth") val placeOfBirth: String,
    val publisher: String
)