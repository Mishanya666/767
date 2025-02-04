package com.example.a767

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv: TextView = itemView.findViewById(R.id.color)
    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        tv.text = "#${Integer.toHexString(color)}"
    }
}
