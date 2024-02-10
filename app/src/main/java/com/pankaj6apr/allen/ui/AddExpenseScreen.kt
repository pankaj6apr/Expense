package com.pankaj6apr.allen.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.pankaj6apr.allen.domain.model.Expense
import com.pankaj6apr.allen.domain.model.User
import com.pankaj6apr.allen.presentation.ExpenseViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExpenseScreen(viewModel: ExpenseViewModel = hiltViewModel()) {
    var participants: List<User> = listOf()
    var currentUser: String = ""
    var expense: Expense = Expense()

    Box() {
        Column {

            Row {
                Text(text = "Expense Tyoe")
                TextField(value = "Lunch", onValueChange = {
                    expense.type = it
                })
            }
            Row {
                Text(text = "Amount")
                TextField(value = "0.0", onValueChange = {
                    expense.totalAmout = it.toDouble()
                })
            }
            Column {
                Text(text = "Paid by")
                TextField(value = "Harsh", onValueChange = {
                    currentUser = it
                })

            }

            Row {
                Text(text = "Participants")
                Column {
                    TextField(value = "Harsh", onValueChange = {
                        currentUser = it
                    })

                    Button(onClick = {
                        participants += User(
                            name = currentUser
                        )
                    }) {
                        "+"
                    }
                }
            }
            Button(onClick = {
                viewModel.addExpense(
                    expense
                )
            }) {
                "Add"
            }
        }
    }
}