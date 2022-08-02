package com.example.RecyclerView.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.RecyclerView.SuperHero
import com.example.RecyclerView.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View):RecyclerView.ViewHolder(view){

     val binding = ItemSuperheroBinding.bind(view)


    fun render(superHeroModel: SuperHero, onClickListener:(SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
       itemView.setOnClickListener {onClickListener(superHeroModel)}

    }
}