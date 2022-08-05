package com.example.myquizapp.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myquizapp.R
import com.example.myquizapp.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSciences.setOnClickListener {
            startActivity(Intent(this, SiencesActivity::class.java))

        }

    }
}