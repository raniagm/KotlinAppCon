package com.example.kotlinappcon

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.util.Log

class RegisterActivity : AppCompatActivity() {
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var roleEditText: EditText
    lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        roleEditText = findViewById(R.id.roleEditText)
        registerButton = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            // Here you can add code to register the user
            // For now, let's just log the registration details
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val role = roleEditText.text.toString()
            Log.i("RegistrationDetails", "Email: $email, Password: $password, Role: $role")

            // After registration, navigate back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finish current activity to prevent going back to it when pressing back button from MainActivity
            finish()
        }
    }
}
