package com.example.implicit_intnet_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webbutton=findViewById<TextView>(R.id.crome)
        val cambutton=findViewById<TextView>(R.id.camera)
        webbutton.setOnClickListener {
            //for open crome website
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://chromewebstore.google.com/")
            startActivity(intent)
        }

        cambutton.setOnClickListener {
            //for open camera app in mobile not website
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }


    }
}