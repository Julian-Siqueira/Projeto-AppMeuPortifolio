package com.example.appmeuportifolio

import android.content.Intent
import android.net.Uri
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

        binding.imgWpp.setOnClickListener {

            val numeroTelefone = "5524999646677"
            val uri = Uri.parse("https://api.whatsapp.com/send?phone=$numeroTelefone")
            val intent = Intent(Intent.ACTION_VIEW, uri)

            if(numeroTelefone.equals(numeroTelefone)){
                startActivity(intent)
            }else{
                val playstore = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
                startActivity(playstore)
            }
        }
    }
}