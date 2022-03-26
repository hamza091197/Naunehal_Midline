package com.example.naunehalmidline

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
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
import com.example.naunehalmidline.databinding.ActivityEightBinding
import com.example.naunehalmidline.eight.Eight
import com.example.naunehalmidline.main.Contact
import com.example.naunehalmidline.main.ContactDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class EightActivity : AppCompatActivity() {
    lateinit var binding: ActivityEightBinding
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight)
        binding.callback
        database = ContactDatabase.getDatabase(this)


        val window: Window = this@EightActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@EightActivity, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/

        binding.btnContinue.setOnClickListener{

            /*if (binding.se01.checkedRadioButtonId == -1){
                binding.se0101.requestFocus()
                binding.se0101.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0101.error = null
            }

            if (binding.se0196.isChecked && binding.se0196x.text.toString().trim().isEmpty()){
                binding.se0196x.requestFocus()
                binding.se0196x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se02.checkedRadioButtonId == -1){
                binding.se0211.requestFocus()
                binding.se0211.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0211.error = null
            }

            if (binding.se0296.isChecked && binding.se0296x.text.toString().trim().isEmpty()){
                binding.se0296x.requestFocus()
                binding.se0296x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se03.checkedRadioButtonId == -1){
                binding.se0301.requestFocus()
                binding.se0301.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0301.error = null
            }

            if (binding.se0396.isChecked && binding.se0396x.text.toString().trim().isEmpty()){
                binding.se0396x.requestFocus()
                binding.se0396x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se04.checkedRadioButtonId == -1){
                binding.se0401.requestFocus()
                binding.se0401.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0401.error = null
            }

            if (binding.se0496.isChecked && binding.se0496x.text.toString().trim().isEmpty()){
                binding.se0496x.requestFocus()
                binding.se0496x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se05.checkedRadioButtonId == -1){
                binding.se0501.requestFocus()
                binding.se0501.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0501.error = null
            }

            if (binding.se0596.isChecked && binding.se0596x.text.toString().trim().isEmpty()){
                binding.se0596x.requestFocus()
                binding.se0596x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se06a.text.toString().trim().isEmpty()){
                binding.se06a.requestFocus()
                binding.se06a.error = "Rupees"
                sound()
                return@setOnClickListener
            }

            if (binding.se07a.text.toString().trim().isEmpty()){
                binding.se07a.requestFocus()
                binding.se07a.error = "Rupees"
                sound()
                return@setOnClickListener
            }

            if (binding.se08.checkedRadioButtonId == -1){
                binding.se0801.requestFocus()
                binding.se0801.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0801.error = null
            }

            if (binding.se0896.isChecked && binding.se0896x.text.toString().trim().isEmpty()){
                binding.se0896x.requestFocus()
                binding.se0896x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se09.checkedRadioButtonId == -1){
                binding.se0998.requestFocus()
                binding.se0998.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se0998.error = null
            }

            if (binding.se10.checkedRadioButtonId == -1){
                binding.se1001.requestFocus()
                binding.se1001.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1001.error = null
            }

            if (binding.se1099.isChecked && binding.se1099x.text.toString().trim().isEmpty()){
                binding.se1099x.requestFocus()
                binding.se1099x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se11.checkedRadioButtonId == -1){
                binding.se1101.requestFocus()
                binding.se1101.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1101.error = null
            }

            if (binding.se1196.isChecked && binding.se1196x.text.toString().trim().isEmpty()){
                binding.se1196x.requestFocus()
                binding.se1196x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se12.checkedRadioButtonId == -1){
                binding.se1201.requestFocus()
                binding.se1201.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1201.error = null
            }

            if (binding.se1296.isChecked && binding.se1296x.text.toString().trim().isEmpty()){
                binding.se1296x.requestFocus()
                binding.se1296x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se13.checkedRadioButtonId == -1){
                binding.se1301.requestFocus()
                binding.se1301.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1301.error = null
            }

            if (binding.se14.checkedRadioButtonId == -1){
                binding.se1402.requestFocus()
                binding.se1402.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1402.error = null
            }

            if (binding.se15.checkedRadioButtonId == -1){
                binding.se1501.requestFocus()
                binding.se1501.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1501.error = null
            }

            if (binding.se16.checkedRadioButtonId == -1){
                binding.se1601.requestFocus()
                binding.se1601.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1601.error = null
            }

            var se17Flag = false
            binding.se17check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se17Flag = true
                }
                if (!se17Flag) return@forEach
            }
            if (!se17Flag){
                binding.se1701.error = "CheckBox Not Selected"
                binding.se1701.requestFocus()
                sound()
                return@setOnClickListener
            }
            else {
                binding.se1701.error = null
            }

            if (binding.se1801.checkedRadioButtonId == -1){
                binding.se180102.requestFocus()
                binding.se180102.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se180102.error = null
            }

            if (binding.se1802.checkedRadioButtonId == -1){
                binding.se180202.requestFocus()
                binding.se180202.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se180202.error = null
            }

            if (binding.se1803.checkedRadioButtonId == -1){
                binding.se180302.requestFocus()
                binding.se180302.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se180302.error = null
            }

            if (binding.se1804.checkedRadioButtonId == -1){
                binding.se180402.requestFocus()
                binding.se180402.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se180402.error = null
            }

            if (binding.se1805.checkedRadioButtonId == -1){
                binding.se180502.requestFocus()
                binding.se180502.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se180502.error = null
            }

            if (binding.se1896.checkedRadioButtonId == -1){
                binding.se189602.requestFocus()
                binding.se189602.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se189602.error = null
            }

            if (binding.se19.checkedRadioButtonId == -1){
                binding.se1901.requestFocus()
                binding.se1901.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se1901.error = null
            }

            if (binding.se1996.isChecked && binding.se1996x.text.toString().trim().isEmpty()){
                binding.se1996x.requestFocus()
                binding.se1996x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            var se20Flag = false
            binding.se20check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se20Flag = true
                }
                if (!se20Flag) return@forEach
            }
            if (!se20Flag){
                binding.se2001.error = "CheckBox Not Selected"
                binding.se2001.requestFocus()
                sound()
                return@setOnClickListener
            }
            else {
                binding.se2001.error = null
            }

            if (binding.se2096.isChecked && binding.se2096x.text.toString().trim().isEmpty()){
                binding.se2096x.requestFocus()
                binding.se2096x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            var se21Flag = false
            binding.se21check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se21Flag = true
                }
                if (!se21Flag) return@forEach
            }
            if (!se21Flag){
                binding.se2101.error = "CheckBox Not Selected"
                binding.se2101.requestFocus()
                sound()
                return@setOnClickListener
            }
            else {
                binding.se2101.error = null
            }

            if (binding.se2196.isChecked && binding.se2196x.text.toString().trim().isEmpty()){
                binding.se2196x.requestFocus()
                binding.se2196x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.se2201.checkedRadioButtonId == -1){
                binding.se220102.requestFocus()
                binding.se220102.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se220102.error = null
            }

            if (binding.se2202.checkedRadioButtonId == -1){
                binding.se220202.requestFocus()
                binding.se220202.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se220202.error = null
            }*/

            if (binding.se2203.checkedRadioButtonId == -1){
                binding.se220302.requestFocus()
                binding.se220302.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else{
                binding.se220302.error = null
            }

            val intent = Intent(this, EightActivity2::class.java)
            startActivity(intent)

            insertEight()
            updateEight()
        }


        binding.btnEnd.setOnClickListener {
val mediaPlayer = MediaPlayer.create(this@EightActivity, R.raw.sound)
        mediaPlayer.start() // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
            createDialog()
        }
        setTransparentStatusBar()
    }

    fun sound(){
        /*val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
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
    fun insertEight() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().insert(
                    Eight(
                        0,
                        se0196x = binding.se0196x.text.toString(),
                        se0296x = binding.se0296x.text.toString(),
                        se0396x = binding.se0396x.text.toString(),
                        se0496x = binding.se0496x.text.toString(),
                        se0596x = binding.se0596x.text.toString(),
                        se06a = binding.se06a.text.toString(),
                        se07a = binding.se07a.text.toString(),
                        se0896x = binding.se0896x.text.toString(),
                        se1099x = binding.se1099x.text.toString(),
                        se1196x = binding.se1196x.text.toString(),
                        se1296x = binding.se1296x.text.toString(),
                        se1996x = binding.se1996x.text.toString(),
                        se2096x = binding.se2096x.text.toString(),
                        se2196x = binding.se2196x.text.toString(),

                        se01 = (when  {
                            binding.se0101.isChecked -> "1"
                            binding.se0102.isChecked -> "2"
                            binding.se0103.isChecked -> "3"
                            binding.se0104.isChecked -> "4"
                            binding.se0105.isChecked -> "5"
                            binding.se0106.isChecked -> "6"
                            binding.se0107.isChecked -> "7"
                            binding.se0108.isChecked -> "8"
                            binding.se0109.isChecked -> "9"
                            binding.se0196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se02 = (when  {
                            binding.se0211.isChecked -> "1"
                            binding.se0212.isChecked -> "2"
                            binding.se0221.isChecked -> "3"
                            binding.se0222.isChecked -> "4"
                            binding.se0231.isChecked -> "5"
                            binding.se0232.isChecked -> "6"
                            binding.se0233.isChecked -> "7"
                            binding.se0234.isChecked -> "8"
                            binding.se0235.isChecked -> "9"
                            binding.se0236.isChecked -> "10"
                            binding.se0237.isChecked -> "11"
                            binding.se0296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se03 = (when {
                            binding.se0301.isChecked -> "1"
                            binding.se0302.isChecked -> "2"
                            binding.se0303.isChecked -> "3"
                            binding.se0304.isChecked -> "4"
                            binding.se0305.isChecked -> "5"
                            binding.se0306.isChecked -> "6"
                            binding.se0307.isChecked -> "7"
                            binding.se0308.isChecked -> "8"
                            binding.se0309.isChecked -> "9"
                            binding.se0310.isChecked -> "10"
                            binding.se0311.isChecked -> "11"
                            binding.se0312.isChecked -> "12"
                            binding.se0313.isChecked -> "13"
                            binding.se0314.isChecked -> "14"
                            binding.se0315.isChecked -> "15"
                            binding.se0316.isChecked -> "16"
                            binding.se0317.isChecked -> "17"
                            binding.se0396.isChecked -> "96"
                            else -> "-1"
                        }),

                        se04 = (when {
                            binding.se0401.isChecked -> "1"
                            binding.se0402.isChecked -> "2"
                            binding.se0403.isChecked -> "3"
                            binding.se0404.isChecked -> "4"
                            binding.se0405.isChecked -> "5"
                            binding.se0406.isChecked -> "6"
                            binding.se0407.isChecked -> "7"
                            binding.se0408.isChecked -> "8"
                            binding.se0409.isChecked -> "9"
                            binding.se0410.isChecked -> "10"
                            binding.se0411.isChecked -> "11"
                            binding.se0412.isChecked -> "12"
                            binding.se0413.isChecked -> "13"
                            binding.se0414.isChecked -> "14"
                            binding.se0415.isChecked -> "15"
                            binding.se0496.isChecked -> "96"
                            else -> "-1"
                        }),

                        se05 = (when {
                            binding.se0501.isChecked -> "1"
                            binding.se0502.isChecked -> "2"
                            binding.se0503.isChecked -> "3"
                            binding.se0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        se08 = (when {
                            binding.se0801.isChecked -> "1"
                            binding.se0802.isChecked -> "2"
                            binding.se0803.isChecked -> "3"
                            binding.se0804.isChecked -> "4"
                            binding.se0805.isChecked -> "5"
                            binding.se0806.isChecked -> "6"
                            binding.se0807.isChecked -> "7"
                            binding.se0808.isChecked -> "8"
                            binding.se0809.isChecked -> "9"
                            binding.se0810.isChecked -> "10"
                            binding.se0811.isChecked -> "11"
                            binding.se0812.isChecked -> "12"
                            binding.se0813.isChecked -> "13"
                            binding.se0814.isChecked -> "14"
                            binding.se0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        se09 = (when {
                            binding.se0901.isChecked -> "1"
                            binding.se0902.isChecked -> "2"
                            binding.se0998.isChecked -> "98"
                            else -> "-1"
                        }),

                        se10 = (when {
                            binding.se1001.isChecked -> "1"
                            binding.se1002.isChecked -> "2"
                            binding.se1003.isChecked -> "3"
                            binding.se1004.isChecked -> "4"
                            binding.se1005.isChecked -> "5"
                            binding.se1006.isChecked -> "6"
                            binding.se1098.isChecked -> "98"
                            binding.se1099.isChecked -> "99"
                            else -> "-1"
                        }),

                        se11 = (when {
                            binding.se1101.isChecked -> "1"
                            binding.se1102.isChecked -> "2"
                            binding.se1103.isChecked -> "3"
                            binding.se1104.isChecked -> "4"
                            binding.se1105.isChecked -> "5"
                            binding.se1106.isChecked -> "6"
                            binding.se1107.isChecked -> "7"
                            binding.se1108.isChecked -> "8"
                            binding.se1109.isChecked -> "9"
                            binding.se1110.isChecked -> "10"
                            binding.se1111.isChecked -> "11"
                            binding.se1196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se12 = (when {
                            binding.se1201.isChecked -> "1"
                            binding.se1202.isChecked -> "2"
                            binding.se1203.isChecked -> "3"
                            binding.se1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se13 = (when {
                            binding.se1301.isChecked -> "1"
                            binding.se1302.isChecked -> "2"
                            binding.se1303.isChecked -> "3"
                            binding.se1304.isChecked -> "4"
                            binding.se1305.isChecked -> "5"
                            else -> "-1"
                        }),

                        se14 = (when {
                            binding.se1401.isChecked -> "1"
                            binding.se1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se15 = (when {
                            binding.se1501.isChecked -> "1"
                            binding.se1502.isChecked -> "2"
                            binding.se1503.isChecked -> "3"
                            else -> "-1"
                        }),

                        se16 = (when {
                            binding.se1601.isChecked -> "1"
                            binding.se1602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se17 = (when {
                            binding.se1701.isChecked -> "1"
                            binding.se1702.isChecked -> "2"
                            binding.se1703.isChecked -> "3"
                            binding.se1704.isChecked -> "4"
                            binding.se1705.isChecked -> "5"
                            else -> "-1"
                        }),

                        se1801 = (when {
                            binding.se180101.isChecked -> "1"
                            binding.se180102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1802 = (when {
                            binding.se180201.isChecked -> "1"
                            binding.se180202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1803 = (when {
                            binding.se180301.isChecked -> "1"
                            binding.se180302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1804 = (when {
                            binding.se180401.isChecked -> "1"
                            binding.se180402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1805 = (when {
                            binding.se180501.isChecked -> "1"
                            binding.se180502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1896 = (when {
                            binding.se189601.isChecked -> "1"
                            binding.se189602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se19 = (when {
                            binding.se1901.isChecked -> "1"
                            binding.se1902.isChecked -> "2"
                            binding.se1903.isChecked -> "3"
                            binding.se1904.isChecked -> "4"
                            binding.se1905.isChecked -> "5"
                            binding.se1906.isChecked -> "6"
                            binding.se1907.isChecked -> "7"
                            binding.se1908.isChecked -> "8"
                            binding.se1909.isChecked -> "9"
                            binding.se1910.isChecked -> "10"
                            binding.se1911.isChecked -> "11"
                            binding.se1912.isChecked -> "12"
                            binding.se1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        se20 = (when {
                            binding.se2001.isChecked -> "1"
                            binding.se2002.isChecked -> "2"
                            binding.se2003.isChecked -> "3"
                            binding.se2004.isChecked -> "4"
                            binding.se2005.isChecked -> "5"
                            binding.se2006.isChecked -> "6"
                            binding.se2096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se21 = (when {
                            binding.se2101.isChecked -> "1"
                            binding.se2102.isChecked -> "2"
                            binding.se2103.isChecked -> "3"
                            binding.se2104.isChecked -> "4"
                            binding.se2105.isChecked -> "5"
                            binding.se2196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se2201 = (when {
                            binding.se220101.isChecked -> "1"
                            binding.se220102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2202 = (when {
                            binding.se220201.isChecked -> "1"
                            binding.se220202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2203 = (when {
                            binding.se220301.isChecked -> "1"
                            binding.se220302.isChecked -> "2"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }
    fun updateEight() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().update(
                    Eight(
                        0,
                        se0196x = binding.se0196x.text.toString(),
                        se0296x = binding.se0296x.text.toString(),
                        se0396x = binding.se0396x.text.toString(),
                        se0496x = binding.se0496x.text.toString(),
                        se0596x = binding.se0596x.text.toString(),
                        se06a = binding.se06a.text.toString(),
                        se07a = binding.se07a.text.toString(),
                        se0896x = binding.se0896x.text.toString(),
                        se1099x = binding.se1099x.text.toString(),
                        se1196x = binding.se1196x.text.toString(),
                        se1296x = binding.se1296x.text.toString(),
                        se1996x = binding.se1996x.text.toString(),
                        se2096x = binding.se2096x.text.toString(),
                        se2196x = binding.se2196x.text.toString(),

                        se01 = (when  {
                            binding.se0101.isChecked -> "1"
                            binding.se0102.isChecked -> "2"
                            binding.se0103.isChecked -> "3"
                            binding.se0104.isChecked -> "4"
                            binding.se0105.isChecked -> "5"
                            binding.se0106.isChecked -> "6"
                            binding.se0107.isChecked -> "7"
                            binding.se0108.isChecked -> "8"
                            binding.se0109.isChecked -> "9"
                            binding.se0196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se02 = (when  {
                            binding.se0211.isChecked -> "1"
                            binding.se0212.isChecked -> "2"
                            binding.se0221.isChecked -> "3"
                            binding.se0222.isChecked -> "4"
                            binding.se0231.isChecked -> "5"
                            binding.se0232.isChecked -> "6"
                            binding.se0233.isChecked -> "7"
                            binding.se0234.isChecked -> "8"
                            binding.se0235.isChecked -> "9"
                            binding.se0236.isChecked -> "10"
                            binding.se0237.isChecked -> "11"
                            binding.se0296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se03 = (when {
                            binding.se0301.isChecked -> "1"
                            binding.se0302.isChecked -> "2"
                            binding.se0303.isChecked -> "3"
                            binding.se0304.isChecked -> "4"
                            binding.se0305.isChecked -> "5"
                            binding.se0306.isChecked -> "6"
                            binding.se0307.isChecked -> "7"
                            binding.se0308.isChecked -> "8"
                            binding.se0309.isChecked -> "9"
                            binding.se0310.isChecked -> "10"
                            binding.se0311.isChecked -> "11"
                            binding.se0312.isChecked -> "12"
                            binding.se0313.isChecked -> "13"
                            binding.se0314.isChecked -> "14"
                            binding.se0315.isChecked -> "15"
                            binding.se0316.isChecked -> "16"
                            binding.se0317.isChecked -> "17"
                            binding.se0396.isChecked -> "96"
                            else -> "-1"
                        }),

                        se04 = (when {
                            binding.se0401.isChecked -> "1"
                            binding.se0402.isChecked -> "2"
                            binding.se0403.isChecked -> "3"
                            binding.se0404.isChecked -> "4"
                            binding.se0405.isChecked -> "5"
                            binding.se0406.isChecked -> "6"
                            binding.se0407.isChecked -> "7"
                            binding.se0408.isChecked -> "8"
                            binding.se0409.isChecked -> "9"
                            binding.se0410.isChecked -> "10"
                            binding.se0411.isChecked -> "11"
                            binding.se0412.isChecked -> "12"
                            binding.se0413.isChecked -> "13"
                            binding.se0414.isChecked -> "14"
                            binding.se0415.isChecked -> "15"
                            binding.se0496.isChecked -> "96"
                            else -> "-1"
                        }),

                        se05 = (when {
                            binding.se0501.isChecked -> "1"
                            binding.se0502.isChecked -> "2"
                            binding.se0503.isChecked -> "3"
                            binding.se0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        se08 = (when {
                            binding.se0801.isChecked -> "1"
                            binding.se0802.isChecked -> "2"
                            binding.se0803.isChecked -> "3"
                            binding.se0804.isChecked -> "4"
                            binding.se0805.isChecked -> "5"
                            binding.se0806.isChecked -> "6"
                            binding.se0807.isChecked -> "7"
                            binding.se0808.isChecked -> "8"
                            binding.se0809.isChecked -> "9"
                            binding.se0810.isChecked -> "10"
                            binding.se0811.isChecked -> "11"
                            binding.se0812.isChecked -> "12"
                            binding.se0813.isChecked -> "13"
                            binding.se0814.isChecked -> "14"
                            binding.se0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        se09 = (when {
                            binding.se0901.isChecked -> "1"
                            binding.se0902.isChecked -> "2"
                            binding.se0998.isChecked -> "98"
                            else -> "-1"
                        }),

                        se10 = (when {
                            binding.se1001.isChecked -> "1"
                            binding.se1002.isChecked -> "2"
                            binding.se1003.isChecked -> "3"
                            binding.se1004.isChecked -> "4"
                            binding.se1005.isChecked -> "5"
                            binding.se1006.isChecked -> "6"
                            binding.se1098.isChecked -> "98"
                            binding.se1099.isChecked -> "99"
                            else -> "-1"
                        }),

                        se11 = (when {
                            binding.se1101.isChecked -> "1"
                            binding.se1102.isChecked -> "2"
                            binding.se1103.isChecked -> "3"
                            binding.se1104.isChecked -> "4"
                            binding.se1105.isChecked -> "5"
                            binding.se1106.isChecked -> "6"
                            binding.se1107.isChecked -> "7"
                            binding.se1108.isChecked -> "8"
                            binding.se1109.isChecked -> "9"
                            binding.se1110.isChecked -> "10"
                            binding.se1111.isChecked -> "11"
                            binding.se1196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se12 = (when {
                            binding.se1201.isChecked -> "1"
                            binding.se1202.isChecked -> "2"
                            binding.se1203.isChecked -> "3"
                            binding.se1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        se13 = (when {
                            binding.se1301.isChecked -> "1"
                            binding.se1302.isChecked -> "2"
                            binding.se1303.isChecked -> "3"
                            binding.se1304.isChecked -> "4"
                            binding.se1305.isChecked -> "5"
                            else -> "-1"
                        }),

                        se14 = (when {
                            binding.se1401.isChecked -> "1"
                            binding.se1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se15 = (when {
                            binding.se1501.isChecked -> "1"
                            binding.se1502.isChecked -> "2"
                            binding.se1503.isChecked -> "3"
                            else -> "-1"
                        }),

                        se16 = (when {
                            binding.se1601.isChecked -> "1"
                            binding.se1602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se17 = (when {
                            binding.se1701.isChecked -> "1"
                            binding.se1702.isChecked -> "2"
                            binding.se1703.isChecked -> "3"
                            binding.se1704.isChecked -> "4"
                            binding.se1705.isChecked -> "5"
                            else -> "-1"
                        }),

                        se1801 = (when {
                            binding.se180101.isChecked -> "1"
                            binding.se180102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1802 = (when {
                            binding.se180201.isChecked -> "1"
                            binding.se180202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1803 = (when {
                            binding.se180301.isChecked -> "1"
                            binding.se180302.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1804 = (when {
                            binding.se180401.isChecked -> "1"
                            binding.se180402.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1805 = (when {
                            binding.se180501.isChecked -> "1"
                            binding.se180502.isChecked -> "2"
                            else -> "-1"
                        }),

                        se1896 = (when {
                            binding.se189601.isChecked -> "1"
                            binding.se189602.isChecked -> "2"
                            else -> "-1"
                        }),

                        se19 = (when {
                            binding.se1901.isChecked -> "1"
                            binding.se1902.isChecked -> "2"
                            binding.se1903.isChecked -> "3"
                            binding.se1904.isChecked -> "4"
                            binding.se1905.isChecked -> "5"
                            binding.se1906.isChecked -> "6"
                            binding.se1907.isChecked -> "7"
                            binding.se1908.isChecked -> "8"
                            binding.se1909.isChecked -> "9"
                            binding.se1910.isChecked -> "10"
                            binding.se1911.isChecked -> "11"
                            binding.se1912.isChecked -> "12"
                            binding.se1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        se20 = (when {
                            binding.se2001.isChecked -> "1"
                            binding.se2002.isChecked -> "2"
                            binding.se2003.isChecked -> "3"
                            binding.se2004.isChecked -> "4"
                            binding.se2005.isChecked -> "5"
                            binding.se2006.isChecked -> "6"
                            binding.se2096.isChecked -> "96"
                            else -> "-1"
                        }),

                        se21 = (when {
                            binding.se2101.isChecked -> "1"
                            binding.se2102.isChecked -> "2"
                            binding.se2103.isChecked -> "3"
                            binding.se2104.isChecked -> "4"
                            binding.se2105.isChecked -> "5"
                            binding.se2196.isChecked -> "96"
                            else -> "-1"
                        }),

                        se2201 = (when {
                            binding.se220101.isChecked -> "1"
                            binding.se220102.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2202 = (when {
                            binding.se220201.isChecked -> "1"
                            binding.se220202.isChecked -> "2"
                            else -> "-1"
                        }),

                        se2203 = (when {
                            binding.se220301.isChecked -> "1"
                            binding.se220302.isChecked -> "2"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    private fun createDialog() {
        AlertDialog.Builder(this@EightActivity).apply {
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
                    binding.Grp8.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }
}