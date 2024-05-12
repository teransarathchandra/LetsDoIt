package com.teransarathchandra.letsdoit.viewmodels

import androidx.lifecycle.ViewModel
import com.teransarathchandra.letsdoit.models.Task
import com.teransarathchandra.letsdoit.repository.TaskRepository

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {

    val taskStateFlow get() = repository.taskStateFlow
    val statusLiveData get() = repository.statusLiveData
    val sortByLiveData get() = repository.sortByLiveData

    fun setSortBy(sort:Pair<String,Boolean>){
        repository.setSortBy(sort)
    }

    fun getTaskList(isAsc : Boolean, sortByName:String) {
        repository.getTaskList(isAsc, sortByName)
    }

    fun insertTask(task: Task){
        repository.insertTask(task)
    }

    fun deleteTask(task: Task) {
        repository.deleteTask(task)
    }

    fun deleteTaskUsingId(taskId: String){
        repository.deleteTaskUsingId(taskId)
    }

    fun updateTask(task: Task) {
        repository.updateTask(task)
    }

    fun updateTaskPaticularField(taskId: String,title:String,description:String) {
        repository.updateTaskPaticularField(taskId, title, description)
    }
    fun searchTaskList(query: String){
        repository.searchTaskList(query)
    }
}