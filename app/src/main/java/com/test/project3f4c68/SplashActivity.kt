package com.test.project3f4c68

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    val SPLASH_VIEW_TIME:Long = 1200

    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },SPLASH_VIEW_TIME)
    }
}