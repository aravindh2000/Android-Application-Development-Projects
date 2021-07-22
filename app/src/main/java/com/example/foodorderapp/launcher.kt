package com.example.foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class launcher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launcher)
        Handler().postDelayed(
            {
              launcher()
            },2000
        )
    }
    fun launcher():Unit
    {
        val intent= Intent(this@launcher,login::class.java)
        startActivity(intent)
    }

}