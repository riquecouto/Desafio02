package com.example.desafio02

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_pratos.view.*

class PratosFragment(val nomeRestaurante: String, val imgRestaurante: Int) : Fragment() {

    private var listaPratos = mutableListOf<Prato>()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pratos, container, false)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarPratos)
        toolbar.setNavigationOnClickListener { activity!!.onBackPressed() }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        popularLista()
        view.txtFlRestauranteNome.text = nomeRestaurante
        view.imgFlPrato.setImageResource(imgRestaurante)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPratos)
        recyclerView.adapter = PratosAdapter(listaPratos)
        recyclerView.layoutManager = GridLayoutManager(view.context, 2)
    }

    private fun popularLista() {
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre1",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua")
        )
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre2",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat")
        )
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre3",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur")
        )
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre4",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum")
        )
        listaPratos.add(Prato(1, R.drawable.image4, "Salada com molho Gengibre5",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam")
        )
    }
}