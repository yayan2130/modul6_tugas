package com.example.modul6_tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajan.view.*

class adapter  (val itemFac: List<data>, val clickListener: (data) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun bind(data : data, clickListener: (data) -> Unit)
        {
            itemView.image_fac.setImageResource(data.imgJajan)
            itemView.tv_list_fac.text = data.namaJajan
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}
