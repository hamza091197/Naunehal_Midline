package com.example.naunehalmidline

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityMain1Binding
import com.example.naunehalmidline.databinding.ActivityMainBinding
import com.example.naunehalmidline.main.ContactDatabase

class MainActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMain1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main1)
        binding.callback

       /* binding.btnMain.visibility = View.GONE
        binding.btnSecond.visibility = View.GONE

        binding.btnThird.visibility = View.GONE
        binding.btnFourth.visibility = View.GONE
        binding.btnFourth2.visibility = View.GONE
        binding.btnFifth.visibility = View.GONE
        binding.btnSixth.visibility = View.GONE
        binding.btnSeven.visibility = View.GONE
        binding.btnEight.visibility = View.GONE
        binding.btnEight2.visibility = View.GONE*/

/*
        binding.btnMenu.setOnClickListener {
            binding.btnMain.visibility = View.VISIBLE
            binding.btnSecond.visibility = View.VISIBLE
            binding.btnThird.visibility = View.VISIBLE
            binding.btnFourth.visibility = View.VISIBLE
            binding.btnFourth2.visibility = View.VISIBLE
            binding.btnFifth.visibility = View.VISIBLE
            binding.btnSixth.visibility = View.VISIBLE
            binding.btnSeventh.visibility = View.VISIBLE
            binding.btnEight.visibility = View.VISIBLE
            binding.btnEight2.visibility = View.VISIBLE
        }*/
        binding.btnMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.btnThird.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        binding.btnFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        binding.btnFourth2.setOnClickListener {
            val intent = Intent(this, FourthActivity2::class.java)
            startActivity(intent)
        }

        binding.btnFifth.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

        binding.btnSixth.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }

        binding.btnSeven.setOnClickListener {
            val intent = Intent(this, SevenActivity::class.java)
            startActivity(intent)
        }

        binding.btnEight.setOnClickListener {
            val intent = Intent(this, EightActivity::class.java)
            startActivity(intent)
        }

        binding.btnEight2.setOnClickListener {
            val intent = Intent(this, EightActivity2::class.java)
            startActivity(intent)
        }

        setTransparentStatusBar()

    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }
}