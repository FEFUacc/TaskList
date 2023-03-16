package com.maskalor.recycler.domain.useCases

import android.icu.text.CaseMap.Title
import com.maskalor.recycler.data.Task
import com.maskalor.recycler.domain.Repository

class AddTaskUseCase(private val repository: Repository) {
    fun execute(task: Task) {
        repository.createTask(task)
    }
}