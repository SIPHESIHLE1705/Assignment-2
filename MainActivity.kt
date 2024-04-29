package com.example.assignment_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Butto
import android.widget.Button

fun setContentView(activityMai Int) {

}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)
    //Declare the Views
    val next = findViewById<Button>(R.id.btnmeow)
    next.setOnClickListener {
        intent = Intent(:this,MainActivity::class.java)
        startActivity(intent)
    }
            }
    }
}