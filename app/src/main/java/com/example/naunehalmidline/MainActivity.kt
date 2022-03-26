package com.example.naunehalmidline

import android.Manifest
import android.Manifest.permission.CAMERA
import android.app.Activity
import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityMainBinding
import com.example.naunehalmidline.main.Contact
import com.example.naunehalmidline.main.ContactDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    private var needSave: Boolean = false
    private var backPressedTime = 0L
    lateinit var database: ContactDatabase
    lateinit var binding: ActivityMainBinding
    private val CAMERA_PERMISSION_CODE=123
    private val STORAGE_PERMISSION_CODE=113
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.callback
        database = ContactDatabase.getDatabase(this)


        checkPermission(CAMERA,CAMERA_PERMISSION_CODE)
        checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE,STORAGE_PERMISSION_CODE)




        /*val actionBar = supportActionBar
        actionBar?.title = "Identification Information (HH)"
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.darkBlue)
       *//* window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.statusBarColor = getResources().getColor(R.color.darkPink);*//*
        window.navigationBarColor = getResources().getColor(R.color.black);
       *//* Toast.makeText(this, "Identification Information (HH)", Toast.LENGTH_SHORT).show()*/

        title = "Identification Information (HH)"
        val window: Window = this@MainActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.blue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        /*getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)*/
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*/*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/*/

        binding.btnContinue.setOnClickListener {
            /*if (binding.hh01.text.toString().trim().isEmpty()) {
                binding.hh01.requestFocus()
                binding.hh01.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }

            if (binding.hh0201.text.toString().trim().isEmpty()) {
                binding.hh0201.requestFocus()
                binding.hh0201.error = "Hours"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh0201.isRangeTextValidate) {
                binding.hh0201.requestFocus()
                binding.hh0201.error = "The range is from 1 to 23"
                sound()
                return@setOnClickListener
            }


            if (binding.hh0202.text.toString().trim().isEmpty()) {
                binding.hh0202.requestFocus()
                binding.hh0202.error = "Hours"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh0202.isRangeTextValidate) {
                binding.hh0202.requestFocus()
                binding.hh0202.error = "The range is from 1 to 59"
                sound()
                return@setOnClickListener
            }

            if (binding.hh03.text.toString().trim().isEmpty()) {
                binding.hh03.requestFocus()
                binding.hh03.error = "Code of Interviewer"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh03.isRangeTextValidate) {
                binding.hh03.requestFocus()
                binding.hh03.error = "The range is from 1 to 9999"
                sound()
                return@setOnClickListener
            }

            if (binding.hh04.text.toString().trim().isEmpty()) {
                binding.hh04.requestFocus()
                binding.hh04.error = "Name of Interviewer"
                sound()
                return@setOnClickListener
            }

            if (binding.hh05.checkedRadioButtonId == -1) {
                binding.hh0501.requestFocus()
                binding.hh0501.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh0501.error = null
            }

            if (binding.hh06.text.toString().trim().isEmpty()) {
                binding.hh06.requestFocus()
                binding.hh06.error = "Enter Union Council"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh06.isRangeTextValidate) {
                binding.hh06.requestFocus()
                binding.hh06.error = "The range is from 1 to 999"
                sound()
                return@setOnClickListener
            }

            if (binding.hh07.text.toString().trim().isEmpty()) {
                binding.hh07.requestFocus()
                binding.hh07.error = "Enter Block, Street, Colony, Village Name"
                sound()
                return@setOnClickListener
            }

            if (binding.hh08.text.toString().trim().isEmpty()) {
                binding.hh08.requestFocus()
                binding.hh08.error = "Cluster Number"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh08.isRangeTextValidate) {
                binding.hh08.requestFocus()
                binding.hh08.error = "The range is from 1 99999"
                sound()
                return@setOnClickListener
            }

            if (binding.hh09.text.toString().trim().isEmpty()) {
                binding.hh09.requestFocus()
                binding.hh09.error = "Enter Household number"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh09.isRangeTextValidate) {
                binding.hh09.requestFocus()
                binding.hh09.error = "The range is from 1 to 9999"
                sound()
                return@setOnClickListener
            }

            if (binding.hh10.text.toString().trim().isEmpty()) {
                binding.hh10.requestFocus()
                binding.hh10.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }

            if (binding.hh11.checkedRadioButtonId == -1) {
                binding.hh1102.requestFocus()
                binding.hh1102.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh1102.error = null
            }

            if (binding.hh12.text.toString().trim().isEmpty()) {
                binding.hh12.requestFocus()
                binding.hh12.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }

            if (binding.hh13.text.toString().trim().isEmpty()) {
                binding.hh13.requestFocus()
                binding.hh13.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }

            if (!binding.hh13.isRangeTextValidate) {
                binding.hh13.requestFocus()
                binding.hh13.error = "the range is from 15 to 99"
                sound()
                return@setOnClickListener
            }

            if (binding.hh14.checkedRadioButtonId == -1) {
                binding.hh1402.requestFocus()
                binding.hh1402.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh1402.error = null
            }


            if (binding.hh15.checkedRadioButtonId == -1) {
                binding.hh1501.requestFocus()
                binding.hh1501.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh1501.error = null
            }


            if (binding.hh16.text.toString().trim().isEmpty()) {
                binding.hh16.requestFocus()
                binding.hh16.error = ""
                sound()
                return@setOnClickListener
            }

            if (!binding.hh16.isRangeTextValidate) {
                binding.hh16.requestFocus()
                binding.hh16.error = "The range is from 1 to 17"
                sound()
                return@setOnClickListener
            }

            if (binding.hh17.checkedRadioButtonId == -1) {
                binding.hh1701.requestFocus()
                binding.hh1701.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh1701.error = null
            }

            if (binding.hh18.checkedRadioButtonId == -1) {
                binding.hh1801.requestFocus()
                binding.hh1801.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh1801.error = null
            }

            if (binding.hh19.text.toString().trim().isEmpty()) {
                binding.hh19.requestFocus()
                binding.hh19.error = "Enter Name of Head of Household"
                sound()
                return@setOnClickListener
            }

            if (binding.hh20.checkedRadioButtonId == -1) {
                binding.hh2001.requestFocus()
                binding.hh2001.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh2001.error = null
            }

            if (binding.hh21.text.toString().trim().isEmpty()) {
                binding.hh21.requestFocus()
                binding.hh21.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }


            if (!binding.hh21.isRangeTextValidate) {
                binding.hh21.requestFocus()
                binding.hh21.error = "The range is from 1 to 60"
                sound()
                return@setOnClickListener
            }

            if (binding.hh22.text.toString().trim().isEmpty()) {
                binding.hh22.requestFocus()
                binding.hh22.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }


            if (!binding.hh22.isRangeTextValidate) {
                binding.hh22.requestFocus()
                binding.hh22.error = "The range is from 1 to 20"
                sound()
                return@setOnClickListener
            }

            if (binding.hh23.text.toString().trim().isEmpty()) {
                binding.hh23.requestFocus()
                binding.hh23.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }


            if (!binding.hh23.isRangeTextValidate) {
                binding.hh23.requestFocus()
                binding.hh23.error = "The range is from 1 to 20"
                sound()
                return@setOnClickListener
            }

            if (binding.hh24.text.toString().trim().isEmpty()) {
                binding.hh24.requestFocus()
                binding.hh24.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }


            if (!binding.hh24.isRangeTextValidate) {
                binding.hh24.requestFocus()
                binding.hh24.error = "The range is from 1 to 20"
                sound()
                return@setOnClickListener
            }

            if (binding.hh25.text.toString().trim().isEmpty()) {
                binding.hh25.requestFocus()
                binding.hh25.error = "Enter Date of Interview"
                sound()
                return@setOnClickListener
            }


            if (!binding.hh25.isRangeTextValidate) {
                binding.hh25.requestFocus()
                binding.hh25.error = "The range is from 1 to 20"
                sound()
                return@setOnClickListener
            }*/

            if (binding.hh26.checkedRadioButtonId == -1) {
                binding.hh2601.requestFocus()
                binding.hh2601.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.hh2601.error = null
            }


            val prg = ProgressDialog(this)
            prg.setMessage("Please Wait....")
            Handler().postDelayed({prg.dismiss()}, 3000)
            prg.show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

            /*val intent = intent
            finish()
            startActivity(intent)*/

            /*val refresh = Intent(this, SecondActivity::class.java)
            startActivity(refresh)*/

            insertContact()
            updateContact()



        }



        binding.btnEnd.setOnClickListener {
val mediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.sound)
        mediaPlayer.start() // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
            createDialog()
        }

        binding.hh01.transformIntoDatePicker(this, "dd/MM/yyyy", Date())

        Child_Basic_Information()
        setTransparentStatusBar()
        /*onBackPressed()*/

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

    /*override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
        .setTitle("Exit App")
            .setMessage("Are you sure you want exit the app?")
            .setPositiveButton(android.R.string.ok) { dialog, whichButton ->
                super.onBackPressed()
            }
            .setNegativeButton(android.R.string.cancel) { dialog, whichButton ->

            }
            .show()
    }*/


    private fun Child_Basic_Information() {

        binding.hh17.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.hh1796.isClickable && binding.hh1796x.text.toString().trim().isEmpty()) {
                binding.hh1796x.error = "Empty EditText"
            } else {
                binding.hh1796x.error = null
            }
        }
    }

    private fun createDialog() {
        AlertDialog.Builder(this@MainActivity).apply {
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
                    binding.Grp.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }


    private fun EditText.transformIntoDatePicker(
        context: Context,
        format: String,
        maxDate: Date? = null
    ) {
        isFocusableInTouchMode = false
        isClickable = true
        isFocusable = false

        val myCalendar = Calendar.getInstance()
        val datePickerOnDataSetListener =
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                myCalendar.set(Calendar.YEAR, year)
                myCalendar.set(Calendar.MONTH, monthOfYear)
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val sdf = SimpleDateFormat(format, Locale.UK)
                setText(sdf.format(myCalendar.time))
            }

        setOnClickListener {
            DatePickerDialog(
                context, datePickerOnDataSetListener, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            ).run {
                maxDate?.time?.also { datePicker.maxDate = it }
                show()
            }
        }
    }


    fun insertContact() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().insert(
                    Contact(
                        0,
                        hh01 = binding.hh01.text.toString(),
                        hh0201 = binding.hh0201.text.toString(),
                        hh0202 = binding.hh0202.text.toString(),
                        hh03 = binding.hh03.text.toString(),
                        hh04 = binding.hh04.text.toString(),
                        hh06 = binding.hh06.text.toString(),
                        hh07 = binding.hh07.text.toString(),
                        hh08 = binding.hh08.text.toString(),
                        hh09 = binding.hh09.text.toString(),
                        hh10 = binding.hh10.text.toString(),
                        hh12 = binding.hh12.text.toString(),
                        hh13 = binding.hh13.text.toString(),
                        hh16 = binding.hh16.text.toString(),
                        hh19 = binding.hh19.text.toString(),
                        hh1796x = binding.hh1796x.text.toString(),
                        hh2096x = binding.hh2096x.text.toString(),
                        hh21 = binding.hh21.text.toString(),
                        hh22 = binding.hh22.text.toString(),
                        hh23 = binding.hh23.text.toString(),
                        hh24 = binding.hh24.text.toString(),
                        hh25 = binding.hh25.text.toString(),
                        hh2696x = binding.hh2696x.text.toString(),

                        hh05 = (when  {
                            binding.hh0501.isChecked -> "1"
                            binding.hh0502.isChecked -> "2"
                            binding.hh0503.isChecked -> "3"
                            else -> "-1"
                        }),

                        hh11 = (when {
                            binding.hh1101.isChecked -> "1"
                            binding.hh1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh14 = (when {
                            binding.hh1401.isChecked -> "1"
                            binding.hh1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh15 = (when {
                            binding.hh1501.isChecked -> "1"
                            binding.hh1502.isChecked -> "2"
                            binding.hh1503.isChecked -> "3"
                            binding.hh1504.isChecked -> "4"
                            binding.hh1505.isChecked -> "5"
                            else -> "-1"
                        }),

                        hh17 = (when {
                            binding.hh1701.isChecked -> "1"
                            binding.hh1702.isChecked -> "2"
                            binding.hh1703.isChecked -> "3"
                            binding.hh1704.isChecked -> "4"
                            binding.hh1705.isChecked -> "5"
                            binding.hh1706.isChecked -> "6"
                            binding.hh1707.isChecked -> "7"
                            binding.hh1708.isChecked -> "8"
                            binding.hh1709.isChecked -> "9"
                            binding.hh1710.isChecked -> "10"
                            binding.hh1711.isChecked -> "11"
                            binding.hh1712.isChecked -> "12"
                            binding.hh1713.isChecked -> "13"
                            else -> "-1"
                        }),

                        hh18 = (when {
                            binding.hh1801.isChecked -> "1"
                            binding.hh1802.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh20 = (when {
                            binding.hh2001.isChecked -> "1"
                            binding.hh2002.isChecked -> "2"
                            binding.hh2003.isChecked -> "3"
                            binding.hh2004.isChecked -> "4"
                            binding.hh2005.isChecked -> "5"
                            binding.hh2006.isChecked -> "6"
                            binding.hh2007.isChecked -> "7"
                            binding.hh2008.isChecked -> "8"
                            binding.hh2009.isChecked -> "9"
                            binding.hh2010.isChecked -> "10"
                            binding.hh2011.isChecked -> "11"
                            binding.hh2012.isChecked -> "12"
                            binding.hh2013.isChecked -> "13"
                            else -> "-1"
                        }),

                        hh26 = (when {
                            binding.hh2601.isChecked -> "1"
                            binding.hh2602.isChecked -> "2"
                            binding.hh2603.isChecked -> "3"
                            binding.hh2604.isChecked -> "4"
                            binding.hh2605.isChecked -> "5"
                            binding.hh2606.isChecked -> "6"
                            binding.hh2607.isChecked -> "7"
                            else -> "-1"
                        }),
                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateContact() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().update(
                    Contact(
                        0,
                        hh01 = binding.hh01.text.toString(),
                        hh0201 = binding.hh0201.text.toString(),
                        hh0202 = binding.hh0202.text.toString(),
                        hh03 = binding.hh03.text.toString(),
                        hh04 = binding.hh04.text.toString(),
                        hh06 = binding.hh06.text.toString(),
                        hh07 = binding.hh07.text.toString(),
                        hh08 = binding.hh08.text.toString(),
                        hh09 = binding.hh09.text.toString(),
                        hh10 = binding.hh10.text.toString(),
                        hh12 = binding.hh12.text.toString(),
                        hh13 = binding.hh13.text.toString(),
                        hh16 = binding.hh16.text.toString(),
                        hh19 = binding.hh19.text.toString(),
                        hh1796x = binding.hh1796x.text.toString(),
                        hh2096x = binding.hh2096x.text.toString(),
                        hh21 = binding.hh21.text.toString(),
                        hh22 = binding.hh22.text.toString(),
                        hh23 = binding.hh23.text.toString(),
                        hh24 = binding.hh24.text.toString(),
                        hh25 = binding.hh25.text.toString(),
                        hh2696x = binding.hh2696x.text.toString(),

                        hh05 = (when  {
                            binding.hh0501.isChecked -> "1"
                            binding.hh0502.isChecked -> "2"
                            binding.hh0503.isChecked -> "3"
                            else -> "-1"
                        }),

                        hh11 = (when {
                            binding.hh1101.isChecked -> "1"
                            binding.hh1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh14 = (when {
                            binding.hh1401.isChecked -> "1"
                            binding.hh1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh15 = (when {
                            binding.hh1501.isChecked -> "1"
                            binding.hh1502.isChecked -> "2"
                            binding.hh1503.isChecked -> "3"
                            binding.hh1504.isChecked -> "4"
                            binding.hh1505.isChecked -> "5"
                            else -> "-1"
                        }),

                        hh17 = (when {
                            binding.hh1701.isChecked -> "1"
                            binding.hh1702.isChecked -> "2"
                            binding.hh1703.isChecked -> "3"
                            binding.hh1704.isChecked -> "4"
                            binding.hh1705.isChecked -> "5"
                            binding.hh1706.isChecked -> "6"
                            binding.hh1707.isChecked -> "7"
                            binding.hh1708.isChecked -> "8"
                            binding.hh1709.isChecked -> "9"
                            binding.hh1710.isChecked -> "10"
                            binding.hh1711.isChecked -> "11"
                            binding.hh1712.isChecked -> "12"
                            binding.hh1713.isChecked -> "13"
                            else -> "-1"
                        }),

                        hh18 = (when {
                            binding.hh1801.isChecked -> "1"
                            binding.hh1802.isChecked -> "2"
                            else -> "-1"
                        }),

                        hh20 = (when {
                            binding.hh2001.isChecked -> "1"
                            binding.hh2002.isChecked -> "2"
                            binding.hh2003.isChecked -> "3"
                            binding.hh2004.isChecked -> "4"
                            binding.hh2005.isChecked -> "5"
                            binding.hh2006.isChecked -> "6"
                            binding.hh2007.isChecked -> "7"
                            binding.hh2008.isChecked -> "8"
                            binding.hh2009.isChecked -> "9"
                            binding.hh2010.isChecked -> "10"
                            binding.hh2011.isChecked -> "11"
                            binding.hh2012.isChecked -> "12"
                            binding.hh2013.isChecked -> "13"
                            else -> "-1"
                        }),

                        hh26 = (when {
                            binding.hh2601.isChecked -> "1"
                            binding.hh2602.isChecked -> "2"
                            binding.hh2603.isChecked -> "3"
                            binding.hh2604.isChecked -> "4"
                            binding.hh2605.isChecked -> "5"
                            binding.hh2606.isChecked -> "6"
                            binding.hh2607.isChecked -> "7"
                            else -> "-1"
                        }),
                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    private fun checkPermission(permission:String,requestCode:Int){
        if (ContextCompat.checkSelfPermission(this@MainActivity,permission)==PackageManager.PERMISSION_DENIED){
            //Take Permissions
            ActivityCompat.requestPermissions(this@MainActivity, arrayOf(permission), requestCode )
        }
        else {
      /*  Toast.makeText(this@MainActivity, "Permission Granted Already", Toast.LENGTH_LONG).show()*/
    }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this@MainActivity, "Camera Permission Granted", Toast.LENGTH_SHORT).show()
            } else {
                /*Toast.makeText(this@MainActivity, "Camera Permission Denied", Toast.LENGTH_SHORT).show()*/
            }
        }

            if (requestCode == STORAGE_PERMISSION_CODE) {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this@MainActivity, "Storage Permission Granted", Toast.LENGTH_SHORT).show()
                } else {
                    /*Toast.makeText(this@MainActivity, "Storage Permission Denied", Toast.LENGTH_SHORT).show()*/
                }
            }

    }
    }
