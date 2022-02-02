package com.example.naunehalmidline

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityFourthBinding


class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth)
        binding.callback

        binding.btnFourth2.setOnClickListener {
            val intent = Intent(this, FourthActivity2::class.java)
            startActivity(intent)
        }

        binding.btnContinue.setOnClickListener {

            /*if (binding.im01.checkedRadioButtonId == -1){
                binding.im01.requestFocus()
                binding.im012.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im012.error = null
            }


            if (binding.im02.checkedRadioButtonId == -1){
                binding.im02.requestFocus()
                binding.im022.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im022.error = null
            }*/

            if (binding.im03.checkedRadioButtonId == -1){
                binding.im03.requestFocus()
                binding.im031.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im031.error = null
            }

            if (binding.im0396.isChecked &&
                binding.im0396x.text.toString().trim().isEmpty()){
                binding.im0396x.requestFocus()
                binding.im0396x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.im04Dd.text.toString().trim().isEmpty()){
                binding.im04Dd.requestFocus()
                binding.im04Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (binding.im04Mm.text.toString().trim().isEmpty()){
                binding.im04Mm.requestFocus()
                binding.im04Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (binding.im04Yy.text.toString().trim().isEmpty()){
                binding.im04Yy.requestFocus()
                binding.im04Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (binding.im0501Dd.text.toString().trim().isEmpty()){
                binding.im0501Dd.requestFocus()
                binding.im0501Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0501Dd.isRangeTextValidate){
                binding.im0501Dd.requestFocus()
                binding.im0501Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0501Mm.text.toString().trim().isEmpty()){
                binding.im0501Mm.requestFocus()
                binding.im0501Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0501Mm.isRangeTextValidate){
                binding.im0501Mm.requestFocus()
                binding.im0501Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0501Yy.text.toString().trim().isEmpty()){
                binding.im0501Yy.requestFocus()
                binding.im0501Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0501Yy.isRangeTextValidate){
                binding.im0501Yy.requestFocus()
                binding.im0501Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0502Dd.text.toString().trim().isEmpty()){
                binding.im0502Dd.requestFocus()
                binding.im0502Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0502Dd.isRangeTextValidate){
                binding.im0502Dd.requestFocus()
                binding.im0502Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0502Mm.text.toString().trim().isEmpty()){
                binding.im0502Mm.requestFocus()
                binding.im0502Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0502Mm.isRangeTextValidate){
                binding.im0502Mm.requestFocus()
                binding.im0502Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0502Yy.text.toString().trim().isEmpty()){
                binding.im0502Yy.requestFocus()
                binding.im0502Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0502Yy.isRangeTextValidate){
                binding.im0502Yy.requestFocus()
                binding.im0502Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im07.checkedRadioButtonId == -1){
                binding.im072.requestFocus()
                binding.im072.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im072.error = null
            }

            if (binding.im08a.checkedRadioButtonId == -1){
                binding.im08a3.requestFocus()
                binding.im08a3.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im08a3.error = null
            }


            if (binding.im08b.text.toString().trim().isEmpty()){
                binding.im08b.requestFocus()
                binding.im08b.error = "How many times has (name) polio drops been given during the national polio campaigns?"
                return@setOnClickListener
            }

            if (binding.im08b.isRangeTextValidate){
                binding.im08b.requestFocus()
                binding.im08b.error = "The range is from 1 to 5"
                return@setOnClickListener
            }

            var im08cFlag = false
            binding.im08ccheck.children.forEach{
                if (it is CheckBox && it.isChecked){
                    im08cFlag = true
                }
                if (!im08cFlag) return@forEach
            }
            if (!im08cFlag){
                binding.im08c01.error = "CheckBox Not Selected"
                binding.im08c01.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.im08c01.error = null
            }

            if (binding.im0896.isChecked &&
                    binding.im0896x.text.toString().trim().isEmpty())
            {
                binding.im0896x.requestFocus()
                binding.im0896x.error = "Other"
                return@setOnClickListener
            }

            if (binding.im09.checkedRadioButtonId == -1){
                binding.im093.requestFocus()
                binding.im093.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im093.error = null
            }

            if (binding.im10.checkedRadioButtonId == -1){
                binding.im103.requestFocus()
                binding.im103.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            var im10aFlag = false
            binding.im10acheck.children.forEach{
                if (it is CheckBox && it.isChecked){
                    im10aFlag = true
                }
                if (!im10aFlag) return@forEach
            }
            if (!im10aFlag){
                binding.im10a01.error = "CheckBox Not Selected"
                binding.im10a01.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.im10a01.error = null
            }

            if (binding.im10a96.isChecked &&
                    binding.im10a96x.text.toString().trim().isEmpty()){
                binding.im10a96x.requestFocus()
                binding.im10a96x.error = "Other"
                return@setOnClickListener
            }

            if (binding.im0501Dd.text.toString() == "44" ||
                binding.im0501Dd.text.toString() == "66" ||
                binding.im0501Dd.text.toString() == "88" ||
                binding.im0501Dd.text.toString() == "97"){
                binding.im0501Mm.error = null
                binding.im0501Yy.error = null
            } else
            {
                binding.im0501Mm.error = "Enter Months"
                binding.im0501Yy.error = "Enter Years"
                return@setOnClickListener
            }
            
            if (binding.im0502Dd.text.toString() == "44" ||
                binding.im0502Dd.text.toString() == "66" ||
                binding.im0502Dd.text.toString() == "88" ||
                binding.im0502Dd.text.toString() == "97"){
                binding.im0502Mm.error = null
                binding.im0502Yy.error = null

            } else
            {
                binding.im0502Mm.error = "Enter months"
                binding.im0502Yy.error = "Enter Years"
                return@setOnClickListener
            }

        }

        im()

    }
    private fun im(){
        binding.im0501Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                // TODO Auto-generated method stub
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s: Editable) {
                /*fun rand(start: Int, end: Int): Int {
                    require(start <= end) { "Illegal Argument" }
                    return (Math.random() * (end - start + 1)).toInt() + start
                }*/



              /*  if (binding.im0501Dd.text.toString() == "44-97"){
                   binding.im0501Mm.text = null
                    binding.im0501Yy.text = null
                    binding.im0501Mm.setEnabled(false)
                    binding.im0501Yy.setEnabled(false)
                    binding.im0501Dd.rangedefaultvalue = binding.im0501Dd.text.toString().toFloat()
                }
                else {
                    binding.im0501Mm.setEnabled(true)
                    binding.im0501Yy.setEnabled(true)
                }*/

            }
        })

        binding.im0502Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                // TODO Auto-generated method stub
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                // TODO Auto-generated method stub
            }
            override fun afterTextChanged(s: Editable) {

                if (binding.im0502Dd.text.toString() == "44" ||
                    binding.im0502Dd.text.toString() == "66" ||
                    binding.im0502Dd.text.toString() == "88" ||
                    binding.im0502Dd.text.toString() == "97"){
                    binding.im0502Mm.text = null
                    binding.im0502Yy.text = null
                    binding.im0502Mm.setEnabled(false)
                    binding.im0502Yy.setEnabled(false)
                }
                else {
                    binding.im0502Mm.setEnabled(true)
                    binding.im0502Yy.setEnabled(true)
                }

            }
        })

        binding.im02.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.im021.isChecked) {
                binding.im03.clearCheck()
                binding.im0396x.text = null
                binding.im04Dd.text = null
                binding.im04Mm.text = null
                binding.im04Yy.text = null
                binding.im0501Dd.text = null
                binding.im0501Mm.text = null
                binding.im0501Yy.text = null
                binding.im0502Dd.text = null
                binding.im0502Mm.text = null
                binding.im0502Yy.text = null
                binding.im0503Dd.text = null
                binding.im0503Mm.text = null
                binding.im0503Yy.text = null
                binding.im0504Dd.text = null
                binding.im0504Mm.text = null
                binding.im0504Yy.text = null
                binding.im0505Dd.text = null
                binding.im0505Mm.text = null
                binding.im0505Yy.text = null
                binding.im0506Dd.text = null
                binding.im0506Mm.text = null
                binding.im0506Yy.text = null
                binding.im0507Dd.text = null
                binding.im0507Mm.text = null
                binding.im0507Yy.text = null
                binding.im0508Dd.text = null
                binding.im0508Mm.text = null
                binding.im0508Yy.text = null
                binding.im0509Dd.text = null
                binding.im0509Mm.text = null
                binding.im0509Yy.text = null
                binding.im0510Dd.text = null
                binding.im0510Mm.text = null
                binding.im0510Yy.text = null
                binding.im0511Dd.text = null
                binding.im0511Mm.text = null
                binding.im0511Yy.text = null
                binding.im0512Dd.text = null
                binding.im0512Mm.text = null
                binding.im0512Yy.text = null
                binding.im0513Dd.text = null
                binding.im0513Mm.text = null
                binding.im0513Yy.text = null
                binding.im0514Dd.text = null
                binding.im0514Mm.text = null
                binding.im0514Yy.text = null
                binding.im0515Dd.text = null
                binding.im0515Mm.text = null
                binding.im0515Yy.text = null
                binding.im0516Dd.text = null
                binding.im0516Mm.text = null
                binding.im0516Yy.text = null
                binding.im07.clearCheck()
                binding.im08.clearCheck()
            }
        }
    }

    }
