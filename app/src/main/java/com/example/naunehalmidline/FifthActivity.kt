package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fifth)
        binding.callback

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

}