package com.example.prueba.Consultations.Interfaces

import com.example.prueba.Consultations.Beans.Consultation
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface PlaceHolder {

    @GET("consultations/{farmerId}")
    fun getConsultationsByFarmerId(@Path("farmerId") farmerId: Int): Call<List<Consultation>>
    @POST("consultations")
    fun createConsultation(@Body consultation: JsonObject): Call<Consultation>
    @GET("consultations")
    fun getConsultation(): Call<List<Consultation>>
}
