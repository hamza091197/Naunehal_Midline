package com.example.naunehalmidline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.databinding.ActivityEightBinding
import com.validatorcrawler.aliazaz.Clear
import kotlinx.coroutines.launch

class EightActivity : AppCompatActivity() {
    lateinit var binding: ActivityEightBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_eight)
        binding.callback

        binding.btnContinue.setOnClickListener{

            if (binding.se01.checkedRadioButtonId == -1){
                binding.se0101.requestFocus()
                binding.se0101.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0101.error = null
            }

            if (binding.se0196.isChecked && binding.se0196x.text.toString().trim().isEmpty()){
                binding.se0196x.requestFocus()
                binding.se0196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se02.checkedRadioButtonId == -1){
                binding.se0211.requestFocus()
                binding.se0211.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0211.error = null
            }

            if (binding.se0296.isChecked && binding.se0296x.text.toString().trim().isEmpty()){
                binding.se0296x.requestFocus()
                binding.se0296x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se03.checkedRadioButtonId == -1){
                binding.se0301.requestFocus()
                binding.se0301.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0301.error = null
            }

            if (binding.se0396.isChecked && binding.se0396x.text.toString().trim().isEmpty()){
                binding.se0396x.requestFocus()
                binding.se0396x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se04.checkedRadioButtonId == -1){
                binding.se0401.requestFocus()
                binding.se0401.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0401.error = null
            }

            if (binding.se0496.isChecked && binding.se0496x.text.toString().trim().isEmpty()){
                binding.se0496x.requestFocus()
                binding.se0496x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se05.checkedRadioButtonId == -1){
                binding.se0501.requestFocus()
                binding.se0501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0501.error = null
            }

            if (binding.se0596.isChecked && binding.se0596x.text.toString().trim().isEmpty()){
                binding.se0596x.requestFocus()
                binding.se0596x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se06a.text.toString().trim().isEmpty()){
                binding.se06a.requestFocus()
                binding.se06a.error = "Rupees"
                return@setOnClickListener
            }

            if (binding.se07a.text.toString().trim().isEmpty()){
                binding.se07a.requestFocus()
                binding.se07a.error = "Rupees"
                return@setOnClickListener
            }

            if (binding.se08.checkedRadioButtonId == -1){
                binding.se0801.requestFocus()
                binding.se0801.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0801.error = null
            }

            if (binding.se0896.isChecked && binding.se0896x.text.toString().trim().isEmpty()){
                binding.se0896x.requestFocus()
                binding.se0896x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se09.checkedRadioButtonId == -1){
                binding.se0998.requestFocus()
                binding.se0998.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se0998.error = null
            }

            if (binding.se10.checkedRadioButtonId == -1){
                binding.se1001.requestFocus()
                binding.se1001.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1001.error = null
            }

            if (binding.se1099.isChecked && binding.se1099x.text.toString().trim().isEmpty()){
                binding.se1099x.requestFocus()
                binding.se1099x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se11.checkedRadioButtonId == -1){
                binding.se1101.requestFocus()
                binding.se1101.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1101.error = null
            }

            if (binding.se1196.isChecked && binding.se1196x.text.toString().trim().isEmpty()){
                binding.se1196x.requestFocus()
                binding.se1196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se12.checkedRadioButtonId == -1){
                binding.se1201.requestFocus()
                binding.se1201.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1201.error = null
            }

            if (binding.se1296.isChecked && binding.se1296x.text.toString().trim().isEmpty()){
                binding.se1296x.requestFocus()
                binding.se1296x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se13.checkedRadioButtonId == -1){
                binding.se1301.requestFocus()
                binding.se1301.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1301.error = null
            }

            if (binding.se14.checkedRadioButtonId == -1){
                binding.se1402.requestFocus()
                binding.se1402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1402.error = null
            }

            if (binding.se15.checkedRadioButtonId == -1){
                binding.se1501.requestFocus()
                binding.se1501.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1501.error = null
            }

            if (binding.se16.checkedRadioButtonId == -1){
                binding.se1601.requestFocus()
                binding.se1601.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1601.error = null
            }

            var se17Flag = false
            binding.se17check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se17Flag = true
                }
                if (!se17Flag) return@forEach
            }
            if (!se17Flag){
                binding.se1701.error = "CheckBox Not Selected"
                binding.se1701.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se1701.error = null
            }

            if (binding.se1801.checkedRadioButtonId == -1){
                binding.se180102.requestFocus()
                binding.se180102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se180102.error = null
            }

            if (binding.se1802.checkedRadioButtonId == -1){
                binding.se180202.requestFocus()
                binding.se180202.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se180202.error = null
            }

            if (binding.se1803.checkedRadioButtonId == -1){
                binding.se180302.requestFocus()
                binding.se180302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se180302.error = null
            }

            if (binding.se1804.checkedRadioButtonId == -1){
                binding.se180402.requestFocus()
                binding.se180402.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se180402.error = null
            }

            if (binding.se1805.checkedRadioButtonId == -1){
                binding.se180502.requestFocus()
                binding.se180502.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se180502.error = null
            }

            if (binding.se1896.checkedRadioButtonId == -1){
                binding.se189602.requestFocus()
                binding.se189602.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se189602.error = null
            }

            if (binding.se19.checkedRadioButtonId == -1){
                binding.se1901.requestFocus()
                binding.se1901.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se1901.error = null
            }

            if (binding.se1996.isChecked && binding.se1996x.text.toString().trim().isEmpty()){
                binding.se1996x.requestFocus()
                binding.se1996x.error = "Other Please Specify"
                return@setOnClickListener
            }

            var se20Flag = false
            binding.se20check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se20Flag = true
                }
                if (!se20Flag) return@forEach
            }
            if (!se20Flag){
                binding.se2001.error = "CheckBox Not Selected"
                binding.se2001.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2001.error = null
            }

            if (binding.se2096.isChecked && binding.se2096x.text.toString().trim().isEmpty()){
                binding.se2096x.requestFocus()
                binding.se2096x.error = "Other Please Specify"
                return@setOnClickListener
            }

            var se21Flag = false
            binding.se21check.children.forEach{
                if (it is CheckBox && it.isChecked){
                    se21Flag = true
                }
                if (!se21Flag) return@forEach
            }
            if (!se21Flag){
                binding.se2101.error = "CheckBox Not Selected"
                binding.se2101.requestFocus()
                return@setOnClickListener
            }
            else {
                binding.se2101.error = null
            }

            if (binding.se2196.isChecked && binding.se2196x.text.toString().trim().isEmpty()){
                binding.se2196x.requestFocus()
                binding.se2196x.error = "Other Please Specify"
                return@setOnClickListener
            }

            if (binding.se2201.checkedRadioButtonId == -1){
                binding.se220102.requestFocus()
                binding.se220102.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220102.error = null
            }

            if (binding.se2202.checkedRadioButtonId == -1){
                binding.se220202.requestFocus()
                binding.se220202.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220202.error = null
            }

            if (binding.se2203.checkedRadioButtonId == -1){
                binding.se220302.requestFocus()
                binding.se220302.error = "RadioButton Not Selected"
                return@setOnClickListener
            }
            else{
                binding.se220302.error = null
            }

            val refresh = Intent(this, EightActivity::class.java)
            startActivity(refresh)
        }
        binding.btnEnd.setOnClickListener {
            createDialog()
        }
    }

    private fun createDialog() {
        AlertDialog.Builder(this@EightActivity).apply {
            setCancelable(true)
            setTitle("Alert Dialog")
            setMessage("Are you sure you want to clear this form?")
            setPositiveButton("Yes") { dialog, id ->
                //Action for "Delete".
                Log.e("click", "positive")

                lifecycleScope.launch {
                    val def = launch { Clear.clearAllFields(binding.GrpName) }
                    def.join()
                    /*startActivity(Intent(this@MainActivity, MainActivity::class.java))*/
                    binding.Grp8.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }
}