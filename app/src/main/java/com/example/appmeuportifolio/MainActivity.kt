package com.example.appmeuportifolio

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.appmeuportifolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.jucao)
        val circulo = RoundedBitmapDrawableFactory.create(resources, fotoPerfil)
        circulo.isCircular = true
        binding.imageUser.setImageDrawable(circulo)

        binding.btnProjeto.setOnClickListener{

            val intent = Intent(this, Projetos::class.java)
            startActivity(intent)
        }

        binding.btnContato.setOnClickListener{

            val intent = Intent(this, Contatos::class.java)
            startActivity(intent)
        }
    }
}