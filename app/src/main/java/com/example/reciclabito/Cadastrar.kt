package com.example.reciclabito

import android.app.Activity
import android.app.Activity.*
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastrar.*
import kotlinx.android.synthetic.main.activity_main.*

class Cadastrar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        cadastrarse.setOnClickListener{

            if(cadUsuario.text.toString() != "" && cadPassword.text.toString() != ""){

                val intent = Intent()
                intent.putExtra("loginCadastro", cadUsuario.text.toString())
                intent.putExtra("senhaCadastro", cadPassword.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else{

                Toast.makeText(this, "Você precisa informar um login e senha", Toast.LENGTH_LONG).show()
            }
        }
    }
}
