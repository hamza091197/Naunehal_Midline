package com.example.naunehalmidline

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.callback


        binding.btnContinue.setOnClickListener {




            /*if (binding.hh01.text.toString().trim().isEmpty()){
                binding.hh01.requestFocus()
                binding.hh01.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (!binding.hh01.isRangeTextValidate){
                binding.hh01.requestFocus()
                binding.hh01.error = "The range is from 0 to 0"
                return@setOnClickListener
            }

            if(binding.hh0201.text.toString().trim().isEmpty()){
                binding.hh0201.requestFocus()
                binding.hh0201.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.hh0201.isRangeTextValidate){
                binding.hh0201.requestFocus()
                binding.hh0201.error = "The range is from 1 to 23"
                return@setOnClickListener
            }


            if  (binding.hh0202.text.toString().trim().isEmpty()){
                binding.hh0202.requestFocus()
                binding.hh0202.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.hh0202.isRangeTextValidate){
                binding.hh0202.requestFocus()
                binding.hh0202.error = "The range is from 1 to 59"
                return@setOnClickListener
            }

            if (binding.hh03.text.toString().trim().isEmpty()){
                binding.hh03.requestFocus()
                binding.hh03.error = "Code of Interviewer"
                return@setOnClickListener
            }

            if (!binding.hh03.isRangeTextValidate){
                binding.hh03.requestFocus()
                binding.hh03.error = "The range is from 1 to 9999"
                return@setOnClickListener
            }

            if (binding.hh04.text.toString().trim().isEmpty()){
                binding.hh04.requestFocus()
                binding.hh04.error = "Name of Interviewer"
                return@setOnClickListener
            }

            if (binding.hh05.checkedRadioButtonId == -1){
                binding.hh0501.requestFocus()
                binding.hh0501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.hh0501.error = null
            }

            if (binding.hh06.text.toString().trim().isEmpty()){
                binding.hh06.requestFocus()
                binding.hh06.error = "Enter Union Council"
                return@setOnClickListener
            }

            if (!binding.hh06.isRangeTextValidate){
                binding.hh06.requestFocus()
                binding.hh06.error = "The range is from 1 to 999"
                return@setOnClickListener
            }

            if (binding.hh07.text.toString().trim().isEmpty()){
                binding.hh07.requestFocus()
                binding.hh07.error = "Enter Block, Street, Colony, Village Name"
                return@setOnClickListener
            }

            if (binding.hh08.text.toString().trim().isEmpty()){
                binding.hh08.requestFocus()
                binding.hh08.error = "Cluster Number"
                return@setOnClickListener
            }

            if (!binding.hh08.isRangeTextValidate){
                binding.hh08.requestFocus()
                binding.hh08.error = "The range is from 1 99999"
                return@setOnClickListener
            }

            if (binding.hh09.text.toString().trim().isEmpty()){
                binding.hh09.requestFocus()
                binding.hh09.error = "Enter Household number"
                return@setOnClickListener
            }

            if (!binding.hh09.isRangeTextValidate){
                binding.hh09.requestFocus()
                binding.hh09.error = "The range is from 1 to 9999"
                return@setOnClickListener
            }

            if (binding.hh10.text.toString().trim().isEmpty()){
                binding.hh10.requestFocus()
                binding.hh10.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if(binding.hh11.checkedRadioButtonId == -1){
                binding.hh1102.requestFocus()
                binding.hh1102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.hh1102.error = null
            }

            if (binding.hh12.text.toString().trim().isEmpty()){
                binding.hh12.requestFocus()
                binding.hh12.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (binding.hh13.text.toString().trim().isEmpty()){
                binding.hh13.requestFocus()
                binding.hh13.error = "Enter Date of Interview"
                return@setOnClickListener
            }

            if (!binding.hh13.isRangeTextValidate){
                binding.hh13.requestFocus()
                binding.hh13.error = "the range is from 15 to 99"
                return@setOnClickListener
            }

            if (binding.hh14.checkedRadioButtonId == -1){
                binding.hh1402.requestFocus()
                binding.hh1402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.hh1402.error = null
            }


            if (binding.hh15.checkedRadioButtonId == -1){
                binding.hh1501.requestFocus()
                binding.hh1501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.hh1501.error = null
            }


            if (binding.hh16.text.toString().trim().isEmpty()){
                binding.hh16.requestFocus()
                binding.hh16.error = ""
                return@setOnClickListener
            }

            if (!binding.hh16.isRangeTextValidate){
                binding.hh16.requestFocus()
                binding.hh16.error = "The range is from 1 to 17"
                return@setOnClickListener
            }

            if (binding.hh17.checkedRadioButtonId == -1){
                binding.hh1701.requestFocus()
                binding.hh1701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.hh1701.error = null
            }

            if (binding.hh18.checkedRadioButtonId == -1){
                binding.hh1801.requestFocus()
                binding.hh1801.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.hh1801.error = null
            }

            if (binding.hh19.text.toString().trim().isEmpty()){
                binding.hh19.requestFocus()
                binding.hh19.error = "Enter Name of Head of Household"
                return@setOnClickListener
            }

            if (binding.hh20.checkedRadioButtonId == -1){
                binding.hh2001.requestFocus()
                binding.hh2001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.hh2001.error = null
            }

            if (binding.hh21.text.toString().trim().isEmpty()){
                binding.hh21.requestFocus()
                binding.hh21.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh21.isRangeTextValidate){
                binding.hh21.requestFocus()
                binding.hh21.error = "The range is from 1 to 60"
                return@setOnClickListener
            }

            if (binding.hh22.text.toString().trim().isEmpty()){
                binding.hh22.requestFocus()
                binding.hh22.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh22.isRangeTextValidate){
                binding.hh22.requestFocus()
                binding.hh22.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh23.text.toString().trim().isEmpty()){
                binding.hh23.requestFocus()
                binding.hh23.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh23.isRangeTextValidate){
                binding.hh23.requestFocus()
                binding.hh23.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh24.text.toString().trim().isEmpty()){
                binding.hh24.requestFocus()
                binding.hh24.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh24.isRangeTextValidate){
                binding.hh24.requestFocus()
                binding.hh24.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.hh25.text.toString().trim().isEmpty()){
                binding.hh25.requestFocus()
                binding.hh25.error = "Enter Date of Interview"
                return@setOnClickListener
            }


            if (!binding.hh25.isRangeTextValidate){
                binding.hh25.requestFocus()
                binding.hh25.error = "The range is from 1 to 20"
                return@setOnClickListener
            }*/


            if (binding.hh26.checkedRadioButtonId == -1){
                binding.hh2601.requestFocus()
                binding.hh2601.error = "RadioButton Not Selected"
            }
            else {
                binding.hh2601.error = null
            }



            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)



           /* val intent = intent
            finish()
            startActivity(intent)*/


        }

        binding.btnEnd.setOnClickListener {
            createDialog()

        }


        binding.hh01.transformIntoDatePicker(this, "dd/MM/yyyy", Date())
    }

        fun createDialog() {
            val dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setCancelable(false)
            dialog.setTitle("Alert Dialog")
            dialog.setMessage("Are you sure you want to delete this entry?")
            dialog.setPositiveButton("Delete") { dialog, id ->
                //Action for "Delete".
            }
                .setNegativeButton("Cancel ") { dialog, which ->
                    //Action for "Cancel".

                    val intent = intent
                    finish()
                    startActivity(intent)
                }

            val alert = dialog.create()
            alert.show()


        }


    private fun EditText.transformIntoDatePicker(
        context: Context,
        format: String,
        maxDate: Date? = null) {
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

}