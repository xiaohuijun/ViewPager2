package com.example.viewpager2


import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_text.view.*

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    val data = arrayOf("aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false);
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(data[position], if (position % 2 == 0) Color.BLUE else Color.RED)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class ItemViewHolder internal constructor(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    internal fun bind(text: String, color: Int) {
        itemView.tv_text.text = text;
        itemView.setBackgroundColor(color)
    }
}