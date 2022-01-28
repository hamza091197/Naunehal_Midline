package com.example.naunehalmidline

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.naunehalmidline.databinding.ActivityFourthBinding


class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth)
        binding.callback

        binding.btnFourth2.setOnClickListener {
            val intent = Intent(this, FourthActivity2::class.java)
            startActivity(intent)
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

                if (binding.im0501Dd.text.toString() == "44" ||
                    binding.im0501Dd.text.toString() == "66" ||
                    binding.im0501Dd.text.toString() == "88" ||
                    binding.im0501Dd.text.toString() == "97"){
                    binding.im0501Mm.text = null
                    binding.im0501Mm.setEnabled(false)
                    binding.im0501Yy.setEnabled(false)
                }
                else {
                    binding.im0501Mm.setEnabled(true)
                    binding.im0501Yy.setEnabled(true)
                }

            }
        })
    }
    }
