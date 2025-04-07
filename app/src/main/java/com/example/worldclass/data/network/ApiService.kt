package com.example.worldclass.data.network

import com.example.worldclass.data.model.AccountModel
import com.example.worldclass.data.model.UserModel
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiService {
    //objeto de json
    @POST("user")
    suspend fun login(@Body user:UserModel):Response<JsonObject>

    //lista de cuentas
    @GET("service")
    suspend fun getAccounts():Response<List<AccountModel>>

    //solo un elemento
    @GET("service/{id}")
    suspend fun getAccount(@Path("id") id:Int): Response<AccountModel>

    @POST("service")
    suspend fun addAccount(@Body service: AccountModel): Response<JsonObject>
}