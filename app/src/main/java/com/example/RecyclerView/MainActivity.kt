   package com.example.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.RecyclerView.adapter.SuperHeroAdapter
import com.example.RecyclerView.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // SuperheroProvider.superHeroList
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    // recuperar el recyclerview del activitymain
    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this )
        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperheroProvider.superHeroList) { superHero ->
            onItemSelected(
                superHero
            )
        }
    }
    // binding.recyclerSuperHero.addItemDecoration(decoration)


    fun onItemSelected(superHero: SuperHero) {
            Toast.makeText(this, superHero.superHero, Toast.LENGTH_SHORT).show()
          }
    }
