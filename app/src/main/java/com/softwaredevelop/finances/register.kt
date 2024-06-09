package com.softwaredevelop.finances

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        val nameText = findViewById<EditText>(R.id.editTextname)
        val lastNameText = findViewById<EditText>(R.id.editTextLastname)
        val ageText = findViewById<EditText>(R.id.editTextEdad)
        val emailText = findViewById<EditText>(R.id.editTextEmail)
        val accountText = findViewById<EditText>(R.id.editTextAccount)
        val passwordText = findViewById<EditText>(R.id.editTextPassword)

        val returnButton = findViewById<Button>(R.id.buttonReturn)
        returnButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val registerButton = findViewById<Button>(R.id.buttonRegister)

    }
}