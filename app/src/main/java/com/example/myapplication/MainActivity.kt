package com.example.myapplication

import android.content.ClipData.newIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent1: Button
    private lateinit var btnIntent2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIntent1 = findViewById(R.id.btn_signin)
        btnIntent2 = findViewById(R.id.btn_signup)
        btnIntent1.setOnClickListener(this)
        btnIntent2.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_signin -> {
                val masuk = Intent(this@MainActivity, sign_in::class.java)
                startActivity(masuk)
            }
        }
        when(v.id) {
            R.id.btn_signup -> {
                val masuk = Intent(this@MainActivity, SignUpActivity::class.java)
                startActivity(masuk)
            }
        }
    }
}