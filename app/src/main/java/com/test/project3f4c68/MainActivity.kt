package com.test.project3f4c68

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener{

            var id = id_edittext.text.toString()
            var password = password_edittext.text.toString()

            id_check.setOnCheckedChangeListener{view,isChecked -> if (isChecked){Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()} }


            if (id.equals("admin")){


                var intent = Intent(this,StoreSelectActivity::class.java)
                startActivity(intent)}
            else
                Toast.makeText(this,id,Toast.LENGTH_SHORT).show()

        }

        signup_button.setOnClickListener{
            var intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

    }
}