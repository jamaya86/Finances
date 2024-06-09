package com.softwaredevelop.finances

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class login  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sesion)

        val emailText = findViewById<EditText>(R.id.editTextEmailLogin)
        val passwordText = findViewById<EditText>(R.id.editTextPasswordLogin)

        val returnButtonL = findViewById<Button>(R.id.buttonReturnLogin)
        returnButtonL.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<Button>(R.id.buttonLogin)

    }
}