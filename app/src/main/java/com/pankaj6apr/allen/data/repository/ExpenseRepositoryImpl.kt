package com.pankaj6apr.allen.data.repository

import com.pankaj6apr.allen.data.local.ExpenseDao
import com.pankaj6apr.allen.domain.model.Expense
import com.pankaj6apr.allen.domain.model.User
import com.pankaj6apr.allen.domain.model.toExpenseEntity
import com.pankaj6apr.allen.domain.repository.ExpenseRepository

class ExpenseRepositoryImpl constructor(val dao: ExpenseDao) :ExpenseRepository {
    override suspend fun addExpense(expense: Expense) {
        dao.addExpense(expense.toExpenseEntity())
    }

    override suspend fun getBalances(): List<User> {
        return listOf()
//        return dao.getBalances().map {
//           // User(it.name, it.amount)
//        }
    }
}