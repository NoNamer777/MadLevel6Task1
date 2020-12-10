package com.nonamer777.madlevel6task1.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nonamer777.madlevel6task1.R
import com.nonamer777.madlevel6task1.databinding.ItemColorBinding
import com.nonamer777.madlevel6task1.model.ColorItem

class ColorAdapter(private val colors: List<ColorItem>, private val onClick: (ColorItem) -> Unit):
    RecyclerView.Adapter<ColorAdapter.ViewHolder>() {

    private lateinit var context: Context

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val binding = ItemColorBinding.bind(itemView)

        init {
            itemView.setOnClickListener { onClick(colors[adapterPosition]) }
        }

        fun bind(colorItem: ColorItem) {
            Glide.with(context).load(colorItem.getImageUrl()).into(binding.colorImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        return ViewHolder(LayoutInflater.from(context).inflate(
            R.layout.item_color,
            parent,
            false
        ))
    }

    override fun getItemCount(): Int = colors.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(colors[position])
}
