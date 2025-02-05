package com.example.appmeuportifolio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appmeuportifolio.databinding.ActivityContatosBinding
import com.example.appmeuportifolio.databinding.ActivityMainBinding

class Contatos : AppCompatActivity() {

    private lateinit var binding: ActivityContatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.actionbarContato.setNavigationOnClickListener{
            finish()
        }

    }
}