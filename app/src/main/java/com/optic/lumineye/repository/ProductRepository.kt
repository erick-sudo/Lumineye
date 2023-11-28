package com.optic.lumineye.repository

import com.optic.lumineye.api.LumineyeApi
import com.optic.lumineye.models.Product
import com.optic.lumineye.models.Glass
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

class ProductRepository {

    private val api: LumineyeApi

    init {
        // Http Client
        val okHttpClient: OkHttpClient = OkHttpClient
            .Builder()
            .build()

        // Retrofit builder
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("http://")
            .client(okHttpClient)
            .build()

        // Initialize api
        api = retrofit.create()
    }

    fun fetchGlass(glassId: String): Glass {
        return api.fetchGlass(glassId).toGlass()
    }

    fun fetchProduct(productId: String): Product {
        return api.fetchProduct(productId).toProduct()
    }
}