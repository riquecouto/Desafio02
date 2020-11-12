package com.example.desafio02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardapioFragment : Fragment() {

    private var listaPratos = mutableListOf<Prato>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cardapio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        popularLista()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPratos)

        recyclerView.adapter = PratosAdapter(listaPratos)
        recyclerView.layoutManager = GridLayoutManager(view.context, 2)
    }

    private fun popularLista() {
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre"))
    }
}