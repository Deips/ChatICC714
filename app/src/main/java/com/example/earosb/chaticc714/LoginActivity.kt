package com.example.earosb.chaticc714

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_layout.*

class LoginActivity: AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        btnLogin.setOnClickListener { this }
    }

    override fun onClick(view: View?) {
        val i = view!!.id

        when (i) {
            R.id.btnLogin -> {
                //TODO implementar autentificación
                val intent = Intent (this,  MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}