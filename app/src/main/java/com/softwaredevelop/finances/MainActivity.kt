package com.softwaredevelop.finances

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        val sendButton = findViewById<Button>(R.id.registro)
        val loginButton = findViewById<Button>(R.id.inisesion)
        //val pruebaButton = findViewById<Button>(R.id.pruebaboton)

        sendButton.setOnClickListener {
            val intent = Intent(this,register::class.java)
            startActivity(intent) }

        loginButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent) }

        //pruebaButton.setOnClickListener {
        //    val intent = Intent(this,BeginActivity::class.java)
        //    startActivity(intent) }

        }
    }