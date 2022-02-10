package com.example.naunehalmidline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityFifthBinding
import com.example.naunehalmidline.fifth.Fifth
import com.example.naunehalmidline.fifth.FifthDatabase
import com.example.naunehalmidline.third.Third
import com.example.naunehalmidline.third.ThirdDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FifthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBinding
    lateinit var database: FifthDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fifth)
        binding.callback
        database = FifthDatabase.getDatabase(this)
        binding.btnContinue.setOnClickListener {

            if (binding.pd01.text.toString().trim().isEmpty()){
            binding.pd01.requestFocus()
            binding.pd01.error = "Enter Child's Line Number"
            return@setOnClickListener
            }

            if (!binding.pd01.isRangeTextValidate){
                binding.pd01.requestFocus()
                binding.pd01.error = "The range is from 1 to 99"
                return@setOnClickListener
            }

            if (binding.pd02.text.toString().trim().isEmpty()){
                binding.pd02.requestFocus()
                binding.pd02.error = "WRA's Name"
                return@setOnClickListener
            }

            if (binding.pd03.checkedRadioButtonId == -1){
                binding.pd0301.requestFocus()
                binding.pd0301.error = "RadioButton Not selected"
                return@setOnClickListener
            }
            else {
                binding.pd0301.error = null
            }

            if (binding.pd04.checkedRadioButtonId == -1){
                binding.pd0498.requestFocus()
                binding.pd0498.error = "RadioButton Not selected"
                return@setOnClickListener
            }
            else {
                binding.pd0498.error = null
            }

            if (binding.pd05.checkedRadioButtonId == -1){
                binding.pd0501.requestFocus()
                binding.pd0501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd0501.error = null
            }

            if (binding.pd0596.isChecked &&
                binding.pd0596x.text.toString().trim().isEmpty()){
                binding.pd0596x.requestFocus()
                binding.pd0596x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.pd06.checkedRadioButtonId == -1){
                binding.pd0601.requestFocus()
                binding.pd0601.error = "RadioButton Not selected"
                return@setOnClickListener
            }
            else {
                binding.pd0601.error = null
            }

            if (binding.pd06962.isChecked &&
                binding.pd06962x.text.toString().trim().isEmpty()){
                binding.pd06962x.requestFocus()
                binding.pd06962x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (!binding.pd0798.isChecked) {
                if (binding.pd0701x.text.toString().trim().isEmpty()) {
                    binding.pd0701x.requestFocus()
                    binding.pd0701x.error = "Number Of Times"
                    return@setOnClickListener
                }

                if (!binding.pd0701x.isRangeTextValidate) {
                    binding.pd0701x.requestFocus()
                    binding.pd0701x.error = "The range is from 1 to 20"
                    return@setOnClickListener
                }

            }

            if (binding.pd08.checkedRadioButtonId == -1){
                binding.pd0801.requestFocus()
                binding.pd0801.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd0801.error = null
            }

            var pd08aFlag = false
            binding.pd08acheck.children.forEach{
                if (it is CheckBox && it.isChecked){
                    pd08aFlag = true
                }
                if (!pd08aFlag) return@forEach
            }
            if (!pd08aFlag){
                binding.pd08a01.error = "CheckBox Not Selected"
                binding.pd08a01.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.pd08a01.error = null
            }

            if (binding.pd08a96.isChecked &&
                binding.pd08a96x.text.toString().trim().isEmpty()){
                binding.pd08a96x.requestFocus()
                binding.pd08a96x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.pd08b.checkedRadioButtonId == -1){
                binding.pd08b98.requestFocus()
                binding.pd08b98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            if (binding.pd08c.text.toString().trim().isEmpty()){
                binding.pd08c.requestFocus()
                binding.pd08c.error = "How many times did you receive tetanus injection?"
                return@setOnClickListener
            }

            if (binding.pd09.checkedRadioButtonId == -1){
                binding.pd0902.requestFocus()
                binding.pd0902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd0902.error = null
            }

            if (binding.pd10.checkedRadioButtonId == -1){
                binding.pd1001.requestFocus()
                binding.pd1001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1001.error = null
            }

            if (binding.pd1101.text.toString().trim().isEmpty()){
                binding.pd1101.requestFocus()
                binding.pd1101.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd1101.isRangeTextValidate){
                binding.pd1101.requestFocus()
                binding.pd1101.error = "The range is from 0 to 10"
                return@setOnClickListener
            }

            if (binding.pd1102.text.toString().trim().isEmpty()){
                binding.pd1102.requestFocus()
                binding.pd1102.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd1102.isRangeTextValidate){
                binding.pd1102.requestFocus()
                binding.pd1102.error = "The range is from 0 to 30"
                return@setOnClickListener
            }

            if (binding.pd12.checkedRadioButtonId == -1){
                binding.pd1201.requestFocus()
                binding.pd1201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1201.error = null
            }

            if (binding.pd1296.isChecked &&
                binding.pd1296x.text.toString().trim().isEmpty()){
                binding.pd1296x.requestFocus()
                binding.pd1296x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.pd13.checkedRadioButtonId == -1){
                binding.pd1301.requestFocus()
                binding.pd1301.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1301.error = null
            }

            if (binding.pd13962.isChecked &&
                binding.pd13962x.text.toString().trim().isEmpty()){
                binding.pd13962x.requestFocus()
                binding.pd13962x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.pd14.checkedRadioButtonId == -1){
                binding.pd1401.requestFocus()
                binding.pd1401.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1401.error = null
            }

            if (binding.pd1496.isChecked &&
                binding.pd1496x.text.toString().trim().isEmpty()){
                binding.pd1496x.requestFocus()
                binding.pd1496x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.pd15.checkedRadioButtonId == -1){
                binding.pd1502.requestFocus()
                binding.pd1502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.pd1502.error = null
            }

            var pd16Flag = false
            binding.pd16check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    pd16Flag = true
                }
                if (!pd16Flag) return@forEach
            }
            if (!pd16Flag){
                binding.pd1601.error = "CheckBox Not Selected"
                binding.pd1601.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.pd1601.error = null
            }

            if (binding.pd1696.isChecked &&
                binding.pd1696x.text.toString().trim().isEmpty()){
                binding.pd1696x.requestFocus()
                binding.pd1696x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.pd1701.text.toString().trim().isEmpty()){
                binding.pd1701.requestFocus()
                binding.pd1701.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd1701.isRangeTextValidate){
                binding.pd1701.requestFocus()
                binding.pd1701.error = "The range is from 1 to 23"
                return@setOnClickListener
            }

            if (binding.pd1702.text.toString().trim().isEmpty()){
                binding.pd1702.requestFocus()
                binding.pd1702.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd1702.isRangeTextValidate){
                binding.pd1702.requestFocus()
                binding.pd1702.error = "The range is from 1 to 30"
                return@setOnClickListener
            }

            if (binding.pd17.checkedRadioButtonId == -1){
                binding.pd1798.requestFocus()
                binding.pd1798.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1798.error = null
            }

            if (binding.pd18.text.toString().trim().isEmpty()){
                binding.pd18.requestFocus()
                binding.pd18.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd18.isRangeTextValidate){
                binding.pd18.requestFocus()
                binding.pd18.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.pd19.checkedRadioButtonId == -1){
                binding.pd1998.requestFocus()
                binding.pd1998.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd1998.error = null
            }

            var pd20Flag = false
            binding.pd20check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    pd20Flag = true
                }
                if (!pd20Flag) return@forEach
            }
            if (!pd20Flag){
                binding.pd2001.error = "CheckBox Not Selected"
                binding.pd2001.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.pd2001.error = null
            }

            if (binding.pd2096.isChecked &&
                binding.pd2096x.text.toString().trim().isEmpty()){
                binding.pd2096x.requestFocus()
                binding.pd2096x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.pd2101.text.toString().trim().isEmpty()){
                binding.pd2101.requestFocus()
                binding.pd2101.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd2101.isRangeTextValidate){
                binding.pd2101.requestFocus()
                binding.pd2101.error = "The range is from 1 to 23"
                return@setOnClickListener
            }

            if (binding.pd2102.text.toString().trim().isEmpty()){
                binding.pd2102.requestFocus()
                binding.pd2102.error = "Months"
                return@setOnClickListener
            }

            if (!binding.pd2102.isRangeTextValidate){
                binding.pd2102.requestFocus()
                binding.pd2102.error = "The range is from 1 to 30"
                return@setOnClickListener
            }

            if (binding.pd21.checkedRadioButtonId == -1){
                binding.pd2198.requestFocus()
                binding.pd2198.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.pd2198.error = null
            }

            if (binding.pd22.text.toString().trim().isEmpty()){
                binding.pd22.requestFocus()
                binding.pd22.error = "How many times such happen? Times"
                return@setOnClickListener
            }

            if (!binding.pd22.isRangeTextValidate){
                binding.pd22.requestFocus()
                binding.pd22.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            var pd24Flag = false
            binding.pd24check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    pd24Flag = true
                }
                if (!pd24Flag) return@forEach
            }
            if (!pd24Flag){
                binding.pd2401.error = "CheckBox Not Selected"
                binding.pd2401.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.pd2401.error = null
            }

            val refresh = Intent(this, FifthActivity::class.java)
            startActivity(refresh)

            insertFifth()
            updateFifth()
        }

        binding.fab5.setOnClickListener {
            RoomExplorer.show(this, FifthDatabase::class.java, "fifthDB")
        }

    binding.btnEnd.setOnClickListener {
        createDialog()
    }

        binding.pd0798.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.pd0798.isChecked){
                binding.pd0701x.error = null
                binding.pd0701x.text = null
                binding.pd0701x.setEnabled(false)

            }
            else{
                binding.pd0701x.setEnabled(true)
            }

        }

        binding.pd0701x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


                }

                override fun afterTextChanged(p0: Editable?) {
                    if (binding.pd0701x.text.toString().isNotEmpty()){
                        binding.pd0798.isChecked = false
                    }
                    else {
                        binding.pd0798.isChecked = true
                    }
                }


            })


    }

    private fun createDialog() {
        AlertDialog.Builder(this@FifthActivity).apply {
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
                    binding.Grp5.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun insertFifth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.FifthDao().insert(
                    Fifth(
                        0,
                        pd01 = binding.pd01.text.toString(),
                        pd02 = binding.pd02.text.toString(),
                        pd0596x = binding.pd0596x.text.toString(),
                        pd06961x = binding.pd06961x.text.toString(),
                        pd06962x = binding.pd06962x.text.toString(),
                        pd0701x = binding.pd0701x.text.toString(),
                        pd08a96x = binding.pd08a96x.text.toString(),
                        pd08c = binding.pd08c.text.toString(),
                        pd1101 = binding.pd1101.text.toString(),
                        pd1102 = binding.pd1102.text.toString(),
                        pd1296x = binding.pd1296x.text.toString(),
                        pd13961x = binding.pd13961x.text.toString(),
                        pd13962x = binding.pd13962x.text.toString(),
                        pd1496x = binding.pd1496x.text.toString(),
                        pd1696x = binding.pd1696x.text.toString(),
                        pd1701 = binding.pd1701.text.toString(),
                        pd1702 = binding.pd1702.text.toString(),
                        pd1703 = binding.pd1703.text.toString(),
                        pd18 = binding.pd18.text.toString(),
                        pd2096x = binding.pd2096x.text.toString(),
                        pd2101 = binding.pd2101.text.toString(),
                        pd2102 = binding.pd2102.text.toString(),
                        pd2103 = binding.pd2103.text.toString(),
                        pd22 = binding.pd22.text.toString(),

                        pd03 = (when {
                            binding.pd0301.isChecked -> "1"
                            binding.pd0302.isChecked -> "2"
                            binding.pd0303.isChecked -> "3"
                            binding.pd0304.isChecked -> "4"
                           else -> "-1"
                        }),

                        pd04 = (when  {
                            binding.pd0401.isChecked -> "1"
                            binding.pd0402.isChecked -> "2"
                            binding.pd0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd05 = (when {
                            binding.pd0501.isChecked -> "1"
                            binding.pd0502.isChecked -> "2"
                            binding.pd0503.isChecked -> "3"
                            binding.pd0504.isChecked -> "4"
                            binding.pd0506.isChecked -> "6"
                            binding.pd0507.isChecked -> "7"
                            binding.pd0508.isChecked -> "8"
                            binding.pd0509.isChecked -> "9"
                            binding.pd0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd06 = (when {
                            binding.pd0601.isChecked -> "1"
                            binding.pd0602.isChecked -> "2"
                            binding.pd0603.isChecked -> "3"
                            binding.pd0604.isChecked -> "4"
                            binding.pd0605.isChecked -> "5"
                            binding.pd0607.isChecked -> "7"
                            binding.pd0608.isChecked -> "8"
                            binding.pd0609.isChecked -> "9"
                            binding.pd0610.isChecked -> "10"
                            binding.pd06962.isChecked -> "962"
                            else -> "-1"
                        }),

                        pd07 = (when {
                            binding.pd0798.isChecked -> "1"
                            else -> "-1"
                        }),

                        pd08 = (when {
                            binding.pd0801.isChecked -> "1"
                            binding.pd0802.isChecked -> "2"
                            binding.pd0803.isChecked -> "3"
                            binding.pd0805.isChecked -> "5"
                            binding.pd0806.isChecked -> "6"
                            else -> "-1"
                        }),

                        pd08a = (when {
                            binding.pd08a01.isChecked -> "1"
                            binding.pd08a02.isChecked -> "2"
                            binding.pd08a03.isChecked -> "3"
                            binding.pd08a04.isChecked -> "4"
                            binding.pd08a06.isChecked -> "6"
                            binding.pd08a07.isChecked -> "7"
                            binding.pd08a08.isChecked -> "8"
                            binding.pd08a09.isChecked -> "9"
                            binding.pd08a96.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd08b = (when {
                            binding.pd08b01.isChecked -> "1"
                            binding.pd08b02.isChecked -> "2"
                            binding.pd08b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd09 = (when {
                            binding.pd0901.isChecked -> "1"
                            binding.pd0902.isChecked -> "2"
                            else -> "-1"
                        }),

                        pd10 = (when {
                            binding.pd1001.isChecked -> "1"
                            binding.pd1002.isChecked -> "2"
                            binding.pd1003.isChecked -> "3"
                            binding.pd1005.isChecked -> "5"
                            else -> "-1"
                        }),

                        pd12 = (when {
                            binding.pd1201.isChecked -> "1"
                            binding.pd1202.isChecked -> "2"
                            binding.pd1203.isChecked -> "3"
                            binding.pd1205.isChecked -> "5"
                            binding.pd1206.isChecked -> "6"
                            binding.pd1207.isChecked -> "7"
                            binding.pd1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd13 = (when {
                            binding.pd1301.isChecked -> "1"
                            binding.pd1302.isChecked -> "2"
                            binding.pd1303.isChecked -> "3"
                            binding.pd1305.isChecked -> "5"
                            binding.pd1306.isChecked -> "6"
                            binding.pd13961.isChecked -> "961"
                            binding.pd1307.isChecked -> "7"
                            binding.pd13962.isChecked -> "962"
                            else -> "-1"
                        }),

                        pd14 = (when {
                            binding.pd1401.isChecked -> "1"
                            binding.pd1402.isChecked -> "2"
                            binding.pd1403.isChecked -> "3"
                            binding.pd1404.isChecked -> "4"
                            binding.pd1405.isChecked -> "5"
                            binding.pd1496.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd15 = (when {
                            binding.pd1501.isChecked -> "1"
                            binding.pd1502.isChecked -> "2"
                            else -> "-1"
                        }),

                        pd16 = (when {
                            binding.pd1601.isChecked -> "1"
                            binding.pd1602.isChecked -> "2"
                            binding.pd1603.isChecked -> "3"
                            binding.pd1604.isChecked -> "4"
                            binding.pd1605.isChecked -> "5"
                            binding.pd1606.isChecked -> "6"
                            binding.pd1607.isChecked -> "7"
                            binding.pd1696.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd17 = (when {
                            binding.pd1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd19 = (when {
                            binding.pd1901.isChecked -> "1"
                            binding.pd1902.isChecked -> "2"
                            binding.pd1998.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd20 = (when {
                            binding.pd2001.isChecked -> "1"
                            binding.pd2002.isChecked -> "2"
                            binding.pd2003.isChecked -> "3"
                            binding.pd2004.isChecked -> "4"
                            binding.pd2005.isChecked -> "5"
                            binding.pd2006.isChecked -> "6"
                            binding.pd2007.isChecked -> "7"
                            binding.pd2096.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd21 = (when {
                            binding.pd2198.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd23 = (when {
                            binding.pd2301.isChecked -> "1"
                            binding.pd2302.isChecked -> "2"
                            binding.pd2398.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd24 = (when {
                            binding.pd2401.isChecked -> "1"
                            binding.pd2402.isChecked -> "2"
                            binding.pd2403.isChecked -> "3"
                            binding.pd2404.isChecked -> "4"
                            binding.pd2405.isChecked -> "5"
                            binding.pd2406.isChecked -> "6"
                            binding.pd2496.isChecked -> "96"
                            binding.pd2498.isChecked -> "98"
                           else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateFifth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.FifthDao().update(
                    Fifth(
                        0,
                        pd01 = binding.pd01.text.toString(),
                        pd02 = binding.pd02.text.toString(),
                        pd0596x = binding.pd0596x.text.toString(),
                        pd06961x = binding.pd06961x.text.toString(),
                        pd06962x = binding.pd06962x.text.toString(),
                        pd0701x = binding.pd0701x.text.toString(),
                        pd08a96x = binding.pd08a96x.text.toString(),
                        pd08c = binding.pd08c.text.toString(),
                        pd1101 = binding.pd1101.text.toString(),
                        pd1102 = binding.pd1102.text.toString(),
                        pd1296x = binding.pd1296x.text.toString(),
                        pd13961x = binding.pd13961x.text.toString(),
                        pd13962x = binding.pd13962x.text.toString(),
                        pd1496x = binding.pd1496x.text.toString(),
                        pd1696x = binding.pd1696x.text.toString(),
                        pd1701 = binding.pd1701.text.toString(),
                        pd1702 = binding.pd1702.text.toString(),
                        pd1703 = binding.pd1703.text.toString(),
                        pd18 = binding.pd18.text.toString(),
                        pd2096x = binding.pd2096x.text.toString(),
                        pd2101 = binding.pd2101.text.toString(),
                        pd2102 = binding.pd2102.text.toString(),
                        pd2103 = binding.pd2103.text.toString(),
                        pd22 = binding.pd22.text.toString(),

                        pd03 = (when {
                            binding.pd0301.isChecked -> "1"
                            binding.pd0302.isChecked -> "2"
                            binding.pd0303.isChecked -> "3"
                            binding.pd0304.isChecked -> "4"
                            else -> "-1"
                        }),

                        pd04 = (when  {
                            binding.pd0401.isChecked -> "1"
                            binding.pd0402.isChecked -> "2"
                            binding.pd0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd05 = (when {
                            binding.pd0501.isChecked -> "1"
                            binding.pd0502.isChecked -> "2"
                            binding.pd0503.isChecked -> "3"
                            binding.pd0504.isChecked -> "4"
                            binding.pd0506.isChecked -> "6"
                            binding.pd0507.isChecked -> "7"
                            binding.pd0508.isChecked -> "8"
                            binding.pd0509.isChecked -> "9"
                            binding.pd0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd06 = (when {
                            binding.pd0601.isChecked -> "1"
                            binding.pd0602.isChecked -> "2"
                            binding.pd0603.isChecked -> "3"
                            binding.pd0604.isChecked -> "4"
                            binding.pd0605.isChecked -> "5"
                            binding.pd0607.isChecked -> "7"
                            binding.pd0608.isChecked -> "8"
                            binding.pd0609.isChecked -> "9"
                            binding.pd0610.isChecked -> "10"
                            binding.pd06962.isChecked -> "962"
                            else -> "-1"
                        }),

                        pd07 = (when {
                            binding.pd0798.isChecked -> "1"
                            else -> "-1"
                        }),

                        pd08 = (when {
                            binding.pd0801.isChecked -> "1"
                            binding.pd0802.isChecked -> "2"
                            binding.pd0803.isChecked -> "3"
                            binding.pd0805.isChecked -> "5"
                            binding.pd0806.isChecked -> "6"
                            else -> "-1"
                        }),

                        pd08a = (when {
                            binding.pd08a01.isChecked -> "1"
                            binding.pd08a02.isChecked -> "2"
                            binding.pd08a03.isChecked -> "3"
                            binding.pd08a04.isChecked -> "4"
                            binding.pd08a06.isChecked -> "6"
                            binding.pd08a07.isChecked -> "7"
                            binding.pd08a08.isChecked -> "8"
                            binding.pd08a09.isChecked -> "9"
                            binding.pd08a96.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd08b = (when {
                            binding.pd08b01.isChecked -> "1"
                            binding.pd08b02.isChecked -> "2"
                            binding.pd08b98.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd09 = (when {
                            binding.pd0901.isChecked -> "1"
                            binding.pd0902.isChecked -> "2"
                            else -> "-1"
                        }),

                        pd10 = (when {
                            binding.pd1001.isChecked -> "1"
                            binding.pd1002.isChecked -> "2"
                            binding.pd1003.isChecked -> "3"
                            binding.pd1005.isChecked -> "5"
                            else -> "-1"
                        }),

                        pd12 = (when {
                            binding.pd1201.isChecked -> "1"
                            binding.pd1202.isChecked -> "2"
                            binding.pd1203.isChecked -> "3"
                            binding.pd1205.isChecked -> "5"
                            binding.pd1206.isChecked -> "6"
                            binding.pd1207.isChecked -> "7"
                            binding.pd1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd13 = (when {
                            binding.pd1301.isChecked -> "1"
                            binding.pd1302.isChecked -> "2"
                            binding.pd1303.isChecked -> "3"
                            binding.pd1305.isChecked -> "5"
                            binding.pd1306.isChecked -> "6"
                            binding.pd13961.isChecked -> "961"
                            binding.pd1307.isChecked -> "7"
                            binding.pd13962.isChecked -> "962"
                            else -> "-1"
                        }),

                        pd14 = (when {
                            binding.pd1401.isChecked -> "1"
                            binding.pd1402.isChecked -> "2"
                            binding.pd1403.isChecked -> "3"
                            binding.pd1404.isChecked -> "4"
                            binding.pd1405.isChecked -> "5"
                            binding.pd1496.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd15 = (when {
                            binding.pd1501.isChecked -> "1"
                            binding.pd1502.isChecked -> "2"
                            else -> "-1"
                        }),

                        pd16 = (when {
                            binding.pd1601.isChecked -> "1"
                            binding.pd1602.isChecked -> "2"
                            binding.pd1603.isChecked -> "3"
                            binding.pd1604.isChecked -> "4"
                            binding.pd1605.isChecked -> "5"
                            binding.pd1606.isChecked -> "6"
                            binding.pd1607.isChecked -> "7"
                            binding.pd1696.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd17 = (when {
                            binding.pd1798.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd19 = (when {
                            binding.pd1901.isChecked -> "1"
                            binding.pd1902.isChecked -> "2"
                            binding.pd1998.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd20 = (when {
                            binding.pd2001.isChecked -> "1"
                            binding.pd2002.isChecked -> "2"
                            binding.pd2003.isChecked -> "3"
                            binding.pd2004.isChecked -> "4"
                            binding.pd2005.isChecked -> "5"
                            binding.pd2006.isChecked -> "6"
                            binding.pd2007.isChecked -> "7"
                            binding.pd2096.isChecked -> "96"
                            else -> "-1"
                        }),

                        pd21 = (when {
                            binding.pd2198.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd23 = (when {
                            binding.pd2301.isChecked -> "1"
                            binding.pd2302.isChecked -> "2"
                            binding.pd2398.isChecked -> "98"
                            else -> "-1"
                        }),

                        pd24 = (when {
                            binding.pd2401.isChecked -> "1"
                            binding.pd2402.isChecked -> "2"
                            binding.pd2403.isChecked -> "3"
                            binding.pd2404.isChecked -> "4"
                            binding.pd2405.isChecked -> "5"
                            binding.pd2406.isChecked -> "6"
                            binding.pd2496.isChecked -> "96"
                            binding.pd2498.isChecked -> "98"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

}