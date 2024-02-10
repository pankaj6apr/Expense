package com.pankaj6apr.allen.domain.usecase

import com.pankaj6apr.allen.domain.model.Expense
import com.pankaj6apr.allen.domain.repository.ExpenseRepository
import javax.inject.Inject

class AddExpenseUseCase @Inject constructor(
    private val repository: ExpenseRepository
){

     suspend operator fun invoke(expense: Expense) {
         expense.payer.amount = expense.totalAmout
         expense.participants.forEach {
             it.amount += -expense.totalAmout/expense.participants.size
         }
        repository.addExpense(expense)
    }
}