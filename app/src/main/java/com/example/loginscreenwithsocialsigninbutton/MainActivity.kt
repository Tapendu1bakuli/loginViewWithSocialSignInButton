package com.example.loginscreenwithsocialsigninbutton

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput : EditText
    lateinit var userPasswordInput : EditText
    lateinit var loginButton : Button
    lateinit var forgot_pasword : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.username_input)
        userPasswordInput = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_btn)

        loginButton.setOnClickListener{
            val userName = usernameInput.text.toString()
            val password = usernameInput.text.toString()
            val navigate = Intent(this@MainActivity, Register::class.java)
            startActivity(navigate)
            Log.i("Test Credential", "USerName : $userName and password is $password")

        }
         forgot_pasword = findViewById(R.id.reset_password)
        forgot_pasword.setOnClickListener{
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}