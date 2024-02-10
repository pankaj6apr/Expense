package com.pankaj6apr.allen.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExpenseEntity (
    @PrimaryKey val key: String,
    val type: String,
    val totalAmout: Double,
    val participants: String
)