package com.optic.lumineye.api

import retrofit2.http.GET

interface LumineyeApi {
    @GET("/glass")
    fun fetchGlass(glassId: String): GlassResponse

    @GET("/products/:productID")
    fun fetchProduct(productInt: String): ProductResponse
}