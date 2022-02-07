package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivitySixthBinding

class SixthActivity : AppCompatActivity() {
    lateinit var binding: ActivitySixthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sixth)
        binding.callback

        binding.btnContinue.setOnClickListener {
            binding
        }

        binding.bf0501.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.bf0501.isChecked){
                binding.bf0502.error = null
                binding.bf0503.error = null
                binding.bf0502.text = null
                binding.bf0503.text = null
                binding.bf0503.isEnabled = false
                binding.bf0502.isEnabled = false
            }
            else{
                binding.bf0502.isEnabled
                binding.bf0503.isEnabled
            }
        }
    }
}