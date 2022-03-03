package com.example.naunehalmidline

import android.app.Activity
import android.content.Context
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
import com.example.naunehalmidline.databinding.ActivityFourth2Binding
import com.validatorcrawler.aliazaz.Clear
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FourthActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityFourth2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth2)
        binding.callback


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