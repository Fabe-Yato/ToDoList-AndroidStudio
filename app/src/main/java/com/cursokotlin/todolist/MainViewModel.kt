package com.cursokotlin.todolist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cursokotlin.todolist.api.Repository
import com.cursokotlin.todolist.model.Categoria
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.reflect.Constructor
import javax.inject.Inject


//Inject constructor diz para injetar o construtor dentro da instancia Repository
@HiltViewModel // indica que a classe é uma hiltViewModel
class MainViewModel @Inject constructor (
    private val repository:Repository
    ) : ViewModel(){

    private val _myCategoriaResponse =
        MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse
    //Pega os dados da variavel _mycategoriaResponse para muda-los depois

    init{
       // listCategoria()
    }
    fun listCategoria(){
        viewModelScope.launch {
            try{
                val response = repository.listCategoria()
                _myCategoriaResponse.value = response
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    } //adicionando o Método a uma corotina deixando-o assincrono

}