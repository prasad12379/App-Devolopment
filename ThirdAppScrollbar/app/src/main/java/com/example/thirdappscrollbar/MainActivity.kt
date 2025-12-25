package com.example.thirdappscrollbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            //open new activity
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

        }
}