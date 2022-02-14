package com.example.naunehalmidline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityFourth2Binding


class FourthActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityFourth2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth2)
        binding.callback

        binding.btnContinue2.setOnClickListener {


          /*  if (binding.im11.checkedRadioButtonId == -1){
                binding.im11.requestFocus()
                binding.im113.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im113.error = null

            }*/

            if (!binding.im1298.isChecked) {
                if (binding.im121x.text.toString().trim().isEmpty()) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "Number Of Times"
                    return@setOnClickListener
                }

                if (!binding.im121x.isRangeTextValidate) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "The range is from 1 to 96"
                    return@setOnClickListener
                }

            }

            if (!binding.im12a98.isChecked){

                if (binding.im12a1.text.toString().trim().isEmpty()){
                    binding.im12a1.requestFocus()
                    binding.im12a1.error = "Number of Times"
                    return@setOnClickListener
                }

                if (binding.im12a1.isRangeTextValidate){
                    binding.im12a1.requestFocus()
                    binding.im12a1.error = "The range is from 1 to 96"
                    return@setOnClickListener
                }
            }

            if (binding.im13.checkedRadioButtonId == -1){
                binding.im133.requestFocus()
                binding.im133.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im133.error = null
            }

            if (binding.im14.checkedRadioButtonId == -1){
                binding.im143.requestFocus()
                binding.im143.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im143.error = null
            }



            if (!binding.im1598.isChecked){

                if (binding.im151.text.toString().trim().isEmpty()){
                    binding.im151.requestFocus()
                    binding.im151.error = "Number of Times"
                    return@setOnClickListener
                }

                if (binding.im151.isRangeTextValidate){
                    binding.im151.requestFocus()
                    binding.im151.error = "The range is from 1 to 96"
                    return@setOnClickListener
                }
            }
            if (binding.im16.checkedRadioButtonId == -1){
                binding.im163.requestFocus()
                binding.im163.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else {
                binding.im163.error = null
            }

            if (!binding.im1798.isChecked){

                if (binding.im171.text.toString().trim().isEmpty()){
                    binding.im171.requestFocus()
                    binding.im171.error = "Number of Times"
                    return@setOnClickListener
                }

                if (binding.im171.isRangeTextValidate){
                    binding.im171.requestFocus()
                    binding.im171.error = "The range is from 1 to 96"
                    return@setOnClickListener
                }
            }

        }

        binding.im1298.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1298.isChecked){
                binding.im121x.error = null
                binding.im121x.text = null
                binding.im121x.setEnabled(false)

            }
            else{
                binding.im121x.setEnabled(true)
            }

        }

        binding.im121x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1298.isChecked = !binding.im121x.text.toString().isNotEmpty()
                }

            })

        binding.im12a98.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im12a98.isChecked){
                binding.im12a1.error = null
                binding.im12a1.text = null
                binding.im12a1.setEnabled(false)

            }
            else{
                binding.im12a1.setEnabled(true)
            }

        }

        binding.im12a1.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im12a98.isChecked = !binding.im12a1.text.toString().isNotEmpty()
                }

            })

        binding.im1598.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1598.isChecked){
                binding.im151.error = null
                binding.im151.text = null
                binding.im151.setEnabled(false)

            }
            else{
                binding.im151.setEnabled(true)
            }

        }

        binding.im151.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1598.isChecked = !binding.im151.text.toString().isNotEmpty()
                }

            })

        binding.im1798.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1798.isChecked){
                binding.im171.error = null
                binding.im171.text = null
                binding.im171.setEnabled(false)

            }
            else{
                binding.im171.setEnabled(true)
            }

        }

        binding.im171.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun afterTextChanged(p0: Editable?) {
                    binding.im1798.isChecked = !binding.im171.text.toString().isNotEmpty()
                }

            })


        binding.im23.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.im234.isChecked){
                binding.im23a.clearCheck()
                binding.im23a96x.text = null
                binding.im23b1.text = null
                binding.im23b2.text = null
                binding.im24.clearCheck()
                binding.im2496x.text = null
                binding.im25.clearCheck()
            }
        }

       /* binding.im23.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.im236.isChecked){
                binding.im23a.clearCheck()
                binding.im23a96x.text = null
                binding.im23b1.text = null
                binding.im23b2.text = null
                binding.im24.clearCheck()
                binding.im2496x.text = null
                binding.im25.clearCheck()
            }
        }*/

        /*binding.im12a1x.setOnCh*/
    }
}