package com.example.naunehalmidline

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivitySecondBinding
import com.example.naunehalmidline.main.Contact
import com.example.naunehalmidline.main.ContactDatabase
import com.example.naunehalmidline.second.Second
import com.example.naunehalmidline.second.SecondDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SecondActivity : AppCompatActivity() {
    lateinit var database: SecondDatabase
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.callback
        database = SecondDatabase.getDatabase(this)

       /* val actionBar = supportActionBar
        actionBar?.title = "Child Basic Information"
        actionBar?.setDisplayHomeAsUpEnabled(true)*/

        title ="Child Basic Information"
        val window: Window = this@SecondActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@SecondActivity, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/
        /*supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#146775")))*/


        binding.btnContinue.setOnClickListener { 
            
            if (binding.cb01.text.toString().trim().isEmpty()){
                binding.cb01.requestFocus()
                binding.cb01.error = " Line no"
                sound()
                return@setOnClickListener
            }
            
            if (binding.cb02.text.toString().trim().isEmpty()){
                binding.cb02.requestFocus()
                binding.cb02.error = " Name"
                sound()
                return@setOnClickListener
            }

            if (binding.cb03.checkedRadioButtonId == -1){
                binding.cb03.requestFocus()
                binding.cb0302.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb0302.error = null
            }
            
            if (binding.cb04dd.text.toString().trim().isEmpty()){
                binding.cb04dd.requestFocus()
                binding.cb04dd.error = " Days"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb04dd.isRangeTextValidate){
                binding.cb04dd.requestFocus()
                binding.cb04dd.error = "The range is from 1 to 29"
                sound()
                return@setOnClickListener
            }

            if (binding.cb04mm.text.toString().trim().isEmpty()){
                binding.cb04mm.requestFocus()
                binding.cb04mm.error = " Months"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb04mm.isRangeTextValidate){
                binding.cb04mm.requestFocus()
                binding.cb04mm.error = "The range is from 1 to 11"
                sound()
                return@setOnClickListener
            }

            if (binding.cb04yy.text.toString().trim().isEmpty()){
                binding.cb04yy.requestFocus()
                binding.cb04yy.error = " Year"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb04yy.isRangeTextValidate){
                binding.cb04yy.requestFocus()
                binding.cb04yy.error = "The range is from 2015 to 2021"
                sound()
                return@setOnClickListener
            }

            if (binding.cb0501.text.toString().trim().isEmpty()){
                binding.cb0501.requestFocus()
                binding.cb0501.error = " Year"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb0501.isRangeTextValidate){
                binding.cb0501.requestFocus()
                binding.cb0501.error = "The range is from 1 to 5"
                sound()
                return@setOnClickListener
            }

            if (binding.cb0502.text.toString().trim().isEmpty()){
                binding.cb0502.requestFocus()
                binding.cb0502.error = " Months"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb0502.isRangeTextValidate){
                binding.cb0502.requestFocus()
                binding.cb0502.error = "The range is from 1 to 11"
                sound()
                return@setOnClickListener
            }
            
            if (binding.cb06.checkedRadioButtonId == -1){
                binding.cb06.requestFocus()
                binding.cb0601.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb0601.error = null
            }
            
            if (binding.cb15.text.toString().trim().isEmpty()){
                binding.cb15.requestFocus()
                binding.cb15.error = "Birth weight (kg)"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb15.isRangeTextValidate){
                binding.cb15.requestFocus()
                binding.cb15.error = "The range is from 0.5 to 9.0"
                sound()
                return@setOnClickListener
            }

            if (binding.cb17.checkedRadioButtonId == -1){
                binding.cb17.requestFocus()
                binding.cb1701.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb1701.error = null
            }

            if (binding.cb07.text.toString().trim().isEmpty()){
                binding.cb07.requestFocus()
                binding.cb07.error = "Name of Mother"
                sound()
                return@setOnClickListener
            }

            if (binding.cb08.text.toString().trim().isEmpty()){
                binding.cb08.requestFocus()
                binding.cb08.error = "Age"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb08.isRangeTextValidate){
                binding.cb08.requestFocus()
                binding.cb08.error = "The range is from 12 to 99"
                sound()
                return@setOnClickListener
            }

            if (binding.cb09.text.toString().trim().isEmpty()){
                binding.cb09.requestFocus()
                binding.cb09.error = "Education Qualification of respondent Mention completed years of education; Code: 55 for uneducated, and 22 for only religious studies"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb09.isRangeTextValidate){
                binding.cb09.requestFocus()
                binding.cb09.error = "The range is from 1 to 17"
                sound()
                return@setOnClickListener
            }

            if (binding.cb16.checkedRadioButtonId == -1){
                binding.cb1603.requestFocus()
                binding.cb1603.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb1603.error = null
            }

            if (binding.cb10.checkedRadioButtonId == -1){
                binding.cb10.requestFocus()
                binding.cb1001.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }



            if (binding.cb11.checkedRadioButtonId == -1){
                binding.cb11.requestFocus()
                binding.cb1102.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb1102.error = null
            }

            if (binding.cb13.text.toString().trim().isEmpty()){
                binding.cb13.requestFocus()
                binding.cb13.error = "Education Qualification of Father Mention completed years of education; Code: 55 for uneducated, and 22 for only religious studies"
                sound()
                return@setOnClickListener
            }

            if (!binding.cb13.isRangeTextValidate){
                binding.cb13.requestFocus()
                binding.cb13.error = "The range is from 1 to 17"
                sound()
                return@setOnClickListener
            }

            if (binding.cb14.checkedRadioButtonId == -1){
                binding.cb14.requestFocus()
                binding.cb1401.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb1401.error = null
            }

            if (binding.cb1496.isChecked &&
                binding.cb1496x.text.toString().trim().isEmpty()){
                binding.cb1496x.requestFocus()
                binding.cb1496x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }
            else {
                binding.cb1496x.error = null
            }
            val prg = ProgressDialog(this)
            prg.setMessage("Please Wait....")
            Handler().postDelayed({prg.dismiss()}, 3000)
            prg.show()

            val refresh = Intent(this, SecondActivity::class.java)
            startActivity(refresh)

            insertSecond()
            updateSecond()
        }

        binding.fab2.setOnClickListener {
            RoomExplorer.show(this, SecondDatabase::class.java, "secondDB")
        }

        binding.btnEnd.setOnClickListener {
val mediaPlayer = MediaPlayer.create(this@SecondActivity, R.raw.sound)
        mediaPlayer.start() // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
            createDialog()
        }

        setTransparentStatusBar()
        /*Child_Basic_Information()*/
    }

    fun sound(){
        /*val mediaPlayer = MediaPlayer.create(this@SecondActivity, R.raw.beep)
        mediaPlayer.start()*/ // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT
    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

    private fun createDialog() {
        AlertDialog.Builder(this@SecondActivity).apply {
            setCancelable(true)
            setTitle("Alert Dialog")
            setMessage("Are you sure you want to clear this form?")
            setPositiveButton("Yes") { dialog, id ->
                //Action for "Delete".
                Log.e("click", "Positive")

                lifecycleScope.launch {
                    val def = launch { Clear.clearAllFields(binding.GrpName) }
                    def.join()
                    /*startActivity(Intent(this@MainActivity, MainActivity::class.java))*/
                    binding.Grp2.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun insertSecond() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SecondDao().insert(
                    Second(
                        0,
                        cb01 = binding.cb01.text.toString(),
                        cb02 = binding.cb02.text.toString(),
                        cb04dd = binding.cb04dd.text.toString(),
                        cb04mm = binding.cb04mm.text.toString(),
                        cb04yy = binding.cb04yy.text.toString(),
                        cb0501 = binding.cb0501.text.toString(),
                        cb0502 = binding.cb0502.text.toString(),
                        cb15 = binding.cb15.text.toString(),
                        cb07 = binding.cb07.text.toString(),
                        cb08 = binding.cb08.text.toString(),
                        cb09 = binding.cb09.text.toString(),
                        cb12 = binding.cb12.text.toString(),
                        cb13 = binding.cb13.text.toString(),
                        cb1496x = binding.cb1496x.text.toString(),
                        cb1096x = binding.cb1096x.text.toString(),

                       cb03 = (when  {
                            binding.cb0301.isChecked -> "1"
                            binding.cb0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cb06 = (when {
                            binding.cb0601.isChecked -> "1"
                            binding.cb0602.isChecked -> "2"
                            binding.cb0603.isChecked -> "3"
                            binding.cb0696.isChecked -> "4"
                            else -> "-1"
                        }),

                        cb17 = (when {
                            binding.cb1701.isChecked -> "1"
                            binding.cb1702.isChecked -> "2"
                            binding.cb1703.isChecked -> "3"
                            binding.cb1704.isChecked -> "4"
                            binding.cb1705.isChecked -> "5"
                            binding.cb1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        cb16 = (when {
                            binding.cb1601.isChecked -> "1"
                            binding.cb1602.isChecked -> "2"
                            binding.cb1603.isChecked -> "3"

                            else -> "-1"
                        }),

                        cb10 = (when {
                            binding.cb1001.isChecked -> "1"
                            binding.cb1002.isChecked -> "2"
                            binding.cb1003.isChecked -> "3"
                            binding.cb1004.isChecked -> "4"
                            binding.cb1005.isChecked -> "5"
                            binding.cb1006.isChecked -> "6"
                            binding.cb1007.isChecked -> "7"
                            binding.cb1008.isChecked -> "8"
                            binding.cb1009.isChecked -> "9"
                            binding.cb1010.isChecked -> "10"
                            binding.cb1011.isChecked -> "11"
                            binding.cb1012.isChecked -> "12"
                            binding.cb1013.isChecked -> "13"
                            binding.cb1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        cb11 = (when  {
                            binding.cb1101.isChecked -> "1"
                            binding.cb1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cb14 = (when {
                            binding.cb1401.isChecked -> "1"
                            binding.cb1402.isChecked -> "2"
                            binding.cb1403.isChecked -> "3"
                            binding.cb1404.isChecked -> "4"
                            binding.cb1405.isChecked -> "5"
                            binding.cb1406.isChecked -> "6"
                            binding.cb1407.isChecked -> "7"
                            binding.cb1408.isChecked -> "8"
                            binding.cb1409.isChecked -> "9"
                            binding.cb1410.isChecked -> "10"
                            binding.cb1411.isChecked -> "11"
                            binding.cb1412.isChecked -> "12"
                            binding.cb1413.isChecked -> "13"
                            binding.cb1496.isChecked -> "96"
                            else -> "-1"
                        }),
                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateSecond() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SecondDao().update(
                    Second(
                        0,
                        cb01 = binding.cb01.text.toString(),
                        cb02 = binding.cb02.text.toString(),
                        cb04dd = binding.cb04dd.text.toString(),
                        cb04mm = binding.cb04mm.text.toString(),
                        cb04yy = binding.cb04yy.text.toString(),
                        cb0501 = binding.cb0501.text.toString(),
                        cb0502 = binding.cb0502.text.toString(),
                        cb15 = binding.cb15.text.toString(),
                        cb07 = binding.cb07.text.toString(),
                        cb08 = binding.cb08.text.toString(),
                        cb09 = binding.cb09.text.toString(),
                        cb12 = binding.cb12.text.toString(),
                        cb13 = binding.cb13.text.toString(),
                        cb1496x = binding.cb1496x.text.toString(),
                        cb1096x = binding.cb1096x.text.toString(),

                        cb03 = (when  {
                            binding.cb0301.isChecked -> "1"
                            binding.cb0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cb06 = (when {
                            binding.cb0601.isChecked -> "1"
                            binding.cb0602.isChecked -> "2"
                            binding.cb0603.isChecked -> "3"
                            binding.cb0696.isChecked -> "4"
                            else -> "-1"
                        }),

                        cb17 = (when {
                            binding.cb1701.isChecked -> "1"
                            binding.cb1702.isChecked -> "2"
                            binding.cb1703.isChecked -> "3"
                            binding.cb1704.isChecked -> "4"
                            binding.cb1705.isChecked -> "5"
                            binding.cb1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        cb16 = (when {
                            binding.cb1601.isChecked -> "1"
                            binding.cb1602.isChecked -> "2"
                            binding.cb1603.isChecked -> "3"

                            else -> "-1"
                        }),

                        cb10 = (when {
                            binding.cb1001.isChecked -> "1"
                            binding.cb1002.isChecked -> "2"
                            binding.cb1003.isChecked -> "3"
                            binding.cb1004.isChecked -> "4"
                            binding.cb1005.isChecked -> "5"
                            binding.cb1006.isChecked -> "6"
                            binding.cb1007.isChecked -> "7"
                            binding.cb1008.isChecked -> "8"
                            binding.cb1009.isChecked -> "9"
                            binding.cb1010.isChecked -> "10"
                            binding.cb1011.isChecked -> "11"
                            binding.cb1012.isChecked -> "12"
                            binding.cb1013.isChecked -> "13"
                            binding.cb1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        cb11 = (when  {
                            binding.cb1101.isChecked -> "1"
                            binding.cb1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cb14 = (when {
                            binding.cb1401.isChecked -> "1"
                            binding.cb1402.isChecked -> "2"
                            binding.cb1403.isChecked -> "3"
                            binding.cb1404.isChecked -> "4"
                            binding.cb1405.isChecked -> "5"
                            binding.cb1406.isChecked -> "6"
                            binding.cb1407.isChecked -> "7"
                            binding.cb1408.isChecked -> "8"
                            binding.cb1409.isChecked -> "9"
                            binding.cb1410.isChecked -> "10"
                            binding.cb1411.isChecked -> "11"
                            binding.cb1412.isChecked -> "12"
                            binding.cb1413.isChecked -> "13"
                            binding.cb1496.isChecked -> "96"
                            else -> "-1"
                        }),
                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

}