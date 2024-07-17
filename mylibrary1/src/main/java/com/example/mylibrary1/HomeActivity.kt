package com.example.mylibrary1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        buttonColorChange()
    }

    private fun buttonColorChange(){
        val button1 = findViewById<Button>(R.id.myButton)
        button1.setOnClickListener {
            it.setBackgroundColor(getColor(R.color.black))
        }
    }
}