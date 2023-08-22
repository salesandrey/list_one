package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import com.high.list_one.databinding.ActivityCalculateAgeQuestionThreeBinding
import com.high.list_one.question_three.CalculateYears
import com.high.list_one.question_two.CalculateBoxVolume

class CalculateAgeQuestionThree : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateAgeQuestionThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculateAgeQuestionThreeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val year: EditText = binding.yearText

        val resultText: TextView = binding.resultText
        val calculateButton: Button = binding.calcButton

        val invalidText = "Informe o ano de nascimento e tente novamente."
        val invalidYear = "O ano não pode ser maior que o ano atual e não pode ser menor que 1900"

        calculateButton.setOnClickListener {

            if(year.text.isNotEmpty()) {

                val valueYear = year.text.toString().toInt()

                if(CalculateYears().checkYear(valueYear)){
                    Toast.makeText(this,invalidYear, Toast.LENGTH_LONG).show()
                } else {

                    val yearText = when(CalculateYears().calcYears(valueYear)) {
                        1 -> "ano"
                        else -> "anos"
                    }

                    val result = "A idade é ${
                        CalculateYears().calcYears(valueYear)} $yearText"

                    resultText.text = result
                }
            }

            else { Toast.makeText(this,invalidText, Toast.LENGTH_LONG).show() }
        }
    }
}