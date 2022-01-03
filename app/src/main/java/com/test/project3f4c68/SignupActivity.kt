package com.test.project3f4c68

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

//        val db = Room.databaseBuilder(
//            applicationContext,
//            AppDatabase::class.java,
//            "database"
//        ).allowMainThreadQueries().build()

        signup_button.setOnClickListener {

            val db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java,
                "user-database"
            ).allowMainThreadQueries().build()

            db.userDao().insert(
                UserInfo(
                    id_edittext.text.toString(),
                    password_edittext.text.toString(),
                    "abc123",
                    0
                )
            )

            Toast.makeText(this,db.userDao().getAll().toString(),Toast.LENGTH_LONG).show()
        }
    }
}