package com.infinitelearning.tugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.infinitelearning.tugas.R.*
import com.infinitelearning.tugas.R.id.*

class SignIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail : EditText
    private lateinit var etPassword: EditText
//    private lateinit var etConfirmPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_sign_in)

        etEmail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_password)
//        etConfirmPassword = findViewById(R.id.edt_reg_confirm_password)

        val bundle = intent.extras
        if (bundle != null) {
            etEmail.setText(bundle.getString("email"))
            etPassword.setText(bundle.getString("password"))
//            etConfirmPassword.setText(bundle.getInt("Konfirmasi sandi"))
        }

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