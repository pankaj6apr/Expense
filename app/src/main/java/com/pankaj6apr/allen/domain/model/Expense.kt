package com.pankaj6apr.allen.domain.model

import com.google.gson.Gson
import com.pankaj6apr.allen.data.local.ExpenseEntity
import java.util.Random

data class Expense(
    var type: String = "Lunch",
    var totalAmout: Double = 0.0,
    val participants: List<User> = listOf(),
    var payer: User = User("Harsh", 0.0)
)

fun Expense.toExpenseEntity(): ExpenseEntity {
    return ExpenseEntity(
        key = "key_"+ Random().nextInt(),
        type = type,
        totalAmout = totalAmout,
        participants = Gson().toJson(participants)
    )
}