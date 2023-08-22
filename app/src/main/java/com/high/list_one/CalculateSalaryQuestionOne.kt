package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityCalculateSalaryQuestionOneBinding
import com.high.list_one.question_four.CalculateKilometers
import com.high.list_one.question_one.CalculateSalaryEmployee

class CalculateSalaryQuestionOne : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateSalaryQuestionOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateSalaryQuestionOneBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val currentSalary: EditText = binding.currentSalary
        val porcentIncrease: EditText = binding.porcentSalary
        val calculateButton: Button = binding.calcButton

        val resultText: TextView = binding.resultText

        val invalidText = "Informe o valor do salario atual e a porcentagem ganha."

        calculateButton.setOnClickListener {

            if(porcentIncrease.text.isNotEmpty() && currentSalary.text.isNotEmpty()) {

                val valueSalary = currentSalary.text.toString().toDouble()
                val valueIncrease = porcentIncrease.text.toString().toDouble()


                val result = " O novo salario será ${
                    CalculateSalaryEmployee().calcNewSalary(valueSalary, valueIncrease)} reais e o valor do aumento foi " +
                        "${CalculateSalaryEmployee().calcIncrease(valueSalary, valueIncrease)} reais"

                resultText.text = result

            }

            else {
                Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show()
            }
        }

    }
}