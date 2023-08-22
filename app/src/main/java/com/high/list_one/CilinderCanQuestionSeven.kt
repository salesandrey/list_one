package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityCilinderCanQuestionSevenBinding
import com.high.list_one.question_seven.CalculateCilinder
import com.high.list_one.question_three.CalculateYears

class CilinderCanQuestionSeven : AppCompatActivity() {

    private lateinit var binding: ActivityCilinderCanQuestionSevenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCilinderCanQuestionSevenBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val thunder: EditText = binding.thunder
        val height: EditText = binding.heigthText

        val resultText: TextView = binding.resultText
        val calculateButton: Button = binding.calcButton

        val invalidText = "Informe o raio e a altura do cilindro e tente novamente."

        calculateButton.setOnClickListener {

            if(thunder.text.isNotEmpty() && height.text.isNotEmpty()) {

                val valueThunder = thunder.text.toString().toDouble()
                val valueHeight = height.text.toString().toDouble()

                val result = "O volume do cilindo é ${
                    CalculateCilinder().calcCilinderVolume(valueThunder,valueHeight)}"

                resultText.text = result
            }
            else { Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show() }
        }
    }
}