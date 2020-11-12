package com.example.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ac_main_btn_login.setOnClickListener() {
            callHome()
        }

        ac_main_btn_register.setOnClickListener() {
            callCadastro()
        }
    }

    fun callHome() {
        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    fun callCadastro() {
        var intent = Intent(this, CardapioActivity::class.java)
        startActivity(intent)
    }
}