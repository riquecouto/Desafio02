package com.example.desafio02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PratosAdapter(private val listPratos: List<Prato>) : RecyclerView.Adapter<PratosAdapter.PratosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_card_pratos, parent, false)
        return PratosViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPratos.size
    }

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        holder.txtNome.text = listPratos[position].nome
        holder.imageView.setImageResource(listPratos[position].imagem)

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Voce tocou no prato: ${listPratos[position].nome}", Toast.LENGTH_SHORT).show()
        }
    }

    class PratosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imgRecyclerPrato)
        val txtNome : TextView = itemView.findViewById(R.id.txtRecyclerPratoNome)
    }
}