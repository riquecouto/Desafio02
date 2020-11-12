package com.example.desafio02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantesFragment : Fragment() {

    private var listaRestaurantes = mutableListOf<Restaurante>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_restaurantes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        popularLista()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerRestaurantes)

        recyclerView.adapter = RestaurantesAdapter(listaRestaurantes)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
    }

    private fun popularLista() {
        listaRestaurantes.add(Restaurante(1, R.drawable.image1, "Tony Roma's", "Av. Lavandisca, 717 - Indianápolis, São Paulo","Fecha às 22:00"))
        listaRestaurantes.add(Restaurante(2, R.drawable.image4, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema","Fecha às 00:00"))
        listaRestaurantes.add(Restaurante(3, R.drawable.image5, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 00:00"))
        listaRestaurantes.add(Restaurante(4, R.drawable.image3, "Sí Señor!", "Alameda Jauaperi, 626 - Moema","Fecha às 01:00"))
    }
}