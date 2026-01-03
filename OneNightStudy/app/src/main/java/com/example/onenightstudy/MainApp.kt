package com.example.onenightstudy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_app)
        val name=intent.getStringExtra(MainActivity2login.KEY1)
        val email=intent.getStringExtra(MainActivity2login.KEY2)

        val msg=findViewById<TextView>(R.id.t1)
        val msg2=findViewById<TextView>(R.id.t2)

        msg.text=name

    }
}