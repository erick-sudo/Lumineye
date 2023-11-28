package com.optic.lumineye.api

import com.optic.lumineye.models.Product
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductResponse(
    @Json(name = "name") val name: String
) {

    fun toProduct(): Product {
        return Product()
    }
}