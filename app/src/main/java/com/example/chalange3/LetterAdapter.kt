package com.example.chalange3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerviewapp.databinding.ItemListBinding


class LetterAdapter(val callback: (String) -> Unit):RecyclerView.Adapter<LetterAdapter.ViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }
     private val differ = AsyncListDiffer(this, diffCallback)

     fun submitData(value: MutableList<String>) = differ.submitList(value)

    class ViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String, callback: (String) -> Unit){
            binding.tvName.text = data
            binding.root.setOnClickListener{
                callback(data)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(differ.currentList[position], callback)
    }

}