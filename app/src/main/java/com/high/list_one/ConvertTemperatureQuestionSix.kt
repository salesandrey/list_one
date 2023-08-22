package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityConvertTemperatureQuestionSixBinding
import com.high.list_one.question_six.CalculateTemperature

class ConvertTemperatureQuestionSix : AppCompatActivity() {

    private lateinit var binding: ActivityConvertTemperatureQuestionSixBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvertTemperatureQuestionSixBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convertButton: Button = binding.calcButton
        val valueCelsios: EditText = binding.editTextNumber
        val isNegative: Switch = binding.isNegativeSwitch
        val resultText: TextView = binding.resultText


        val invalidText = "Digite um valor número para converter em Celsios e tente novamente."

        convertButton.setOnClickListener {

            if(valueCelsios.text.isEmpty()){ Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show() }

            else{

                val calc = CalculateTemperature()

                val result: String = valueCelsios.text.toString()
                val negativeValue = isNegative.isChecked
                val valueToShow = "${calc.checkNegativeValue(calc.convertToFahrenheit(result.toDouble()),negativeValue)}°F"

                resultText.text = valueToShow
            }

        }
    }
}