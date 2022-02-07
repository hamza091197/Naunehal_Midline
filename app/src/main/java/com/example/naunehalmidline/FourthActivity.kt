package com.example.naunehalmidline

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityFourthBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


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

            if (binding.im03.checkedRadioButtonId == -1) {
                binding.im03.requestFocus()
                binding.im031.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.im031.error = null
            }

            if (binding.im0396.isChecked &&
                binding.im0396x.text.toString().trim().isEmpty()
            ) {
                binding.im0396x.requestFocus()
                binding.im0396x.error = "Other PLease Specify"
                return@setOnClickListener
            }

            if (binding.im04Dd.text.toString().trim().isEmpty()) {
                binding.im04Dd.requestFocus()
                binding.im04Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (binding.im04Mm.text.toString().trim().isEmpty()) {
                binding.im04Mm.requestFocus()
                binding.im04Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (binding.im04Yy.text.toString().trim().isEmpty()) {
                binding.im04Yy.requestFocus()
                binding.im04Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (binding.im0501Dd.text.toString().trim().isEmpty()) {
                binding.im0501Dd.requestFocus()
                binding.im0501Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0501Dd.isRangeTextValidate) {
                binding.im0501Dd.requestFocus()
                binding.im0501Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0501Mm.text.toString().trim().isEmpty()) {
                binding.im0501Mm.requestFocus()
                binding.im0501Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0501Mm.isRangeTextValidate) {
                binding.im0501Mm.requestFocus()
                binding.im0501Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0501Yy.text.toString().trim().isEmpty()) {
                binding.im0501Yy.requestFocus()
                binding.im0501Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0501Yy.isRangeTextValidate) {
                binding.im0501Yy.requestFocus()
                binding.im0501Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0502Dd.text.toString().trim().isEmpty()) {
                binding.im0502Dd.requestFocus()
                binding.im0502Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0502Dd.isRangeTextValidate) {
                binding.im0502Dd.requestFocus()
                binding.im0502Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0502Mm.text.toString().trim().isEmpty()) {
                binding.im0502Mm.requestFocus()
                binding.im0502Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0502Mm.isRangeTextValidate) {
                binding.im0502Mm.requestFocus()
                binding.im0502Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0502Yy.text.toString().trim().isEmpty()) {
                binding.im0502Yy.requestFocus()
                binding.im0502Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0502Yy.isRangeTextValidate) {
                binding.im0502Yy.requestFocus()
                binding.im0502Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0503Dd.text.toString().trim().isEmpty()) {
                binding.im0503Dd.requestFocus()
                binding.im0503Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0503Dd.isRangeTextValidate) {
                binding.im0503Dd.requestFocus()
                binding.im0503Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0503Mm.text.toString().trim().isEmpty()) {
                binding.im0503Mm.requestFocus()
                binding.im0503Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0503Mm.isRangeTextValidate) {
                binding.im0503Mm.requestFocus()
                binding.im0503Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0503Yy.text.toString().trim().isEmpty()) {
                binding.im0503Yy.requestFocus()
                binding.im0503Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0503Yy.isRangeTextValidate) {
                binding.im0503Yy.requestFocus()
                binding.im0503Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0504Dd.text.toString().trim().isEmpty()) {
                binding.im0504Dd.requestFocus()
                binding.im0504Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0504Dd.isRangeTextValidate) {
                binding.im0504Dd.requestFocus()
                binding.im0504Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0504Mm.text.toString().trim().isEmpty()) {
                binding.im0504Mm.requestFocus()
                binding.im0504Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0504Mm.isRangeTextValidate) {
                binding.im0504Mm.requestFocus()
                binding.im0504Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0504Yy.text.toString().trim().isEmpty()) {
                binding.im0504Yy.requestFocus()
                binding.im0504Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0504Yy.isRangeTextValidate) {
                binding.im0504Yy.requestFocus()
                binding.im0504Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0505Dd.text.toString().trim().isEmpty()) {
                binding.im0505Dd.requestFocus()
                binding.im0505Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0505Dd.isRangeTextValidate) {
                binding.im0505Dd.requestFocus()
                binding.im0505Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0505Mm.text.toString().trim().isEmpty()) {
                binding.im0505Mm.requestFocus()
                binding.im0505Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0505Mm.isRangeTextValidate) {
                binding.im0505Mm.requestFocus()
                binding.im0505Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0505Yy.text.toString().trim().isEmpty()) {
                binding.im0505Yy.requestFocus()
                binding.im0505Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0505Yy.isRangeTextValidate) {
                binding.im0505Yy.requestFocus()
                binding.im0505Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0506Dd.text.toString().trim().isEmpty()) {
                binding.im0506Dd.requestFocus()
                binding.im0506Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0506Dd.isRangeTextValidate) {
                binding.im0506Dd.requestFocus()
                binding.im0506Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0506Mm.text.toString().trim().isEmpty()) {
                binding.im0506Mm.requestFocus()
                binding.im0506Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0506Mm.isRangeTextValidate) {
                binding.im0506Mm.requestFocus()
                binding.im0506Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0506Yy.text.toString().trim().isEmpty()) {
                binding.im0506Yy.requestFocus()
                binding.im0506Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0506Yy.isRangeTextValidate) {
                binding.im0506Yy.requestFocus()
                binding.im0506Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0507Dd.text.toString().trim().isEmpty()) {
                binding.im0507Dd.requestFocus()
                binding.im0507Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0507Dd.isRangeTextValidate) {
                binding.im0507Dd.requestFocus()
                binding.im0507Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0507Mm.text.toString().trim().isEmpty()) {
                binding.im0507Mm.requestFocus()
                binding.im0507Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0507Mm.isRangeTextValidate) {
                binding.im0507Mm.requestFocus()
                binding.im0507Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0507Yy.text.toString().trim().isEmpty()) {
                binding.im0507Yy.requestFocus()
                binding.im0507Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0507Yy.isRangeTextValidate) {
                binding.im0507Yy.requestFocus()
                binding.im0507Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0508Dd.text.toString().trim().isEmpty()) {
                binding.im0508Dd.requestFocus()
                binding.im0508Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0508Dd.isRangeTextValidate) {
                binding.im0508Dd.requestFocus()
                binding.im0508Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0508Mm.text.toString().trim().isEmpty()) {
                binding.im0508Mm.requestFocus()
                binding.im0508Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0508Mm.isRangeTextValidate) {
                binding.im0508Mm.requestFocus()
                binding.im0508Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0508Yy.text.toString().trim().isEmpty()) {
                binding.im0508Yy.requestFocus()
                binding.im0508Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0508Yy.isRangeTextValidate) {
                binding.im0508Yy.requestFocus()
                binding.im0508Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0509Dd.text.toString().trim().isEmpty()) {
                binding.im0509Dd.requestFocus()
                binding.im0509Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0509Dd.isRangeTextValidate) {
                binding.im0509Dd.requestFocus()
                binding.im0509Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0509Mm.text.toString().trim().isEmpty()) {
                binding.im0509Mm.requestFocus()
                binding.im0509Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0509Mm.isRangeTextValidate) {
                binding.im0509Mm.requestFocus()
                binding.im0509Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0509Yy.text.toString().trim().isEmpty()) {
                binding.im0509Yy.requestFocus()
                binding.im0509Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0509Yy.isRangeTextValidate) {
                binding.im0509Yy.requestFocus()
                binding.im0509Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0510Dd.text.toString().trim().isEmpty()) {
                binding.im0510Dd.requestFocus()
                binding.im0510Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0510Dd.isRangeTextValidate) {
                binding.im0510Dd.requestFocus()
                binding.im0510Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0510Mm.text.toString().trim().isEmpty()) {
                binding.im0510Mm.requestFocus()
                binding.im0510Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0510Mm.isRangeTextValidate) {
                binding.im0510Mm.requestFocus()
                binding.im0510Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0510Yy.text.toString().trim().isEmpty()) {
                binding.im0510Yy.requestFocus()
                binding.im0510Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0510Yy.isRangeTextValidate) {
                binding.im0510Yy.requestFocus()
                binding.im0510Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0511Dd.text.toString().trim().isEmpty()) {
                binding.im0511Dd.requestFocus()
                binding.im0511Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0511Dd.isRangeTextValidate) {
                binding.im0511Dd.requestFocus()
                binding.im0511Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0511Mm.text.toString().trim().isEmpty()) {
                binding.im0511Mm.requestFocus()
                binding.im0511Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0511Mm.isRangeTextValidate) {
                binding.im0511Mm.requestFocus()
                binding.im0511Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0511Yy.text.toString().trim().isEmpty()) {
                binding.im0511Yy.requestFocus()
                binding.im0511Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0511Yy.isRangeTextValidate) {
                binding.im0511Yy.requestFocus()
                binding.im0511Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0512Dd.text.toString().trim().isEmpty()) {
                binding.im0512Dd.requestFocus()
                binding.im0512Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0512Dd.isRangeTextValidate) {
                binding.im0512Dd.requestFocus()
                binding.im0512Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0512Mm.text.toString().trim().isEmpty()) {
                binding.im0512Mm.requestFocus()
                binding.im0512Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0512Mm.isRangeTextValidate) {
                binding.im0512Mm.requestFocus()
                binding.im0512Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0512Yy.text.toString().trim().isEmpty()) {
                binding.im0512Yy.requestFocus()
                binding.im0512Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0512Yy.isRangeTextValidate) {
                binding.im0512Yy.requestFocus()
                binding.im0512Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0513Dd.text.toString().trim().isEmpty()) {
                binding.im0513Dd.requestFocus()
                binding.im0513Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0513Dd.isRangeTextValidate) {
                binding.im0513Dd.requestFocus()
                binding.im0513Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0513Mm.text.toString().trim().isEmpty()) {
                binding.im0513Mm.requestFocus()
                binding.im0513Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0513Mm.isRangeTextValidate) {
                binding.im0513Mm.requestFocus()
                binding.im0513Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0513Yy.text.toString().trim().isEmpty()) {
                binding.im0513Yy.requestFocus()
                binding.im0513Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0513Yy.isRangeTextValidate) {
                binding.im0513Yy.requestFocus()
                binding.im0513Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0514Dd.text.toString().trim().isEmpty()) {
                binding.im0514Dd.requestFocus()
                binding.im0514Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0514Dd.isRangeTextValidate) {
                binding.im0514Dd.requestFocus()
                binding.im0514Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0514Mm.text.toString().trim().isEmpty()) {
                binding.im0514Mm.requestFocus()
                binding.im0514Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0514Mm.isRangeTextValidate) {
                binding.im0514Mm.requestFocus()
                binding.im0514Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0514Yy.text.toString().trim().isEmpty()) {
                binding.im0514Yy.requestFocus()
                binding.im0514Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0514Yy.isRangeTextValidate) {
                binding.im0514Yy.requestFocus()
                binding.im0514Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0515Dd.text.toString().trim().isEmpty()) {
                binding.im0515Dd.requestFocus()
                binding.im0515Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0515Dd.isRangeTextValidate) {
                binding.im0515Dd.requestFocus()
                binding.im0515Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0515Mm.text.toString().trim().isEmpty()) {
                binding.im0515Mm.requestFocus()
                binding.im0515Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0515Mm.isRangeTextValidate) {
                binding.im0515Mm.requestFocus()
                binding.im0515Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0515Yy.text.toString().trim().isEmpty()) {
                binding.im0515Yy.requestFocus()
                binding.im0515Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0515Yy.isRangeTextValidate) {
                binding.im0515Yy.requestFocus()
                binding.im0515Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }

            if (binding.im0516Dd.text.toString().trim().isEmpty()) {
                binding.im0516Dd.requestFocus()
                binding.im0516Dd.error = "Enter Day"
                return@setOnClickListener
            }

            if (!binding.im0516Dd.isRangeTextValidate) {
                binding.im0516Dd.requestFocus()
                binding.im0516Dd.error = "The range is from 1 to 31"
                return@setOnClickListener
            }

            if (binding.im0516Mm.text.toString().trim().isEmpty()) {
                binding.im0516Mm.requestFocus()
                binding.im0516Mm.error = "Enter Month"
                return@setOnClickListener
            }

            if (!binding.im0516Mm.isRangeTextValidate) {
                binding.im0516Mm.requestFocus()
                binding.im0516Mm.error = "The range is from 1 to 12"
                return@setOnClickListener
            }

            if (binding.im0516Yy.text.toString().trim().isEmpty()) {
                binding.im0516Yy.requestFocus()
                binding.im0516Yy.error = "Enter Year"
                return@setOnClickListener
            }

            if (!binding.im0516Yy.isRangeTextValidate) {
                binding.im0516Yy.requestFocus()
                binding.im0516Yy.error = "The range is from 2015 to 2020"
                return@setOnClickListener
            }
            
            if (binding.im07.checkedRadioButtonId == -1) {
                binding.im072.requestFocus()
                binding.im072.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.im072.error = null
            }

            if (binding.im08a.checkedRadioButtonId == -1) {
                binding.im08a3.requestFocus()
                binding.im08a3.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.im08a3.error = null
            }


            if (binding.im08b.text.toString().trim().isEmpty()) {
                binding.im08b.requestFocus()
                binding.im08b.error =
                    "How many times has (name) polio drops been given during the national polio campaigns?"
                return@setOnClickListener
            }

            if (binding.im08b.isRangeTextValidate) {
                binding.im08b.requestFocus()
                binding.im08b.error = "The range is from 1 to 5"
                return@setOnClickListener
            }

            var im08cFlag = false
            binding.im08ccheck.children.forEach {
                if (it is CheckBox && it.isChecked) {
                    im08cFlag = true
                }
                if (!im08cFlag) return@forEach
            }
            if (!im08cFlag) {
                binding.im08c01.error = "CheckBox Not Selected"
                binding.im08c01.requestFocus()
                return@setOnClickListener
            } else {
                binding.im08c01.error = null
            }

            if (binding.im0896.isChecked &&
                binding.im0896x.text.toString().trim().isEmpty()
            ) {
                binding.im0896x.requestFocus()
                binding.im0896x.error = "Other"
                return@setOnClickListener
            }

            if (binding.im09.checkedRadioButtonId == -1) {
                binding.im093.requestFocus()
                binding.im093.error = "RadioButton Not Selected"
                return@setOnClickListener
            } else {
                binding.im093.error = null
            }

            if (binding.im10.checkedRadioButtonId == -1) {
                binding.im103.requestFocus()
                binding.im103.error = "RadioButton Not Selected"
                return@setOnClickListener
            }

            var im10aFlag = false
            binding.im10acheck.children.forEach {
                if (it is CheckBox && it.isChecked) {
                    im10aFlag = true
                }
                if (!im10aFlag) return@forEach
            }
            if (!im10aFlag) {
                binding.im10a01.error = "CheckBox Not Selected"
                binding.im10a01.requestFocus()
                return@setOnClickListener
            } else {
                binding.im10a01.error = null
            }

            if (binding.im10a96.isChecked &&
                binding.im10a96x.text.toString().trim().isEmpty()
            ) {
                binding.im10a96x.requestFocus()
                binding.im10a96x.error = "Other"
                return@setOnClickListener
            }

            /*if (!binding.im0501Dd.isEnabled) {
                if (binding.im0501Dd.text.toString() == "44" ||
                    binding.im0501Dd.text.toString() == "66" ||
                    binding.im0501Dd.text.toString() == "88" ||
                    binding.im0501Dd.text.toString() == "97"
                ) {
                    binding.im0501Mm.error = null
                    binding.im0501Yy.error = null
                    binding.im0501Mm.defaultvalue
                }
            }else {
                binding.im0501Mm.error = "Enter Months"
                binding.im0501Yy.error = "Enter Years"
                return@setOnClickListener
            }*/

            if (binding.im0501Dd.text.toString() == "44" || binding.im0501Dd.text.toString() == "77" ){
                binding.im0501Mm.isEnabled = false
                binding.im0501Yy.isEnabled = false
                binding.im0501Mm.error = null
                binding.im0501Mm.error = null
            }
            else{
                binding.im0501Mm.error = "Enter Months"
                binding.im0501Yy.error = "Enter Years"
                return@setOnClickListener
            }

            if (binding.im0502Dd.text.toString() == "44" ||
                binding.im0502Dd.text.toString() == "66" ||
                binding.im0502Dd.text.toString() == "88" ||
                binding.im0502Dd.text.toString() == "97"
            ) {
                binding.im0502Mm.error = null
                binding.im0502Yy.error = null

            } else {
                binding.im0502Mm.error = "Enter months"
                binding.im0502Yy.error = "Enter Years"
                return@setOnClickListener
            }

        }

        im()

    }

    private fun im() {
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
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0501Mm.text = null
                    binding.im0501Yy.text = null
                    binding.im0501Mm.isEnabled = false
                    binding.im0501Yy.isEnabled = false
                    binding.im0501Dd.rangedefaultvalue = value.toFloat()
                } else {
                    binding.im0501Mm.isEnabled = true
                    binding.im0501Yy.isEnabled = true
                }

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
                    binding.im0502Dd.text.toString() == "97"
                ) {
                    binding.im0502Mm.text = null
                    binding.im0502Yy.text = null
                    binding.im0502Mm.setEnabled(false)
                    binding.im0502Yy.setEnabled(false)
                } else {
                    binding.im0502Mm.setEnabled(true)
                    binding.im0502Yy.setEnabled(true)
                }

            }
        })

        binding.im02.setOnCheckedChangeListener { radioGroup, i ->
            if (i == binding.im022.id) {
                binding.skip08.visibility = View.GONE
                lifecycleScope.launch {
                    val root = binding.skip08
                    clearingFields(root)
                }
                /*binding.im03.clearCheck()
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
                binding.im08.clearCheck()*/
            } else binding.skip08.visibility = View.VISIBLE
        }
    }

    private suspend fun clearingFields(root: ViewGroup) {
        withContext(Dispatchers.Main) {
            val children = root.children
            children.forEach { view ->
                when (view) {
                    is RadioGroup -> {
                        view.clearCheck()
                    }
                    is EditText -> {
                        view.text = null
                    }
                    is ViewGroup -> {
                        clearingFields(view)
                    }
                }
            }
        }
    }

}
