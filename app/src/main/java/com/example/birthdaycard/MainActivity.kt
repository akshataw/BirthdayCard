package com.example.birthdaycard

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendName = findViewById<EditText>(R.id.friendName)
        val doneButton = findViewById<Button>(R.id.done_button)

        friendName.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(friendName, 0)

        doneButton.setOnClickListener {
            wishFriend(it, friendName)
        }

    }

    private fun wishFriend (view: View, friendName: EditText) {
        val friendName = findViewById<EditText>(R.id.friendName).getText().toString()
        Toast.makeText(this@MainActivity,  "Happy Birthday ${friendName}", Toast.LENGTH_LONG).show()
    }
}
