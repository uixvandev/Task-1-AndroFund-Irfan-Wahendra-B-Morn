package com.infinitelearning.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.infinitelearning.tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragment1 = Fragment1()
        val fragment2 = Fragment2()
        val existingFragment = fragmentManager.findFragmentByTag(Fragment1::class.java.simpleName)

        if (existingFragment == null) {
            fragmentManager.beginTransaction().add(R.id.fragmentContainerView, fragment1, Fragment1::class.java.simpleName).commit()
        } else if (existingFragment !is Fragment2) {
            fragmentManager.beginTransaction().add(R.id.fragmentContainerView, fragment2, Fragment2::class.java.simpleName).commit()
        }



        tv = findViewById(R.id.textView)

        val email = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "email: $email dan Password: $password"

        val btnImplicit: Button = findViewById(R.id.btnImplicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnImplicit -> {
//                val message = tv.text
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plain"
//                startActivity(intent)

                val intent = Intent()
                intent.putExtra("history", "Anda Telah Login")
                setResult(RESULT_OK, intent)
                finish()
            }


        }

    }

}