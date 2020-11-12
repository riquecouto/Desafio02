package com.example.desafio02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView

class RestaurantesAdapter(private val listRestaurantes: List<Restaurante>) :
    RecyclerView.Adapter<RestaurantesAdapter.RestaurantesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_card_restaurantes, parent, false)
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

        holder.itemView.setOnClickListener {
            val manager = (holder.itemView.context as FragmentActivity).supportFragmentManager
            manager.beginTransaction().replace(R.id.flFragRestaurante, PratosFragment(), null)
                .addToBackStack(null).commit()
        }
    }

    class RestaurantesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imgRecyclerRestaurante)
        val txtNome: TextView = itemView.findViewById(R.id.txtRecyclerNome)
        val txtEndereco: TextView = itemView.findViewById(R.id.txtRecyclerEndereco)
        val txtHorario: TextView = itemView.findViewById(R.id.txtRecyclerHora)
    }
}