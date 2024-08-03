package com.sena.assiscor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sena.assiscor.Crear_cuenta
import com.sena.assiscor.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val btn: Button = findViewById(R.id.btn_Cuenta)
            btn.setOnClickListener {
                val intent: Intent = Intent( this, Crear_cuenta::class.java)
                startActivity(intent)
            }
        val recuperar: TextView = findViewById(R.id.text_recupe)
        recuperar.setOnClickListener {
            val intent: Intent = Intent( this, Recuperar_contras::class.java)
            startActivity(intent)
        }
        }
    }