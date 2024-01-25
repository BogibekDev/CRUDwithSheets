package dev.bogibek.crudwithsheets.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val API_ID = "f2wdmbcryg5qw"
    private const val BASE_URL = "https://sheetdb.io/api/v1/$API_ID/"


    private val retrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    val apiService: ApiService = retrofit.create(ApiService::class.java)

}