package com.example.onenightstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity2login : AppCompatActivity() {
    companion object{
        const val KEY1="com.example.onenightstudy.MainActivity2_login.name"
        const val KEY2="com.example.onenightstudy.MainActivity2_login.email"
    }
    lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2_login)

        var btn=findViewById<Button>(R.id.signin)
        var username=findViewById<TextInputEditText>(R.id.sip1)
        var password=findViewById<TextInputEditText>(R.id.sip2)

        btn.setOnClickListener {
            var uniqid=username.text.toString()
            if(uniqid.isNotEmpty()){
                readdata(uniqid)
            }
            else{
                Toast.makeText(this,"Please enter username", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun  readdata(uniqid : String){
        databaseReference= FirebaseDatabase.getInstance().getReference("Users")

        databaseReference.child(uniqid).get().addOnSuccessListener {
            //if user exist or not
            if(it.exists()){  //it is bydefault itrator
                var name=it.child("name").toString()
                var email=it.child("email").toString()

                //transfer data to main page
                var intentval= Intent(this, MainApp::class.java)
                intentval.putExtra(KEY1,name)
                intentval.putExtra(KEY2,email)
                startActivity(intentval)
            }
            else{
                Toast.makeText(this,"User Not Exist",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            //if database not accessable
            Toast.makeText(this,"Fail to Connect",Toast.LENGTH_SHORT).show()
        }

    }
}