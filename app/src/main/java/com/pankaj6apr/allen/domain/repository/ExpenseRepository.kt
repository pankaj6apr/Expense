package com.pankaj6apr.allen.domain.repository

import com.pankaj6apr.allen.domain.model.Expense
import com.pankaj6apr.allen.domain.model.User

interface ExpenseRepository {
    suspend fun addExpense(expense: Expense)

    suspend fun getBalances(): List<User>
}