package com.example.flash2.network


import com.example.flash2.data.InternetItem
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory


private const val BASE_URL = "https://training-uploads.internshala.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(

        Json.asConverterFactory(
            "application/json".toMediaType()
        )

    )
    .baseUrl(BASE_URL)
    .build()

interface FlashApiService{
    @GET("android/grocery_delivery_app/items.json")
    suspend fun getItems():List<InternetItem>
}
object FlashApi{
    val retrofitService:FlashApiService by lazy{
        retrofit.create(
            FlashApiService::class.java
        )
    }
}

