package com.example.naunehalmidline

import android.app.DatePickerDialog
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.SearchView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.room.RoomDatabase
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

    lateinit var database: ContactDatabase
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.callback
        database = ContactDatabase.getDatabase(this)


        val actionBar = supportActionBar
        actionBar?.title = "Identification Information (HH)"

        binding.btnContinue.setOnClickListener {


            if (binding.hh01.text.toString().trim().isEmpty()) {
                binding.hh01.requestFocus()
                binding.hh01.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            /*if (binding.hh0201.text.toString().trim().isEmpty()) {
                binding.hh0201.requestFocus()
                binding.hh0201.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.hh0201.isRangeTextValidate) {
                binding.hh0201.requestFocus()
                binding.hh0201.error = "The range is from 1 to 23"
                return@setOnClickListener
            }


            if (binding.hh0202.text.toString().trim().isEmpty()) {
                binding.hh0202.requestFocus()
                binding.hh0202.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.hh0202.isRangeTextValidate) {
                binding.hh0202.requestFocus()
                binding.hh0202.error = "The range is from 1 to 59"
                return@setOnClickListener
            }

            if (binding.hh03.text.toString().trim().isEmpty()) {
                binding.hh03.requestFocus()
                binding.hh03.error = "Code of Interviewer"
                return@setOnClickListener
            }

            if (!binding.hh03.isRangeTextValidate) {
                binding.hh03.requestFocus()
                binding.hh03.error = "The range is from 1 to 9999"
                return@setOnClickListener
            }

            if (binding.hh04.text.toString().trim().isEmpty()) {
                binding.hh04.requestFocus()
                binding.hh04.error = "Name of Interviewer"
                return@setOnClickListener
            }

            if (binding.hh05.checkedRadioButtonId == -1) {
                binding.hh0501.requestFocus()
                binding.hh0501.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh0501.error = null
            }

            if (binding.hh06.text.toString().trim().isEmpty()) {
                binding.hh06.requestFocus()
                binding.hh06.error = "Enter Union Council"
                return@setOnClickListener
            }

            if (!binding.hh06.isRangeTextValidate) {
                binding.hh06.requestFocus()
                binding.hh06.error = "The range is from 1 to 999"
                return@setOnClickListener
            }

            if (binding.hh07.text.toString().trim().isEmpty()) {
                binding.hh07.requestFocus()
                binding.hh07.error = "Enter Block, Street, Colony, Village Name"
                return@setOnClickListener
            }

            if (binding.hh08.text.toString().trim().isEmpty()) {
                binding.hh08.requestFocus()
                binding.hh08.error = "Cluster Number"
                return@setOnClickListener
            }

            if (!binding.hh08.isRangeTextValidate) {
                binding.hh08.requestFocus()
                binding.hh08.error = "The range is from 1 99999"
                return@setOnClickListener
            }

            if (binding.hh09.text.toString().trim().isEmpty()) {
                binding.hh09.requestFocus()
                binding.hh09.error = "Enter Household number"
                return@setOnClickListener
            }

            if (!binding.hh09.isRangeTextValidate) {
                binding.hh09.requestFocus()
                binding.hh09.error = "The range is from 1 to 9999"
                return@setOnClickListener
            }

            if (binding.hh10.text.toString().trim().isEmpty()) {
                binding.hh10.requestFocus()
                binding.hh10.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (binding.hh11.checkedRadioButtonId == -1) {
                binding.hh1102.requestFocus()
                binding.hh1102.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh1102.error = null
            }

            if (binding.hh12.text.toString().trim().isEmpty()) {
                binding.hh12.requestFocus()
                binding.hh12.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (binding.hh13.text.toString().trim().isEmpty()) {
                binding.hh13.requestFocus()
                binding.hh13.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (!binding.hh13.isRangeTextValidate) {
                binding.hh13.requestFocus()
                binding.hh13.error = "the range is from 15 to 99"
                return@setOnClickListener
            }

            if (binding.hh14.checkedRadioButtonId == -1) {
                binding.hh1402.requestFocus()
                binding.hh1402.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh1402.error = null
            }


            if (binding.hh15.checkedRadioButtonId == -1) {
                binding.hh1501.requestFocus()
                binding.hh1501.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh1501.error = null
            }


            if (binding.hh16.text.toString().trim().isEmpty()) {
                binding.hh16.requestFocus()
                binding.hh16.error = ""
                return@setOnClickListener
            }

            if (!binding.hh16.isRangeTextValidate) {
                binding.hh16.requestFocus()
                binding.hh16.error = "The range is from 1 to 17"
                return@setOnClickListener
            }

            if (binding.hh17.checkedRadioButtonId == -1) {
                binding.hh1701.requestFocus()
                binding.hh1701.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh1701.error = null
            }

            if (binding.hh18.checkedRadioButtonId == -1) {
                binding.hh1801.requestFocus()
                binding.hh1801.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh1801.error = null
            }

            if (binding.hh19.text.toString().trim().isEmpty()) {
                binding.hh19.requestFocus()
                binding.hh19.error = "Enter Name of Head of Household"
                return@setOnClickListener
            }

            if (binding.hh20.checkedRadioButtonId == -1) {
                binding.hh2001.requestFocus()
                binding.hh2001.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh2001.error = null
            }

            if (binding.hh21.text.toString().trim().isEmpty()) {
                binding.hh21.requestFocus()
                binding.hh21.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh21.isRangeTextValidate) {
                binding.hh21.requestFocus()
                binding.hh21.error = "The range is from 1 to 60"
                return@setOnClickListener
            }

            if (binding.hh22.text.toString().trim().isEmpty()) {
                binding.hh22.requestFocus()
                binding.hh22.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh22.isRangeTextValidate) {
                binding.hh22.requestFocus()
                binding.hh22.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh23.text.toString().trim().isEmpty()) {
                binding.hh23.requestFocus()
                binding.hh23.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh23.isRangeTextValidate) {
                binding.hh23.requestFocus()
                binding.hh23.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh24.text.toString().trim().isEmpty()) {
                binding.hh24.requestFocus()
                binding.hh24.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh24.isRangeTextValidate) {
                binding.hh24.requestFocus()
                binding.hh24.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh25.text.toString().trim().isEmpty()) {
                binding.hh25.requestFocus()
                binding.hh25.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh25.isRangeTextValidate) {
                binding.hh25.requestFocus()
                binding.hh25.error = "The range is from 1 to 20"
                return@setOnClickListener
            }
*/

            if (binding.hh26.checkedRadioButtonId == -1) {
                binding.hh2601.requestFocus()
                binding.hh2601.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.hh2601.error = null
            }



            /*val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)*/

            /*val intent = intent
            finish()
            startActivity(intent)*/

            val refresh = Intent(this, MainActivity::class.java)
            startActivity(refresh)

            insertContact()
            updateContact()

        }




        binding.fab.setOnClickListener {
            RoomExplorer.show(this, ContactDatabase::class.java, "contactDB")
        }

        binding.btnSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.btnEnd.setOnClickListener {
            createDialog()


        }


        binding.hh01.transformIntoDatePicker(this, "dd/MM/yyyy", Date())

        Child_Basic_Information()


    }

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
}