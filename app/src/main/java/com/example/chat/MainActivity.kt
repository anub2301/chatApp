package com.example.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val button = binding.button

        button.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            val intent = Intent(this, toastActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }
    }
}















