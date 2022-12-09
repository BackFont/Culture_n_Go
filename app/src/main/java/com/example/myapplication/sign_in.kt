package com.example.myapplication

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class sign_in : AppCompatActivity() {
    var username: EditText? = null
    var password: EditText? = null
    var btnLogin: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        username = findViewById<View>(R.id.Username) as EditText
        password = findViewById<View>(R.id.password_edit) as EditText
        btnLogin = findViewById<View>(R.id.btn_login) as Button
        btnLogin!!.setOnClickListener {
            val usernameKey = username!!.text.toString()
            val passwordKey = password!!.text.toString()
            if (usernameKey == "admin" && passwordKey == "123") {
                //jika login berhasil
                Toast.makeText(
                    applicationContext, "LOGIN SUKSES",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this@sign_in, Dashboard::class.java)
                this@sign_in.startActivity(intent)
                finish()
            } else {
                //jika login gagal
                val builder: AlertDialog.Builder = AlertDialog.Builder(this@sign_in)
                builder.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show()
            }
        }
    }
}