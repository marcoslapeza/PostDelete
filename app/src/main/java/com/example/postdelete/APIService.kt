package com.example.postdelete

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface APIService {
    companion object{
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.1.141:8080/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @GET("inmuebles")
    fun getImuebles(): Call<List<InmuebleResponse>>

    @POST("inmuebles")
    fun altaInmueble(@Body inmueble: InmuebleResponse): Call<InmuebleResponse>

    @DELETE("inmuebles/{id}")
    fun deleteInmueble(@Path("id") id: Int): Call<Void>
}