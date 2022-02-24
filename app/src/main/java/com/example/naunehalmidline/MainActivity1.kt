package com.example.naunehalmidline

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityMain1Binding
import kotlinx.coroutines.launch

class MainActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMain1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity1, R.layout.activity_main1)
        binding.callback



        lifecycleScope.launch {
            binding.btnMain.setOnClickListener {
                val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
                mediaPlayer.start() // no need to call prepare(); create() does that for you
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
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
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
                val prg = ProgressDialog(this@MainActivity1)
                prg.setMessage("Please Wait....")
                Handler().postDelayed({ prg.dismiss() }, 300)
                prg.show()
                val intent = Intent(this@MainActivity1, EightActivity::class.java)
                startActivity(intent)
            }
        }

        lifecycleScope.launch {
            binding.btnEight2.setOnClickListener {
                val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibratorService.vibrate(150)
            val prg = ProgressDialog(this@MainActivity1)
            prg.setMessage("Please Wait....")
            Handler().postDelayed({ prg.dismiss() }, 300)
            prg.show()
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
        val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
        mediaPlayer.start() // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
        AlertDialog.Builder(this@MainActivity1)
            .setTitle("Exit App")
            .setMessage("Are you sure you want exit the app?")
            .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                super.onBackPressed()
                val Player = MediaPlayer.create(this@MainActivity1, R.raw.goodbye)
                Player.start() // no need to call prepare(); create() does that for you
            }
            .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->

            }
            .show()

    }

}