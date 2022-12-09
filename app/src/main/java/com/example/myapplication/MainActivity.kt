package com.example.myapplication

import android.content.ClipData.newIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var signIn: Button
    private lateinit var signUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signIn = findViewById(R.id.btn_signin)
        signUp = findViewById(R.id.btn_signup)
        signIn.setOnClickListener(this)
        signUp.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_signin -> {
                val signin = Intent(this@MainActivity, sign_in::class.java)
                startActivity(signin)
            }
        }
        when(v.id) {
            R.id.btn_signup -> {
                val signup = Intent(this@MainActivity, SignUpActivity::class.java)
                startActivity(signup)
            }
        }
    }
}