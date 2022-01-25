package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivitySecondBinding
import com.example.naunehalmidline.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)
        binding.callback

        binding.btnContinue.setOnClickListener {

            if (binding.cs01.text.toString().trim().isEmpty()){
                binding.cs01.requestFocus()
                binding.cs01.error = "Chil's Line no"
                return@setOnClickListener
            }

            if (!binding.cs01.isRangeTextValidate){
                binding.cs01.requestFocus()
                binding.cs01.error = "The range is from 1 to 99"
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
                binding.cs02b.error = "Chil's Line no"
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
            }

            if (binding.cs07.checkedRadioButtonId == -1){
                binding.cs0701.requestFocus()
                binding.cs0701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.cs0701.error = null
            }

            if (binding.cs07962x.text.toString().trim().isEmpty()){
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

            if (binding.cs0896x.text.toString().trim().isEmpty()){
                binding.cs0896x.requestFocus()
                binding.cs0896x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.cs08a.checkedRadioButtonId == -1){
                binding.cs08a02.requestFocus()
                binding.cs08a02.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs08a02.error = null
            }

            if (binding.cs09.checkedRadioButtonId == -1){
                binding.cs0901.requestFocus()
                binding.cs0901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.cs0901.error = null
            }

            if (binding.cs0996x.text.toString().trim().isEmpty()){
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

            if (binding.cs1596x.text.toString().trim().isEmpty()){
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

            if (binding.cs17961x.text.toString().trim().isEmpty()){
                binding.cs17961x.requestFocus()
                binding.cs17961x.error = "Other Please Specify"
                return@setOnClickListener
            }


            if (binding.cs17962x.text.toString().trim().isEmpty()){
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


            if (binding.cs1896x.text.toString().trim().isEmpty()){
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

            if (binding.cs1996x.text.toString().trim().isEmpty()){
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

        }
    }
}