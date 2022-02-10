package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityEightBinding

class EightActivity : AppCompatActivity() {
    lateinit var binding: ActivityEightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight)
        binding.callback
    }
}