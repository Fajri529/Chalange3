package com.example.chalange3

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chalange3.databinding.ItemListBinding


class LetterAdapter():RecyclerView.Adapter<LetterAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val view = ItemListBinding.inflate(layoutInflatet.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return differ.curentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.bind(differ.currentList[position], callback)
    }

}
