package com.example.naunehalmidline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {
    lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_registration)
        binding.callback

        binding.registration.setOnClickListener {
            if (binding.username.text.toString().trim().isEmpty()){
                binding.username.error = "Enter Username"
                return@setOnClickListener
            }

            if (binding.email.text.toString().trim().isEmpty()){
                binding.email.error = "Enter Email"
                return@setOnClickListener
            }

            if (binding.password.text.toString().trim().isEmpty()){
                binding.password.error = "Enter Password"
                return@setOnClickListener
            }

            if (binding.confirmpassword.text.toString().trim().isEmpty()){
                binding.confirmpassword.error = "Enter Confirm Password"
                return@setOnClickListener
            }

            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

        /*binding.email.addTextChangedListener (object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                if (Patterns.EMAIL_ADDRESS.matcher(binding.email.text.toString()).matches())
                    binding.email.isEnabled = true
                else {
                    binding.email.isEnabled = false
                    binding.email.error = "Invalid Email"
                }
            }

        })*/

    }
}