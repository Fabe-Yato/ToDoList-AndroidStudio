package com.cursokotlin.todolist.api

import com.cursokotlin.todolist.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}