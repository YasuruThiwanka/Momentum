package com.example.momentum.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val category: String,
    val priority: String,
    val points: Int,
    val isCompleted: Boolean,
    val dueDate: Long, // timestamp
    val isRecurring: Boolean,
    val recurringRule: String? // e.g., RRULE string for recurring logic
)
