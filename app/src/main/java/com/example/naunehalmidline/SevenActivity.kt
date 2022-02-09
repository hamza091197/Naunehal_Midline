package com.example.naunehalmidline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivitySevenBinding
import com.example.naunehalmidline.fifth.FifthDatabase
import com.example.naunehalmidline.seven.Seven
import com.example.naunehalmidline.seven.SevenDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SevenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySevenBinding
    lateinit var database: SevenDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_seven)
        binding.callback
        database = SevenDatabase.getDatabase(this)

        binding.btnContinue.setOnClickListener {

            if (binding.cv01a.text.toString().trim().isEmpty()){
                binding.cv01a.requestFocus()
                binding.cv01a.error = "Name of respondent"
                return@setOnClickListener
            }

            if (binding.cv01.checkedRadioButtonId == -1){
                binding.cv0102.requestFocus()
                binding.cv0102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv0102.error = null
            }

            if (binding.cv02.checkedRadioButtonId == -1){
                binding.cv0201.requestFocus()
                binding.cv0201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv0201.error = null
            }

            if (binding.cv03.checkedRadioButtonId == -1){
                binding.cv0302.requestFocus()
                binding.cv0302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv0302.error = null
            }

            if (binding.cv04.checkedRadioButtonId == -1){
                binding.cv0401.requestFocus()
                binding.cv0401.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv0401.error = null
            }

            var cv05Flag = false
            binding.cv05check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv05Flag = true
                }
                if (!cv05Flag) return@forEach
            }
            if (!cv05Flag){
                binding.cv0501.error = "CheckBox Not Selected"
                binding.cv0501.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv0501.error = null
            }

            if (binding.cv0596.isChecked &&
                binding.cv0596x.text.toString().trim().isEmpty()){
                binding.cv0596x.requestFocus()
                binding.cv0596x.error = "Other Please Specify"
                return@setOnClickListener
            }

            var cv06Flag = false
            binding.cv06check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv06Flag = true
                }
                if (!cv06Flag) return@forEach
            }
            if (!cv06Flag){
                binding.cv0601.error = "CheckBox Not Selected"
                binding.cv0601.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv0601.error = null
            }

            if (binding.cv0696.isChecked &&
                binding.cv0696x.text.toString().trim().isEmpty()){
                binding.cv0696x.requestFocus()
                binding.cv0696x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv07.checkedRadioButtonId == -1){
                binding.cv0798.requestFocus()
                binding.cv0798.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv0798.error = null
            }

            var cv08Flag = false
            binding.cv08check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv08Flag = true
                }
                if (!cv08Flag) return@forEach
            }
            if (!cv08Flag){
                binding.cv0801.error = "CheckBox Not Selected"
                binding.cv0801.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv0801.error = null
            }

            if (binding.cv0896.isChecked &&
                binding.cv0896x.text.toString().trim().isEmpty()){
                binding.cv0896x.requestFocus()
                binding.cv0896x.error = "Other Please Specify"
                return@setOnClickListener
            }

            var cv09Flag = false
            binding.cv09check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv09Flag = true
                }
                if (!cv09Flag) return@forEach
            }
            if (!cv09Flag){
                binding.cv0901.error = "CheckBox Not Selected"
                binding.cv0901.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv0901.error = null
            }

            if (binding.cv0996.isChecked &&
                binding.cv0996x.text.toString().trim().isEmpty()){
                binding.cv0996x.requestFocus()
                binding.cv0996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            var cv10Flag = false
            binding.cv09check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv10Flag = true
                }
                if (!cv10Flag) return@forEach
            }
            if (!cv10Flag){
                binding.cv1001.error = "CheckBox Not Selected"
                binding.cv1001.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv1001.error = null
            }

            if (binding.cv1096.isChecked &&
                binding.cv1096x.text.toString().trim().isEmpty()){
                binding.cv1096x.requestFocus()
                binding.cv1096x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv11.checkedRadioButtonId == -1){
                binding.cv1102.requestFocus()
                binding.cv1102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1102.error = null
            }

            if (binding.cv12.checkedRadioButtonId == -1){
                binding.cv1201.requestFocus()
                binding.cv1201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1201.error = null
            }

            if (binding.cv1296.isChecked &&
                binding.cv1296x.text.toString().trim().isEmpty()){
                binding.cv1296x.requestFocus()
                binding.cv1296x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv13.checkedRadioButtonId == -1){
                binding.cv1302.requestFocus()
                binding.cv1302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1302.error = null
            }

            if (binding.cv14.checkedRadioButtonId == -1){
                binding.cv1402.requestFocus()
                binding.cv1402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1402.error = null
            }

            if (binding.cv15.checkedRadioButtonId == -1){
                binding.cv1502.requestFocus()
                binding.cv1502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1502.error = null
            }

            if (binding.cv16.checkedRadioButtonId == -1){
                binding.cv1601.requestFocus()
                binding.cv1601.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1601.error = null
            }

            if (binding.cv1696.isChecked &&
                binding.cv1696x.text.toString().trim().isEmpty()){
                binding.cv1696x.requestFocus()
                binding.cv1696x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv17.checkedRadioButtonId == -1){
                binding.cv1702.requestFocus()
                binding.cv1702.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1702.error = null
            }

            if (binding.cv18.checkedRadioButtonId == -1){
                binding.cv1801.requestFocus()
                binding.cv1801.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1801.error = null
            }

            if (binding.cv1896.isChecked &&
                binding.cv1896x.text.toString().trim().isEmpty()){
                binding.cv1896x.requestFocus()
                binding.cv1896x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv19.checkedRadioButtonId == -1){
                binding.cv1901.requestFocus()
                binding.cv1901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv1901.error = null
            }

            if (binding.cv1996.isChecked &&
                binding.cv1996x.text.toString().trim().isEmpty()){
                binding.cv1996x.requestFocus()
                binding.cv1996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cv20.checkedRadioButtonId == -1){
                binding.cv2002.requestFocus()
                binding.cv2002.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cv2002.error = null
            }

            var cv21Flag = false
            binding.cv21check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cv21Flag = true
                }
                if (!cv21Flag) return@forEach
            }

            if (!cv21Flag){
                binding.cv2101.error = "CheckBox Not Selected"
                binding.cv2101.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cv2101.error = null
            }

            if (binding.cv2196.isChecked &&
                binding.cv2196x.text.toString().trim().isEmpty()){
                binding.cv2196x.requestFocus()
                binding.cv2196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            val refresh = Intent(this, SevenActivity::class.java)
            startActivity(refresh)

            insertSeven()
            updateSeven()
        }

        binding.fab7.setOnClickListener {
            RoomExplorer.show(this, SevenDatabase::class.java, "sevenDB")
        }

        binding.btnEnd.setOnClickListener {
            createDialog()
        }
    }

    private fun createDialog() {
        AlertDialog.Builder(this@SevenActivity).apply {
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
                    binding.Grp7.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun insertSeven() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SevenDao().insert(
                    Seven(
                        0,
                        cv01a = binding.cv01a.text.toString(),
                        cv0596x = binding.cv0596x.text.toString(),
                        cv0696x = binding.cv0696x.text.toString(),
                        cv0896x = binding.cv0896x.text.toString(),
                        cv0996x = binding.cv0996x.text.toString(),
                        cv1096x = binding.cv1096x.text.toString(),
                        cv1296x = binding.cv1296x.text.toString(),
                        cv1696x = binding.cv1696x.text.toString(),
                        cv1896x = binding.cv1896x.text.toString(),
                        cv1996x = binding.cv1996x.text.toString(),
                        cv2196x = binding.cv2196x.text.toString(),

                        cv01 = (when {
                            binding.cv0101.isChecked -> "1"
                            binding.cv0102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv02 = (when {
                            binding.cv0201.isChecked -> "1"
                            binding.cv0202.isChecked -> "2"
                            binding.cv0203.isChecked -> "3"
                            binding.cv0204.isChecked -> "4"
                            binding.cv0205.isChecked -> "5"
                            else -> "-1"
                        }),

                        cv03 = (when {
                            binding.cv0301.isChecked -> "1"
                            binding.cv0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv04 = (when {
                            binding.cv0401.isChecked -> "1"
                            binding.cv0402.isChecked -> "2"
                            binding.cv0403.isChecked -> "3"
                            binding.cv0404.isChecked -> "4"
                            binding.cv0405.isChecked -> "5"
                            binding.cv0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        cv05 = (when {
                            binding.cv0501.isChecked -> "1"
                            binding.cv0502.isChecked -> "2"
                            binding.cv0503.isChecked -> "3"
                            binding.cv0504.isChecked -> "4"
                            binding.cv0505.isChecked -> "5"
                            binding.cv0506.isChecked -> "6"
                            binding.cv0507.isChecked -> "7"
                            binding.cv0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv06 = (when {
                            binding.cv0601.isChecked -> "1"
                            binding.cv0602.isChecked -> "2"
                            binding.cv0603.isChecked -> "3"
                            binding.cv0604.isChecked -> "4"
                            binding.cv0605.isChecked -> "5"
                            binding.cv0606.isChecked -> "6"
                            binding.cv0607.isChecked -> "7"
                            binding.cv0608.isChecked -> "8"
                            binding.cv0609.isChecked -> "9"
                            binding.cv0610.isChecked -> "10"
                            binding.cv0611.isChecked -> "11"
                            binding.cv0612.isChecked -> "12"
                            binding.cv0696.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv07 = (when {
                            binding.cv0701.isChecked -> "1"
                            binding.cv0702.isChecked -> "2"
                            binding.cv0798.isChecked -> "98"
                            else -> "-1"
                        }),

                        cv08 = (when {
                            binding.cv0801.isChecked -> "1"
                            binding.cv0802.isChecked -> "2"
                            binding.cv0803.isChecked -> "3"
                            binding.cv0804.isChecked -> "4"
                            binding.cv0805.isChecked -> "5"
                            binding.cv0806.isChecked -> "6"
                            binding.cv0807.isChecked -> "7"
                            binding.cv0898.isChecked -> "98"
                           binding.cv0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv09 = (when {
                            binding.cv0901.isChecked -> "1"
                            binding.cv0902.isChecked -> "2"
                            binding.cv0903.isChecked -> "3"
                            binding.cv0904.isChecked -> "4"
                            binding.cv0905.isChecked -> "5"
                            binding.cv0906.isChecked -> "6"
                            binding.cv0907.isChecked -> "7"
                            binding.cv0998.isChecked -> "98"
                            binding.cv0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv10 = (when {
                            binding.cv1001.isChecked -> "1"
                            binding.cv1002.isChecked -> "2"
                            binding.cv1003.isChecked -> "3"
                            binding.cv1004.isChecked -> "4"
                            binding.cv1005.isChecked -> "5"
                            binding.cv1006.isChecked -> "6"
                            binding.cv1007.isChecked -> "7"
                            binding.cv1008.isChecked -> "8"
                            binding.cv1009.isChecked -> "9"
                            binding.cv1098.isChecked -> "98"
                            binding.cv1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv11 = (when {
                            binding.cv1101.isChecked -> "1"
                            binding.cv1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv12 = (when {
                            binding.cv1201.isChecked -> "1"
                            binding.cv1202.isChecked -> "2"
                            binding.cv1203.isChecked -> "3"
                            binding.cv1204.isChecked -> "4"
                            binding.cv1205.isChecked -> "5"
                            binding.cv1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv13 = (when {
                            binding.cv1301.isChecked -> "1"
                            binding.cv1302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv14 = (when {
                            binding.cv1401.isChecked -> "1"
                            binding.cv1402.isChecked -> "2"
                           else -> "-1"
                        }),

                        cv15 = (when {
                            binding.cv1401.isChecked -> "1"
                            binding.cv1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv16 = (when {
                            binding.cv1601.isChecked -> "1"
                            binding.cv1602.isChecked -> "2"
                            binding.cv1603.isChecked -> "3"
                            binding.cv1604.isChecked -> "4"
                            binding.cv1605.isChecked -> "5"
                            binding.cv1606.isChecked -> "6"
                            binding.cv1696.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv17 = (when {
                            binding.cv1701.isChecked -> "1"
                            binding.cv1702.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv18 = (when {
                            binding.cv1801.isChecked -> "1"
                            binding.cv1802.isChecked -> "2"
                            binding.cv1803.isChecked -> "3"
                            binding.cv1804.isChecked -> "4"
                            binding.cv1805.isChecked -> "5"
                            binding.cv1806.isChecked -> "6"
                            binding.cv1896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv19 = (when {
                            binding.cv1901.isChecked -> "1"
                            binding.cv1902.isChecked -> "2"
                            binding.cv1903.isChecked -> "3"
                            binding.cv1904.isChecked -> "4"
                            binding.cv1905.isChecked -> "5"
                            binding.cv1906.isChecked -> "6"
                            binding.cv1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv20 = (when {
                            binding.cv2001.isChecked -> "1"
                            binding.cv2002.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv21 = (when {
                            binding.cv2101.isChecked -> "1"
                            binding.cv2102.isChecked -> "2"
                            binding.cv2103.isChecked -> "3"
                            binding.cv2104.isChecked -> "4"
                            binding.cv2105.isChecked -> "5"
                            binding.cv2106.isChecked -> "6"
                            binding.cv2107.isChecked -> "7"
                            binding.cv2108.isChecked -> "8"
                            binding.cv2109.isChecked -> "9"
                            binding.cv2198.isChecked -> "98"
                            binding.cv2196.isChecked -> "96"
                            else -> "-1"
                        }),

                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateSeven() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.SevenDao().update(
                    Seven(
                        0,
                        cv01a = binding.cv01a.text.toString(),
                        cv0596x = binding.cv0596x.text.toString(),
                        cv0696x = binding.cv0696x.text.toString(),
                        cv0896x = binding.cv0896x.text.toString(),
                        cv0996x = binding.cv0996x.text.toString(),
                        cv1096x = binding.cv1096x.text.toString(),
                        cv1296x = binding.cv1296x.text.toString(),
                        cv1696x = binding.cv1696x.text.toString(),
                        cv1896x = binding.cv1896x.text.toString(),
                        cv1996x = binding.cv1996x.text.toString(),
                        cv2196x = binding.cv2196x.text.toString(),

                        cv01 = (when {
                            binding.cv0101.isChecked -> "1"
                            binding.cv0102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv02 = (when {
                            binding.cv0201.isChecked -> "1"
                            binding.cv0202.isChecked -> "2"
                            binding.cv0203.isChecked -> "3"
                            binding.cv0204.isChecked -> "4"
                            binding.cv0205.isChecked -> "5"
                            else -> "-1"
                        }),

                        cv03 = (when {
                            binding.cv0301.isChecked -> "1"
                            binding.cv0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv04 = (when {
                            binding.cv0401.isChecked -> "1"
                            binding.cv0402.isChecked -> "2"
                            binding.cv0403.isChecked -> "3"
                            binding.cv0404.isChecked -> "4"
                            binding.cv0405.isChecked -> "5"
                            binding.cv0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        cv05 = (when {
                            binding.cv0501.isChecked -> "1"
                            binding.cv0502.isChecked -> "2"
                            binding.cv0503.isChecked -> "3"
                            binding.cv0504.isChecked -> "4"
                            binding.cv0505.isChecked -> "5"
                            binding.cv0506.isChecked -> "6"
                            binding.cv0507.isChecked -> "7"
                            binding.cv0596.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv06 = (when {
                            binding.cv0601.isChecked -> "1"
                            binding.cv0602.isChecked -> "2"
                            binding.cv0603.isChecked -> "3"
                            binding.cv0604.isChecked -> "4"
                            binding.cv0605.isChecked -> "5"
                            binding.cv0606.isChecked -> "6"
                            binding.cv0607.isChecked -> "7"
                            binding.cv0608.isChecked -> "8"
                            binding.cv0609.isChecked -> "9"
                            binding.cv0610.isChecked -> "10"
                            binding.cv0611.isChecked -> "11"
                            binding.cv0612.isChecked -> "12"
                            binding.cv0696.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv07 = (when {
                            binding.cv0701.isChecked -> "1"
                            binding.cv0702.isChecked -> "2"
                            binding.cv0798.isChecked -> "98"
                            else -> "-1"
                        }),

                        cv08 = (when {
                            binding.cv0801.isChecked -> "1"
                            binding.cv0802.isChecked -> "2"
                            binding.cv0803.isChecked -> "3"
                            binding.cv0804.isChecked -> "4"
                            binding.cv0805.isChecked -> "5"
                            binding.cv0806.isChecked -> "6"
                            binding.cv0807.isChecked -> "7"
                            binding.cv0898.isChecked -> "98"
                            binding.cv0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv09 = (when {
                            binding.cv0901.isChecked -> "1"
                            binding.cv0902.isChecked -> "2"
                            binding.cv0903.isChecked -> "3"
                            binding.cv0904.isChecked -> "4"
                            binding.cv0905.isChecked -> "5"
                            binding.cv0906.isChecked -> "6"
                            binding.cv0907.isChecked -> "7"
                            binding.cv0998.isChecked -> "98"
                            binding.cv0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv10 = (when {
                            binding.cv1001.isChecked -> "1"
                            binding.cv1002.isChecked -> "2"
                            binding.cv1003.isChecked -> "3"
                            binding.cv1004.isChecked -> "4"
                            binding.cv1005.isChecked -> "5"
                            binding.cv1006.isChecked -> "6"
                            binding.cv1007.isChecked -> "7"
                            binding.cv1008.isChecked -> "8"
                            binding.cv1009.isChecked -> "9"
                            binding.cv1098.isChecked -> "98"
                            binding.cv1096.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv11 = (when {
                            binding.cv1101.isChecked -> "1"
                            binding.cv1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv12 = (when {
                            binding.cv1201.isChecked -> "1"
                            binding.cv1202.isChecked -> "2"
                            binding.cv1203.isChecked -> "3"
                            binding.cv1204.isChecked -> "4"
                            binding.cv1205.isChecked -> "5"
                            binding.cv1296.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv13 = (when {
                            binding.cv1301.isChecked -> "1"
                            binding.cv1302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv14 = (when {
                            binding.cv1401.isChecked -> "1"
                            binding.cv1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv15 = (when {
                            binding.cv1401.isChecked -> "1"
                            binding.cv1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv16 = (when {
                            binding.cv1601.isChecked -> "1"
                            binding.cv1602.isChecked -> "2"
                            binding.cv1603.isChecked -> "3"
                            binding.cv1604.isChecked -> "4"
                            binding.cv1605.isChecked -> "5"
                            binding.cv1606.isChecked -> "6"
                            binding.cv1696.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv17 = (when {
                            binding.cv1701.isChecked -> "1"
                            binding.cv1702.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv18 = (when {
                            binding.cv1801.isChecked -> "1"
                            binding.cv1802.isChecked -> "2"
                            binding.cv1803.isChecked -> "3"
                            binding.cv1804.isChecked -> "4"
                            binding.cv1805.isChecked -> "5"
                            binding.cv1806.isChecked -> "6"
                            binding.cv1896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv19 = (when {
                            binding.cv1901.isChecked -> "1"
                            binding.cv1902.isChecked -> "2"
                            binding.cv1903.isChecked -> "3"
                            binding.cv1904.isChecked -> "4"
                            binding.cv1905.isChecked -> "5"
                            binding.cv1906.isChecked -> "6"
                            binding.cv1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cv20 = (when {
                            binding.cv2001.isChecked -> "1"
                            binding.cv2002.isChecked -> "2"
                            else -> "-1"
                        }),

                        cv21 = (when {
                            binding.cv2101.isChecked -> "1"
                            binding.cv2102.isChecked -> "2"
                            binding.cv2103.isChecked -> "3"
                            binding.cv2104.isChecked -> "4"
                            binding.cv2105.isChecked -> "5"
                            binding.cv2106.isChecked -> "6"
                            binding.cv2107.isChecked -> "7"
                            binding.cv2108.isChecked -> "8"
                            binding.cv2109.isChecked -> "9"
                            binding.cv2198.isChecked -> "98"
                            binding.cv2196.isChecked -> "96"
                            else -> "-1"
                        }),

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }
}