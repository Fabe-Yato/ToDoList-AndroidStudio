package com.cursokotlin.todolist

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//diz que nossa aplicação pode utilizar o hilt
@HiltAndroidApp
class TodoApplication : Application() {
}