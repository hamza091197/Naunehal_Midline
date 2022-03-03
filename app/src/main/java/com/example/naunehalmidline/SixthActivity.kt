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
import android.view.Window
import android.view.WindowManager
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivitySixthBinding
import com.example.naunehalmidline.fifth.Fifth
import com.example.naunehalmidline.fifth.FifthDatabase
import com.example.naunehalmidline.sixth.Sixth
import com.example.naunehalmidline.sixth.SixthDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SixthActivity : AppCompatActivity() {
    lateinit var binding: ActivitySixthBinding
    lateinit var database: SixthDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sixth)
        binding.callback
        database = SixthDatabase.getDatabase(this)


        val window: Window = this@SixthActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@SixthActivity, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/

        binding.btnContinue.setOnClickListener {

            if (binding.bf01.text.toString().trim().isEmpty()){
                binding.bf01.requestFocus()
                binding.bf01.error = "Enter Child's line number"
                sound()
                return@setOnClickListener
            }

            if (binding.bf02.text.toString().trim().isEmpty()){
                binding.bf02.requestFocus()
                binding.bf02.error = "WRA's Name"
                sound()
                return@setOnClickListener
            }

            if (binding.bf3y.text.toString().trim().isEmpty()){
                binding.bf3y.requestFocus()
                binding.bf3y.error = "Enter Years"
                sound()
                return@setOnClickListener
            }

            if (binding.bf03m.text.toString().trim().isEmpty()){
                binding.bf03m.requestFocus()
                binding.bf03m.error = "Enter Months"
                sound()
                return@setOnClickListener
            }

            if (binding.bf3d.text.toString().trim().isEmpty()){
                binding.bf3d.requestFocus()
                binding.bf3d.error = "Enter Days"
                sound()
                return@setOnClickListener
            }

            if (binding.bf03a01.text.toString().trim().isEmpty()){
                binding.bf03a01.requestFocus()
                binding.bf03a01.error = "Enter Months"
                sound()
                return@setOnClickListener
            }

            if (binding.bf03a02.text.toString().trim().isEmpty()){
                binding.bf03a02.requestFocus()
                binding.bf03a02.error = "Enter Years"
                sound()
                return@setOnClickListener
            }

            if (binding.bf04.checkedRadioButtonId == -1){
                binding.bf0401.requestFocus()
                binding.bf0498.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.bf0498.error = null
            }

            if (!binding.bf0501.isChecked){
                if (binding.bf0502.text.toString().trim().isEmpty()){
                    binding.bf0502.requestFocus()
                    binding.bf0502.error = "Enter Hours"
                    sound()
                return@setOnClickListener
                }
                if (!binding.bf0502.isRangeTextValidate){
                    binding.bf0502.requestFocus()
                    binding.bf0502.error = "The range is from 1 to 24"
                    sound()
                return@setOnClickListener
                }

                if (binding.bf0503.text.toString().trim().isEmpty()){
                    binding.bf0503.requestFocus()
                    binding.bf0503.error = "Enter Hours"
                    sound()
                return@setOnClickListener
                }
                if (!binding.bf0503.isRangeTextValidate){
                    binding.bf0503.requestFocus()
                    binding.bf0503.error = "The range is from 1 to 24"
                    sound()
                return@setOnClickListener
                }
            }

            if (binding.bf06.checkedRadioButtonId == -1){
                binding.bf0601.requestFocus()
                binding.bf0698.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.bf0698.error = null
            }

            if (binding.bf07.checkedRadioButtonId == -1){
                binding.bf0701.requestFocus()
                binding.bf0701.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf0701.error = null
            }

            if (binding.bf0796.isChecked &&
                binding.bf0796x.text.toString().trim().isEmpty()){
                binding.bf0796x.requestFocus()
                binding.bf0796x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.bf08.checkedRadioButtonId == -1){
                binding.bf0801.requestFocus()
                binding.bf0898.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf0898.error = null
            }

            var bf09Flag = false
            binding.bf09check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    bf09Flag = true
                }
                if (!bf09Flag) return@forEach
            }
            if (!bf09Flag){
                binding.bf0901.error = "CheckBox Not Selected"
                binding.bf0901.requestFocus()
                sound()
                return@setOnClickListener
            }
            else {
                binding.bf0901.error = null
            }

            if (binding.bf0996.isChecked &&
                binding.bf0996x.text.toString().trim().isEmpty()){
                binding.bf0996x.requestFocus()
                binding.bf0996x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.bf10.checkedRadioButtonId == -1){
                binding.bf1096.requestFocus()
                binding.bf1096.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf1096.error = null
            }

            if (binding.bf12.checkedRadioButtonId == -1){
                binding.bf1298.requestFocus()
                binding.bf1298.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf1298.error = null
            }

            if (binding.bf13.checkedRadioButtonId == -1){
                binding.bf1398.requestFocus()
                binding.bf1398.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf1398.error = null
            }

            if (binding.bf14a.checkedRadioButtonId == -1){
                binding.bf14a98.requestFocus()
                binding.bf14a98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14a98.error = null
            }

            if (!binding.bf14b02.isChecked && !binding.bf14b98.isChecked){
                if (binding.bf14b01.text.toString().trim().isEmpty()){
                    binding.bf14b01.requestFocus()
                    binding.bf14b01.error = ""
                    sound()
                return@setOnClickListener
                }
                if (!binding.bf14b01.isRangeTextValidate){
                    binding.bf14b01.requestFocus()
                    binding.bf14b01.error = "The range is from 1 to 23"
                    sound()
                return@setOnClickListener
                }
            }


            if (!binding.bf14c02.isChecked && !binding.bf14c98.isChecked){
                if (binding.bf14c01.text.toString().trim().isEmpty()){
                    binding.bf14c01.requestFocus()
                    binding.bf14c01.error = ""
                    sound()
                return@setOnClickListener
                }
                if (!binding.bf14c01.isRangeTextValidate){
                    binding.bf14c01.requestFocus()
                    binding.bf14c01.error = "The range is from 1 to 23"
                    sound()
                return@setOnClickListener
                }
            }

            if (binding.bf14d.checkedRadioButtonId == -1){
                binding.bf14d98.requestFocus()
                binding.bf14d98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14d98.error = null
            }

            if (binding.bf14e.checkedRadioButtonId == -1){
                binding.bf14e98.requestFocus()
                binding.bf14e98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14e98.error = null
            }

            if (!binding.bf14f02.isChecked && !binding.bf14f98.isChecked){
                if (binding.bf14f01.text.toString().trim().isEmpty()){
                    binding.bf14f01.requestFocus()
                    binding.bf14f01.error = "Enter Hours"
                    sound()
                return@setOnClickListener
                }
                if (!binding.bf14f01.isRangeTextValidate){
                    binding.bf14f01.requestFocus()
                    binding.bf14f01.error = "The range is from 1 to 23"
                    sound()
                return@setOnClickListener
                }
            }

            if (binding.bf14g.checkedRadioButtonId == -1){
                binding.bf14g98.requestFocus()
                binding.bf14g98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14g98.error = null
            }

            if (binding.bf14h.checkedRadioButtonId == -1){
                binding.bf14h98.requestFocus()
                binding.bf14h98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14h98.error = null
            }

            if (binding.bf14i.checkedRadioButtonId == -1){
                binding.bf14i98.requestFocus()
                binding.bf14i98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf14i98.error = null
            }

            if (binding.bf15a.checkedRadioButtonId == -1){
                binding.bf15a98.requestFocus()
                binding.bf15a98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15a98.error = null
            }

            if (binding.bf15b.checkedRadioButtonId == -1){
                binding.bf15b98.requestFocus()
                binding.bf15b98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15b98.error = null
            }

            if (binding.bf15c.checkedRadioButtonId == -1){
                binding.bf15c98.requestFocus()
                binding.bf15c98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15c98.error = null
            }

            if (binding.bf15d.checkedRadioButtonId == -1){
                binding.bf15d98.requestFocus()
                binding.bf15d98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15d98.error = null
            }

            if (binding.bf15e.checkedRadioButtonId == -1){
                binding.bf15e98.requestFocus()
                binding.bf15e98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15e98.error = null
            }

            if (binding.bf15f.checkedRadioButtonId == -1){
                binding.bf15f98.requestFocus()
                binding.bf15f98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15f98.error = null
            }
            
            if (binding.bf15g.checkedRadioButtonId == -1){
                binding.bf15g98.requestFocus()
                binding.bf15g98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15g98.error = null
            }

            if (binding.bf15h.checkedRadioButtonId == -1){
                binding.bf15h98.requestFocus()
                binding.bf15h98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15h98.error = null
            }

            if (binding.bf15i.checkedRadioButtonId == -1){
                binding.bf15i98.requestFocus()
                binding.bf15i98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15i98.error = null
            }

            if (binding.bf15j.checkedRadioButtonId == -1){
                binding.bf15j98.requestFocus()
                binding.bf15j98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15j98.error = null
            }

            if (binding.bf15k.checkedRadioButtonId == -1){
                binding.bf15k98.requestFocus()
                binding.bf15k98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15k98.error = null
            }

            if (binding.bf15l.checkedRadioButtonId == -1){
                binding.bf15l98.requestFocus()
                binding.bf15l98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15l98.error = null
            }

            if (binding.bf15m.checkedRadioButtonId == -1){
                binding.bf15m98.requestFocus()
                binding.bf15m98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15m98.error = null
            }

            if (binding.bf15n.checkedRadioButtonId == -1){
                binding.bf15n98.requestFocus()
                binding.bf15n98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15n98.error = null
            }

            if (binding.bf15o.checkedRadioButtonId == -1){
                binding.bf15o98.requestFocus()
                binding.bf15o98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15o98.error = null
            }

            if (binding.bf15p.checkedRadioButtonId == -1){
                binding.bf15p98.requestFocus()
                binding.bf15p98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15p98.error = null
            }

            if (binding.bf15q.checkedRadioButtonId == -1){
                binding.bf15q98.requestFocus()
                binding.bf15q98.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf15q98.error = null
            }

            if (binding.bf16.checkedRadioButtonId == -1){
                binding.bf1698.requestFocus()
                binding.bf1698.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }

            else {
                binding.bf1698.error = null
            }

            if(binding.bf18.checkedRadioButtonId == -1){
                binding.bf1898.requestFocus()
                binding.bf1898.error = "RadioButton Not selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.bf1898.error = null
            }


            if (binding.bf19.checkedRadioButtonId == -1){
                binding.bf1901.requestFocus()
                binding.bf1901.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }else {
                binding.bf1901.error = null
            }

            if (binding.bf1996.isChecked &&
                binding.bf1996x.text.toString().trim().isEmpty()){
                binding.bf1996x.requestFocus()
                binding.bf1996x.error = "Other Please Specify"
                sound()
                return@setOnClickListener
            }

            if (binding.bf20.checkedRadioButtonId == -1){
                binding.bf2098.requestFocus()
                binding.bf2098.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.bf2098.error = null
            }


            val refresh = Intent(this, SixthActivity::class.java)
            startActivity(refresh)

            insertSixth()
            updateSixth()
        }

        binding.fab6.setOnClickListener {
            RoomExplorer.show(this, SixthDatabase::class.java, "sixthDB")
        }

        binding.btnEnd.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this@SixthActivity, R.raw.sound)
            mediaPlayer.start() // no need to call prepare(); create() does that for you
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(150)
            createDialog()
        }

        binding.bf1798.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.bf1798.isChecked){
                binding.bf1701x.error = null
                binding.bf1701x.text = null
                binding.bf1701x.setEnabled(false)

            }
            else{
                binding.bf1701x.setEnabled(true)
            }

        }

        binding.bf1701x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.bf1798.isChecked = !binding.bf1701x.text.toString().isNotEmpty()
                }


            })

        binding.bf0501.setOnCheckedChangeListener { compoundButton, b ->

            if (b){
                binding.bf0502.error = null
                binding.bf0503.error = null
                binding.bf0502.text = null
                binding.bf0503.text = null
                binding.bf0503.isEnabled = false
                binding.bf0502.isEnabled = false
            }
            else{
                binding.bf0502.isEnabled = true
                binding.bf0503.isEnabled = true
            }
        }

        binding.bf0502.addTextChangedListener(
            object : TextWatcher {

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.bf0501.isChecked = !binding.bf0502.text.toString().isNotEmpty()
                }
            })

        binding.bf0503.addTextChangedListener(
            object : TextWatcher {

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


                }

                override fun afterTextChanged(p0: Editable?) {
                    if (binding.bf0503.text.toString().isNotEmpty()){
                        binding.bf0501.isChecked = false
                    }
                    else {
                        binding.bf0501.isChecked = true
                    }
                }
            })

        binding.bf14b02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14b02.isChecked){
                binding.bf14b01.text = null
                binding.bf14b98.isChecked = false
                binding.bf14b01.error = null
                binding.bf14b01.isEnabled = false
            }
            else{
                binding.bf14b01.isEnabled = true
            }
        }

        binding.bf14b98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14b98.isChecked){
                binding.bf14b01.text = null
                binding.bf14b02.isChecked = false
                binding.bf14b01.error = null
                binding.bf14b01.isEnabled = false
            }
            else{
                binding.bf14b01.isEnabled = true
            }
        }

        binding.bf14c02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14c02.isChecked){
                binding.bf14c01.text = null
                binding.bf14c98.isChecked = false
                binding.bf14c01.error = null
                binding.bf14c01.isEnabled = false
            }
            else{
                binding.bf14c01.isEnabled = true
            }
        }

        binding.bf14c98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14c98.isChecked){
                binding.bf14c01.text = null
                binding.bf14c02.isChecked = false
                binding.bf14c01.error = null
                binding.bf14c01.isEnabled = false
            }
            else{
                binding.bf14c01.isEnabled = true
            }
        }

        binding.bf14f02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14f02.isChecked){
                binding.bf14f01.text = null
                binding.bf14f98.isChecked = false
                binding.bf14f01.error = null
               binding.bf14f01.isEnabled = false
            }
            else{
                binding.bf14f01.isEnabled = true
            }
        }

        binding.bf14f98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14f98.isChecked){
                binding.bf14f01.text = null
                binding.bf14f02.isChecked = false
                binding.bf14f01.error = null
                binding.bf14f01.isEnabled = false
            }
            else{
                binding.bf14f01.isEnabled = true
            }
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
    private fun createDialog() {
        AlertDialog.Builder(this@SixthActivity).apply {
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
                    binding.Grp6.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun insertSixth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SixthDao().insert(
                    Sixth(
                        0,
                        bf01 = binding.bf01.text.toString(),
                        bf02 = binding.bf02.text.toString(),
                        bf3y = binding.bf3y.text.toString(),
                        bf03m = binding.bf03m.text.toString(),
                        bf3d = binding.bf3d.text.toString(),
                        bf03a01 = binding.bf03a01.text.toString(),
                        bf03a02 = binding.bf03a02.text.toString(),
                        bf0502 = binding.bf0502.text.toString(),
                        bf0503 = binding.bf0503.text.toString(),
                        bf0796x = binding.bf0796x.text.toString(),
                        bf0996x = binding.bf0996x.text.toString(),
                        bf14b01 = binding.bf14b01.text.toString(),
                        bf14c01 = binding.bf14c01.text.toString(),
                        bf14f01 = binding.bf14f01.text.toString(),
                        bf1701x = binding.bf1701x.text.toString(),

                        bf04 = (when {
                            binding.bf0401.isChecked -> "1"
                            binding.bf0402.isChecked -> "2"
                            binding.bf0498.isChecked -> "98"
                            else -> "-1"
                        }),


                        bf05 = (when  {
                            binding.bf0501.isChecked -> "1"
                            else -> "-1"
                        }),

                        bf06 = (when {
                            binding.bf0601.isChecked -> "1"
                            binding.bf0602.isChecked -> "2"
                            binding.bf0698.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf07 = (when {
                            binding.bf0701.isChecked -> "1"
                            binding.bf0702.isChecked -> "2"
                            binding.bf0703.isChecked -> "3"
                            binding.bf0796.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf08 = (when {
                            binding.bf0801.isChecked -> "1"
                            binding.bf0802.isChecked -> "2"
                            binding.bf0898.isChecked -> "98"
                            else -> "-1"
                        }),



                        bf09 = (when {
                            binding.bf0901.isChecked -> "1"
                            binding.bf0902.isChecked -> "2"
                            binding.bf0903.isChecked -> "3"
                            binding.bf0904.isChecked -> "4"
                            binding.bf0906.isChecked -> "6"
                            binding.bf0907.isChecked -> "7"
                            binding.bf0908.isChecked -> "8"
                            binding.bf0909.isChecked -> "9"
                            binding.bf0910.isChecked -> "10"
                            binding.bf0999.isChecked -> "99"
                            binding.bf0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf10 = (when {
                            binding.bf1001.isChecked -> "1"
                            binding.bf1002.isChecked -> "2"
                            binding.bf1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf11 = (when {
                            binding.bf1101.isChecked -> "1"
                            binding.bf1102.isChecked -> "2"
                            binding.bf1198.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf12 = (when {
                            binding.bf1201.isChecked -> "1"
                            binding.bf1202.isChecked -> "2"
                            binding.bf1298.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf13 = (when {
                            binding.bf1301.isChecked -> "1"
                            binding.bf1302.isChecked -> "2"
                            binding.bf1398.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14a = (when {
                            binding.bf14a01.isChecked -> "1"
                            binding.bf14a02.isChecked -> "2"
                            binding.bf14a98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14b = (when {
                            binding.bf14b02.isChecked -> "2"
                            binding.bf14b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14c = (when {
                            binding.bf14c02.isChecked -> "2"
                            binding.bf14c98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14d = (when {
                            binding.bf14d01.isChecked -> "1"
                            binding.bf14d02.isChecked -> "2"
                            binding.bf14d98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14e = (when {
                            binding.bf14e01.isChecked -> "1"
                            binding.bf14e02.isChecked -> "2"
                            binding.bf14e98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14f = (when {
                            binding.bf14f02.isChecked -> "2"
                            binding.bf14f98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14g = (when {
                            binding.bf14g01.isChecked -> "1"
                            binding.bf14g02.isChecked -> "2"
                            binding.bf14g98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14h = (when {
                            binding.bf14h01.isChecked -> "1"
                            binding.bf14h02.isChecked -> "2"
                            binding.bf14h98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14i = (when {
                            binding.bf14i01.isChecked -> "1"
                            binding.bf14i02.isChecked -> "2"
                            binding.bf14i98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15a = (when {
                            binding.bf15a01.isChecked -> "1"
                            binding.bf15a02.isChecked -> "2"
                            binding.bf15a98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15b = (when {
                            binding.bf15b01.isChecked -> "1"
                            binding.bf15b02.isChecked -> "2"
                            binding.bf15b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15c = (when {
                            binding.bf15c01.isChecked -> "1"
                            binding.bf15c02.isChecked -> "2"
                            binding.bf15c98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15d = (when {
                            binding.bf15d01.isChecked -> "1"
                            binding.bf15d02.isChecked -> "2"
                            binding.bf15d98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15e = (when {
                            binding.bf15e01.isChecked -> "1"
                            binding.bf15e02.isChecked -> "2"
                            binding.bf15e98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15f = (when {
                            binding.bf15f01.isChecked -> "1"
                            binding.bf15f02.isChecked -> "2"
                            binding.bf15f98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15g = (when {
                            binding.bf15g01.isChecked -> "1"
                            binding.bf15g02.isChecked -> "2"
                            binding.bf15g98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15h = (when {
                            binding.bf15h01.isChecked -> "1"
                            binding.bf15h02.isChecked -> "2"
                            binding.bf15h98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15i = (when {
                            binding.bf15i01.isChecked -> "1"
                            binding.bf15i02.isChecked -> "2"
                            binding.bf15i98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15j = (when {
                            binding.bf15j01.isChecked -> "1"
                            binding.bf15j02.isChecked -> "2"
                            binding.bf15j98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15k = (when {
                            binding.bf15k01.isChecked -> "1"
                            binding.bf15k02.isChecked -> "2"
                            binding.bf15k98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15l = (when {
                            binding.bf15l01.isChecked -> "1"
                            binding.bf15l02.isChecked -> "2"
                            binding.bf15l98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15m = (when {
                            binding.bf15m01.isChecked -> "1"
                            binding.bf15m02.isChecked -> "2"
                            binding.bf15m98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15n = (when {
                            binding.bf15n01.isChecked -> "1"
                            binding.bf15n02.isChecked -> "2"
                            binding.bf15n98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15o = (when {
                            binding.bf15o01.isChecked -> "1"
                            binding.bf15o02.isChecked -> "2"
                            binding.bf15o98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15p = (when {
                            binding.bf15p01.isChecked -> "1"
                            binding.bf15p02.isChecked -> "2"
                            binding.bf15p98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15q = (when {
                            binding.bf15q01.isChecked -> "1"
                            binding.bf15q02.isChecked -> "2"
                            binding.bf15q98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf16 = (when {
                            binding.bf1601.isChecked -> "1"
                            binding.bf1602.isChecked -> "2"
                            binding.bf1698.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf17 = (when {
                            binding.bf1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf18 = (when {
                            binding.bf1801.isChecked -> "1"
                            binding.bf1802.isChecked -> "2"
                            binding.bf1898.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf19 = (when {
                            binding.bf1901.isChecked -> "1"
                            binding.bf1902.isChecked -> "2"
                            binding.bf1903.isChecked -> "3"
                            binding.bf1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf20 = (when {
                            binding.bf2001.isChecked -> "1"
                            binding.bf2002.isChecked -> "2"
                            binding.bf2098.isChecked -> "98"
                            else -> "-1"
                        }),
                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateSixth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SixthDao().update(
                    Sixth(
                        0,
                        bf01 = binding.bf01.text.toString(),
                        bf02 = binding.bf02.text.toString(),
                        bf3y = binding.bf3y.text.toString(),
                        bf03m = binding.bf03m.text.toString(),
                        bf3d = binding.bf3d.text.toString(),
                        bf03a01 = binding.bf03a01.text.toString(),
                        bf03a02 = binding.bf03a02.text.toString(),
                        bf0502 = binding.bf0502.text.toString(),
                        bf0503 = binding.bf0503.text.toString(),
                        bf0796x = binding.bf0796x.text.toString(),
                        bf0996x = binding.bf0996x.text.toString(),
                        bf14b01 = binding.bf14b01.text.toString(),
                        bf14c01 = binding.bf14c01.text.toString(),
                        bf14f01 = binding.bf14f01.text.toString(),
                        bf1701x = binding.bf1701x.text.toString(),

                        bf04 = (when {
                            binding.bf0401.isChecked -> "1"
                            binding.bf0402.isChecked -> "2"
                            binding.bf0498.isChecked -> "98"
                           else -> "-1"
                        }),
                        

                        bf05 = (when  {
                            binding.bf0501.isChecked -> "1"
                            else -> "-1"
                        }),

                        bf06 = (when {
                            binding.bf0601.isChecked -> "1"
                            binding.bf0602.isChecked -> "2"
                            binding.bf0698.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf07 = (when {
                            binding.bf0701.isChecked -> "1"
                            binding.bf0702.isChecked -> "2"
                            binding.bf0703.isChecked -> "3"
                            binding.bf0796.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf08 = (when {
                            binding.bf0801.isChecked -> "1"
                            binding.bf0802.isChecked -> "2"
                            binding.bf0898.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf09 = (when {
                            binding.bf0901.isChecked -> "1"
                            binding.bf0902.isChecked -> "2"
                            binding.bf0903.isChecked -> "3"
                            binding.bf0904.isChecked -> "4"
                            binding.bf0906.isChecked -> "6"
                            binding.bf0907.isChecked -> "7"
                            binding.bf0908.isChecked -> "8"
                            binding.bf0909.isChecked -> "9"
                            binding.bf0910.isChecked -> "10"
                            binding.bf0999.isChecked -> "99"
                            binding.bf0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf10 = (when {
                            binding.bf1001.isChecked -> "1"
                            binding.bf1002.isChecked -> "2"
                            binding.bf1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf11 = (when {
                            binding.bf1101.isChecked -> "1"
                            binding.bf1102.isChecked -> "2"
                            binding.bf1198.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf12 = (when {
                            binding.bf1201.isChecked -> "1"
                            binding.bf1202.isChecked -> "2"
                            binding.bf1298.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf13 = (when {
                            binding.bf1301.isChecked -> "1"
                            binding.bf1302.isChecked -> "2"
                            binding.bf1398.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14a = (when {
                            binding.bf14a01.isChecked -> "1"
                            binding.bf14a02.isChecked -> "2"
                            binding.bf14a98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14b = (when {
                            binding.bf14b02.isChecked -> "2"
                            binding.bf14b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14c = (when {
                            binding.bf14c02.isChecked -> "2"
                            binding.bf14c98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14d = (when {
                            binding.bf14d01.isChecked -> "1"
                            binding.bf14d02.isChecked -> "2"
                            binding.bf14d98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14e = (when {
                            binding.bf14e01.isChecked -> "1"
                            binding.bf14e02.isChecked -> "2"
                            binding.bf14e98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14f = (when {
                            binding.bf14f02.isChecked -> "2"
                            binding.bf14f98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14g = (when {
                            binding.bf14g01.isChecked -> "1"
                            binding.bf14g02.isChecked -> "2"
                            binding.bf14g98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14h = (when {
                            binding.bf14h01.isChecked -> "1"
                            binding.bf14h02.isChecked -> "2"
                            binding.bf14h98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf14i = (when {
                            binding.bf14i01.isChecked -> "1"
                            binding.bf14i02.isChecked -> "2"
                            binding.bf14i98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15a = (when {
                            binding.bf15a01.isChecked -> "1"
                            binding.bf15a02.isChecked -> "2"
                            binding.bf15a98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15b = (when {
                            binding.bf15b01.isChecked -> "1"
                            binding.bf15b02.isChecked -> "2"
                            binding.bf15b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15c = (when {
                            binding.bf15c01.isChecked -> "1"
                            binding.bf15c02.isChecked -> "2"
                            binding.bf15c98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15d = (when {
                            binding.bf15d01.isChecked -> "1"
                            binding.bf15d02.isChecked -> "2"
                            binding.bf15d98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15e = (when {
                            binding.bf15e01.isChecked -> "1"
                            binding.bf15e02.isChecked -> "2"
                            binding.bf15e98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15f = (when {
                            binding.bf15f01.isChecked -> "1"
                            binding.bf15f02.isChecked -> "2"
                            binding.bf15f98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15g = (when {
                            binding.bf15g01.isChecked -> "1"
                            binding.bf15g02.isChecked -> "2"
                            binding.bf15g98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15h = (when {
                            binding.bf15h01.isChecked -> "1"
                            binding.bf15h02.isChecked -> "2"
                            binding.bf15h98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15i = (when {
                            binding.bf15i01.isChecked -> "1"
                            binding.bf15i02.isChecked -> "2"
                            binding.bf15i98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15j = (when {
                            binding.bf15j01.isChecked -> "1"
                            binding.bf15j02.isChecked -> "2"
                            binding.bf15j98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15k = (when {
                            binding.bf15k01.isChecked -> "1"
                            binding.bf15k02.isChecked -> "2"
                            binding.bf15k98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15l = (when {
                            binding.bf15l01.isChecked -> "1"
                            binding.bf15l02.isChecked -> "2"
                            binding.bf15l98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15m = (when {
                            binding.bf15m01.isChecked -> "1"
                            binding.bf15m02.isChecked -> "2"
                            binding.bf15m98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15n = (when {
                            binding.bf15n01.isChecked -> "1"
                            binding.bf15n02.isChecked -> "2"
                            binding.bf15n98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15o = (when {
                            binding.bf15o01.isChecked -> "1"
                            binding.bf15o02.isChecked -> "2"
                            binding.bf15o98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15p = (when {
                            binding.bf15p01.isChecked -> "1"
                            binding.bf15p02.isChecked -> "2"
                            binding.bf15p98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf15q = (when {
                            binding.bf15q01.isChecked -> "1"
                            binding.bf15q02.isChecked -> "2"
                            binding.bf15q98.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf16 = (when {
                            binding.bf1601.isChecked -> "1"
                            binding.bf1602.isChecked -> "2"
                            binding.bf1698.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf17 = (when {
                            binding.bf1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf18 = (when {
                            binding.bf1801.isChecked -> "1"
                            binding.bf1802.isChecked -> "2"
                            binding.bf1898.isChecked -> "98"
                            else -> "-1"
                        }),

                        bf19 = (when {
                            binding.bf1901.isChecked -> "1"
                            binding.bf1902.isChecked -> "2"
                            binding.bf1903.isChecked -> "3"
                            binding.bf1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        bf20 = (when {
                            binding.bf2001.isChecked -> "1"
                            binding.bf2002.isChecked -> "2"
                            binding.bf2098.isChecked -> "98"
                            else -> "-1"
                        }),
                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }


}