package com.wew.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class KayaAdapter(private val context: Context, private val kaya: List<kaya>, val listener: (kaya) -> Unit)
    : RecyclerView.Adapter<KayaAdapter.KayaViewHolder>(){

    class KayaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgKaya = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKaya = view.findViewById<TextView>(R.id.tv_item_name)
        val descKaya = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(kaya: kaya, listener: (kaya) -> Unit) {
            imgKaya.setImageResource(kaya.imgKaya)
            nameKaya.text = kaya.nameKaya
            descKaya.text = kaya.descKaya
            itemView.setOnClickListener {
                listener(kaya)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KayaViewHolder {
        return KayaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kaya, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KayaViewHolder, position: Int) {
        holder.bindView(kaya[position],listener)
    }

    override fun getItemCount(): Int {
        return kaya.size
    }

    }

