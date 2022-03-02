package com.example.naunehalmidline

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityMain1Binding
import com.example.naunehalmidline.databinding.BottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.coroutines.launch


class MainActivity1 : AppCompatActivity() {
lateinit var binding: ActivityMain1Binding

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity1, R.layout.activity_main1)
        binding.callback

        binding.title.translationY = -1000f
        binding.title.animate().translationY(0f).duration = 1000

        binding.text.translationY = -1000f
        binding.text.animate().translationY(0f).duration = 3000


        // val dialogView = layoutInflater.inflate(R.layout.progress_dialog, null)

        /*binding.btnMain.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, MainActivity::class.java)
            startActivity(intent)
        }



        binding.btnSecond.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, SecondActivity::class.java)
            startActivity(intent)
        }


        binding.btnThird.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, ThirdActivity::class.java)
            startActivity(intent)
        }



        binding.btnFourth.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, FourthActivity::class.java)
            startActivity(intent)
        }



        binding.btnFourth2.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, FourthActivity2::class.java)
            startActivity(intent)
        }



        binding.btnFifth.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, FifthActivity::class.java)
            startActivity(intent)
        }



        binding.btnSixth.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, SixthActivity::class.java)
            startActivity(intent)
        }



        binding.btnSeven.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, SevenActivity::class.java)
            startActivity(intent)
        }



        binding.btnEight.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, EightActivity::class.java)
            startActivity(intent)
        }



        binding.btnEight2.setOnClickListener {
            prg()
            val intent = Intent(this@MainActivity1, EightActivity2::class.java)
            startActivity(intent)
        }*/

       binding.btnShowBottomSheet.setOnClickListener {

            // on below line we are creating a new bottom sheet dialog.
            val dialog = BottomSheetDialog(this)
            // on below line we are inflating a layout file which we have created.
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
            val bind = BottomSheetDialogBinding.inflate(layoutInflater, view as ViewGroup, false)
            // on below line we are creating a variable for our button
            // which we are using to dismiss our dialog.
            /*val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)
            val btnmain = view.findViewById<Button>(R.id.btn_main)*/

            /*binding.btnSecond.setOnClickListener {
                prg()
                val intent = Intent(this@MainActivity1, MainActivity::class.java)
                startActivity(intent)
            }*/
            /*btnmain.setOnClickListener {
                prg()
                val intent = Intent(this@MainActivity1, SecondActivity::class.java)
                startActivity(intent)
            }*/

               bind.btnMain.setOnClickListener {
                   prg()
                   val intent = Intent(this@MainActivity1, MainActivity::class.java)
                   startActivity(intent)
               }



                   bind.btnSecond.setOnClickListener {
                       prg()
                       val intent = Intent(this@MainActivity1, SecondActivity::class.java)
                       startActivity(intent)
                   }


           bind.btnThird.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, ThirdActivity::class.java)
                    startActivity(intent)
                }



           bind.btnFourth.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, FourthActivity::class.java)
                    startActivity(intent)
                }



           bind.btnFourth2.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, FourthActivity2::class.java)
                    startActivity(intent)
                }



           bind.btnFifth.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, FifthActivity::class.java)
                    startActivity(intent)
                }



           bind.btnSixth.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, SixthActivity::class.java)
                    startActivity(intent)
                }



           bind.btnSeven.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, SevenActivity::class.java)
                    startActivity(intent)
                }



           bind.btnEight.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, EightActivity::class.java)
                    startActivity(intent)
                }



           bind.btnEight2.setOnClickListener {
                    prg()
                    val intent = Intent(this@MainActivity1, EightActivity2::class.java)
                    startActivity(intent)
                }


            // on below line we are adding on click listener
            // for our dismissing the dialog button.
            bind.idBtnDismiss.setOnClickListener {
                // on below line we are calling a dismiss
                // method to close our dialog.
                dialog.dismiss()
            }
            // below line is use to set cancelable to avoid
            // closing of dialog box when clicking on the screen.
            dialog.setCancelable(false)
            // on below line we are setting
            // content view to our view.
            dialog.setContentView(bind.root)
            // on below line we are calling
            // a show method to display a dialog.
            dialog.show()
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

        /*val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
        mediaPlayer.start()*/ // no need to call prepare(); create() does that for you
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

    fun prg(){
        val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
        mediaPlayer.start() // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
        val prg = ProgressDialog(this@MainActivity1)
            prg.setMessage("Please Wait....")
        val builder = AlertDialog.Builder(this@MainActivity1)
        val dialogView = layoutInflater.inflate(R.layout.progress_dialog, null)
         val message = dialogView.findViewById<TextView>(R.id.message)
         message.text = "PLease Wait...."
        builder.setView(dialogView)
        builder.setCancelable(false)
        val dialog = builder.create()
        dialog.show()
        Handler().postDelayed({dialog.dismiss()}, 3000)
    }

}


