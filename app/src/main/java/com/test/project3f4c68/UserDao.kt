package com.test.project3f4c68

import androidx.room.*

@Dao
interface UserDao {

    @Insert
    fun insert(userInfo: UserInfo)

    @Update
    fun update(userInfo: UserInfo)

    @Query("SELECT * FROM UserInfo")
    fun getAll(): List<UserInfo>

    @Query("DELETE FROM UserInfo WHERE userId = :name")
    fun deleteUserByName(name: String)

    @Query("DELETE FROM UserInfo")
    fun deleteAll()

}