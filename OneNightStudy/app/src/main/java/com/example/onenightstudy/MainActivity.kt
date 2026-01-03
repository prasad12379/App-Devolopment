package com.example.onenightstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference  //firebase link
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.btn1)
        val etname=findViewById<TextInputEditText>(R.id.ip1)
        val etusername=findViewById<TextInputEditText>(R.id.ip2)
        val etemail=findViewById<TextInputEditText>(R.id.ip3)
        val etpassword=findViewById<TextInputEditText>(R.id.ip4)

        val btn2=findViewById<TextView>(R.id.btn2) //signin

        btn.setOnClickListener {
            val name=etname.text.toString()
            val username=etusername.text.toString()
            val email=etemail.text.toString()
            val password=etpassword.text.toString()

            val data=User(name,username,email,password) //compact in class
            database= FirebaseDatabase.getInstance().getReference("Users")  //link to database
            database.child(username).setValue(data).addOnSuccessListener {  //add value in data
                Toast.makeText(this,"User Registered", Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this,"Failed to Registered", Toast.LENGTH_SHORT).show()
            }
        }

        btn2.setOnClickListener {
            val intent= Intent(this, MainActivity2login::class.java)
            startActivity(intent)
        }
    }
}