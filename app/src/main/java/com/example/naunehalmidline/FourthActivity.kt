package com.example.naunehalmidline

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Vibrator
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.naunehalmidline.Fourth.Fourth
import com.example.naunehalmidline.databinding.ActivityFourthBinding
import com.example.naunehalmidline.main.ContactDatabase
import com.validatorcrawler.aliazaz.Clear
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth)
        binding.callback
        database = ContactDatabase.getDatabase(this)
        val window: Window = this@FourthActivity.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this@FourthActivity, R.color.selectedBlue)
        window.navigationBarColor = resources.getColor(R.color.gray)
        getWindow().decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /*window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN*/

        binding.btnContinue.setOnClickListener {

            if (binding.im01.checkedRadioButtonId == -1){
                binding.im01.requestFocus()
                binding.im012.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            }
            else {
                binding.im012.error = null
            }

            if (binding.im021.isChecked) {
                if (binding.im02.checkedRadioButtonId == -1) {
                    binding.im02.requestFocus()
                    binding.im022.error = "RadioButton Not Selected"
                    sound()
                    return@setOnClickListener
                } else {
                    binding.im022.error = null
                }

                if (binding.im03.checkedRadioButtonId == -1) {
                    binding.im03.requestFocus()
                    binding.im031.error = "RadioButton Not Selected"
                    sound()
                    return@setOnClickListener
                } else {
                    binding.im031.error = null
                }

                if (binding.im0396.isChecked &&
                    binding.im0396x.text.toString().trim().isEmpty()
                ) {
                    binding.im0396x.requestFocus()
                    binding.im0396x.error = "Other PLease Specify"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im04Dd.text.toString().trim().isEmpty()) {
                    binding.im04Dd.requestFocus()
                    binding.im04Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im04Mm.text.toString().trim().isEmpty()) {
                    binding.im04Mm.requestFocus()
                    binding.im04Mm.error = "Enter Month"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im04Yy.text.toString().trim().isEmpty()) {
                    binding.im04Yy.requestFocus()
                    binding.im04Yy.error = "Enter Year"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0501Dd.text.toString().trim().isEmpty()) {
                    binding.im0501Dd.requestFocus()
                    binding.im0501Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0501Dd.text.toString().isEmpty()) {
                    binding.im0501Dd.requestFocus()
                    binding.im0501Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0501Dd.isRangeTextValidate) {
                    binding.im0501Dd.error =
                        "The range is from ${binding.im0501Dd.minvalue.toInt()} to ${binding.im0501Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0501Mm.isEnabled) {
                    if (binding.im0501Mm.text.toString().isEmpty()) {
                        binding.im0501Mm.requestFocus()
                        binding.im0501Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0501Mm.isRangeTextValidate) {
                        binding.im0501Mm.error =
                            "The range is from ${binding.im0501Mm.minvalue.toInt()} to ${binding.im0501Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0501Yy.text.toString().isEmpty()) {
                        binding.im0501Yy.requestFocus()
                        binding.im0501Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0501Yy.isRangeTextValidate) {
                        binding.im0501Yy.error =
                            "The range is from ${binding.im0501Yy.minvalue.toInt()} to ${binding.im0501Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0502Dd.text.toString().isEmpty()) {
                    binding.im0502Dd.requestFocus()
                    binding.im0502Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0502Dd.isRangeTextValidate) {
                    binding.im0502Dd.error =
                        "The range is from ${binding.im0502Dd.minvalue.toInt()} to ${binding.im0502Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0502Mm.isEnabled) {
                    if (binding.im0502Mm.text.toString().isEmpty()) {
                        binding.im0502Mm.requestFocus()
                        binding.im0502Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0502Mm.isRangeTextValidate) {
                        binding.im0502Mm.error =
                            "The range is from ${binding.im0502Mm.minvalue.toInt()} to ${binding.im0502Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0502Yy.text.toString().isEmpty()) {
                        binding.im0502Yy.requestFocus()
                        binding.im0502Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0502Yy.isRangeTextValidate) {
                        binding.im0502Yy.error =
                            "The range is from ${binding.im0502Yy.minvalue.toInt()} to ${binding.im0502Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0503Dd.text.toString().isEmpty()) {
                    binding.im0503Dd.requestFocus()
                    binding.im0503Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0503Dd.isRangeTextValidate) {
                    binding.im0503Dd.error =
                        "The range is from ${binding.im0503Dd.minvalue.toInt()} to ${binding.im0503Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0503Mm.isEnabled) {
                    if (binding.im0503Mm.text.toString().isEmpty()) {
                        binding.im0503Mm.requestFocus()
                        binding.im0503Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0503Mm.isRangeTextValidate) {
                        binding.im0503Mm.error =
                            "The range is from ${binding.im0503Mm.minvalue.toInt()} to ${binding.im0503Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0503Yy.text.toString().isEmpty()) {
                        binding.im0503Yy.requestFocus()
                        binding.im0503Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0503Yy.isRangeTextValidate) {
                        binding.im0503Yy.error =
                            "The range is from ${binding.im0503Yy.minvalue.toInt()} to ${binding.im0503Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }
                if (binding.im0504Dd.text.toString().isEmpty()) {
                    binding.im0504Dd.requestFocus()
                    binding.im0504Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0504Dd.isRangeTextValidate) {
                    binding.im0504Dd.error =
                        "The range is from ${binding.im0504Dd.minvalue.toInt()} to ${binding.im0504Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0504Mm.isEnabled) {
                    if (binding.im0504Mm.text.toString().isEmpty()) {
                        binding.im0504Mm.requestFocus()
                        binding.im0504Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0504Mm.isRangeTextValidate) {
                        binding.im0504Mm.error =
                            "The range is from ${binding.im0504Mm.minvalue.toInt()} to ${binding.im0504Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0504Yy.text.toString().isEmpty()) {
                        binding.im0504Yy.requestFocus()
                        binding.im0504Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0504Yy.isRangeTextValidate) {
                        binding.im0504Yy.error =
                            "The range is from ${binding.im0504Yy.minvalue.toInt()} to ${binding.im0504Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0505Dd.text.toString().isEmpty()) {
                    binding.im0505Dd.requestFocus()
                    binding.im0505Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0505Dd.isRangeTextValidate) {
                    binding.im0505Dd.error =
                        "The range is from ${binding.im0505Dd.minvalue.toInt()} to ${binding.im0505Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0505Mm.isEnabled) {
                    if (binding.im0505Mm.text.toString().isEmpty()) {
                        binding.im0505Mm.requestFocus()
                        binding.im0505Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0505Mm.isRangeTextValidate) {
                        binding.im0505Mm.error =
                            "The range is from ${binding.im0505Mm.minvalue.toInt()} to ${binding.im0505Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0505Yy.text.toString().isEmpty()) {
                        binding.im0505Yy.requestFocus()
                        binding.im0505Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0505Yy.isRangeTextValidate) {
                        binding.im0505Yy.error =
                            "The range is from ${binding.im0505Yy.minvalue.toInt()} to ${binding.im0505Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0506Dd.text.toString().isEmpty()) {
                    binding.im0506Dd.requestFocus()
                    binding.im0506Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0506Dd.isRangeTextValidate) {
                    binding.im0506Dd.error =
                        "The range is from ${binding.im0506Dd.minvalue.toInt()} to ${binding.im0506Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0506Mm.isEnabled) {
                    if (binding.im0506Mm.text.toString().isEmpty()) {
                        binding.im0506Mm.requestFocus()
                        binding.im0506Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0506Mm.isRangeTextValidate) {
                        binding.im0506Mm.error =
                            "The range is from ${binding.im0506Mm.minvalue.toInt()} to ${binding.im0506Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0506Yy.text.toString().isEmpty()) {
                        binding.im0506Yy.requestFocus()
                        binding.im0506Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0506Yy.isRangeTextValidate) {
                        binding.im0506Yy.error =
                            "The range is from ${binding.im0506Yy.minvalue.toInt()} to ${binding.im0506Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0507Dd.text.toString().isEmpty()) {
                    binding.im0507Dd.requestFocus()
                    binding.im0507Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0507Dd.isRangeTextValidate) {
                    binding.im0507Dd.error =
                        "The range is from ${binding.im0507Dd.minvalue.toInt()} to ${binding.im0507Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0507Mm.isEnabled) {
                    if (binding.im0507Mm.text.toString().isEmpty()) {
                        binding.im0507Mm.requestFocus()
                        binding.im0507Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0507Mm.isRangeTextValidate) {
                        binding.im0507Mm.error =
                            "The range is from ${binding.im0507Mm.minvalue.toInt()} to ${binding.im0507Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0507Yy.text.toString().isEmpty()) {
                        binding.im0507Yy.requestFocus()
                        binding.im0507Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0507Yy.isRangeTextValidate) {
                        binding.im0507Yy.error =
                            "The range is from ${binding.im0507Yy.minvalue.toInt()} to ${binding.im0507Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0508Dd.text.toString().isEmpty()) {
                    binding.im0508Dd.requestFocus()
                    binding.im0508Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0508Dd.isRangeTextValidate) {
                    binding.im0508Dd.error =
                        "The range is from ${binding.im0508Dd.minvalue.toInt()} to ${binding.im0508Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0508Mm.isEnabled) {
                    if (binding.im0508Mm.text.toString().isEmpty()) {
                        binding.im0508Mm.requestFocus()
                        binding.im0508Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0508Mm.isRangeTextValidate) {
                        binding.im0508Mm.error =
                            "The range is from ${binding.im0508Mm.minvalue.toInt()} to ${binding.im0508Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0508Yy.text.toString().isEmpty()) {
                        binding.im0508Yy.requestFocus()
                        binding.im0508Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0508Yy.isRangeTextValidate) {
                        binding.im0508Yy.error =
                            "The range is from ${binding.im0508Yy.minvalue.toInt()} to ${binding.im0508Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0509Dd.text.toString().isEmpty()) {
                    binding.im0509Dd.requestFocus()
                    binding.im0509Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0509Dd.isRangeTextValidate) {
                    binding.im0509Dd.error =
                        "The range is from ${binding.im0509Dd.minvalue.toInt()} to ${binding.im0509Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0509Mm.isEnabled) {
                    if (binding.im0509Mm.text.toString().isEmpty()) {
                        binding.im0509Mm.requestFocus()
                        binding.im0509Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0509Mm.isRangeTextValidate) {
                        binding.im0509Mm.error =
                            "The range is from ${binding.im0509Mm.minvalue.toInt()} to ${binding.im0509Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0509Yy.text.toString().isEmpty()) {
                        binding.im0509Yy.requestFocus()
                        binding.im0509Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0509Yy.isRangeTextValidate) {
                        binding.im0509Yy.error =
                            "The range is from ${binding.im0509Yy.minvalue.toInt()} to ${binding.im0509Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0510Dd.text.toString().isEmpty()) {
                    binding.im0510Dd.requestFocus()
                    binding.im0510Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0510Dd.isRangeTextValidate) {
                    binding.im0510Dd.error =
                        "The range is from ${binding.im0510Dd.minvalue.toInt()} to ${binding.im0510Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0510Mm.isEnabled) {
                    if (binding.im0510Mm.text.toString().isEmpty()) {
                        binding.im0510Mm.requestFocus()
                        binding.im0510Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0510Mm.isRangeTextValidate) {
                        binding.im0510Mm.error =
                            "The range is from ${binding.im0510Mm.minvalue.toInt()} to ${binding.im0510Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0510Yy.text.toString().isEmpty()) {
                        binding.im0510Yy.requestFocus()
                        binding.im0510Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0510Yy.isRangeTextValidate) {
                        binding.im0510Yy.error =
                            "The range is from ${binding.im0510Yy.minvalue.toInt()} to ${binding.im0510Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0511Dd.text.toString().isEmpty()) {
                    binding.im0511Dd.requestFocus()
                    binding.im0511Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0511Dd.isRangeTextValidate) {
                    binding.im0511Dd.error =
                        "The range is from ${binding.im0511Dd.minvalue.toInt()} to ${binding.im0511Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0511Mm.isEnabled) {
                    if (binding.im0511Mm.text.toString().isEmpty()) {
                        binding.im0511Mm.requestFocus()
                        binding.im0511Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0511Mm.isRangeTextValidate) {
                        binding.im0511Mm.error =
                            "The range is from ${binding.im0511Mm.minvalue.toInt()} to ${binding.im0511Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0511Yy.text.toString().isEmpty()) {
                        binding.im0511Yy.requestFocus()
                        binding.im0511Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0511Yy.isRangeTextValidate) {
                        binding.im0511Yy.error =
                            "The range is from ${binding.im0511Yy.minvalue.toInt()} to ${binding.im0511Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0512Dd.text.toString().isEmpty()) {
                    binding.im0512Dd.requestFocus()
                    binding.im0512Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0512Dd.isRangeTextValidate) {
                    binding.im0512Dd.error =
                        "The range is from ${binding.im0512Dd.minvalue.toInt()} to ${binding.im0512Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0512Mm.isEnabled) {
                    if (binding.im0512Mm.text.toString().isEmpty()) {
                        binding.im0512Mm.requestFocus()
                        binding.im0512Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0512Mm.isRangeTextValidate) {
                        binding.im0512Mm.error =
                            "The range is from ${binding.im0512Mm.minvalue.toInt()} to ${binding.im0512Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0512Yy.text.toString().isEmpty()) {
                        binding.im0512Yy.requestFocus()
                        binding.im0512Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0512Yy.isRangeTextValidate) {
                        binding.im0512Yy.error =
                            "The range is from ${binding.im0512Yy.minvalue.toInt()} to ${binding.im0512Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0513Dd.text.toString().isEmpty()) {
                    binding.im0513Dd.requestFocus()
                    binding.im0513Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0513Dd.isRangeTextValidate) {
                    binding.im0513Dd.error =
                        "The range is from ${binding.im0513Dd.minvalue.toInt()} to ${binding.im0513Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0513Mm.isEnabled) {
                    if (binding.im0513Mm.text.toString().isEmpty()) {
                        binding.im0513Mm.requestFocus()
                        binding.im0513Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0513Mm.isRangeTextValidate) {
                        binding.im0513Mm.error =
                            "The range is from ${binding.im0513Mm.minvalue.toInt()} to ${binding.im0513Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0513Yy.text.toString().isEmpty()) {
                        binding.im0513Yy.requestFocus()
                        binding.im0513Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0513Yy.isRangeTextValidate) {
                        binding.im0513Yy.error =
                            "The range is from ${binding.im0513Yy.minvalue.toInt()} to ${binding.im0513Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }


                if (binding.im0514Dd.text.toString().isEmpty()) {
                    binding.im0514Dd.requestFocus()
                    binding.im0514Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0514Dd.isRangeTextValidate) {
                    binding.im0514Dd.error =
                        "The range is from ${binding.im0514Dd.minvalue.toInt()} to ${binding.im0514Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0514Mm.isEnabled) {
                    if (binding.im0514Mm.text.toString().isEmpty()) {
                        binding.im0514Mm.requestFocus()
                        binding.im0514Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0514Mm.isRangeTextValidate) {
                        binding.im0514Mm.error =
                            "The range is from ${binding.im0514Mm.minvalue.toInt()} to ${binding.im0514Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0514Yy.text.toString().isEmpty()) {
                        binding.im0514Yy.requestFocus()
                        binding.im0514Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0514Yy.isRangeTextValidate) {
                        binding.im0514Yy.error =
                            "The range is from ${binding.im0514Yy.minvalue.toInt()} to ${binding.im0514Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0515Dd.text.toString().isEmpty()) {
                    binding.im0515Dd.requestFocus()
                    binding.im0515Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0515Dd.isRangeTextValidate) {
                    binding.im0515Dd.error =
                        "The range is from ${binding.im0515Dd.minvalue.toInt()} to ${binding.im0515Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0515Mm.isEnabled) {
                    if (binding.im0515Mm.text.toString().isEmpty()) {
                        binding.im0515Mm.requestFocus()
                        binding.im0515Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0515Mm.isRangeTextValidate) {
                        binding.im0515Mm.error =
                            "The range is from ${binding.im0515Mm.minvalue.toInt()} to ${binding.im0515Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0515Yy.text.toString().isEmpty()) {
                        binding.im0515Yy.requestFocus()
                        binding.im0515Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0515Yy.isRangeTextValidate) {
                        binding.im0515Yy.error =
                            "The range is from ${binding.im0515Yy.minvalue.toInt()} to ${binding.im0515Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im0516Dd.text.toString().isEmpty()) {
                    binding.im0516Dd.requestFocus()
                    binding.im0516Dd.error = "Enter Day"
                    sound()
                    return@setOnClickListener
                }
                if (!binding.im0516Dd.isRangeTextValidate) {
                    binding.im0516Dd.error =
                        "The range is from ${binding.im0516Dd.minvalue.toInt()} to ${binding.im0516Dd.maxvalue.toInt()}"
                    sound()
                    return@setOnClickListener
                }

                if (binding.im0516Mm.isEnabled) {
                    if (binding.im0516Mm.text.toString().isEmpty()) {
                        binding.im0516Mm.requestFocus()
                        binding.im0516Mm.error = "Enter Month"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0516Mm.isRangeTextValidate) {
                        binding.im0516Mm.error =
                            "The range is from ${binding.im0516Mm.minvalue.toInt()} to ${binding.im0516Mm.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }

                    if (binding.im0516Yy.text.toString().isEmpty()) {
                        binding.im0516Yy.requestFocus()
                        binding.im0516Yy.error = "Enter Years"
                        sound()
                        return@setOnClickListener
                    }
                    if (!binding.im0516Yy.isRangeTextValidate) {
                        binding.im0516Yy.error =
                            "The range is from ${binding.im0516Yy.minvalue.toInt()} to ${binding.im0516Yy.maxvalue.toInt()}"
                        sound()
                        return@setOnClickListener
                    }
                }

                if (binding.im07.checkedRadioButtonId == -1) {
                    binding.im072.requestFocus()
                    binding.im072.error = "RadioButton Not Selected"
                    sound()
                    return@setOnClickListener
                } else {
                    binding.im072.error = null
                }
            }

            if (binding.im08a.checkedRadioButtonId == -1) {
                binding.im08a3.requestFocus()
                binding.im08a3.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.im08a3.error = null
            }


            if (binding.im08b.text.toString().trim().isEmpty()) {
                binding.im08b.requestFocus()
                binding.im08b.error = "How many times has (name) polio drops been given during the national polio campaigns?"
                sound()
                return@setOnClickListener
            }

            if (binding.im08b.isRangeTextValidate) {
                binding.im08b.requestFocus()
                binding.im08b.error = "The range is from 1 to 5"
                sound()
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
                sound()
                return@setOnClickListener
            } else {
                binding.im08c01.error = null
            }

            if (binding.im0896.isChecked &&
                binding.im0896x.text.toString().trim().isEmpty()
            ) {
                binding.im0896x.requestFocus()
                binding.im0896x.error = "Other"
                sound()
                return@setOnClickListener
            }

            if (binding.im09.checkedRadioButtonId == -1) {
                binding.im093.requestFocus()
                binding.im093.error = "RadioButton Not Selected"
                sound()
                return@setOnClickListener
            } else {
                binding.im093.error = null
            }

            if (binding.im10.checkedRadioButtonId == -1) {
                binding.im103.requestFocus()
                binding.im103.error = "RadioButton Not Selected"
                sound()
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
                sound()
                return@setOnClickListener
            } else {
                binding.im10a01.error = null
            }

            if (binding.im10a96.isChecked &&
                binding.im10a96x.text.toString().trim().isEmpty()
            ) {
                binding.im10a96x.requestFocus()
                binding.im10a96x.error = "Other"
                sound()
                return@setOnClickListener
            }
            /*44 66 88 97*//*
            if (binding.im0502Dd.text.toString() == "44" ||
                    binding.im0502Dd.text.toString() == "88" ||
                    binding.im0502Dd.text.toString() == "66" ||
                    binding.im0502Dd.text.toString() == "97") {
                binding.im0502Mm.error = null
                binding.im0502Yy.error = null
            }
            else {
                binding.im0502Mm.error = "Enter Month"
                binding.im0502Yy.error = "Enter Years"
                sound()
                return@setOnClickListener
            }



            *//*if (!binding.im0501Dd.isEnabled) {
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
                sound()
                return@setOnClickListener
            }*//*


            *//*if (binding.im0502Dd.text.toString() == "44" ||
                binding.im0502Dd.text.toString() == "66" ||
                binding.im0502Dd.text.toString() == "88" ||
                binding.im0502Dd.text.toString() == "97"){
                binding.im0502Mm.isEnabled = false
                binding.im0502Yy.isEnabled = false
                binding.im0502Mm.error = null
                binding.im0502Yy.error = null
            } else {
                binding.im0502Mm.error = "Enter months"
                binding.im0502Yy.error = "Enter Years"
                sound()
                return@setOnClickListener
            }*//*
*/

            val intent = Intent(this, FourthActivity2::class.java)
            startActivity(intent)

            insertFourth()
            updateFourth()

        }

        binding.btnEnd.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this@FourthActivity, R.raw.sound)
            mediaPlayer.start() // no need to call prepare(); create() does that for you
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(150)
            createDialog()
        }

        im()
        setTransparentStatusBar()

    }

    fun insertFourth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().insert (
                    Fourth(
                        id = 1,
                        im04Dd = binding.im04Dd.text.toString(),
                        im04Mm = binding.im04Mm.text.toString(),
                        im04Yy = binding.im04Yy.text.toString(),
                        im0501Dd = binding.im0501Dd.text.toString(),
                        im0501Mm = binding.im0501Mm.text.toString(),
                        im0501Yy = binding.im0501Yy.text.toString(),
                        im0502Dd = binding.im0502Dd.text.toString(),
                        im0502Mm = binding.im0502Mm.text.toString(),
                        im0502Yy = binding.im0502Yy.text.toString(),
                        im0503Dd = binding.im0503Dd.text.toString(),
                        im0503Mm = binding.im0503Mm.text.toString(),
                        im0503Yy = binding.im0503Yy.text.toString(),
                        im0504Dd = binding.im0504Dd.text.toString(),
                        im0504Mm = binding.im0504Mm.text.toString(),
                        im0504Yy = binding.im0504Yy.text.toString(),
                        im0505Dd = binding.im0505Dd.text.toString(),
                        im0505Mm = binding.im0505Mm.text.toString(),
                        im0505Yy = binding.im0505Yy.text.toString(),
                        im0506Dd = binding.im0506Dd.text.toString(),
                        im0506Mm = binding.im0506Mm.text.toString(),
                        im0506Yy = binding.im0506Yy.text.toString(),
                        im0507Dd = binding.im0507Dd.text.toString(),
                        im0507Mm = binding.im0507Mm.text.toString(),
                        im0507Yy = binding.im0507Yy.text.toString(),
                        im0508Dd = binding.im0508Dd.text.toString(),
                        im0508Mm = binding.im0508Mm.text.toString(),
                        im0508Yy = binding.im0508Yy.text.toString(),
                        im0509Dd = binding.im0509Dd.text.toString(),
                        im0509Mm = binding.im0509Mm.text.toString(),
                        im0509Yy = binding.im0509Yy.text.toString(),
                        im0510Dd = binding.im0510Dd.text.toString(),
                        im0510Mm = binding.im0510Mm.text.toString(),
                        im0510Yy = binding.im0510Yy.text.toString(),
                        im0511Dd = binding.im0511Dd.text.toString(),
                        im0511Mm = binding.im0511Mm.text.toString(),
                        im0511Yy = binding.im0511Yy.text.toString(),
                        im0512Dd = binding.im0512Dd.text.toString(),
                        im0512Mm = binding.im0512Mm.text.toString(),
                        im0512Yy = binding.im0512Yy.text.toString(),
                        im0513Dd = binding.im0513Dd.text.toString(),
                        im0513Mm = binding.im0513Mm.text.toString(),
                        im0513Yy = binding.im0513Yy.text.toString(),
                        im0514Dd = binding.im0514Dd.text.toString(),
                        im0514Mm = binding.im0514Mm.text.toString(),
                        im0514Yy = binding.im0514Yy.text.toString(),
                        im0515Dd = binding.im0515Dd.text.toString(),
                        im0515Mm = binding.im0515Mm.text.toString(),
                        im0515Yy = binding.im0515Yy.text.toString(),
                        im0516Dd = binding.im0516Dd.text.toString(),
                        im0516Mm = binding.im0516Mm.text.toString(),
                        im0516Yy = binding.im0516Yy.text.toString(),
                        im08b = binding.im08b.text.toString(),
                        im0896x = binding.im0896x.text.toString(),
                        im0396x = binding.im0396x.text.toString(),
                        im10a96x = binding.im10a96x.text.toString(),


                        im01 = when {
                            binding.im011.isChecked -> "1"
                            binding.im022.isChecked -> "2"
                            else -> "-1"
                        },

                        im02 = (when {
                            binding.im021.isChecked -> "1"
                            binding.im022.isChecked -> "2"
                            else -> "-1"
                        }),

                        im03 = (when {
                            binding.im031.isChecked -> "1"
                            binding.im032.isChecked -> "2"
                            binding.im033.isChecked -> "3"
                            binding.im034.isChecked -> "4"
                            binding.im035.isChecked -> "5"
                            binding.im036.isChecked -> "6"
                            binding.im0396.isChecked -> "96"
                            else -> "-1"
                        }),

                        im07 = (when {
                            binding.im071.isChecked -> "1"
                            binding.im072.isChecked -> "2"
                            else -> "-1"
                        }),

                        im08 = (when {
                            binding.im081.isChecked -> "1"
                            binding.im082.isChecked -> "2"
                            binding.im083.isChecked -> "98"
                            else -> "-1"
                        }),

                        im08a = (when {
                            binding.im08a1.isChecked -> "1"
                            binding.im08a2.isChecked -> "2"
                            binding.im08a3.isChecked -> "98"
                            else -> "-1"
                        }),

                        im08c = (when {
                            binding.im08c01.isChecked -> "1"
                            binding.im08c02.isChecked -> "2"
                            binding.im08c03.isChecked -> "3"
                            binding.im08c04.isChecked -> "4"
                            binding.im08c05.isChecked -> "5"
                            binding.im08c06.isChecked -> "6"
                            binding.im08c07.isChecked -> "7"
                            binding.im08c08.isChecked -> "8"
                            binding.im08c09.isChecked -> "9"
                            binding.im08c10.isChecked -> "10"
                            binding.im08c11.isChecked -> "11"
                            binding.im08c12.isChecked -> "12"
                            binding.im08c13.isChecked -> "13"
                            binding.im08c98.isChecked -> "98"
                            binding.im0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        im09 = (when {
                            binding.im091.isChecked -> "1"
                            binding.im092.isChecked -> "2"
                            binding.im093.isChecked -> "98"
                            else -> "-1"
                        }),

                        im10 = (when {
                            binding.im101.isChecked -> "1"
                            binding.im102.isChecked -> "2"
                            binding.im103.isChecked -> "98"
                            else -> "-1"
                        }),

                        im10a = (when {
                            binding.im10a01.isChecked -> "1"
                            binding.im10a02.isChecked -> "2"
                            binding.im10a03.isChecked -> "3"
                            binding.im10a04.isChecked -> "4"
                            binding.im10a05.isChecked -> "5"
                            binding.im10a06.isChecked -> "6"
                            binding.im10a07.isChecked -> "7"
                            binding.im10a08.isChecked -> "8"
                            binding.im10a09.isChecked -> "9"
                            binding.im10a10.isChecked -> "10"
                            binding.im10a11.isChecked -> "11"
                            binding.im10a12.isChecked -> "12"
                            binding.im10a13.isChecked -> "13"
                            binding.im10a98.isChecked -> "98"
                            binding.im10a96.isChecked -> "96"
                            else -> "-1"
                        })

                    )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }

    fun updateFourth() {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count = database.ContactDao().update(
                    Fourth(
                        0,
                        im04Dd = binding.im04Dd.text.toString(),
                        im04Mm = binding.im04Mm.text.toString(),
                        im04Yy = binding.im04Yy.text.toString(),
                        im0501Dd = binding.im0501Dd.text.toString(),
                        im0501Mm = binding.im0501Mm.text.toString(),
                        im0501Yy = binding.im0501Yy.text.toString(),
                        im0502Dd = binding.im0502Dd.text.toString(),
                        im0502Mm = binding.im0502Mm.text.toString(),
                        im0502Yy = binding.im0502Yy.text.toString(),
                        im0503Dd = binding.im0503Dd.text.toString(),
                        im0503Mm = binding.im0503Mm.text.toString(),
                        im0503Yy = binding.im0503Yy.text.toString(),
                        im0504Dd = binding.im0504Dd.text.toString(),
                        im0504Mm = binding.im0504Mm.text.toString(),
                        im0504Yy = binding.im0504Yy.text.toString(),
                        im0505Dd = binding.im0505Dd.text.toString(),
                        im0505Mm = binding.im0505Mm.text.toString(),
                        im0505Yy = binding.im0505Yy.text.toString(),
                        im0506Dd = binding.im0506Dd.text.toString(),
                        im0506Mm = binding.im0506Mm.text.toString(),
                        im0506Yy = binding.im0506Yy.text.toString(),
                        im0507Dd = binding.im0507Dd.text.toString(),
                        im0507Mm = binding.im0507Mm.text.toString(),
                        im0507Yy = binding.im0507Yy.text.toString(),
                        im0508Dd = binding.im0508Dd.text.toString(),
                        im0508Mm = binding.im0508Mm.text.toString(),
                        im0508Yy = binding.im0508Yy.text.toString(),
                        im0509Dd = binding.im0509Dd.text.toString(),
                        im0509Mm = binding.im0509Mm.text.toString(),
                        im0509Yy = binding.im0509Yy.text.toString(),
                        im0510Dd = binding.im0510Dd.text.toString(),
                        im0510Mm = binding.im0510Mm.text.toString(),
                        im0510Yy = binding.im0510Yy.text.toString(),
                        im0511Dd = binding.im0511Dd.text.toString(),
                        im0511Mm = binding.im0511Mm.text.toString(),
                        im0511Yy = binding.im0511Yy.text.toString(),
                        im0512Dd = binding.im0512Dd.text.toString(),
                        im0512Mm = binding.im0512Mm.text.toString(),
                        im0512Yy = binding.im0512Yy.text.toString(),
                        im0513Dd = binding.im0513Dd.text.toString(),
                        im0513Mm = binding.im0513Mm.text.toString(),
                        im0513Yy = binding.im0513Yy.text.toString(),
                        im0514Dd = binding.im0514Dd.text.toString(),
                        im0514Mm = binding.im0514Mm.text.toString(),
                        im0514Yy = binding.im0514Yy.text.toString(),
                        im0515Dd = binding.im0515Dd.text.toString(),
                        im0515Mm = binding.im0515Mm.text.toString(),
                        im0515Yy = binding.im0515Yy.text.toString(),
                        im0516Dd = binding.im0516Dd.text.toString(),
                        im0516Mm = binding.im0516Mm.text.toString(),
                        im0516Yy = binding.im0516Yy.text.toString(),
                        im08b = binding.im08b.text.toString(),
                        im0896x = binding.im0896x.text.toString(),
                        im0396x = binding.im0396x.text.toString(),
                        im10a96x = binding.im10a96x.text.toString(),


                        im01 = (when {
                            binding.im011.isChecked -> "1"
                            binding.im022.isChecked -> "2"
                            else -> "-1"
                        }),

                        im02 = (when {
                            binding.im021.isChecked -> "1"
                            binding.im022.isChecked -> "2"
                            else -> "-1"
                        }),

                        im03 = (when {
                            binding.im031.isChecked -> "1"
                            binding.im032.isChecked -> "2"
                            binding.im033.isChecked -> "3"
                            binding.im034.isChecked -> "4"
                            binding.im035.isChecked -> "5"
                            binding.im036.isChecked -> "6"
                            binding.im0396.isChecked -> "96"
                            else -> "-1"
                        }),

                        im07 = (when {
                            binding.im071.isChecked -> "1"
                            binding.im072.isChecked -> "2"
                            else -> "-1"
                        }),

                        im08 = (when {
                            binding.im081.isChecked -> "1"
                            binding.im082.isChecked -> "2"
                            binding.im083.isChecked -> "98"
                            else -> "-1"
                        }),

                        im08a = (when {
                            binding.im08a1.isChecked -> "1"
                            binding.im08a2.isChecked -> "2"
                            binding.im08a3.isChecked -> "98"
                            else -> "-1"
                        }),

                        im08c = (when {
                            binding.im08c01.isChecked -> "1"
                            binding.im08c02.isChecked -> "2"
                            binding.im08c03.isChecked -> "3"
                            binding.im08c04.isChecked -> "4"
                            binding.im08c05.isChecked -> "5"
                            binding.im08c06.isChecked -> "6"
                            binding.im08c07.isChecked -> "7"
                            binding.im08c08.isChecked -> "8"
                            binding.im08c09.isChecked -> "9"
                            binding.im08c10.isChecked -> "10"
                            binding.im08c11.isChecked -> "11"
                            binding.im08c12.isChecked -> "12"
                            binding.im08c13.isChecked -> "13"
                            binding.im08c98.isChecked -> "98"
                            binding.im0896.isChecked -> "96"
                            else -> "-1"
                        }),

                        im09 = (when {
                            binding.im091.isChecked -> "1"
                            binding.im092.isChecked -> "2"
                            binding.im093.isChecked -> "98"
                            else -> "-1"
                        }),

                        im10 = (when {
                            binding.im101.isChecked -> "1"
                            binding.im102.isChecked -> "2"
                            binding.im103.isChecked -> "98"
                            else -> "-1"
                        }),

                        im10a = (when {
                            binding.im10a01.isChecked -> "1"
                            binding.im10a02.isChecked -> "2"
                            binding.im10a03.isChecked -> "3"
                            binding.im10a04.isChecked -> "4"
                            binding.im10a05.isChecked -> "5"
                            binding.im10a06.isChecked -> "6"
                            binding.im10a07.isChecked -> "7"
                            binding.im10a08.isChecked -> "8"
                            binding.im10a09.isChecked -> "9"
                            binding.im10a10.isChecked -> "10"
                            binding.im10a11.isChecked -> "11"
                            binding.im10a12.isChecked -> "12"
                            binding.im10a13.isChecked -> "13"
                            binding.im10a98.isChecked -> "98"
                            binding.im10a96.isChecked -> "96"
                            else -> "-1"
                        })

                        )
                )

                Log.e("getData: ", count.toString())

            }
        }

    }


    private fun createDialog() {
        AlertDialog.Builder(this@FourthActivity).apply {
            setCancelable(true)
            setTitle("Alert Dialog")
            setMessage("Are you sure you want to clear this form?")
            setPositiveButton("Yes") { dialog, id ->
                //Action for "Delete".
                Log.e("click", "Positive")

                lifecycleScope.launch {
                    val def = launch { Clear.clearAllFields(binding.GrpName) }
                    def.join()
                    /*startActivity(Intent(this@MainActivity, MainActivity::class.java))*/
                    binding.Grp4.fullScroll(View.FOCUS_UP)
                }
            }
            setNegativeButton("Cancel") { dialog, which ->
                //Action for "Cancel".
                Log.e("click", "Negative")
            }
        }.create().show()
    }

    fun Activity.setTransparentStatusBar() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = Color.TRANSPARENT

    }

    override fun onBackPressed() {
        //super.onBackPressed()
    }

    private fun im() {
        binding.im0501Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // TODO Auto-generated method stub
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun afterTextChanged(s: Editable) {
                /*fun rand(start: Int, end: Int): Int {
                    require(start <= end) { "Illegal Argument" }
                    return (Math.random() * (end - start + 1)).toInt() + start
                }*/
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0501Dd.rangedefaultvalue = value.toFloat()
                    binding.im0501Mm.text = null
                    binding.im0501Yy.text = null
                    binding.im0501Mm.isEnabled = false
                    binding.im0501Yy.isEnabled = false
                } else {
                    binding.im0501Mm.isEnabled = true
                    binding.im0501Yy.isEnabled = true
                }

            }
        })

        binding.im0502Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0502Dd.rangedefaultvalue = value.toFloat()
                    binding.im0502Mm.error = null
                    binding.im0502Yy.error = null
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

        binding.im0503Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0503Dd.rangedefaultvalue = value.toFloat()
                    binding.im0503Mm.error = null
                    binding.im0503Yy.error = null
                    binding.im0503Mm.text = null
                    binding.im0503Yy.text = null
                    binding.im0503Mm.setEnabled(false)
                    binding.im0503Yy.setEnabled(false)
                } else {
                    binding.im0503Mm.setEnabled(true)
                    binding.im0503Yy.setEnabled(true)

                }

            }
        })

        binding.im0504Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0504Dd.rangedefaultvalue = value.toFloat()
                    binding.im0504Mm.error = null
                    binding.im0504Yy.error = null
                    binding.im0504Mm.text = null
                    binding.im0504Yy.text = null
                    binding.im0504Mm.setEnabled(false)
                    binding.im0504Yy.setEnabled(false)
                } else {
                    binding.im0504Mm.setEnabled(true)
                    binding.im0504Yy.setEnabled(true)

                }

            }
        })

        binding.im0505Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0505Dd.rangedefaultvalue = value.toFloat()
                    binding.im0505Mm.error = null
                    binding.im0505Yy.error = null
                    binding.im0505Mm.text = null
                    binding.im0505Yy.text = null
                    binding.im0505Mm.setEnabled(false)
                    binding.im0505Yy.setEnabled(false)
                } else {
                    binding.im0505Mm.setEnabled(true)
                    binding.im0505Yy.setEnabled(true)

                }

            }
        })

        binding.im0506Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0506Dd.rangedefaultvalue = value.toFloat()
                    binding.im0506Mm.error = null
                    binding.im0506Yy.error = null
                    binding.im0506Mm.text = null
                    binding.im0506Yy.text = null
                    binding.im0506Mm.setEnabled(false)
                    binding.im0506Yy.setEnabled(false)
                } else {
                    binding.im0506Mm.setEnabled(true)
                    binding.im0506Yy.setEnabled(true)

                }

            }
        })

        binding.im0507Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0507Dd.rangedefaultvalue = value.toFloat()
                    binding.im0507Mm.error = null
                    binding.im0507Yy.error = null
                    binding.im0507Mm.text = null
                    binding.im0507Yy.text = null
                    binding.im0507Mm.setEnabled(false)
                    binding.im0507Yy.setEnabled(false)
                } else {
                    binding.im0507Mm.setEnabled(true)
                    binding.im0507Yy.setEnabled(true)

                }

            }
        })

        binding.im0508Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0508Dd.rangedefaultvalue = value.toFloat()
                    binding.im0508Mm.error = null
                    binding.im0508Yy.error = null
                    binding.im0508Mm.text = null
                    binding.im0508Yy.text = null
                    binding.im0508Mm.setEnabled(false)
                    binding.im0508Yy.setEnabled(false)
                } else {
                    binding.im0508Mm.setEnabled(true)
                    binding.im0508Yy.setEnabled(true)

                }

            }
        })

        binding.im0509Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0509Dd.rangedefaultvalue = value.toFloat()
                    binding.im0509Mm.error = null
                    binding.im0509Yy.error = null
                    binding.im0509Mm.text = null
                    binding.im0509Yy.text = null
                    binding.im0509Mm.setEnabled(false)
                    binding.im0509Yy.setEnabled(false)
                } else {
                    binding.im0509Mm.setEnabled(true)
                    binding.im0509Yy.setEnabled(true)

                }

            }
        })

        binding.im0510Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0510Dd.rangedefaultvalue = value.toFloat()
                    binding.im0510Mm.error = null
                    binding.im0510Yy.error = null
                    binding.im0510Mm.text = null
                    binding.im0510Yy.text = null
                    binding.im0510Mm.setEnabled(false)
                    binding.im0510Yy.setEnabled(false)
                } else {
                    binding.im0510Mm.setEnabled(true)
                    binding.im0510Yy.setEnabled(true)

                }

            }
        })

        binding.im0511Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0511Dd.rangedefaultvalue = value.toFloat()
                    binding.im0511Mm.error = null
                    binding.im0511Yy.error = null
                    binding.im0511Mm.text = null
                    binding.im0511Yy.text = null
                    binding.im0511Mm.setEnabled(false)
                    binding.im0511Yy.setEnabled(false)
                } else {
                    binding.im0511Mm.setEnabled(true)
                    binding.im0511Yy.setEnabled(true)

                }

            }
        })

        binding.im0512Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0512Dd.rangedefaultvalue = value.toFloat()
                    binding.im0512Mm.error = null
                    binding.im0512Yy.error = null
                    binding.im0512Mm.text = null
                    binding.im0512Yy.text = null
                    binding.im0512Mm.setEnabled(false)
                    binding.im0512Yy.setEnabled(false)
                } else {
                    binding.im0512Mm.setEnabled(true)
                    binding.im0512Yy.setEnabled(true)

                }

            }
        })

        binding.im0513Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0513Dd.rangedefaultvalue = value.toFloat()
                    binding.im0513Mm.error = null
                    binding.im0513Yy.error = null
                    binding.im0513Mm.text = null
                    binding.im0513Yy.text = null
                    binding.im0513Mm.setEnabled(false)
                    binding.im0513Yy.setEnabled(false)
                } else {
                    binding.im0513Mm.setEnabled(true)
                    binding.im0513Yy.setEnabled(true)

                }

            }
        })

        binding.im0514Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0514Dd.rangedefaultvalue = value.toFloat()
                    binding.im0514Mm.error = null
                    binding.im0514Yy.error = null
                    binding.im0514Mm.text = null
                    binding.im0514Yy.text = null
                    binding.im0514Mm.setEnabled(false)
                    binding.im0514Yy.setEnabled(false)
                } else {
                    binding.im0514Mm.setEnabled(true)
                    binding.im0514Yy.setEnabled(true)

                }

            }
        })

        binding.im0515Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0515Dd.rangedefaultvalue = value.toFloat()
                    binding.im0515Mm.error = null
                    binding.im0515Yy.error = null
                    binding.im0515Mm.text = null
                    binding.im0515Yy.text = null
                    binding.im0515Mm.setEnabled(false)
                    binding.im0515Yy.setEnabled(false)
                } else {
                    binding.im0515Mm.setEnabled(true)
                    binding.im0515Yy.setEnabled(true)
                }

            }
        })

        binding.im0516Dd.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val value = s.toString()
                if (value == "44" || value == "66" || value == "88" || value == "97") {
                    binding.im0516Dd.rangedefaultvalue = value.toFloat()
                    binding.im0516Mm.error = null
                    binding.im0516Yy.error = null
                    binding.im0516Mm.text = null
                    binding.im0516Yy.text = null
                    binding.im0516Mm.setEnabled(false)
                    binding.im0516Yy.setEnabled(false)
                } else {
                    binding.im0516Mm.setEnabled(true)
                    binding.im0516Yy.setEnabled(true)

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

    fun sound() {
        /*val mediaPlayer = MediaPlayer.create(this@MainActivity1, R.raw.sound)
        mediaPlayer.start()*/ // no need to call prepare(); create() does that for you
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(150)
    }
}
