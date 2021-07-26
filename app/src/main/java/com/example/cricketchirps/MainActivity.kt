package com.example.cricketchirps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cricketchirps.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.maTvResultado.visibility = View.GONE

        binding.maBtnCalcular.setOnClickListener {
           if(binding.maEtCantos.text.toString().isEmpty()){
                Toast.makeText(this, "Ingresa un valor", Toast.LENGTH_SHORT).show()
           }else{
               //valor ingresado - calculo

               val cantos = Integer.parseInt(binding.maEtCantos.text.toString().trim())
               val temp = ((cantos /3.0)+4).roundToInt()

               val resultado = "La temperatura aproximada en el exterior es $temp ºC"
               binding.maTvResultado.text = resultado
               binding.maTvResultado.visibility = View.VISIBLE
           }
        }
    }
}