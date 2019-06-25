package com.example.reciclabito

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val NEXT_ACTIVITY_REQUEST_CODE = 1

    var tUsuario:EditText? = null
    var tSenha:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tUsuario = findViewById<EditText>(R.id.name)
        tSenha = findViewById<EditText>(R.id.tsenha)
        setTitle("Usuario");
        val btCont = findViewById<Button>(R.id.buttonext)

        buttonext.setOnClickListener {

            val login = tUsuario?.text.toString()
            val senha = tSenha?.text.toString()

            if (login == "tony" && senha == "123") {
                Toast.makeText(
                    this, "login realizado com sucesso!",
                    Toast.LENGTH_LONG
                ).show()
                val nextIntent = Intent(this, BemVindo::class.java)
                startActivityForResult(nextIntent, NEXT_ACTIVITY_REQUEST_CODE)
            } else {
                Toast.makeText(
                    this, "login e/ou senha incorretos!",
                    Toast.LENGTH_LONG
                ).show()

            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int,
                                  intent: Intent?) {

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == NEXT_ACTIVITY_REQUEST_CODE && intent !=
                null) {
                tUsuario?.setText(intent.getStringExtra("loginCadastro"))
                tSenha?.setText(intent.getStringExtra("senhaCadastro"))
            }
        }
    }
    }

