package com.example.desafio02

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_detalhes.view.*

class DetalhesFragment(val nomePrato: String, val descricaoPrato: String, val imgPrato: Int) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detalhes, container, false)
        val toolbar = view.findViewById<Toolbar>(R.id.toolbarDetalhes)

        toolbar.setNavigationOnClickListener { activity!!.onBackPressed() }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.txtFlDetalhesPratoNome.text = nomePrato
        view.txtFlDetalhesPratoDescricao.text = descricaoPrato
        view.imgFlDetalhesPrato.setImageResource(imgPrato)
    }
}