package com.example.day13passdata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    //static key creation
    companion object{
        const val KEY="com.example.day13passdata.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.submit)
        btn.setOnClickListener {
            val info=findViewById<EditText>(R.id.eT1).text.toString()+" "+findViewById<EditText>(R.id.eT2).text.toString()+" "+findViewById<EditText>(R.id.eT3).text.toString()

            intent=Intent(this,view::class.java)
            intent.putExtra(KEY,info)
            startActivity(intent)

        }

    }
}