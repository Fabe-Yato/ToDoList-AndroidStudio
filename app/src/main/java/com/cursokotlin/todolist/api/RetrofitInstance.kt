package com.cursokotlin.todolist.api

import com.cursokotlin.todolist.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            //converter o Gson para algo que o Kotlin consiga ler
    }
    //by lazy inicializa a variavel e
    // a disponibiliza imediatamente

    val api: ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }
    //Cria uma instancia da api com base na APIService
}

