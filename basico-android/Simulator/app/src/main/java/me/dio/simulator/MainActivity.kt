package me.dio.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import me.dio.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContentView(R.layout.activity_main) -é onde liga essa activity com a tela de design
        //ao inves de ficar chamando item por item do layout no findViewById é só usar o binding

        binding = ActivityMainBinding.inflate(layoutInflater) //tem que criar uma
        // private var lateinit (inicialização tardia pois n ta sendo criado no construtor)
        setContentView(binding.root) //pra que entenda qual é a view q ta relacionada


    }
}