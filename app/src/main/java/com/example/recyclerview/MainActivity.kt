package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openSignInWithDelay()
    }

    private fun openSignInWithDelay() {
        val intent = Intent(this, LoginActivity::class.java)
        val delayMillis: Long = 3000

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent)
            finish()
        }, delayMillis)
    }
}