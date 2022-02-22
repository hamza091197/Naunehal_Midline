package com.example.naunehalmidline

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityEight2Binding
import com.example.naunehalmidline.eight.Eight
import com.example.naunehalmidline.eight.EightDatabase
import com.example.naunehalmidline.eight2.Eight2
import com.example.naunehalmidline.eight2.Eight2Database
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EightActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityEight2Binding
    lateinit var database: Eight2Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight2)
        binding.callback
        database = Eight2Database.getDatabase(this)


        val window: Window = this@EightActivity2.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@EightActivity2, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btnContinue2.setOnClickListener {
            if (binding.se2204.checkedRadioButtonId == -1){
                binding.se2204.requestFocus()
                binding.se220402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220402.error = null
            }

            if (binding.se2205.checkedRadioButtonId == -1){
                binding.se220502.requestFocus()
                binding.se220502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220502.error = null
            }

            if (binding.se2206.checkedRadioButtonId == -1){
                binding.se220602.requestFocus()
                binding.se220602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220602.error = null
            }

            if (binding.se2207.checkedRadioButtonId == -1){
                binding.se220702.requestFocus()
                binding.se220702.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220702.error = null
            }

            if (binding.se2208.checkedRadioButtonId == -1){
                binding.se220802.requestFocus()
                binding.se220802.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220802.error = null
            }

            if (binding.se2209.checkedRadioButtonId == -1){
                binding.se220902.requestFocus()
                binding.se220902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220902.error = null
            }

            if (binding.se2210.checkedRadioButtonId == -1){
                binding.se221002.requestFocus()
                binding.se221002.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221002.error = null
            }

            if (binding.se2211.checkedRadioButtonId == -1){
                binding.se221102.requestFocus()
                binding.se221102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221102.error = null
            }

            if (binding.se2212.checkedRadioButtonId == -1){
                binding.se221202.requestFocus()
                binding.se221202.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221202.error = null
            }

            if (binding.se2213.checkedRadioButtonId == -1){
                binding.se221302.requestFocus()
                binding.se221302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221302.error = null
            }

            if (binding.se2214.checkedRadioButtonId == -1){
                binding.se221402.requestFocus()
                binding.se221402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221402.error = null
            }

            if (binding.se2215.checkedRadioButtonId == -1){
                binding.se221502.requestFocus()
                binding.se221502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221502.error = null
            }

            if (binding.se2216.checkedRadioButtonId == -1){
                binding.se221602.requestFocus()
                binding.se221602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221602.error = null
            }

            if (binding.se2217.checkedRadioButtonId == -1){
                binding.se221702.requestFocus()
                binding.se221702.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221702.error = null
            }

            if (binding.se2218.checkedRadioButtonId == -1){
                binding.se221802.requestFocus()
                binding.se221802.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221802.error = null
            }

            if (binding.se23.checkedRadioButtonId == -1){
                binding.se2302.requestFocus()
                binding.se2302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se2302.error = null
            }

            if (binding.se24.text.toString().trim().isEmpty()){
                binding.se24.requestFocus()
                binding.se24.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se24.isRangeTextValidate){
                binding.se24.requestFocus()
                binding.se24.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.se25.text.toString().trim().isEmpty()){
                binding.se25.requestFocus()
                binding.se25.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se25.isRangeTextValidate){
                binding.se25.requestFocus()
                binding.se25.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.se26.text.toString().trim().isEmpty()){
                binding.se26.requestFocus()
                binding.se26.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se26.isRangeTextValidate){
                binding.se26.requestFocus()
                binding.se26.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            var se27Flag = false
            binding.se27check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se27Flag = true
                }
                if (!se27Flag) return@forEach
            }
            if (!se27Flag){
                binding.se2701.error = "CheckBox Not Selected"
                binding.se2701.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2701.error = null
            }

            var se28Flag = false
            binding.se28check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se28Flag = true
                }
                if (!se28Flag) return@forEach
            }
            if (!se28Flag){
                binding.se2803.error = "CheckBox Not Selected"
                binding.se2803.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2803.error = null
            }

            if (binding.se29.checkedRadioButtonId == -1){
                binding.se2902.requestFocus()
                binding.se2902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.se2902.error = null
            }

            var se30Flag = false
            binding.se30check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se30Flag = true
                }
                if (!se30Flag) return@forEach
            }
            if (!se30Flag){
                binding.se3001.error = "CheckBox Not Selected"
                binding.se3001.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se3001.error = null
            }

            if (binding.se3096.isChecked && binding.se3096x.text.toString().trim().isEmpty()){
                binding.se3096x.requestFocus()
                binding.se3096x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se31.checkedRadioButtonId == -1){
                binding.se3101.requestFocus()
                binding.se3101.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3101.error = null
            }

            if (binding.se3196.isChecked && binding.se3196x.text.toString().trim().isEmpty()){
                binding.se3196x.requestFocus()
                binding.se3196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se32.checkedRadioButtonId == -1){
                binding.se3201.requestFocus()
                binding.se3201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3201.error = null
            }

            if (binding.se3302.text.toString().trim().isEmpty()){
                binding.se3302.requestFocus()
                binding.se3302.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.se3302.isRangeTextValidate){
                binding.se3302.requestFocus()
                binding.se3302.error = "The range is from 1 to 24"
                return@setOnClickListener
            }

            if (binding.se3301.text.toString().trim().isEmpty()){
                binding.se3301.requestFocus()
                binding.se3301.error = "Minutes"
                return@setOnClickListener
            }

            if (!binding.se3301.isRangeTextValidate){
                binding.se3301.requestFocus()
                binding.se3301.error = "The range is from 0 to 59"
                return@setOnClickListener
            }

            if (binding.se41.checkedRadioButtonId == -1){
                binding.se4198.requestFocus()
                binding.se4198.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4198.error = null
            }

            if (binding.se42.checkedRadioButtonId == -1){
                binding.se4201.requestFocus()
                binding.se4201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4201.error = null
            }

            if (binding.se4296.isChecked && binding.se4296x.text.toString().trim().isEmpty()){
                binding.se4296x.requestFocus()
                binding.se4296x.error = "Other"
                return@setOnClickListener
            }

            var se43Flag = false
            binding.se43check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se43Flag = true
                }
                if (!se43Flag) return@forEach
            }
            if (!se43Flag){
                binding.se4301.error = "CheckBox Not Selected"
                binding.se4301.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4301.error = null
            }

            if (binding.se4396.isChecked && binding.se4396x.text.toString().trim().isEmpty()){
                binding.se4396x.requestFocus()
                binding.se4396x.error = "Other"
                return@setOnClickListener
            }

            var se44Flag = false
            binding.se44check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se44Flag = true
                }
                if (!se44Flag) return@forEach
            }
            if (!se44Flag){
                binding.se4401.error = "CheckBox Not Selected"
                binding.se4401.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4401.error = null
            }

            if (binding.se4496.isChecked && binding.se4496x.text.toString().trim().isEmpty()){
                binding.se4496x.requestFocus()
                binding.se4496x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se45.checkedRadioButtonId == -1){
                binding.se4598.requestFocus()
                binding.se4598.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4598.error = null
            }

            var se46Flag = false
            binding.se46check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se46Flag = true
                }
                if (!se46Flag) return@forEach
            }
            if (!se46Flag){
                binding.se4601.error = "CheckBox Not Selected"
                binding.se4601.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4601.error = null
            }

            if (binding.se4696.isChecked && binding.se4696x.text.toString().trim().isEmpty()){
                binding.se4696x.requestFocus()
                binding.se4696x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se48.checkedRadioButtonId == -1){
                binding.se4898.requestFocus()
                binding.se4898.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4898.error = null
            }

            var se49Flag = false
            binding.se49check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se49Flag = true
                }
                if (!se49Flag) return@forEach
            }
            if (!se49Flag){
                binding.se4901.error = "CheckBox Not Selected"
                binding.se4901.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4901.error = null
            }

            if (binding.se4996.isChecked && binding.se4996x.text.toString().trim().isEmpty()){
                binding.se4996x.requestFocus()
                binding.se4996x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se50.checkedRadioButtonId == -1){
                binding.se5001.requestFocus()
                binding.se5001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se5001.error = null
            }

            if (binding.se5096.isChecked && binding.se5096x.text.toString().trim().isEmpty()){
                binding.se5096x.requestFocus()
                binding.se5096x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se3401.text.toString().trim().isEmpty()){
                binding.se3401.requestFocus()
                binding.se3401.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.se3401.isRangeTextValidate){
                binding.se3401.requestFocus()
                binding.se3401.error = "The range is from 1 to 24"
                return@setOnClickListener
            }

            if (binding.se3402.text.toString().trim().isEmpty()){
                binding.se3402.requestFocus()
                binding.se3402.error = "Minutes"
                return@setOnClickListener
            }

            if (!binding.se3402.isRangeTextValidate){
                binding.se3402.requestFocus()
                binding.se3402.error = "The range is from 0 to 59"
                return@setOnClickListener
            }

            if (binding.se35.checkedRadioButtonId == -1){
                binding.se3598.requestFocus()
                binding.se3598.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3598.error = null
            }

            if (binding.se36.checkedRadioButtonId == -1){
                binding.se3698.requestFocus()
                binding.se3698.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3698.error = null
            }

            var se37Flag = false
            binding.se37check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se37Flag = true
                }
                if (!se37Flag) return@forEach
            }
            if (!se37Flag){
                binding.se3701.error = "CheckBox Not Selected"
                binding.se3701.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se3701.error = null
            }

            if (binding.se3796.isChecked && binding.se3796x.text.toString().trim().isEmpty()){
                binding.se3796x.requestFocus()
                binding.se3796x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se38.checkedRadioButtonId == -1){
                binding.se3898.requestFocus()
                binding.se3898.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3898.error = null
            }

            if (binding.se39.checkedRadioButtonId == -1){
                binding.se3902.requestFocus()
                binding.se3902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3902.error = null
            }

            if (binding.se40.checkedRadioButtonId == -1){
                binding.se4098.requestFocus()
                binding.se4098.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4098.error = null
            }

            val refresh = Intent(this, EightActivity2::class.java)
            startActivity(refresh)

            binding.fab82.setOnClickListener {
                RoomExplorer.show(this, Eight2Database::class.java, "eight2DB")
            }

            insertEight2()
            updateEight2()
        }

        binding.btnEnd2.setOnClickListener {
            createDialog()
        }
        setTransparentStatusBar()
    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

    fun insertEight2() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.Eight2Dao().insert(
                    Eight2(
                        0,
                        se24 = binding.se24.text.toString(),
                        se25 = binding.se25.text.toString(),
                        se26 = binding.se26.text.toString(),
                        se3096x = binding.se3096x.text.toString(),
                        se3196x = binding.se3196x.text.toString(),
                        se3302 = binding.se3302.text.toString(),
                        se3301 = binding.se3301.text.toString(),
                        se4296x = binding.se4296x.text.toString(),
                        se4396x = binding.se4396x.text.toString(),
                        se4496x = binding.se4496x.text.toString(),
                        se4696x = binding.se4696x.text.toString(),
                        se4796x = binding.se4796x.text.toString(),
                        se4996x = binding.se4996x.text.toString(),
                        se5096x = binding.se5096x.text.toString(),
                        se3402 = binding.se3302.text.toString(),
                        se3401 = binding.se3301.text.toString(),
                        se3796x = binding.se3796x.text.toString(),


                        se2204 = (when {
                            binding.se220401.isChecked -> "1"
                            binding.se220402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2205 = (when {
                            binding.se220501.isChecked -> "1"
                            binding.se220502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2206 = (when {
                            binding.se220601.isChecked -> "1"
                            binding.se220602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2207 = (when {
                            binding.se220701.isChecked -> "1"
                            binding.se220702.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2208 = (when {
                            binding.se220801.isChecked -> "1"
                            binding.se220802.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2209 = (when {
                            binding.se220901.isChecked -> "1"
                            binding.se220902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2210 = (when {
                            binding.se221001.isChecked -> "1"
                            binding.se221002.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2211 = (when {
                            binding.se221101.isChecked -> "1"
                            binding.se221102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2212 = (when {
                            binding.se221201.isChecked -> "1"
                            binding.se221202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2213 = (when {
                            binding.se221301.isChecked -> "1"
                            binding.se221302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2214 = (when {
                            binding.se221401.isChecked -> "1"
                            binding.se221402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2215 = (when {
                            binding.se221501.isChecked -> "1"
                            binding.se221502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2216 = (when {
                            binding.se221601.isChecked -> "1"
                            binding.se221602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2217 = (when {
                            binding.se221701.isChecked -> "1"
                            binding.se221702.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2218 = (when {
                            binding.se221801.isChecked -> "1"
                            binding.se221802.isChecked -> "2"
                            else -> "-1"
                        }),

                        se23 = (when {
                            binding.se2301.isChecked -> "1"
                            binding.se2302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se27 = (when {
                            binding.se2701.isChecked -> "1"
                            binding.se2702.isChecked -> "2"
                            binding.se2703.isChecked -> "3"
                            else -> "-1"
                        }),


                        se28 = (when {
                            binding.se2801.isChecked -> "1"
                            binding.se2802.isChecked -> "2"
                            binding.se2803.isChecked -> "3"
                            else -> "-1"
                        }),

                        se29 = (when {
                            binding.se2901.isChecked -> "1"
                            binding.se2902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se30 = (when  {
                            binding.se3001.isChecked -> "1"
                            binding.se3002.isChecked -> "2"
                            binding.se3003.isChecked -> "3"
                            binding.se3096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se31 = (when  {
                            binding.se3101.isChecked -> "1"
                            binding.se3102.isChecked -> "2"
                            binding.se3196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se32 = (when {
                            binding.se3201.isChecked -> "1"
                            binding.se3202.isChecked -> "2"
                            binding.se3203.isChecked -> "3"
                            binding.se3204.isChecked -> "4"
                            binding.se3205.isChecked -> "5"
                            binding.se3206.isChecked -> "6"
                            binding.se3207.isChecked -> "7"
                            binding.se3208.isChecked -> "8"
                            binding.se3209.isChecked -> "9"
                            else -> "-1"
                        }),

                        se41 = (when {
                            binding.se4101.isChecked -> "1"
                            binding.se4102.isChecked -> "2"
                            binding.se4198.isChecked -> "98"
                            else -> "-1"
                        }),

                        se42 = (when {
                            binding.se4201.isChecked -> "1"
                            binding.se4202.isChecked -> "2"
                            binding.se4203.isChecked -> "3"
                            binding.se4204.isChecked -> "4"
                            binding.se4205.isChecked -> "5"
                            binding.se4298.isChecked -> "98"
                            binding.se4296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se43 = (when {
                            binding.se4301.isChecked -> "1"
                            binding.se4302.isChecked -> "2"
                            binding.se4303.isChecked -> "3"
                            binding.se4304.isChecked -> "4"
                            binding.se4305.isChecked -> "5"
                            binding.se4306.isChecked -> "6"
                            binding.se4307.isChecked -> "7"
                            binding.se4308.isChecked -> "8"
                            binding.se4309.isChecked -> "9"
                            binding.se4310.isChecked -> "10"
                            binding.se4311.isChecked -> "11"
                            binding.se4396.isChecked -> "96"
                            else -> "-1"
                        }),

                        se44 = (when {
                            binding.se4401.isChecked -> "1"
                            binding.se4402.isChecked -> "2"
                            binding.se4403.isChecked -> "3"
                            binding.se4404.isChecked -> "4"
                            binding.se4496.isChecked -> "96"
                            else -> "-1"
                        }),

                        se45 = (when {
                            binding.se4501.isChecked -> "1"
                            binding.se4502.isChecked -> "2"
                            binding.se4598.isChecked -> "98"
                            else -> "-1"
                        }),

                        se46 = (when {
                            binding.se4601.isChecked -> "1"
                            binding.se4602.isChecked -> "2"
                            binding.se4603.isChecked -> "3"
                            binding.se4604.isChecked -> "4"
                            binding.se4605.isChecked -> "5"
                            binding.se4606.isChecked -> "6"
                            binding.se4696.isChecked -> "96"
                            else -> "-1"
                        }),

                        se47 = (when {
                            binding.se4701.isChecked -> "1"
                            binding.se4702.isChecked -> "2"
                            binding.se4703.isChecked -> "3"
                            binding.se4704.isChecked -> "4"
                            binding.se4705.isChecked -> "5"
                            binding.se4706.isChecked -> "6"
                            binding.se4707.isChecked -> "7"
                            binding.se4796.isChecked -> "96"
                            else -> "-1"
                        }),

                        se48 = (when {
                            binding.se4801.isChecked -> "1"
                            binding.se4802.isChecked -> "2"
                            binding.se4898.isChecked -> "98"
                            else -> "-1"
                        }),

                        se49 = (when {
                            binding.se4901.isChecked -> "1"
                            binding.se4902.isChecked -> "2"
                            binding.se4903.isChecked -> "3"
                            binding.se4904.isChecked -> "4"
                            binding.se4998.isChecked -> "98"
                            binding.se4996.isChecked -> "96"
                            else -> "-1"
                        }),

                        se50 = (when {
                            binding.se5001.isChecked -> "1"
                            binding.se5002.isChecked -> "2"
                            binding.se5003.isChecked -> "3"
                            binding.se5098.isChecked -> "98"
                            binding.se5096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se35 = (when {
                            binding.se3501.isChecked -> "1"
                            binding.se3502.isChecked -> "2"
                            binding.se3598.isChecked -> "98"
                            else -> "-1"
                        }),

                        se36 = (when {
                            binding.se3601.isChecked -> "1"
                            binding.se3602.isChecked -> "2"
                            binding.se3698.isChecked -> "98"
                            else -> "-1"
                        }),

                        se37 = (when {
                            binding.se3701.isChecked -> "1"
                            binding.se3702.isChecked -> "2"
                            binding.se3703.isChecked -> "3"
                            binding.se3704.isChecked -> "4"
                            binding.se3705.isChecked -> "5"
                            binding.se3706.isChecked -> "6"
                            binding.se3707.isChecked -> "7"
                            binding.se3708.isChecked -> "8"
                            binding.se3709.isChecked -> "9"
                            binding.se3710.isChecked -> "10"
                            binding.se3796.isChecked -> "96"
                            else -> "-1"
                        }),


                        se38 = (when {
                            binding.se3801.isChecked -> "1"
                            binding.se3802.isChecked -> "2"
                            binding.se3803.isChecked -> "3"
                            binding.se3804.isChecked -> "4"
                            binding.se3805.isChecked -> "5"
                            binding.se3898.isChecked -> "98"
                            else -> "-1"
                        }),

                        se39 = (when {
                            binding.se3901.isChecked -> "1"
                            binding.se3902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se40 = (when {
                            binding.se4001.isChecked -> "1"
                            binding.se4002.isChecked -> "2"
                            binding.se4098.isChecked -> "98"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }
    fun updateEight2() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.Eight2Dao().update(
                    Eight2(
                        0,
                        se24 = binding.se24.text.toString(),
                        se25 = binding.se25.text.toString(),
                        se26 = binding.se26.text.toString(),
                        se3096x = binding.se3096x.text.toString(),
                        se3196x = binding.se3196x.text.toString(),
                        se3302 = binding.se3302.text.toString(),
                        se3301 = binding.se3301.text.toString(),
                        se4296x = binding.se4296x.text.toString(),
                        se4396x = binding.se4396x.text.toString(),
                        se4496x = binding.se4496x.text.toString(),
                        se4696x = binding.se4696x.text.toString(),
                        se4796x = binding.se4796x.text.toString(),
                        se4996x = binding.se4996x.text.toString(),
                        se5096x = binding.se5096x.text.toString(),
                        se3402 = binding.se3302.text.toString(),
                        se3401 = binding.se3301.text.toString(),
                        se3796x = binding.se3796x.text.toString(),


                        se2204 = (when {
                            binding.se220401.isChecked -> "1"
                            binding.se220402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2205 = (when {
                            binding.se220501.isChecked -> "1"
                            binding.se220502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2206 = (when {
                            binding.se220601.isChecked -> "1"
                            binding.se220602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2207 = (when {
                            binding.se220701.isChecked -> "1"
                            binding.se220702.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2208 = (when {
                            binding.se220801.isChecked -> "1"
                            binding.se220802.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2209 = (when {
                            binding.se220901.isChecked -> "1"
                            binding.se220902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2210 = (when {
                            binding.se221001.isChecked -> "1"
                            binding.se221002.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2211 = (when {
                            binding.se221101.isChecked -> "1"
                            binding.se221102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2212 = (when {
                            binding.se221201.isChecked -> "1"
                            binding.se221202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2213 = (when {
                            binding.se221301.isChecked -> "1"
                            binding.se221302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2214 = (when {
                            binding.se221401.isChecked -> "1"
                            binding.se221402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2215 = (when {
                            binding.se221501.isChecked -> "1"
                            binding.se221502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2216 = (when {
                            binding.se221601.isChecked -> "1"
                            binding.se221602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2217 = (when {
                            binding.se221701.isChecked -> "1"
                            binding.se221702.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2218 = (when {
                            binding.se221801.isChecked -> "1"
                            binding.se221802.isChecked -> "2"
                            else -> "-1"
                        }),

                        se23 = (when {
                            binding.se2301.isChecked -> "1"
                            binding.se2302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se27 = (when {
                            binding.se2701.isChecked -> "1"
                            binding.se2702.isChecked -> "2"
                            binding.se2703.isChecked -> "3"
                            else -> "-1"
                        }),


                        se28 = (when {
                            binding.se2801.isChecked -> "1"
                            binding.se2802.isChecked -> "2"
                            binding.se2803.isChecked -> "3"
                            else -> "-1"
                        }),

                        se29 = (when {
                            binding.se2901.isChecked -> "1"
                            binding.se2902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se30 = (when  {
                            binding.se3001.isChecked -> "1"
                            binding.se3002.isChecked -> "2"
                            binding.se3003.isChecked -> "3"
                            binding.se3096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se31 = (when  {
                            binding.se3101.isChecked -> "1"
                            binding.se3102.isChecked -> "2"
                            binding.se3196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se32 = (when {
                            binding.se3201.isChecked -> "1"
                            binding.se3202.isChecked -> "2"
                            binding.se3203.isChecked -> "3"
                            binding.se3204.isChecked -> "4"
                            binding.se3205.isChecked -> "5"
                            binding.se3206.isChecked -> "6"
                            binding.se3207.isChecked -> "7"
                            binding.se3208.isChecked -> "8"
                            binding.se3209.isChecked -> "9"
                            else -> "-1"
                        }),

                        se41 = (when {
                            binding.se4101.isChecked -> "1"
                            binding.se4102.isChecked -> "2"
                            binding.se4198.isChecked -> "98"
                            else -> "-1"
                        }),

                        se42 = (when {
                            binding.se4201.isChecked -> "1"
                            binding.se4202.isChecked -> "2"
                            binding.se4203.isChecked -> "3"
                            binding.se4204.isChecked -> "4"
                            binding.se4205.isChecked -> "5"
                            binding.se4298.isChecked -> "98"
                            binding.se4296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se43 = (when {
                            binding.se4301.isChecked -> "1"
                            binding.se4302.isChecked -> "2"
                            binding.se4303.isChecked -> "3"
                            binding.se4304.isChecked -> "4"
                            binding.se4305.isChecked -> "5"
                            binding.se4306.isChecked -> "6"
                            binding.se4307.isChecked -> "7"
                            binding.se4308.isChecked -> "8"
                            binding.se4309.isChecked -> "9"
                            binding.se4310.isChecked -> "10"
                            binding.se4311.isChecked -> "11"
                            binding.se4396.isChecked -> "96"
                            else -> "-1"
                        }),

                        se44 = (when {
                            binding.se4401.isChecked -> "1"
                            binding.se4402.isChecked -> "2"
                            binding.se4403.isChecked -> "3"
                            binding.se4404.isChecked -> "4"
                            binding.se4496.isChecked -> "96"
                            else -> "-1"
                        }),

                        se45 = (when {
                            binding.se4501.isChecked -> "1"
                            binding.se4502.isChecked -> "2"
                            binding.se4598.isChecked -> "98"
                            else -> "-1"
                        }),

                        se46 = (when {
                            binding.se4601.isChecked -> "1"
                            binding.se4602.isChecked -> "2"
                            binding.se4603.isChecked -> "3"
                            binding.se4604.isChecked -> "4"
                            binding.se4605.isChecked -> "5"
                            binding.se4606.isChecked -> "6"
                            binding.se4696.isChecked -> "96"
                            else -> "-1"
                        }),

                        se47 = (when {
                            binding.se4701.isChecked -> "1"
                            binding.se4702.isChecked -> "2"
                            binding.se4703.isChecked -> "3"
                            binding.se4704.isChecked -> "4"
                            binding.se4705.isChecked -> "5"
                            binding.se4706.isChecked -> "6"
                            binding.se4707.isChecked -> "7"
                            binding.se4796.isChecked -> "96"
                            else -> "-1"
                        }),

                        se48 = (when {
                            binding.se4801.isChecked -> "1"
                            binding.se4802.isChecked -> "2"
                            binding.se4898.isChecked -> "98"
                            else -> "-1"
                        }),

                        se49 = (when {
                            binding.se4901.isChecked -> "1"
                            binding.se4902.isChecked -> "2"
                            binding.se4903.isChecked -> "3"
                            binding.se4904.isChecked -> "4"
                            binding.se4998.isChecked -> "98"
                            binding.se4996.isChecked -> "96"
                            else -> "-1"
                        }),

                        se50 = (when {
                            binding.se5001.isChecked -> "1"
                            binding.se5002.isChecked -> "2"
                            binding.se5003.isChecked -> "3"
                            binding.se5098.isChecked -> "98"
                            binding.se5096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se35 = (when {
                            binding.se3501.isChecked -> "1"
                            binding.se3502.isChecked -> "2"
                            binding.se3598.isChecked -> "98"
                            else -> "-1"
                        }),

                        se36 = (when {
                            binding.se3601.isChecked -> "1"
                            binding.se3602.isChecked -> "2"
                            binding.se3698.isChecked -> "98"
                            else -> "-1"
                        }),

                        se37 = (when {
                            binding.se3701.isChecked -> "1"
                            binding.se3702.isChecked -> "2"
                            binding.se3703.isChecked -> "3"
                            binding.se3704.isChecked -> "4"
                            binding.se3705.isChecked -> "5"
                            binding.se3706.isChecked -> "6"
                            binding.se3707.isChecked -> "7"
                            binding.se3708.isChecked -> "8"
                            binding.se3709.isChecked -> "9"
                            binding.se3710.isChecked -> "10"
                            binding.se3796.isChecked -> "96"
                            else -> "-1"
                        }),


                        se38 = (when {
                            binding.se3801.isChecked -> "1"
                            binding.se3802.isChecked -> "2"
                            binding.se3803.isChecked -> "3"
                            binding.se3804.isChecked -> "4"
                            binding.se3805.isChecked -> "5"
                            binding.se3898.isChecked -> "98"
                            else -> "-1"
                        }),

                        se39 = (when {
                            binding.se3901.isChecked -> "1"
                            binding.se3902.isChecked -> "2"
                            else -> "-1"
                        }),

                        se40 = (when {
                            binding.se4001.isChecked -> "1"
                            binding.se4002.isChecked -> "2"
                            binding.se4098.isChecked -> "98"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    private fun createDialog() {
        AlertDialog.Builder(this@EightActivity2).apply {
            setCancelable(true)
            setTitle("Alert Dialog")
            setMessage("Are you sure you want to clear this form?")
            setPositiveButton("Yes") { dialog, id ->
                //Action for "Delete".
                Log.e("click", "positive")

                lifecycleScope.launch {
                    val def = launch { Clear.clearAllFields(binding.GrpName) }
                    def.join()
                    /*startActivity(Intent(this@MainActivity, MainActivity::class.java))*/
                    binding.Grp82.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

}