package com.example.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chat.databinding.ActivityToastBinding

class toastActivity : AppCompatActivity() {
    private lateinit var binding: ActivityToastBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val showuser = intent.getStringExtra("username")
        Toast.makeText(this, showuser, Toast.LENGTH_LONG).show()
        binding.show.setText("login success $showuser")
    }
}