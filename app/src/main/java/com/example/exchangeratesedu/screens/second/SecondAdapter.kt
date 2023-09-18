package com.example.exchangeratesedu.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangeratesedu.R
import com.example.exchangeratesedu.model.beznal.BeznalItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond = emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_name.text = listSecond[position].buy
        holder.itemView.item_name.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    fun setList(list: List<BeznalItem>){
        listSecond = list
        notifyDataSetChanged()
    }
}