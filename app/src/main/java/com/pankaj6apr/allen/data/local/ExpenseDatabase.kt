package com.pankaj6apr.allen.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ExpenseEntity::class],
    version = 1
)
abstract class ExpenseDatabase : RoomDatabase() {
    abstract val dao: ExpenseDao

    companion object {
        const val DATABASE_NAME = "expense_db"
    }
}