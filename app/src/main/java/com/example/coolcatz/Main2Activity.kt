package com.example.coolcatz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //get data from intent
        val intent=intent
        val name=intent.getStringExtra("Name")
        //textview
        val result=findViewById<TextView>(R.id.result)
        //setText
        result.text="Name: "+name
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "Hello $name",Toast.LENGTH_SHORT).show()
        }
    }
}
