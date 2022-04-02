package com.example.naunehalmidline

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.Fourth.Fourth2
import com.example.naunehalmidline.databinding.ActivityFourth2Binding
import com.example.naunehalmidline.main.ContactDatabase
import com.validatorcrawler.aliazaz.Clear
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FourthActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityFourth2Binding
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth2)
        binding.callback
        database = ContactDatabase.getDatabase(this)

        val window: Window = this@FourthActivity2.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@FourthActivity2, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/


        binding.btnContinue2.setOnClickListener {

          if (binding.im11.checkedRadioButtonId == -1){
                binding.im11.requestFocus()
                binding.im113.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im113.error = null

            }

            if (!binding.im1298.isChecked) {
                if (binding.im121x.text.toString().trim().isEmpty()) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "Number Of Times"
                    sound()
                return@setOnClickListener
                }

                if (!binding.im121x.isRangeTextValidate) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "The range is from 1 to 96"
                    sound()
                return@setOnClickListener
                }

            }

            if (!binding.im12a98.isChecked){

                if (binding.im12a1.text.toString().trim().isEmpty()){
                    binding.im12a1.requestFocus()
                    binding.im12a1.error = "Number of Times"
                    sound()
                return@setOnClickListener
                }

                if (!binding.im12a1.isRangeTextValidate){
                    binding.im12a1.requestFocus()
                    binding.im12a1.error = "The range is from 1 to 96"
                    sound()
                return@setOnClickListener
                }
            }

            if (binding.im13.checkedRadioButtonId == -1){
                binding.im133.requestFocus()
                binding.im133.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im133.error = null
            }

            if (binding.im14.checkedRadioButtonId == -1){
                binding.im143.requestFocus()
                binding.im143.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im143.error = null
            }

            if (!binding.im1598.isChecked){

                if (binding.im151.text.toString().trim().isEmpty()){
                    binding.im151.requestFocus()
                    binding.im151.error = "Number of Times"
                    sound()
                return@setOnClickListener
                }

                if (!binding.im151.isRangeTextValidate){
                    binding.im151.requestFocus()
                    binding.im151.error = "The range is from 1 to 96"
                    sound()
                return@setOnClickListener
                }
            }
            if (binding.im16.checkedRadioButtonId == -1){
                binding.im163.requestFocus()
                binding.im163.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im163.error = null
            }

            if (!binding.im1798.isChecked){

                if (binding.im171.text.toString().trim().isEmpty()){
                    binding.im171.requestFocus()
                    binding.im171.error = "Number of Times"
                    sound()
                return@setOnClickListener
                }

                if (!binding.im171.isRangeTextValidate){
                    binding.im171.requestFocus()
                    binding.im171.error = "The range is from 1 to 96"
                    sound()
                return@setOnClickListener
                }
            }

            if (binding.im18.checkedRadioButtonId == -1){
                binding.im183.requestFocus()
                binding.im183.error = "RadioButton Not Selected"
            } else{
                binding.im183.error = null
            }

            if (!binding.im1998.isChecked){

                if (binding.im191x.text.toString().trim().isEmpty()){
                    binding.im191x.requestFocus()
                    binding.im191x.error = "Number of Times"
                    sound()
                    return@setOnClickListener
                }

                if (!binding.im191x.isRangeTextValidate){
                    binding.im191x.requestFocus()
                    binding.im191x.error = "The range is from 1 to 96"
                    sound()
                    return@setOnClickListener
                }
            }

            if (binding.im20.checkedRadioButtonId == -1){
                binding.im203.requestFocus()
                binding.im203.error = "RadioButton Not Selected"
            } else{
                binding.im203.error = null
            }

            if (binding.im21.checkedRadioButtonId == -1){
                binding.im213.requestFocus()
                binding.im213.error = "RadioButton Not Selected"
            } else{
                binding.im213.error = null
            }

            if (!binding.im2298.isChecked){

                if (binding.im221x.text.toString().trim().isEmpty()){
                    binding.im221x.requestFocus()
                    binding.im221x.error = "Number of Times"
                    sound()
                    return@setOnClickListener
                }

                if (!binding.im221x.isRangeTextValidate){
                    binding.im221x.requestFocus()
                    binding.im221x.error = "The range is from 1 to 96"
                    sound()
                    return@setOnClickListener
                }
            }

            if (binding.im23.checkedRadioButtonId == -1){
                binding.im231.requestFocus()
                binding.im231.error = "RadioButton Not Selected"
            } else {
                binding.im231.error = null
            }

            if (binding.im236.isChecked &&
                binding.im236x.text.toString().trim().isEmpty()){
                binding.im236x.requestFocus()
                binding.im236x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im236x.error = null
            }

            if (binding.im23a.checkedRadioButtonId == -1){
                binding.im23a1.requestFocus()
                binding.im23a1.error = "RadioButton Not Selected"
            } else {
                binding.im23a1.error = null
            }

            if (binding.im23a96.isChecked &&
                binding.im23a96x.text.toString().trim().isEmpty()){
                binding.im23a96x.requestFocus()
                binding.im23a96x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im23a96x.error = null
            }

            if (binding.im23b1.text.toString().trim().isEmpty()){
                binding.im23b1.requestFocus()
                binding.im23b1.error = "Enter Day"
                sound()
                return@setOnClickListener
            }

            if (binding.im23b2.text.toString().trim().isEmpty()){
                binding.im23b2.requestFocus()
                binding.im23b2.error = "Enter Day"
                sound()
                return@setOnClickListener
            }

            if (binding.im24.checkedRadioButtonId == -1){
                binding.im241.requestFocus()
                binding.im241.error = "RadioButton Not Selected"
            } else {
                binding.im241.error = null
            }

            if (binding.im2496.isChecked &&
                binding.im2496x.text.toString().trim().isEmpty()){
                binding.im2496x.requestFocus()
                binding.im2496x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im2496x.error = null
            }

            if (binding.im25.checkedRadioButtonId == -1){
                binding.im251.requestFocus()
                binding.im251.error = "RadioButton Not Selected"
            } else {
                binding.im251.error = null
            }




            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)

            insertFourth2()
            updateFourth2()


        }

        binding.btnEnd2.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this@FourthActivity2, R.raw.sound)
            mediaPlayer.start() // no need to call prepare(); create() does that for you
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(150)
            createDialog()
        }

        im2()
        setTransparentStatusBar()
    }

    fun insertFourth2() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().insert(
                    Fourth2(
                        0,
                        im121x = binding.im121x.text.toString(),
                        im12a1 = binding.im12a1.text.toString(),
                        im151  = binding.im151.text.toString(),
                        im171 = binding.im171.text.toString(),
                        im191x = binding.im171.text.toString(),
                        im221x = binding.im221x.text.toString(),
                        im236x = binding.im236x.text.toString(),
                        im23a96x = binding.im23a96x.text.toString(),
                        im23b1 = binding.im23b1.text.toString(),
                        im23b2 = binding.im23b2.text.toString(),
                        im2496x = binding.im2496x.text.toString(),




                        im11 = (when {
                            binding.im111.isChecked -> "1"
                            binding.im112.isChecked -> "2"
                            binding.im113.isChecked -> "3"
                            else -> "-1"
                        }),

                        im1298 = (when  {
                            binding.im1298.isChecked -> "98"
                            else -> "-1"
                        }),

                        im12a98 = (when  {
                            binding.im12a98.isChecked -> "98"
                            else -> "-1"
                        }),



                        im13 = (when {
                            binding.im131.isChecked -> "1"
                            binding.im132.isChecked -> "2"
                            binding.im133.isChecked -> "98"
                            else -> "-1"
                        }),

                        im14 = (when {
                            binding.im141.isChecked -> "1"
                            binding.im142.isChecked -> "2"
                            binding.im143.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1598 = (when  {
                            binding.im1598.isChecked -> "98"
                            else -> "-1"
                        }),

                        im16 = (when {
                            binding.im161.isChecked -> "1"
                            binding.im162.isChecked -> "2"
                            binding.im163.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1798 = (when  {
                            binding.im1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        im18 = (when {
                            binding.im181.isChecked -> "1"
                            binding.im182.isChecked -> "2"
                            binding.im183.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1998 = (when  {
                            binding.im1998.isChecked -> "98"
                            else -> "-1"
                        }),

                        im20 = (when {
                            binding.im201.isChecked -> "1"
                            binding.im202.isChecked -> "2"
                            binding.im203.isChecked -> "98"
                            else -> "-1"
                        }),

                        im21 = (when {
                            binding.im211.isChecked -> "1"
                            binding.im212.isChecked -> "2"
                            binding.im213.isChecked -> "98"
                            else -> "-1"
                        }),

                        im2298 = (when  {
                            binding.im2298.isChecked -> "98"
                            else -> "-1"
                        }),

                        im23 = (when {
                            binding.im231.isChecked -> "1"
                            binding.im232.isChecked -> "2"
                            binding.im233.isChecked -> "3"
                            binding.im234.isChecked -> "4"
                            binding.im236.isChecked -> "96"
                            else -> "-1"
                        }),

                        im23a = (when {
                            binding.im23a1.isChecked -> "1"
                            binding.im23a2.isChecked -> "2"
                            binding.im23a3.isChecked -> "3"
                            binding.im23a04.isChecked -> "4"
                            binding.im23a05.isChecked -> "5"
                            binding.im23a96.isChecked -> "96"
                            else -> "-1"
                        }),

                        im24 = (when {
                            binding.im241.isChecked -> "1"
                            binding.im242.isChecked -> "2"
                            binding.im243.isChecked -> "3"
                            binding.im244.isChecked -> "4"
                            binding.im246.isChecked -> "6"
                            binding.im247.isChecked -> "7"
                            binding.im248.isChecked -> "8"
                            binding.im249.isChecked -> "9"
                            binding.im2410.isChecked -> "10"
                            binding.im2411.isChecked -> "11"
                            binding.im2412.isChecked -> "12"
                            binding.im2413.isChecked -> "13"
                            binding.im2414.isChecked -> "14"
                            binding.im2415.isChecked -> "15"
                            binding.im2416.isChecked -> "16"
                            binding.im2417.isChecked -> "17"
                            binding.im2498.isChecked -> "98"
                            binding.im2496.isChecked -> "96"
                            else -> "-1"
                        }),

                        im25 = (when {
                            binding.im251.isChecked -> "1"
                            binding.im252.isChecked -> "2"
                            binding.im253.isChecked -> "3"
                            binding.im254.isChecked -> "4"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateFourth2() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().update(
                    Fourth2(
                        0,
                        im121x = binding.im121x.text.toString(),
                        im12a1 = binding.im12a1.text.toString(),
                        im151  = binding.im151.text.toString(),
                        im171 = binding.im171.text.toString(),
                        im191x = binding.im171.text.toString(),
                        im221x = binding.im221x.text.toString(),
                        im236x = binding.im236x.text.toString(),
                        im23a96x = binding.im23a96x.text.toString(),
                        im23b1 = binding.im23b1.text.toString(),
                        im23b2 = binding.im23b2.text.toString(),
                        im2496x = binding.im2496x.text.toString(),


                        im11 = (when {
                            binding.im111.isChecked -> "1"
                            binding.im112.isChecked -> "2"
                            binding.im113.isChecked -> "3"
                            else -> "-1"
                        }),

                        im1298 = (when  {
                            binding.im1298.isChecked -> "98"
                            else -> "-1"
                        }),

                        im12a98 = (when  {
                            binding.im12a98.isChecked -> "98"
                            else -> "-1"
                        }),



                        im13 = (when {
                            binding.im131.isChecked -> "1"
                            binding.im132.isChecked -> "2"
                            binding.im133.isChecked -> "98"
                            else -> "-1"
                        }),

                        im14 = (when {
                            binding.im141.isChecked -> "1"
                            binding.im142.isChecked -> "2"
                            binding.im143.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1598 = (when  {
                            binding.im1598.isChecked -> "98"
                            else -> "-1"
                        }),

                        im16 = (when {
                            binding.im161.isChecked -> "1"
                            binding.im162.isChecked -> "2"
                            binding.im163.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1798 = (when  {
                            binding.im1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        im18 = (when {
                            binding.im181.isChecked -> "1"
                            binding.im182.isChecked -> "2"
                            binding.im183.isChecked -> "98"
                            else -> "-1"
                        }),

                        im1998 = (when  {
                            binding.im1998.isChecked -> "98"
                            else -> "-1"
                        }),

                        im20 = (when {
                            binding.im201.isChecked -> "1"
                            binding.im202.isChecked -> "2"
                            binding.im203.isChecked -> "98"
                            else -> "-1"
                        }),

                        im21 = (when {
                            binding.im211.isChecked -> "1"
                            binding.im212.isChecked -> "2"
                            binding.im213.isChecked -> "98"
                            else -> "-1"
                        }),

                        im2298 = (when  {
                            binding.im2298.isChecked -> "98"
                            else -> "-1"
                        }),

                        im23 = (when {
                            binding.im231.isChecked -> "1"
                            binding.im232.isChecked -> "2"
                            binding.im233.isChecked -> "3"
                            binding.im234.isChecked -> "4"
                            binding.im236.isChecked -> "96"
                            else -> "-1"
                        }),

                        im23a = (when {
                            binding.im23a1.isChecked -> "1"
                            binding.im23a2.isChecked -> "2"
                            binding.im23a3.isChecked -> "3"
                            binding.im23a04.isChecked -> "4"
                            binding.im23a05.isChecked -> "5"
                            binding.im23a96.isChecked -> "96"
                            else -> "-1"
                        }),

                        im24 = (when {
                            binding.im241.isChecked -> "1"
                            binding.im242.isChecked -> "2"
                            binding.im243.isChecked -> "3"
                            binding.im244.isChecked -> "4"
                            binding.im246.isChecked -> "6"
                            binding.im247.isChecked -> "7"
                            binding.im248.isChecked -> "8"
                            binding.im249.isChecked -> "9"
                            binding.im2410.isChecked -> "10"
                            binding.im2411.isChecked -> "11"
                            binding.im2412.isChecked -> "12"
                            binding.im2413.isChecked -> "13"
                            binding.im2414.isChecked -> "14"
                            binding.im2415.isChecked -> "15"
                            binding.im2416.isChecked -> "16"
                            binding.im2417.isChecked -> "17"
                            binding.im2498.isChecked -> "98"
                            binding.im2496.isChecked -> "96"
                            else -> "-1"
                        }),

                        im25 = (when {
                            binding.im251.isChecked -> "1"
                            binding.im252.isChecked -> "2"
                            binding.im253.isChecked -> "3"
                            binding.im254.isChecked -> "4"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    private fun createDialog() {
        AlertDialog.Builder(this@FourthActivity2).apply {
            setCancelable(true)
            setTitle("Alert Dialog")
            setMessage("Are you sure you want to clear this form?")
            setPositiveButton("Yes") { dialog, id ->
                //Action for "Delete".
                Log.e("click", "Positive")

                lifecycleScope.launch {
                    val def = launch { Clear.clearAllFields(binding.GrpName2) }
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

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }
    private fun im2(){
        binding.im1298.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1298.isChecked){
                binding.im121x.error = null
                binding.im121x.text = null
                binding.im121x.setEnabled(false)

            }
            else{
                binding.im121x.setEnabled(true)
            }

        }

        binding.im121x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1298.isChecked = !binding.im121x.text.toString().isNotEmpty()
                }

            })

        binding.im12a98.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im12a98.isChecked){
                binding.im12a1.error = null
                binding.im12a1.text = null
                binding.im12a1.setEnabled(false)

            }
            else{
                binding.im12a1.setEnabled(true)
            }

        }

        binding.im12a1.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im12a98.isChecked = !binding.im12a1.text.toString().isNotEmpty()
                }

            })

        binding.im1598.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1598.isChecked){
                binding.im151.error = null
                binding.im151.text = null
                binding.im151.setEnabled(false)

            }
            else{
                binding.im151.setEnabled(true)
            }

        }

        binding.im151.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1598.isChecked = !binding.im151.text.toString().isNotEmpty()
                }

            })

        binding.im1798.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1798.isChecked){
                binding.im171.error = null
                binding.im171.text = null
                binding.im171.setEnabled(false)

            }
            else{
                binding.im171.setEnabled(true)
            }

        }

        binding.im171.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1798.isChecked = !binding.im171.text.toString().isNotEmpty()
                }

            })

        binding.im1998.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1998.isChecked){
                binding.im191x.error = null
                binding.im191x.text = null
                binding.im191x.setEnabled(false)

            }
            else{
                binding.im191x.setEnabled(true)
            }

        }

        binding.im191x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1998.isChecked = !binding.im191x.text.toString().isNotEmpty()
                }

            })

        binding.im2298.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im2298.isChecked){
                binding.im221x.error = null
                binding.im221x.text = null
                binding.im191x.setEnabled(false)

            }
            else{
                binding.im221x.setEnabled(true)
            }

        }

        binding.im221x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im2298.isChecked = !binding.im221x.text.toString().isNotEmpty()
                }

            })


        /*binding.im23.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.im234.isChecked){
                binding.im23a.clearCheck()
                binding.im23a96x.text = null
                binding.im23b1.text = null
                binding.im23b2.text = null
                binding.im24.clearCheck()
                binding.im2496x.text = null
                binding.im25.clearCheck()
            }
        }*/



        /* binding.im23.setOnCheckedChangeListener { radioGroup, i ->
             if (binding.im236.isChecked){
                 binding.im23a.clearCheck()
                 binding.im23a96x.text = null
                 binding.im23b1.text = null
                 binding.im23b2.text = null
                 binding.im24.clearCheck()
                 binding.im2496x.text = null
                 binding.im25.clearCheck()
             }
         }*/


        /*binding.im12a1x.setOnCh*/
        binding.im23.setOnCheckedChangeListener { radioGroup, i ->
            if (i == binding.im231.id || i == binding.im232.id || i == binding.im233.id) {
                binding.skip231.visibility = View.GONE
                binding.skip232.visibility = View.GONE
                binding.skip233.visibility = View.GONE
                lifecycleScope.launch {
                    val skip231 = binding.skip231
                    val skip232 = binding.skip232
                    val skip233 = binding.skip233
                    clearingFields(skip231)
                    clearingFields(skip232)
                    clearingFields(skip233)
                }
            } else{
                binding.skip231.visibility = View.VISIBLE
                binding.skip232.visibility = View.VISIBLE
                binding.skip233.visibility = View.VISIBLE
            }
        }
    }

    private suspend fun clearingFields(root: ViewGroup) {
        withContext(Dispatchers.Main) {
            val children = root.children
            children.forEach { view ->
                when (view) {
                    is RadioGroup -> {
                        view.clearCheck()
                    }
                    is EditText -> {
                        view.text = null
                    }
                    is ViewGroup -> {
                        clearingFields(view)
                    }
                }
            }
        }
    }
    fun sound(){
        /*val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
        mediaPlayer.start()*/ // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
    }
}