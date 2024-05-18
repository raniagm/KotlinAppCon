package com.example.kotlinappcon


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import android.widget.Button
import android.widget.EditText
import android.util.Log
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button
    lateinit var registerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableEdgeToEdge()

        usernameInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        registerBtn = findViewById(R.id.Register_btn)

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            // Here you can add your authentication logic
            // For now, let's assume the credentials are valid
            if (isValidCredentials(username, password)) {
                // Navigate to AddContractActivity after successful login
                val intent = Intent(this, AddContractActivity::class.java)
                startActivity(intent)
            } else {
                // Handle invalid credentials, show error message, etc.
                Log.i("Login", "Invalid credentials")
            }
        }

        registerBtn.setOnClickListener {
            // Navigate to RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            // Finish current activity to prevent going back to it when pressing back button from RegisterActivity
            finish()
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Implement your authentication logic here
        // For demo purposes, always return true
        return true
    }
}