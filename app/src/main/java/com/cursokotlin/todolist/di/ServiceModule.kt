package com.cursokotlin.todolist.di

import com.cursokotlin.todolist.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)// tranforma em um objeto unico
object ServiceModule {

    @Singleton
    @Provides
    fun returnRepository(): Repository{
        return Repository()
    } //cria e retorna uma instancia do Repository

}