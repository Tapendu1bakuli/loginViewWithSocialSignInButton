package com.example.loginscreenwithsocialsigninbutton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.fragment_register)
        val login_now_text_button = findViewById<TextView>(R.id.login_now_text_button)
        login_now_text_button.setOnClickListener{
            finish()
        }
    }
}