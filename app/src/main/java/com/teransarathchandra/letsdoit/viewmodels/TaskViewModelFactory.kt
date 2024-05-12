package com.teransarathchandra.letsdoit.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.teransarathchandra.letsdoit.repository.TaskRepository

class TaskViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TaskViewModel(TaskRepository(application)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}