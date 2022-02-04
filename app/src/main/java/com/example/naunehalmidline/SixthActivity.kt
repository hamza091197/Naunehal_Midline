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
    }
}