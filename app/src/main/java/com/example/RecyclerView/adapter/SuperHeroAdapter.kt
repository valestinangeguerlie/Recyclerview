package com.example.RecyclerView.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.RecyclerView.R
import com.example.RecyclerView.SuperHero

class SuperHeroAdapter(private val superHeroList:List<SuperHero>, private val onClickListener:(SuperHero) -> Unit) : RecyclerView.Adapter<SuperHeroViewHolder>() {

    // esta funcion va a devolver este item al viewholder por cada objeto que hay al superhero
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
          val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }
    // va pasar por cada uno de los items y va a llamar al superhero rendel
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {

        val item = superHeroList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = superHeroList.size


}
