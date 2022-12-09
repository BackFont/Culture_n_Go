package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class sign_in : AppCompatActivity(){
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    private lateinit var btLoginSubmit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val email:String = "yusrian@gmail.com"
        val password:String = "12345"
        //inisiasi atribut pada tampilan login
        etEmail= findViewById(R.id.Username)
        etPassword= findViewById(R.id.password_edit)
        btLoginSubmit= findViewById(R.id.btn_login)
        //menambahkan action button pada form login
        btLoginSubmit.setOnClickListener(View.OnClickListener {
            if (etEmail.text.isEmpty()||//aksi jika email atau password kosong
                etPassword.text.isEmpty()){
                Toast.makeText(this,"Isi data pengguna dengan benar", Toast.LENGTH_SHORT).show()
            }
            else if(etEmail.text.equals(email)&&// aksi jika email dan password sesuai
                etPassword.text.equals(password)){
                Toast.makeText(this,"Login berhasil", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@sign_in, Dashboard::class.java)
                startActivity(intent)
            }
            else{//aksi jika email atau password tidak sesuai
                Toast.makeText(this,"Login gagal ${etPassword.text.toString()}", Toast.LENGTH_SHORT).show()
            }
        })
    }
//    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.btn_login -> {
//                val masuk = Intent(this@sign_in, Dashboard::class.java)
//                startActivity(masuk)
//            }
//        }
//    }
}