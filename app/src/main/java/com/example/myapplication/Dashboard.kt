package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView

class Dashboard : AppCompatActivity(), View.OnClickListener {
    private lateinit var logout: Button
    private lateinit var editPro: Button
    private lateinit var wayang: Button
    private lateinit var reog: Button
    private lateinit var sekaten: Button
    private lateinit var borobudur: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        logout = findViewById(R.id.logOutB)
        editPro = findViewById(R.id.editProfileB)
        wayang = findViewById(R.id.wayangCard)
        sekaten = findViewById(R.id.sekatenCard)
        reog = findViewById(R.id.reogCard)
        borobudur = findViewById(R.id.borobudurCard)
        logout.setOnClickListener(this)
        editPro.setOnClickListener(this)
        wayang.setOnClickListener(this)
        sekaten.setOnClickListener(this)
        reog.setOnClickListener(this)
        borobudur.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.logOutB -> {
                val keluar = Intent(this@Dashboard, MainActivity::class.java)
                startActivity(keluar)
            }
        }
        when(v.id) {
            R.id.editProfileB -> {
                val edit = Intent(this@Dashboard, SignUpActivity::class.java)
                startActivity(edit)
            }
        }
        when(v.id) {
            R.id.wayangCard -> {
                val Vwayang = Intent(this@Dashboard, MenuBudaya::class.java)
                startActivity(Vwayang)
            }
        }
        when(v.id) {
            R.id.sekatenCard -> {
                val Vsekaten = Intent(this@Dashboard, SignUpActivity::class.java)
                startActivity(Vsekaten)
            }
        }
        when(v.id) {
            R.id.borobudurCard -> {
                val Vborobudur = Intent(this@Dashboard, MainActivity::class.java)
                startActivity(Vborobudur)
            }
        }
        when(v.id) {
            R.id.reogCard -> {
                val Vreog = Intent(this@Dashboard, SignUpActivity::class.java)
                startActivity(Vreog)
            }
        }
    }
}
