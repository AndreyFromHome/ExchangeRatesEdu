package com.example.exchangeratesedu.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeratesedu.R
import com.example.exchangeratesedu.model.nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_name.text = listStart[position].buy
        holder.itemView.item_name.text = listStart[position].sale
    }

    override fun getItemCount(): Int {
     return listStart.size
    }

    fun setList(list: List<NalichkaItem>){
        listStart = list
        notifyDataSetChanged()
    }
}