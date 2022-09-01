package com.example.wisatapati

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class WisataAdapter(var listWisata : ArrayList<Wisata>) : RecyclerView.Adapter<WisataAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_wisata,parent,false)
        return GridViewHolder(view)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listWisata[position].photo)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(holder.imgPhoto)
        holder.tvNama.text = listWisata[position].lokasi
        holder.tvTema.text = listWisata[position].name

        holder.itemView.setOnClickListener {  onItemClickCallback.onItemClicked(listWisata[position])  }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_photo)
        var tvTema : TextView = itemView.findViewById(R.id.tv_tema)
        var tvNama : TextView = itemView.findViewById(R.id.tv_nama)

    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Wisata)
    }
}