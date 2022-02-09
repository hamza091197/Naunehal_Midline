package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivitySevenBinding
import com.example.naunehalmidline.fifth.FifthDatabase

class SevenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySevenBinding
    lateinit var database: FifthDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_seven)
        binding.callback

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

        }
    }
}