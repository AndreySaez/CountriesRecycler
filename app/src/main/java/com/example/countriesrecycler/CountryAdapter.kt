package com.example.countriesrecycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter : RecyclerView.Adapter<CountryHolder>() {

    private val countriesList = mutableListOf<Country>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return CountryHolder(view)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setCountries(countries: List<Country>) {
        countriesList.clear()
        countriesList.addAll(countries)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return countriesList.size
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.bind(countriesList[position])
    }
}