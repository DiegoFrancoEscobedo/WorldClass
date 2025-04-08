package com.example.worldclass.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.worldclass.data.model.AccountEntity

@Dao
interface AccountDao {
    @Query("SELECT * FROM AccountEntity")
    fun getAll(): List<AccountEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(account:AccountEntity)
}