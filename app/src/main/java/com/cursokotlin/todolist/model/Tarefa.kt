package com.cursokotlin.todolist.model

data class Tarefa(
    var id : Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var andamento: Boolean,
    var categoria: Categoria
    ) {
}