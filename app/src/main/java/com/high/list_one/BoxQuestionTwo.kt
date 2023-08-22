package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityBoxQuestionTwoBinding
import com.high.list_one.question_one.CalculateSalaryEmployee
import com.high.list_one.question_two.CalculateBoxVolume

class BoxQuestionTwo : AppCompatActivity() {

    private lateinit var binding: ActivityBoxQuestionTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBoxQuestionTwoBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val width: EditText = binding.widthText
        val wide: EditText = binding.wideText
        val deep: EditText = binding.deepText

        val resultText: TextView = binding.resultText
        val calculateButton: Button = binding.calcButton

        val invalidText = "Informe a largura, comprimento e a altura e tente novamente."

        calculateButton.setOnClickListener {

            if(width.text.isNotEmpty() && wide.text.isNotEmpty() && deep.text.isNotEmpty()) {

                val valueWidth = width.text.toString().toDouble()
                val valueWide = wide.text.toString().toDouble()
                val valueDeep = deep.text.toString().toDouble()


                val result = " O volume da caixa é ${
                    CalculateBoxVolume().calcVolume(valueWidth, valueWide, valueDeep)}"

                resultText.text = result

            }

            else { Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show() }
        }

    }
}