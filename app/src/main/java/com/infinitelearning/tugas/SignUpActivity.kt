package com.infinitelearning.tugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUpActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etEmail = findViewById(R.id.edt_email)
        etPassword = findViewById(R.id.edt_password)
        etConfirmPassword = findViewById(R.id.edt_confirm_password)

        val btnRegister: Button = findViewById(R.id.btn_regist)
        btnRegister.setOnClickListener(this)

        val signInTextView: TextView = findViewById (R.id.link_signIn)
        signInTextView.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regist-> {

                val bundle = Bundle()
                bundle.putString("email", etEmail.text.toString())
                bundle.putString("password", etEmail.text.toString())
                bundle.putString("confirm_password", etEmail.text.toString())

                val intent = Intent(this@SignUpActivity, SignIn::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.link_signIn -> {
                val intent = Intent(this@SignUpActivity, SignIn::class.java)
                startActivity(intent)
            }
        }
    }
}