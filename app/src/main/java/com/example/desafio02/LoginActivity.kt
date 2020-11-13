package com.example.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ac_main_btn_login.setOnClickListener() {
            callHome()
        }

        ac_main_btn_register.setOnClickListener() {
            callCadastro()
        }
    }

    fun callHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    fun callCadastro() {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}