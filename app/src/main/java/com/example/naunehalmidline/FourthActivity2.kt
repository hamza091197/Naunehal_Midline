package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityFourth2Binding


class FourthActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityFourth2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth2)
        binding.callback
    }
}