package com.pankaj6apr.allen.di

import android.app.Application
import androidx.room.Room
import com.pankaj6apr.allen.data.local.ExpenseDatabase
import com.pankaj6apr.allen.data.repository.ExpenseRepositoryImpl
import com.pankaj6apr.allen.domain.repository.ExpenseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideDatabase(app: Application): ExpenseDatabase {
        return Room.databaseBuilder(
            app,
            ExpenseDatabase::class.java,
            ExpenseDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideCurrencyConversionRepository(database: ExpenseDatabase): ExpenseRepository {
        return ExpenseRepositoryImpl(database.dao)
    }

}