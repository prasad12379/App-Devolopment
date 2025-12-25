package com.example.firstdemoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonupload=findViewById<Button>(R.id.btnUpload)
        val buttondownload=findViewById<Button>(R.id.btnDownload)

        buttonupload.setOnClickListener {
            Toast.makeText(applicationContext, "File Uploaded", Toast.LENGTH_SHORT).show()
        }
        buttondownload.setOnClickListener {
            Toast.makeText(applicationContext, "File Downloaded", Toast.LENGTH_SHORT).show()
        }

    }
}