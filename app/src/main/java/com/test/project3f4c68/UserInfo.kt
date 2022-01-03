package com.test.project3f4c68

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserInfo(
    @PrimaryKey val userId:String,
    var password:String,
    var storeCode:String,
    var saveOrNot:Int = 0
)
