package com.example.birthdaycard

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendName = findViewById<EditText>(R.id.friendName)
        val btn = findViewById<Button>(R.id.done_button)

        friendName.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(friendName, 0)

        btn.setOnClickListener {
            val i = Intent(this, WishCard::class.java)
            i.putExtra("keyname", friendName.text.toString())
            startActivity(i)
//            Toast.makeText(this@MainActivity,  "Happy Birthday ${friendName}", Toast.LENGTH_LONG).show()
        }

    }
}
