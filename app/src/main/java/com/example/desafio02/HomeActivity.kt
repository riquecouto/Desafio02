package com.example.desafio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragment = RestaurantesFragment().apply {
            enterTransition = Fade()
            exitTransition = Fade()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flHomeFragment, fragment, null)
            .commit()
    }
}