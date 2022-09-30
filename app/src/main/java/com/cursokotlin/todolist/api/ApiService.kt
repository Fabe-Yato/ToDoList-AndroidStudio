package com.cursokotlin.todolist.api

import com.cursokotlin.todolist.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

//Mapeamento de Requisições
interface ApiService {

    @GET("categoria")
    //suspend functions só serão rodadas dentro de uma corotina
    //O Response vai armazenar uma lista de Categorias
    suspend fun listCategoria(): Response<List<Categoria>>

}