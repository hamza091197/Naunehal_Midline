package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityEight2Binding

class EightActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityEight2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight2)
        binding.callback
    }
}