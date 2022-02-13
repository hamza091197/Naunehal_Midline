package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityEight2Binding

class EightActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityEight2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight2)
        binding.callback
        
        binding.btnContinue2.setOnClickListener {
            if (binding.se2204.checkedRadioButtonId == -1){
                binding.se2204.requestFocus()
                binding.se220402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220402.error = null
            }

            if (binding.se2205.checkedRadioButtonId == -1){
                binding.se220502.requestFocus()
                binding.se220502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220502.error = null
            }

            if (binding.se2206.checkedRadioButtonId == -1){
                binding.se220602.requestFocus()
                binding.se220602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220602.error = null
            }

            if (binding.se2207.checkedRadioButtonId == -1){
                binding.se220702.requestFocus()
                binding.se220702.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220702.error = null
            }

            if (binding.se2208.checkedRadioButtonId == -1){
                binding.se220802.requestFocus()
                binding.se220802.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220802.error = null
            }

            if (binding.se2209.checkedRadioButtonId == -1){
                binding.se220902.requestFocus()
                binding.se220902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220902.error = null
            }

            if (binding.se2210.checkedRadioButtonId == -1){
                binding.se221002.requestFocus()
                binding.se221002.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221002.error = null
            }

            if (binding.se2211.checkedRadioButtonId == -1){
                binding.se221102.requestFocus()
                binding.se221102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221102.error = null
            }

            if (binding.se2212.checkedRadioButtonId == -1){
                binding.se221202.requestFocus()
                binding.se221202.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221202.error = null
            }

            if (binding.se2213.checkedRadioButtonId == -1){
                binding.se221302.requestFocus()
                binding.se221302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221302.error = null
            }

            if (binding.se2214.checkedRadioButtonId == -1){
                binding.se221402.requestFocus()
                binding.se221402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221402.error = null
            }

            if (binding.se2215.checkedRadioButtonId == -1){
                binding.se221502.requestFocus()
                binding.se221502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221502.error = null
            }

            if (binding.se2216.checkedRadioButtonId == -1){
                binding.se221602.requestFocus()
                binding.se221602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221602.error = null
            }

            if (binding.se2217.checkedRadioButtonId == -1){
                binding.se221702.requestFocus()
                binding.se221702.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221702.error = null
            }

            if (binding.se2218.checkedRadioButtonId == -1){
                binding.se221802.requestFocus()
                binding.se221802.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se221802.error = null
            }

            if (binding.se23.checkedRadioButtonId == -1){
                binding.se2302.requestFocus()
                binding.se2302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se2302.error = null
            }

            if (binding.se24.text.toString().trim().isEmpty()){
                binding.se24.requestFocus()
                binding.se24.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se24.isRangeTextValidate){
                binding.se24.requestFocus()
                binding.se24.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.se25.text.toString().trim().isEmpty()){
                binding.se25.requestFocus()
                binding.se25.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se25.isRangeTextValidate){
                binding.se25.requestFocus()
                binding.se25.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            if (binding.se26.text.toString().trim().isEmpty()){
                binding.se26.requestFocus()
                binding.se26.error = "How many mobile phones are there in your household?"
                return@setOnClickListener
            }

            if (!binding.se26.isRangeTextValidate){
                binding.se26.requestFocus()
                binding.se26.error = "The range is from 1 to 20"
                return@setOnClickListener
            }

            var se27Flag = false
            binding.se27check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se27Flag = true
                }
                if (!se27Flag) return@forEach
            }
            if (!se27Flag){
                binding.se2701.error = "CheckBox Not Selected"
                binding.se2701.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2701.error = null
            }

            var se28Flag = false
            binding.se28check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se28Flag = true
                }
                if (!se28Flag) return@forEach
            }
            if (!se28Flag){
                binding.se2803.error = "CheckBox Not Selected"
                binding.se2803.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2803.error = null
            }

            if (binding.se29.checkedRadioButtonId == -1){
                binding.se2902.requestFocus()
                binding.se2902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.se2902.error = null
            }

            var se30Flag = false
            binding.se30check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se30Flag = true
                }
                if (!se30Flag) return@forEach
            }
            if (!se30Flag){
                binding.se3001.error = "CheckBox Not Selected"
                binding.se3001.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se3001.error = null
            }

            if (binding.se3096.isChecked && binding.se3096x.text.toString().trim().isEmpty()){
                binding.se3096x.requestFocus()
                binding.se3096x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se31.checkedRadioButtonId == -1){
                binding.se3101.requestFocus()
                binding.se3101.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3101.error = null
            }

            if (binding.se3196.isChecked && binding.se3196x.text.toString().trim().isEmpty()){
                binding.se3196x.requestFocus()
                binding.se3196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se32.checkedRadioButtonId == -1){
                binding.se3201.requestFocus()
                binding.se3201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3201.error = null
            }

            if (binding.se3302.text.toString().trim().isEmpty()){
                binding.se3302.requestFocus()
                binding.se3302.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.se3302.isRangeTextValidate){
                binding.se3302.requestFocus()
                binding.se3302.error = "The range is from 1 to 24"
                return@setOnClickListener
            }

            if (binding.se3301.text.toString().trim().isEmpty()){
                binding.se3301.requestFocus()
                binding.se3301.error = "Minutes"
                return@setOnClickListener
            }

            if (!binding.se3301.isRangeTextValidate){
                binding.se3301.requestFocus()
                binding.se3301.error = "The range is from 0 to 59"
                return@setOnClickListener
            }

            if (binding.se41.checkedRadioButtonId == -1){
                binding.se4198.requestFocus()
                binding.se4198.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4198.error = null
            }

            if (binding.se42.checkedRadioButtonId == -1){
                binding.se4201.requestFocus()
                binding.se4201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4201.error = null
            }

            if (binding.se4296.isChecked && binding.se4296x.text.toString().trim().isEmpty()){
                binding.se4296x.requestFocus()
                binding.se4296x.error = "Other"
                return@setOnClickListener
            }

            var se43Flag = false
            binding.se43check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se43Flag = true
                }
                if (!se43Flag) return@forEach
            }
            if (!se43Flag){
                binding.se4301.error = "CheckBox Not Selected"
                binding.se4301.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4301.error = null
            }

            if (binding.se4396.isChecked && binding.se4396x.text.toString().trim().isEmpty()){
                binding.se4396x.requestFocus()
                binding.se4396x.error = "Other"
                return@setOnClickListener
            }

            var se44Flag = false
            binding.se44check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se44Flag = true
                }
                if (!se44Flag) return@forEach
            }
            if (!se44Flag){
                binding.se4401.error = "CheckBox Not Selected"
                binding.se4401.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4401.error = null
            }

            if (binding.se4496.isChecked && binding.se4496x.text.toString().trim().isEmpty()){
                binding.se4496x.requestFocus()
                binding.se4496x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se45.checkedRadioButtonId == -1){
                binding.se4598.requestFocus()
                binding.se4598.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4598.error = null
            }

            var se46Flag = false
            binding.se46check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se46Flag = true
                }
                if (!se46Flag) return@forEach
            }
            if (!se46Flag){
                binding.se4601.error = "CheckBox Not Selected"
                binding.se4601.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4601.error = null
            }

            if (binding.se4696.isChecked && binding.se4696x.text.toString().trim().isEmpty()){
                binding.se4696x.requestFocus()
                binding.se4696x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se48.checkedRadioButtonId == -1){
                binding.se4898.requestFocus()
                binding.se4898.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4898.error = null
            }

            var se49Flag = false
            binding.se49check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se49Flag = true
                }
                if (!se49Flag) return@forEach
            }
            if (!se49Flag){
                binding.se4901.error = "CheckBox Not Selected"
                binding.se4901.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se4901.error = null
            }

            if (binding.se4996.isChecked && binding.se4996x.text.toString().trim().isEmpty()){
                binding.se4996x.requestFocus()
                binding.se4996x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se50.checkedRadioButtonId == -1){
                binding.se5001.requestFocus()
                binding.se5001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se5001.error = null
            }

            if (binding.se5096.isChecked && binding.se5096x.text.toString().trim().isEmpty()){
                binding.se5096x.requestFocus()
                binding.se5096x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se3401.text.toString().trim().isEmpty()){
                binding.se3401.requestFocus()
                binding.se3401.error = "Hours"
                return@setOnClickListener
            }

            if (!binding.se3401.isRangeTextValidate){
                binding.se3401.requestFocus()
                binding.se3401.error = "The range is from 1 to 24"
                return@setOnClickListener
            }

            if (binding.se3402.text.toString().trim().isEmpty()){
                binding.se3402.requestFocus()
                binding.se3402.error = "Minutes"
                return@setOnClickListener
            }

            if (!binding.se3402.isRangeTextValidate){
                binding.se3402.requestFocus()
                binding.se3402.error = "The range is from 0 to 59"
                return@setOnClickListener
            }

            if (binding.se35.checkedRadioButtonId == -1){
                binding.se3598.requestFocus()
                binding.se3598.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3598.error = null
            }

            if (binding.se36.checkedRadioButtonId == -1){
                binding.se3698.requestFocus()
                binding.se3698.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3698.error = null
            }

            var se37Flag = false
            binding.se37check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se37Flag = true
                }
                if (!se37Flag) return@forEach
            }
            if (!se37Flag){
                binding.se3701.error = "CheckBox Not Selected"
                binding.se3701.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se3701.error = null
            }

            if (binding.se3796.isChecked && binding.se3796x.text.toString().trim().isEmpty()){
                binding.se3796x.requestFocus()
                binding.se3796x.error = "Other"
                return@setOnClickListener
            }

            if (binding.se38.checkedRadioButtonId == -1){
                binding.se3898.requestFocus()
                binding.se3898.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3898.error = null
            }

            if (binding.se39.checkedRadioButtonId == -1){
                binding.se3902.requestFocus()
                binding.se3902.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se3902.error = null
            }

            if (binding.se40.checkedRadioButtonId == -1){
                binding.se4098.requestFocus()
                binding.se4098.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se4098.error = null
            }
        }
    }
}