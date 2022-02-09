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
import com.example.naunehalmidline.databinding.ActivitySecondBinding
import com.example.naunehalmidline.databinding.ActivityThirdBinding
import com.example.naunehalmidline.main.Contact
import com.example.naunehalmidline.main.ContactDatabase
import com.example.naunehalmidline.third.Third
import com.example.naunehalmidline.third.ThirdDatabase
import com.validatorcrawler.aliazaz.Clear
import com.wajahatkarim3.roomexplorer.RoomExplorer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ThirdActivity : AppCompatActivity() {
    lateinit var database: ThirdDatabase
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)
        binding.callback
        database = ThirdDatabase.getDatabase(this)



        binding.btnContinue.setOnClickListener {

            /*if (binding.cs01.text.toString().trim().isEmpty()){
                binding.cs01.requestFocus()
                binding.cs01.error = "Child's Line no"
                return@setOnClickListener
            }

            if (!binding.cs01.isRangeTextValidate){
                binding.cs01.requestFocus()
                binding.cs01.error = "The range is from 1 to 99"
                return@setOnClickListener
            }

            if (binding.cs02.text.toString().trim().isEmpty()){
                binding.cs02.requestFocus()
                binding.cs02.error = "Name of Child"
                return@setOnClickListener
            }

            if (binding.cs02a.checkedRadioButtonId == -1){
                binding.cs02a.requestFocus()
                binding.cs02a01.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs02a01.error = null
            }

            if (binding.cs02b.text.toString().trim().isEmpty()){
                binding.cs02b.requestFocus()
                binding.cs02b.error = "Name of the respondent"
                return@setOnClickListener
            }

            if (binding.cs03.checkedRadioButtonId == -1){
                binding.cs03.requestFocus()
                binding.cs0302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0302.error = null
            }

            if (binding.cs04.checkedRadioButtonId == -1){
                binding.cs0401.requestFocus()
                binding.cs0401.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0401.error = null
            }

            if (binding.cs05.checkedRadioButtonId == -1){
                binding.cs0501.requestFocus()
                binding.cs0501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0501.error = null
            }

            if (binding.cs06.checkedRadioButtonId == -1){
                binding.cs0602.requestFocus()
                binding.cs0602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0602.error = null
            }*/

            if (binding.cs07.checkedRadioButtonId == -1){
                binding.cs0701.requestFocus()
                binding.cs0701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0701.error = null
            }

            if (binding.cs07962.isChecked &&
                binding.cs07962x.text.toString().trim().isEmpty()){
                binding.cs07962x.requestFocus()
                binding.cs07962x.error = "Other PLease Specify"
                return@setOnClickListener
            }


            var cs08Flag = false
            binding.cs08check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cs08Flag = true
                }
                if (!cs08Flag) return@forEach
            }
            if (!cs08Flag){
                binding.cs0801.error = "CheckBox Not Selected"
                binding.cs0801.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cs0801.error = null
            }

            if (binding.cs0896.isChecked &&
                binding.cs0896x.text.toString().trim().isEmpty()){
                binding.cs0896x.requestFocus()
                binding.cs0896x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.cs08a.checkedRadioButtonId == -1){
                binding.cs08a.requestFocus()
                binding.cs08a02.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs08a02.error = null
            }

            if (binding.cs09.checkedRadioButtonId == -1){
                binding.cs09.requestFocus()
                binding.cs0901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs0901.error = null
            }

            if (binding.cs0996.isChecked &&
                binding.cs0996x.text.toString().trim().isEmpty()){
                binding.cs0996x.requestFocus()
                binding.cs0996x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.cs10.checkedRadioButtonId == -1){
                binding.cs1002.requestFocus()
                binding.cs1002.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1002.error = null
            }

            if (binding.cs11.checkedRadioButtonId == -1){
                binding.cs1102.requestFocus()
                binding.cs1102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1102.error = null
            }

            if (binding.cs12.checkedRadioButtonId == -1){
                binding.cs1202.requestFocus()
                binding.cs1202.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1202.error = null
            }

            if (binding.cs13.checkedRadioButtonId == -1){
                binding.cs1302.requestFocus()
                binding.cs1302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1302.error = null
            }

            if (binding.cs14.checkedRadioButtonId == -1){
                binding.cs1402.requestFocus()
                binding.cs1402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1402.error = null
            }

            if (binding.cs15.checkedRadioButtonId == -1){
                binding.cs1501.requestFocus()
                binding.cs1501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1501.error = null
            }

            if (binding.cs1596.isChecked &&
                binding.cs1596x.text.toString().trim().isEmpty()){
                binding.cs1596x.requestFocus()
                binding.cs1596x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cs16.checkedRadioButtonId == -1){
                binding.cs1602.requestFocus()
                binding.cs1602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1602.error = null
            }

            if (binding.cs17.checkedRadioButtonId == -1){
                binding.cs1701.requestFocus()
                binding.cs1701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1701.error = null
            }

            if (binding.cs17961.isChecked &&
                binding.cs17961x.text.toString().trim().isEmpty()){
                binding.cs17961x.requestFocus()
                binding.cs17961x.error = "Other Please Specify"
                return@setOnClickListener
            }


            if (binding.cs17962.isChecked &&
                binding.cs17962x.text.toString().trim().isEmpty()){
                binding.cs17962x.requestFocus()
                binding.cs17962x.error = "Other Please Specify"
                return@setOnClickListener
            }


            if (binding.cs17a.checkedRadioButtonId == -1){
                binding.cs17a02.requestFocus()
                binding.cs17a02.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs17a02.error = null
            }

            var cs18Flag = false
            binding.cs18check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    cs18Flag = true
                }
                if (!cs18Flag) return@forEach
            }
            if (!cs18Flag){
                binding.cs1802.error = "CheckBox Not Selected"
                binding.cs1802.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.cs1802.error = null
            }


            if (binding.cs1896.isChecked &&
                binding.cs1896x.text.toString().trim().isEmpty()){
                binding.cs1896x.requestFocus()
                binding.cs1896x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cs19.checkedRadioButtonId == -1){
                binding.cs19.requestFocus()
                binding.cs1901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs1901.error = null
            }

            if (binding.cs1996.isChecked &&
                binding.cs1996x.text.toString().trim().isEmpty()){
                binding.cs1996x.requestFocus()
                binding.cs1996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.cs20.checkedRadioButtonId == -1){
                binding.cs20.requestFocus()
                binding.cs2098.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs2098.error = null
            }

            if (binding.cs21.checkedRadioButtonId == -1){
                binding.cs2101.requestFocus()
                binding.cs2101.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs2101.error = null
            }

            val refresh = Intent(this, ThirdActivity::class.java)
            startActivity(refresh)

            insertThird()
            updateThird()

        }

        binding.fab3.setOnClickListener {
            RoomExplorer.show(this, ThirdDatabase::class.java, "thirdDB")
        }

        binding.btnFourth.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        binding.btnEnd.setOnClickListener {
            createDialog()
        }
    }

    private fun createDialog() {
        AlertDialog.Builder(this@ThirdActivity).apply {
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
                    binding.Grp3.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun insertThird() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ThirdDao().insert(
                    Third(
                        0,
                        cs01 = binding.cs01.text.toString(),
                        cs02 = binding.cs02.text.toString(),
                        cs02b = binding.cs02b.text.toString(),
                        cs08b = binding.cs08b.text.toString(),
                        cs17b = binding.cs17b.text.toString(),
                        cs07961x = binding.cs07961x.text.toString(),
                        cs07962x = binding.cs07962x.text.toString(),
                        cs0896x = binding.cs0896x.text.toString(),
                        cs0996x = binding.cs0996x.text.toString(),
                        cs1596x = binding.cs1596x.text.toString(),
                        cs17961x = binding.cs17961x.text.toString(),
                        cs17962x = binding.cs17962x.text.toString(),
                        cs1896x = binding.cs1896x.text.toString(),
                        cs1996x = binding.cs1996x.text.toString(),

                        cs02a = (when  {
                            binding.cs02a01.isChecked -> "1"
                            binding.cs02a02.isChecked -> "2"
                            binding.cs02a03.isChecked -> "3"
                            binding.cs02a04.isChecked -> "4"
                            else -> "-1"
                        }),

                        cs03 = (when {
                            binding.cs0301.isChecked -> "1"
                            binding.cs0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs04 = (when {
                            binding.cs0401.isChecked -> "1"
                            binding.cs0402.isChecked -> "2"
                            binding.cs0403.isChecked -> "3"
                            binding.cs0404.isChecked -> "4"
                            binding.cs0405.isChecked -> "5"
                            binding.cs0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs05 = (when {
                            binding.cs0501.isChecked -> "1"
                            binding.cs0502.isChecked -> "2"
                            binding.cs0503.isChecked -> "3"
                            binding.cs0504.isChecked -> "4"
                            binding.cs0505.isChecked -> "5"
                            binding.cs0598.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs06 = (when {
                            binding.cs0601.isChecked -> "1"
                            binding.cs0602.isChecked -> "2"
                            else -> "-1"
                        }),


                        cs07 = (when {
                            binding.cs0701.isChecked -> "1"
                            binding.cs0702.isChecked -> "2"
                            binding.cs0703.isChecked -> "3"
                            binding.cs0704.isChecked -> "4"
                            binding.cs0706.isChecked -> "6"
                            binding.cs0707.isChecked -> "7"
                            binding.cs0708.isChecked -> "8"
                            binding.cs0709.isChecked -> "9"
                            binding.cs0710.isChecked -> "10"
                            binding.cs0711.isChecked -> "11"
                            binding.cs0712.isChecked -> "12"
                            binding.cs0713.isChecked -> "13"
                            binding.cs07962.isChecked -> "962"
                            binding.cs0714.isChecked -> "14"
                            else -> "-1"
                        }),

                        cs08 = (when {
                            binding.cs0801.isChecked -> "1"
                            binding.cs0802.isChecked -> "2"
                            binding.cs0803.isChecked -> "3"
                            binding.cs0804.isChecked -> "4"
                            binding.cs0805.isChecked -> "5"
                            binding.cs0806.isChecked -> "6"
                            binding.cs0807.isChecked -> "7"
                            binding.cs0808.isChecked -> "8"
                            binding.cs0809.isChecked -> "9"
                            binding.cs0810.isChecked -> "10"
                            binding.cs0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs08a = (when {
                            binding.cs08a01.isChecked -> "1"
                            binding.cs08a02.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs09 = (when {
                            binding.cs0901.isChecked -> "1"
                            binding.cs0902.isChecked -> "2"
                            binding.cs0903.isChecked -> "3"
                            binding.cs0905.isChecked -> "5"
                            binding.cs0906.isChecked -> "6"
                            binding.cs0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs10 = (when {
                            binding.cs1001.isChecked -> "1"
                            binding.cs1002.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs11 = (when {
                            binding.cs1101.isChecked -> "1"
                            binding.cs1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs12 = (when {
                            binding.cs1201.isChecked -> "1"
                            binding.cs1202.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs13 = (when {
                            binding.cs1301.isChecked -> "1"
                            binding.cs1302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs14 = (when {
                            binding.cs1401.isChecked -> "1"
                            binding.cs1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs15 = (when {
                            binding.cs1501.isChecked -> "1"
                            binding.cs1502.isChecked -> "2"
                            binding.cs1503.isChecked -> "3"
                            binding.cs1596.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs16 = (when {
                            binding.cs1601.isChecked -> "1"
                            binding.cs1602.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs17 = (when {
                            binding.cs1701.isChecked -> "1"
                            binding.cs1702.isChecked -> "2"
                            binding.cs1703.isChecked -> "3"
                            binding.cs1704.isChecked -> "4"
                            binding.cs1706.isChecked -> "6"
                            binding.cs1707.isChecked -> "7"
                            binding.cs1708.isChecked -> "8"
                            binding.cs1709.isChecked -> "9"
                            binding.cs1710.isChecked -> "10"
                            binding.cs1711.isChecked -> "11"
                            binding.cs1712.isChecked -> "12"
                            binding.cs1713.isChecked -> "13"
                            binding.cs1714.isChecked -> "14"
                            binding.cs17962.isChecked -> "962"
                            else -> "-1"
                        }),

                        cs17a = (when {
                            binding.cs1701.isChecked -> "1"
                            binding.cs1702.isChecked -> "2"
                            binding.cs1703.isChecked -> "3"
                            binding.cs1704.isChecked -> "4"
                            binding.cs1706.isChecked -> "6"
                            binding.cs1707.isChecked -> "7"
                            binding.cs1708.isChecked -> "8"
                            binding.cs1709.isChecked -> "9"
                            binding.cs1710.isChecked -> "10"
                            binding.cs1711.isChecked -> "11"
                            binding.cs1712.isChecked -> "12"
                            binding.cs1713.isChecked -> "13"
                            binding.cs1714.isChecked -> "14"
                            binding.cs17962.isChecked -> "962"
                            else -> "-1"
                        }),

                        cs18 = (when {
                            binding.cs1802.isChecked -> "2"
                            binding.cs1803.isChecked -> "3"
                            binding.cs1804.isChecked -> "4"
                            binding.cs1805.isChecked -> "5"
                            binding.cs1806.isChecked -> "6"
                            binding.cs1807.isChecked -> "7"
                            binding.cs1808.isChecked -> "8"
                            binding.cs1896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs19 = (when {
                            binding.cs1901.isChecked -> "1"
                            binding.cs1902.isChecked -> "2"
                            binding.cs1903.isChecked -> "3"
                            binding.cs1905.isChecked -> "5"
                            binding.cs1906.isChecked -> "6"
                            binding.cs1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs20 = (when {
                            binding.cs2001.isChecked -> "1"
                            binding.cs2002.isChecked -> "2"
                            binding.cs2098.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs21 = (when {
                            binding.cs2101.isChecked -> "1"
                            binding.cs2102.isChecked -> "2"
                            binding.cs2103.isChecked -> "3"
                            binding.cs2104.isChecked -> "4"
                            binding.cs2105.isChecked -> "5"
                            else -> "-1"
                        }),


                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateThird() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ThirdDao().update(
                    Third(
                        0,
                        cs01 = binding.cs01.text.toString(),
                        cs02 = binding.cs02.text.toString(),
                        cs02b = binding.cs02b.text.toString(),
                        cs08b = binding.cs08b.text.toString(),
                        cs17b = binding.cs17b.text.toString(),
                        cs07961x = binding.cs07961x.text.toString(),
                        cs07962x = binding.cs07962x.text.toString(),
                        cs0896x = binding.cs0896x.text.toString(),
                        cs0996x = binding.cs0996x.text.toString(),
                        cs1596x = binding.cs1596x.text.toString(),
                        cs17961x = binding.cs17961x.text.toString(),
                        cs17962x = binding.cs17962x.text.toString(),
                        cs1896x = binding.cs1896x.text.toString(),
                        cs1996x = binding.cs1996x.text.toString(),

                        cs02a = (when  {
                            binding.cs02a01.isChecked -> "1"
                            binding.cs02a02.isChecked -> "2"
                            binding.cs02a03.isChecked -> "3"
                            binding.cs02a04.isChecked -> "4"
                            else -> "-1"
                        }),

                        cs03 = (when {
                            binding.cs0301.isChecked -> "1"
                            binding.cs0302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs04 = (when {
                            binding.cs0401.isChecked -> "1"
                            binding.cs0402.isChecked -> "2"
                            binding.cs0403.isChecked -> "3"
                            binding.cs0404.isChecked -> "4"
                            binding.cs0405.isChecked -> "5"
                            binding.cs0498.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs05 = (when {
                            binding.cs0501.isChecked -> "1"
                            binding.cs0502.isChecked -> "2"
                            binding.cs0503.isChecked -> "3"
                            binding.cs0504.isChecked -> "4"
                            binding.cs0505.isChecked -> "5"
                            binding.cs0598.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs06 = (when {
                            binding.cs0601.isChecked -> "1"
                            binding.cs0602.isChecked -> "2"
                            else -> "-1"
                        }),


                        cs07 = (when {
                            binding.cs0701.isChecked -> "1"
                            binding.cs0702.isChecked -> "2"
                            binding.cs0703.isChecked -> "3"
                            binding.cs0704.isChecked -> "4"
                            binding.cs0706.isChecked -> "6"
                            binding.cs0707.isChecked -> "7"
                            binding.cs0708.isChecked -> "8"
                            binding.cs0709.isChecked -> "9"
                            binding.cs0710.isChecked -> "10"
                            binding.cs0711.isChecked -> "11"
                            binding.cs0712.isChecked -> "12"
                            binding.cs0713.isChecked -> "13"
                            binding.cs07962.isChecked -> "962"
                            binding.cs0714.isChecked -> "14"
                            else -> "-1"
                        }),

                        cs08 = (when {
                            binding.cs0801.isChecked -> "1"
                            binding.cs0802.isChecked -> "2"
                            binding.cs0803.isChecked -> "3"
                            binding.cs0804.isChecked -> "4"
                            binding.cs0805.isChecked -> "5"
                            binding.cs0806.isChecked -> "6"
                            binding.cs0807.isChecked -> "7"
                            binding.cs0808.isChecked -> "8"
                            binding.cs0809.isChecked -> "9"
                            binding.cs0810.isChecked -> "10"
                            binding.cs0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs08a = (when {
                            binding.cs08a01.isChecked -> "1"
                            binding.cs08a02.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs09 = (when {
                            binding.cs0901.isChecked -> "1"
                            binding.cs0902.isChecked -> "2"
                            binding.cs0903.isChecked -> "3"
                            binding.cs0905.isChecked -> "5"
                            binding.cs0906.isChecked -> "6"
                            binding.cs0996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs10 = (when {
                            binding.cs1001.isChecked -> "1"
                            binding.cs1002.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs11 = (when {
                            binding.cs1101.isChecked -> "1"
                            binding.cs1102.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs12 = (when {
                            binding.cs1201.isChecked -> "1"
                            binding.cs1202.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs13 = (when {
                            binding.cs1301.isChecked -> "1"
                            binding.cs1302.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs14 = (when {
                            binding.cs1401.isChecked -> "1"
                            binding.cs1402.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs15 = (when {
                            binding.cs1501.isChecked -> "1"
                            binding.cs1502.isChecked -> "2"
                            binding.cs1503.isChecked -> "3"
                            binding.cs1596.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs16 = (when {
                            binding.cs1601.isChecked -> "1"
                            binding.cs1602.isChecked -> "2"
                            else -> "-1"
                        }),

                        cs17 = (when {
                            binding.cs1701.isChecked -> "1"
                            binding.cs1702.isChecked -> "2"
                            binding.cs1703.isChecked -> "3"
                            binding.cs1704.isChecked -> "4"
                            binding.cs1706.isChecked -> "6"
                            binding.cs1707.isChecked -> "7"
                            binding.cs1708.isChecked -> "8"
                            binding.cs1709.isChecked -> "9"
                            binding.cs1710.isChecked -> "10"
                            binding.cs1711.isChecked -> "11"
                            binding.cs1712.isChecked -> "12"
                            binding.cs1713.isChecked -> "13"
                            binding.cs1714.isChecked -> "14"
                            binding.cs17962.isChecked -> "962"
                            else -> "-1"
                        }),

                        cs17a = (when {
                            binding.cs1701.isChecked -> "1"
                            binding.cs1702.isChecked -> "2"
                            binding.cs1703.isChecked -> "3"
                            binding.cs1704.isChecked -> "4"
                            binding.cs1706.isChecked -> "6"
                            binding.cs1707.isChecked -> "7"
                            binding.cs1708.isChecked -> "8"
                            binding.cs1709.isChecked -> "9"
                            binding.cs1710.isChecked -> "10"
                            binding.cs1711.isChecked -> "11"
                            binding.cs1712.isChecked -> "12"
                            binding.cs1713.isChecked -> "13"
                            binding.cs1714.isChecked -> "14"
                            binding.cs17962.isChecked -> "962"
                            else -> "-1"
                        }),

                        cs18 = (when {
                            binding.cs1802.isChecked -> "2"
                            binding.cs1803.isChecked -> "3"
                            binding.cs1804.isChecked -> "4"
                            binding.cs1805.isChecked -> "5"
                            binding.cs1806.isChecked -> "6"
                            binding.cs1807.isChecked -> "7"
                            binding.cs1808.isChecked -> "8"
                            binding.cs1896.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs19 = (when {
                            binding.cs1901.isChecked -> "1"
                            binding.cs1902.isChecked -> "2"
                            binding.cs1903.isChecked -> "3"
                            binding.cs1905.isChecked -> "5"
                            binding.cs1906.isChecked -> "6"
                            binding.cs1996.isChecked -> "96"
                            else -> "-1"
                        }),

                        cs20 = (when {
                            binding.cs2001.isChecked -> "1"
                            binding.cs2002.isChecked -> "2"
                            binding.cs2098.isChecked -> "98"
                            else -> "-1"
                        }),

                        cs21 = (when {
                            binding.cs2101.isChecked -> "1"
                            binding.cs2102.isChecked -> "2"
                            binding.cs2103.isChecked -> "3"
                            binding.cs2104.isChecked -> "4"
                            binding.cs2105.isChecked -> "5"
                            else -> "-1"
                        }),


                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }
}