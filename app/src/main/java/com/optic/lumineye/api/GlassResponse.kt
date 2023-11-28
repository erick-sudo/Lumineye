package com.optic.lumineye.api

import com.optic.lumineye.models.Glass
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GlassResponse(
    val brand: String
) {

    fun toGlass(): Glass {
        return Glass()
    }
}
