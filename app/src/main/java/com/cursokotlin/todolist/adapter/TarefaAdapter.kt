package com.cursokotlin.todolist.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cursokotlin.todolist.databinding.CardLayoutBinding
import com.cursokotlin.todolist.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    } // Diz qual o layout que vamos usar

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.andamento
        holder.binding.textCategoria.text = tarefa.categoria.descricao


    }// Cria os atributos(nome, responsavel, data...) e joga na lista

    override fun getItemCount(): Int {
        return listTarefa.size
    } // retorna a contagem de itens que foram gerados

    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    } //atualiza a lista com os novos itens
}