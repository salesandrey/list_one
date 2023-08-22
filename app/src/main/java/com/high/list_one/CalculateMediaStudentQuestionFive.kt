package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityCalculateMediaStudentQuestionFiveBinding
import com.high.list_one.question_five.CalculateMediaResults
import com.high.list_one.question_two.CalculateBoxVolume

class CalculateMediaStudentQuestionFive : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateMediaStudentQuestionFiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateMediaStudentQuestionFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultOne: EditText = binding.resultOne
        val resultTwo: EditText = binding.resultTwo
        val resultThree: EditText = binding.resultThree
        val resultFour: EditText = binding.resultFour

        val resultText: TextView = binding.resultText
        val calculateButton: Button = binding.calcButton

        val invalidText = "Informe todas as notas do bimestre e tente novamente."

        val invalidValue = "Informe que não seja negativo ou maior que 10 e tente novamente."

        calculateButton.setOnClickListener {

            if(resultOne.text.isNotEmpty() &&resultTwo.text.isNotEmpty() && resultThree.text.isNotEmpty() && resultFour.text.isNotEmpty()) {

                val valueOne = resultOne.text.toString().toDouble()
                val valueTwo = resultTwo.text.toString().toDouble()
                val valueThree = resultThree.text.toString().toDouble()
                val valueFour = resultFour.text.toString().toDouble()

                if(CalculateMediaResults().isValidValue(valueOne)){
                    Toast.makeText(this,invalidValue, Toast.LENGTH_LONG).show()
                }

                if(CalculateMediaResults().isValidValue(valueTwo)){
                    Toast.makeText(this,invalidValue, Toast.LENGTH_LONG).show()
                }

                else if(CalculateMediaResults().isValidValue(valueThree)){
                    Toast.makeText(this,invalidValue, Toast.LENGTH_LONG).show()
                }

                else if(CalculateMediaResults().isValidValue(valueFour)){
                    Toast.makeText(this,invalidValue, Toast.LENGTH_LONG).show()
                }

                else {
                    val result = " A nota do bimestre é ${
                        CalculateMediaResults().calcMedia(
                            valueOne,
                            valueTwo,
                            valueThree,
                            valueFour)}"

                    resultText.text = result
                }

            }

            else { Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show() }
        }
    }
}