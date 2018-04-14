package com.example.earosb.chaticc714

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MensajeAdapter(val mensajeList: ArrayList<Mensaje>): RecyclerView.Adapter<MensajeAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.msjBody?.text = mensajeList[position].body
        holder?.hour?.text = mensajeList[position].hour

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.mensaje_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return mensajeList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val msjBody = itemView.findViewById<TextView>(R.id.msjBody)
        val hour = itemView.findViewById<TextView>(R.id.hour)
    }

}