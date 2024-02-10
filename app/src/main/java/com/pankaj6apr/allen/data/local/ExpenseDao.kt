package com.pankaj6apr.allen.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExpenseDao {
    @Insert
    suspend fun addExpense(expense: ExpenseEntity)

    @Query("SELECT * FROM ExpenseEntity")
    suspend fun getBalances(): List<ExpenseEntity>
}