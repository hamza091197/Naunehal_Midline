package com.example.naunehalmidline

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.callback

        val window: Window = this@Login.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@Login, R.color.blue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        /*getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)*/
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        binding.signin.setOnClickListener {
            if (binding.username.text.toString().trim().isEmpty()){
                binding.username.error = "Enter Username"
                return@setOnClickListener
            }

            if (binding.password.text.toString().trim().isEmpty()){
                binding.password.error = "Enter Password"
                return@setOnClickListener
            }

            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        binding.signup.setOnClickListener {

            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }

        /*binding.username.addTextChangedListener (object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(binding.username.text.toString()).matches())
                    binding.signin.isEnabled = true
                else {
                    binding.signin.isEnabled = false
                    binding.username.error = "Invalid Email"
                }
            }

        })*/

        setTransparentStatusBar()
    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }




}

