package com.example.countriesrecycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.countriesrecycler.databinding.CountryItemBinding

class CountryHolder(item: View) : RecyclerView.ViewHolder(item) {
    private val binding = CountryItemBinding.bind(item)
    fun bind(country: Country) {
        binding.flag.load(country.imageId)

        binding.title.text = binding.root.resources.getString(
            R.string.country_template,
            adapterPosition + 1,
            country.title
        )
    }
}