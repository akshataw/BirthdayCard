package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WishCard : AppCompatActivity() {

    lateinit var name: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_card)

        val received = intent.getStringExtra("keyname")

        name = findViewById<TextView>(R.id.wish_text)
        name.text = received
    }
}
