package com.example.desafio02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        ac_reg_btn_register.setOnClickListener() {
            callHome()
        }
    }

    fun callHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}