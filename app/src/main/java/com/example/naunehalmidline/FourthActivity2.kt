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


           /* if (binding.im121x.text.toString().isEmpty()){
                binding.im121x.requestFocus()
                binding.im121x.error = "Number of Times"
                return@setOnClickListener
            }*/



            if (!binding.im1298.isChecked) {
                if (binding.im121x.text.toString().trim().isEmpty()) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "Number Of Times"
                    return@setOnClickListener
                }

                if (!binding.im121x.isRangeTextValidate) {
                    binding.im121x.requestFocus()
                    binding.im121x.error = "The range is from 1 to 97"
                    return@setOnClickListener
                }

            }





            if (!binding.im12a98.isChecked){

                if (binding.im12a1x.text.toString().trim().isEmpty()){
                    binding.im12a1x.requestFocus()
                    binding.im12a1x.error = "NUmber of Times"
                    return@setOnClickListener
                }

                if (binding.im12a1x.isRangeTextValidate){
                    binding.im12a1x.requestFocus()
                    binding.im12a1x.error = "The range is from 1 to 96"
                    return@setOnClickListener
                }
            }
        }

        binding.im1298.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im1298.isChecked){
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
                    if (binding.im121x.text.toString().isNotEmpty()){
                        binding.im1298.isChecked = false
                    }
                    else {
                        binding.im1298.isChecked = true
                    }
                }


            })

        binding.im12a98.setOnCheckedChangeListener { compoundButton, b ->

            if (binding.im12a98.isChecked){
                binding.im12a1x.text = null
                binding.im12a1x.setEnabled(false)

            }
            else{
                binding.im12a1x.setEnabled(true)
            }

        }

        binding.im12a1x.addTextChangedListener(
            object : TextWatcher{

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {


                }

                override fun afterTextChanged(p0: Editable?) {
                    if (binding.im12a1x.text.toString().isNotEmpty()){
                        binding.im12a98.isChecked = false
                    }
                    else {
                        binding.im12a98.isChecked = true
                    }
                }


            })
        binding.im23.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.im232.isChecked && binding.im233.isChecked()){
                binding.im23a.clearCheck()
                binding.im23a96x.text = null
                binding.im23b1.text = null
                binding.im23b2.text = null
                binding.im24.clearCheck()
                binding.im2496x.text = null
                binding.im25.clearCheck()
            }
        }

        /*binding.im12a1x.setOnCh*/
    }
}