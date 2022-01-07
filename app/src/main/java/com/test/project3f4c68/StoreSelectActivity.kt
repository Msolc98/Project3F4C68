package com.test.project3f4c68

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_store_select.*

class StoreSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_select)

        temp.setOnClickListener{
            var goToMaterialListIntent = Intent(this,MaterialListActivity::class.java)
            startActivity(goToMaterialListIntent)
        }

        store_add_button.setOnClickListener {
            var goToStoreAddIntent = Intent(this,StoreAddActivity::class.java)
            startActivity(goToStoreAddIntent)
        }
    }
}