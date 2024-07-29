package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.RegistrationActivityBinding

class RegistrationActivity: AppCompatActivity() {
    private lateinit var binding: RegistrationActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = RegistrationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onLoginClick(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}