package com.example.desafio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class HomeActivity : AppCompatActivity() {
    companion object{
        lateinit var fm: FragmentManager
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.flFragRestaurante, RestaurantesFragment(), null).commit()
    }
}