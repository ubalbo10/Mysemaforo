package com.example.mysemaforo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var contenedor=findViewById<LinearLayout>(R.id.contenedor)
        var mensaje=findViewById<TextView>(R.id.txtMensaje)
        var btnSeguir=findViewById<Button>(R.id.btnSeguir)
        var btnContinuar=findViewById<Button>(R.id.btnContinuar)
        var btnStop=findViewById<Button>(R.id.btnStop)
        var btnReiniciar=findViewById<Button>(R.id.btnReiniciar)

        btnReiniciar.setOnClickListener(){
            contenedor.setBackgroundColor(android.graphics.Color.DKGRAY)
            mensaje.text="DESACTIVADO"
        }
        btnSeguir.setOnClickListener(){
            contenedor.setBackgroundColor(android.graphics.Color.GREEN)
            mensaje.text="SIGA"
        }
        btnContinuar.setOnClickListener(){
            contenedor.setBackgroundColor(android.graphics.Color.YELLOW)
            mensaje.text="CONTINUAR"
        }
        btnStop.setOnClickListener(){
            contenedor.setBackgroundColor(android.graphics.Color.RED)
            mensaje.text="STOP"

        }

    }

}
