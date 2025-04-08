package com.example.worldclass.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.worldclass.data.dao.AccountDao
import com.example.worldclass.data.model.AccountEntity

@Database(entities = [AccountEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun accountDao(): AccountDao
}