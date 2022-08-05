package com.example.myquizapp.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myquizapp.R
import com.example.myquizapp.databinding.ScienceItemLayoutBinding
import com.example.myquizapp.model.ScienceModel
import com.example.myquizapp.screen.ReportActivity

interface SciencesAdapterCallback {
    fun onClick(item: ScienceModel)
}

class SciencesAdapter(val items: List<ScienceModel>, val callback: SciencesAdapterCallback) :
    RecyclerView.Adapter<SciencesAdapter.ItemHolder>() {
    inner class ItemHolder(val binding: ScienceItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(ScienceItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ReportActivity::class.java)
            intent.putExtra("post", item)
            holder.itemView.context.startActivity(intent)
        }
        holder.itemView.setOnClickListener {
            callback.onClick(item)
        }
        holder.binding.tvTitle.text = item.title
    }
}