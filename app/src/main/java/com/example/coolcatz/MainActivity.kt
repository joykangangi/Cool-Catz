package com.example.coolcatz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val textname=findViewById<EditText>(R.id.text_name)
        val button=findViewById<Button>(R.id.about_me)
        //handle button click
        button.setOnClickListener {
            //get text from edittexts
            val name=textname.text.toString()
            //intent to start activity
            val intent=Intent(this@MainActivity, Main2Activity::class.java)
            intent.putExtra("Name",name)
            startActivity(intent)
        }
       }

    }

