package com.example.desafio02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RestaurantesAdapter(private val listRestaurantes: List<Restaurante>) : RecyclerView.Adapter<RestaurantesAdapter.RestaurantesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_card_restaurante, parent, false)
        return RestaurantesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listRestaurantes.size
    }

    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
        holder.txtNome.text = listRestaurantes[position].nome
        holder.txtEndereco.text = listRestaurantes[position].endereco
        holder.txtHorario.text = listRestaurantes[position].horario
        holder.imageView.setImageResource(listRestaurantes[position].imagem)

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Voce tocou no restaure: ${listRestaurantes[position].nome}", Toast.LENGTH_SHORT).show()
        }
    }

    class RestaurantesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imgRecyclerRestaurante)
        val txtNome : TextView = itemView.findViewById(R.id.txtRecyclerNome)
        val txtEndereco : TextView = itemView.findViewById(R.id.txtRecyclerEndereco)
        val txtHorario : TextView = itemView.findViewById(R.id.txtRecyclerHora)
    }
}