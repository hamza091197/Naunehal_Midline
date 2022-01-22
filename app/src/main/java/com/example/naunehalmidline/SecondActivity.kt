package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.callback

        val actionBar = supportActionBar
        actionBar?.title = "Child Basic Information"
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}