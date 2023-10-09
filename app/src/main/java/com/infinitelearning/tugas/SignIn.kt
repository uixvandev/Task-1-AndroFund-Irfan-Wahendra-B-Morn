package com.infinitelearning.tugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.infinitelearning.tugas.R.*
import com.infinitelearning.tugas.R.id.*

class SignIn : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_sign_in)

        val btnSignIn: Button = findViewById(btn_signin)
        btnSignIn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            btn_signin -> {
                val intent = Intent(this@SignIn, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}