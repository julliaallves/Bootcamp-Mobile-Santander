package me.dio.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding //pra chamar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater) //pra chamar
        setContentView(binding.root) //pra chamar

        setSupportActionBar(binding.toolbar) //p aparecer a toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}