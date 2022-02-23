package com.example.naunehalmidline

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityMain1Binding
import com.example.naunehalmidline.databinding.ActivityMainBinding
import com.example.naunehalmidline.main.ContactDatabase
import kotlinx.coroutines.launch

class MainActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMain1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity1, R.layout.activity_main1)
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

        lifecycleScope.launch {
            binding.btnMain.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, MainActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnSecond.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, SecondActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnThird.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, ThirdActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnFourth.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, FourthActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnFourth2.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, FourthActivity2::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnFifth.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, FifthActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnSixth.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, SixthActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnSeven.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, SevenActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnEight.setOnClickListener {
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, EightActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            val prg = ProgressDialog(this@MainActivity1)
            prg.setMessage("Please Wait....")
            Handler().postDelayed({ prg.dismiss() }, 300)
            prg.show()
            binding.btnEight2.setOnClickListener {
                val intent = Intent(this@MainActivity1, EightActivity2::class.java)
                startActivity(intent)
            }
        }

        setTransparentStatusBar()

    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this@MainActivity1)
            .setTitle("Exit App")
            .setMessage("Are you sure you want exit the app?")
            .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                super.onBackPressed()
            }
            .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->

            }
            .show()
    }

}