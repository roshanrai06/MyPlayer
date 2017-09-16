package com.example.roshanrai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.message)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener({
            toast("Hello ${editText.text}")
        })

    }

    private fun toast(message: String): String {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        return message
    }
}
