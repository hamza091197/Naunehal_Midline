package com.example.naunehalmidline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivitySecondBinding
import com.validatorcrawler.aliazaz.Clear
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.callback

        val actionBar = supportActionBar
        actionBar?.title = "Child Basic Information"
        actionBar?.setDisplayHomeAsUpEnabled(true)


        binding.btnContinue.setOnClickListener { 
            
            if (binding.cb01.text.toString().trim().isEmpty()){
                binding.cb01.requestFocus()
                binding.cb01.error = " Line no"
                return@setOnClickListener
            }
            
            if (binding.cb02.text.toString().trim().isEmpty()){
                binding.cb02.requestFocus()
                binding.cb02.error = " Name"
                return@setOnClickListener
            }

            if (binding.cb03.checkedRadioButtonId == -1){
                binding.cb03.requestFocus()
                binding.cb0302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb0302.error = null
            }
            
            if (binding.cb04dd.text.toString().trim().isEmpty()){
                binding.cb04dd.requestFocus()
                binding.cb04dd.error = " Days"
                return@setOnClickListener
            }

            if (binding.cb04dd.isRangeTextValidate){
                binding.cb04dd.requestFocus()
                binding.cb04dd.error = "The range is from 1 to 29"
                return@setOnClickListener
            }

            if (binding.cb04mm.text.toString().trim().isEmpty()){
                binding.cb04mm.requestFocus()
                binding.cb04mm.error = " Months"
                return@setOnClickListener
            }

            if (binding.cb04mm.isRangeTextValidate){
                binding.cb04mm.requestFocus()
                binding.cb04mm.error = "The range is from 1 to 11"
                return@setOnClickListener
            }

            if (binding.cb04yy.text.toString().trim().isEmpty()){
                binding.cb04yy.requestFocus()
                binding.cb04yy.error = " Year"
                return@setOnClickListener
            }

            if (binding.cb04yy.isRangeTextValidate){
                binding.cb04yy.requestFocus()
                binding.cb04yy.error = "The range is from 2015 to 2021"
                return@setOnClickListener
            }

            if (binding.cb0501.text.toString().trim().isEmpty()){
                binding.cb0501.requestFocus()
                binding.cb0501.error = " Year"
                return@setOnClickListener
            }

            if (binding.cb0501.isRangeTextValidate){
                binding.cb0501.requestFocus()
                binding.cb0501.error = "The range is from 1 to 5"
                return@setOnClickListener
            }

            if (binding.cb0502.text.toString().trim().isEmpty()){
                binding.cb0502.requestFocus()
                binding.cb0502.error = " Months"
                return@setOnClickListener
            }

            if (binding.cb0502.isRangeTextValidate){
                binding.cb0502.requestFocus()
                binding.cb0502.error = "The range is from 1 to 11"
                return@setOnClickListener
            }
            
            if (binding.cb06.checkedRadioButtonId == -1){
                binding.cb06.requestFocus()
                binding.cb0601.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb0601.error = null
            }
            
            if (binding.cb15.text.toString().trim().isEmpty()){
                binding.cb15.requestFocus()
                binding.cb15.error = "Birth weight (kg)"
                return@setOnClickListener
            }

            if (binding.cb15.isRangeTextValidate){
                binding.cb15.requestFocus()
                binding.cb15.error = "The range is from 0.5 to 9.0"
                return@setOnClickListener
            }

            if (binding.cb17.checkedRadioButtonId == -1){
                binding.cb17.requestFocus()
                binding.cb1701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb1701.error = null
            }

            if (binding.cb07.text.toString().trim().isEmpty()){
                binding.cb07.requestFocus()
                binding.cb07.error = "Name of Mother"
                return@setOnClickListener
            }

            if (binding.cb08.text.toString().trim().isEmpty()){
                binding.cb08.requestFocus()
                binding.cb08.error = "Age"
                return@setOnClickListener
            }

            if (binding.cb08.isRangeTextValidate){
                binding.cb08.requestFocus()
                binding.cb08.error = "The range is from 12 to 99"
                return@setOnClickListener
            }

            if (binding.cb09.text.toString().trim().isEmpty()){
                binding.cb09.requestFocus()
                binding.cb09.error = "Education Qualification of respondent Mention completed years of education; Code: 55 for uneducated, and 22 for only religious studies"
                return@setOnClickListener
            }

            if (binding.cb09.isRangeTextValidate){
                binding.cb09.requestFocus()
                binding.cb09.error = "The range is from 1 to 17"
                return@setOnClickListener
            }

            if (binding.cb16.checkedRadioButtonId == -1){
                binding.cb1603.requestFocus()
                binding.cb1603.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb1603.error = null
            }

            if (binding.cb10.checkedRadioButtonId == -1){
                binding.cb1001.requestFocus()
                binding.cb1001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            if (binding.cb11.checkedRadioButtonId == -1){
                binding.cb1102.requestFocus()
                binding.cb1102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb1102.error = null
            }

            if (binding.cb13.text.toString().trim().isEmpty()){
                binding.cb13.requestFocus()
                binding.cb13.error = "Education Qualification of Father Mention completed years of education; Code: 55 for uneducated, and 22 for only religious studies"
                return@setOnClickListener
            }

            if (binding.cb13.isRangeTextValidate){
                binding.cb13.requestFocus()
                binding.cb13.error = "The range is from 1 to 17"
                return@setOnClickListener
            }

            if (binding.cb14.checkedRadioButtonId == -1){
                binding.cb14.requestFocus()
                binding.cb1401.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cb1401.error = null
            }

            val refresh = Intent(this, SecondActivity::class.java)
            startActivity(refresh)


        }
        binding.btnEnd.setOnClickListener {
            createDialog()


        }
    }

    private fun createDialog() {
        AlertDialog.Builder(this@SecondActivity).apply {
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
                    binding.Grp1.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

}