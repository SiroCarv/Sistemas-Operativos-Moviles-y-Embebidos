package com.example.curso1kotlinlogin // ajusta al package real de tu proyecto

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<TextInputEditText>(R.id.etUsername)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnIngresar = findViewById<Button>(R.id.button2)

        btnIngresar.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Completa ambos campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Bienvenido, $username", Toast.LENGTH_SHORT).show()
            }
        }
    }
}