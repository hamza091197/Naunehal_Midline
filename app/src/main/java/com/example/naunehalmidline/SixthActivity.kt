package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivitySixthBinding

class SixthActivity : AppCompatActivity() {
    lateinit var binding: ActivitySixthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sixth)
        binding.callback

        binding.btnContinue.setOnClickListener {


            if (binding.bf01.text.toString().trim().isEmpty()){
                binding.bf01.requestFocus()
                binding.bf01.error = "Enter Child's line number"
                return@setOnClickListener
            }

            if (binding.bf02.text.toString().trim().isEmpty()){
                binding.bf02.requestFocus()
                binding.bf02.error = "WRA's Name"
                return@setOnClickListener
            }

            if (binding.bf3y.text.toString().trim().isEmpty()){
                binding.bf3y.requestFocus()
                binding.bf3y.error = "Enter Years"
                return@setOnClickListener
            }

            if (binding.bf03m.text.toString().trim().isEmpty()){
                binding.bf03m.requestFocus()
                binding.bf03m.error = "Enter Months"
                return@setOnClickListener
            }

            if (binding.bf3d.text.toString().trim().isEmpty()){
                binding.bf3d.requestFocus()
                binding.bf3d.error = "Enter Days"
                return@setOnClickListener
            }

            if (binding.bf03a01.text.toString().trim().isEmpty()){
                binding.bf03a01.requestFocus()
                binding.bf03a01.error = "Enter Months"
                return@setOnClickListener
            }

            if (binding.bf03a02.text.toString().trim().isEmpty()){
                binding.bf03a02.requestFocus()
                binding.bf03a02.error = "Enter Years"
                return@setOnClickListener
            }

            if (binding.bf04.checkedRadioButtonId == -1){
                binding.bf0401.requestFocus()
                binding.bf0498.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.bf0498.error = null
            }

            if (!binding.bf0501.isChecked){
                if (binding.bf0502.text.toString().trim().isEmpty()){
                    binding.bf0502.requestFocus()
                    binding.bf0502.error = "Enter Hours"
                    return@setOnClickListener
                }
                if (!binding.bf0502.isRangeTextValidate){
                    binding.bf0502.requestFocus()
                    binding.bf0502.error = "The range is from 1 to 24"
                    return@setOnClickListener
                }

                if (binding.bf0503.text.toString().trim().isEmpty()){
                    binding.bf0503.requestFocus()
                    binding.bf0503.error = "Enter Hours"
                    return@setOnClickListener
                }
                if (!binding.bf0503.isRangeTextValidate){
                    binding.bf0503.requestFocus()
                    binding.bf0503.error = "The range is from 1 to 24"
                    return@setOnClickListener
                }
            }

            if (binding.bf06.checkedRadioButtonId == -1){
                binding.bf0601.requestFocus()
                binding.bf0698.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.bf0698.error = null
            }

            if (binding.bf07.checkedRadioButtonId == -1){
                binding.bf0701.requestFocus()
                binding.bf0701.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf0701.error = null
            }

            if (binding.bf0796.isChecked &&
                binding.bf0796x.text.toString().trim().isEmpty()){
                binding.bf0796x.requestFocus()
                binding.bf0796x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.bf08.checkedRadioButtonId == -1){
                binding.bf0801.requestFocus()
                binding.bf0898.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf0898.error = null
            }

            var bf09Flag = false
            binding.bf09check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    bf09Flag = true
                }
                if (!bf09Flag) return@forEach
            }
            if (!bf09Flag){
                binding.bf0901.error = "CheckBox Not Selected"
                binding.bf0901.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.bf0901.error = null
            }

            if (binding.bf0996.isChecked &&
                binding.bf0996x.text.toString().trim().isEmpty()){
                binding.bf0996x.requestFocus()
                binding.bf0996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.bf10.checkedRadioButtonId == -1){
                binding.bf1096.requestFocus()
                binding.bf1096.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf1096.error = null
            }

            if (binding.bf12.checkedRadioButtonId == -1){
                binding.bf1298.requestFocus()
                binding.bf1298.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf1298.error = null
            }

            if (binding.bf13.checkedRadioButtonId == -1){
                binding.bf1398.requestFocus()
                binding.bf1398.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf1398.error = null
            }

            if (binding.bf14a.checkedRadioButtonId == -1){
                binding.bf14a98.requestFocus()
                binding.bf14a98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14a98.error = null
            }

            if (!binding.bf14b02.isChecked && !binding.bf14b98.isChecked){
                if (binding.bf14b01.text.toString().trim().isEmpty()){
                    binding.bf14b01.requestFocus()
                    binding.bf14b01.error = ""
                    return@setOnClickListener
                }
                if (!binding.bf14b01.isRangeTextValidate){
                    binding.bf14b01.requestFocus()
                    binding.bf14b01.error = "The range is from 1 to 23"
                    return@setOnClickListener
                }
            }


            if (!binding.bf14c02.isChecked && !binding.bf14c98.isChecked){
                if (binding.bf14c01.text.toString().trim().isEmpty()){
                    binding.bf14c01.requestFocus()
                    binding.bf14c01.error = ""
                    return@setOnClickListener
                }
                if (!binding.bf14c01.isRangeTextValidate){
                    binding.bf14c01.requestFocus()
                    binding.bf14c01.error = "The range is from 1 to 23"
                    return@setOnClickListener
                }
            }

            if (binding.bf14d.checkedRadioButtonId == -1){
                binding.bf14d98.requestFocus()
                binding.bf14d98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14d98.error = null
            }

            if (binding.bf14e.checkedRadioButtonId == -1){
                binding.bf14e98.requestFocus()
                binding.bf14e98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14e98.error = null
            }

            if (!binding.bf14f02.isChecked && !binding.bf14f98.isChecked){
                if (binding.bf14f01.text.toString().trim().isEmpty()){
                    binding.bf14f01.requestFocus()
                    binding.bf14f01.error = "Enter Hours"
                    return@setOnClickListener
                }
                if (!binding.bf14f01.isRangeTextValidate){
                    binding.bf14f01.requestFocus()
                    binding.bf14f01.error = "The range is from 1 to 23"
                    return@setOnClickListener
                }
            }

            if (binding.bf14g.checkedRadioButtonId == -1){
                binding.bf14g98.requestFocus()
                binding.bf14g98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14g98.error = null
            }

            if (binding.bf14h.checkedRadioButtonId == -1){
                binding.bf14h98.requestFocus()
                binding.bf14h98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14h98.error = null
            }

            if (binding.bf14i.checkedRadioButtonId == -1){
                binding.bf14i98.requestFocus()
                binding.bf14i98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf14i98.error = null
            }

            if (binding.bf15a.checkedRadioButtonId == -1){
                binding.bf15a98.requestFocus()
                binding.bf15a98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15a98.error = null
            }

            if (binding.bf15b.checkedRadioButtonId == -1){
                binding.bf15b98.requestFocus()
                binding.bf15b98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15b98.error = null
            }

            if (binding.bf15c.checkedRadioButtonId == -1){
                binding.bf15c98.requestFocus()
                binding.bf15c98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15c98.error = null
            }

            if (binding.bf15d.checkedRadioButtonId == -1){
                binding.bf15d98.requestFocus()
                binding.bf15d98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15d98.error = null
            }

            if (binding.bf15e.checkedRadioButtonId == -1){
                binding.bf15e98.requestFocus()
                binding.bf15e98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15e98.error = null
            }

            if (binding.bf15f.checkedRadioButtonId == -1){
                binding.bf15f98.requestFocus()
                binding.bf15f98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15f98.error = null
            }
            
            if (binding.bf15g.checkedRadioButtonId == -1){
                binding.bf15g98.requestFocus()
                binding.bf15g98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15g98.error = null
            }

            if (binding.bf15h.checkedRadioButtonId == -1){
                binding.bf15h98.requestFocus()
                binding.bf15h98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15h98.error = null
            }

            if (binding.bf15i.checkedRadioButtonId == -1){
                binding.bf15i98.requestFocus()
                binding.bf15i98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15i98.error = null
            }

            if (binding.bf15j.checkedRadioButtonId == -1){
                binding.bf15j98.requestFocus()
                binding.bf15j98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15j98.error = null
            }

            if (binding.bf15k.checkedRadioButtonId == -1){
                binding.bf15k98.requestFocus()
                binding.bf15k98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15k98.error = null
            }

            if (binding.bf15l.checkedRadioButtonId == -1){
                binding.bf15l98.requestFocus()
                binding.bf15l98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15l98.error = null
            }

            if (binding.bf15m.checkedRadioButtonId == -1){
                binding.bf15m98.requestFocus()
                binding.bf15m98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15m98.error = null
            }

            if (binding.bf15n.checkedRadioButtonId == -1){
                binding.bf15n98.requestFocus()
                binding.bf15n98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15n98.error = null
            }

            if (binding.bf15o.checkedRadioButtonId == -1){
                binding.bf15o98.requestFocus()
                binding.bf15o98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15o98.error = null
            }

            if (binding.bf15p.checkedRadioButtonId == -1){
                binding.bf15p98.requestFocus()
                binding.bf15p98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15p98.error = null
            }

            if (binding.bf15q.checkedRadioButtonId == -1){
                binding.bf15q98.requestFocus()
                binding.bf15q98.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf15q98.error = null
            }

            if (binding.bf16.checkedRadioButtonId == -1){
                binding.bf1698.requestFocus()
                binding.bf1698.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            else {
                binding.bf1698.error = null
            }

            if(binding.bf18.checkedRadioButtonId == -1){
                binding.bf1898.requestFocus()
                binding.bf1898.error = "RadioButton Not selected"
                return@setOnClickListener
            }
            else {
                binding.bf1898.error = null
            }


            if (binding.bf19.checkedRadioButtonId == -1){
                binding.bf1901.requestFocus()
                binding.bf1901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }else {
                binding.bf1901.error = null
            }

            if (binding.bf1996.isChecked &&
                binding.bf1996x.text.toString().trim().isEmpty()){
                binding.bf1996x.requestFocus()
                binding.bf1996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.bf20.checkedRadioButtonId == -1){
                binding.bf2098.requestFocus()
                binding.bf2098.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.bf2098.error = null
            }


        }

        binding.bf1798.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.bf1798.isChecked){
                binding.bf1701x.error = null
                binding.bf1701x.text = null
                binding.bf1701x.setEnabled(false)

            }
            else{
                binding.bf1701x.setEnabled(true)
            }

        }

        binding.bf1701x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.bf1798.isChecked = !binding.bf1701x.text.toString().isNotEmpty()
                }


            })

        binding.bf0501.setOnCheckedChangeListener { compoundButton, b ->

            if (b){
                binding.bf0502.error = null
                binding.bf0503.error = null
                binding.bf0502.text = null
                binding.bf0503.text = null
                binding.bf0503.isEnabled = false
                binding.bf0502.isEnabled = false
            }
            else{
                binding.bf0502.isEnabled = true
                binding.bf0503.isEnabled = true
            }
        }

        binding.bf0502.addTextChangedListener(
            object : TextWatcher {

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.bf0501.isChecked = !binding.bf0502.text.toString().isNotEmpty()
                }
            })

        binding.bf0503.addTextChangedListener(
            object : TextWatcher {

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


                }

                override fun afterTextChanged(p0: Editable?) {
                    if (binding.bf0503.text.toString().isNotEmpty()){
                        binding.bf0501.isChecked = false
                    }
                    else {
                        binding.bf0501.isChecked = true
                    }
                }
            })

        binding.bf14b02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14b02.isChecked){
                binding.bf14b01.text = null
                binding.bf14b98.isChecked = false
                binding.bf14b01.error = null
                binding.bf14b01.isEnabled = false
            }
            else{
                binding.bf14b01.isEnabled
            }
        }

        binding.bf14b98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14b98.isChecked){
                binding.bf14b01.text = null
                binding.bf14b02.isChecked = false
                binding.bf14b01.error = null
                binding.bf14b01.isEnabled = false
            }
            else{
                binding.bf14b01.isEnabled
            }
        }

        binding.bf14c02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14c02.isChecked){
                binding.bf14c01.text = null
                binding.bf14c98.isChecked = false
                binding.bf14c01.error = null
                binding.bf14c01.isEnabled = false
            }
            else{
                binding.bf14c01.isEnabled
            }
        }

        binding.bf14c98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14c98.isChecked){
                binding.bf14c01.text = null
                binding.bf14c02.isChecked = false
                binding.bf14c01.error = null
                binding.bf14c01.isEnabled = false
            }
            else{
                binding.bf14c01.isEnabled
            }
        }

        binding.bf14f02.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14f02.isChecked){
                binding.bf14f01.text = null
                binding.bf14f98.isChecked = false
                binding.bf14f01.error = null
               binding.bf14f01.isEnabled = false
            }
            else{
                binding.bf14f01.isEnabled
            }
        }

        binding.bf14f98.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.bf14f98.isChecked){
                binding.bf14f01.text = null
                binding.bf14f02.isChecked = false
                binding.bf14f01.error = null
                binding.bf14f01.isEnabled = false
            }
            else{
                binding.bf14f01.isEnabled
            }
        }

    }
}