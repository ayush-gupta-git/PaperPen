package com.example.paperpen.ui.deletingtask

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.paperpen.data.TaskDao
import com.example.paperpen.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class DeleteAllCompletedViewModel @ViewModelInject constructor(
    private val taskDao: TaskDao,
    @ApplicationScope private val applicationScope: CoroutineScope
) : ViewModel() {

    fun onConfirmClick() = applicationScope.launch {
        taskDao.deleteCompletedTasks()
    }
}