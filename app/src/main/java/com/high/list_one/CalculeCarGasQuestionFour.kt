package com.high.list_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.high.list_one.databinding.ActivityCalculeCarGasQuestionFourBinding
import com.high.list_one.question_four.CalculateKilometers

class CalculeCarGasQuestionFour : AppCompatActivity() {

    private lateinit var binding: ActivityCalculeCarGasQuestionFourBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculeCarGasQuestionFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kilometers: EditText = binding.kilometer
        val quantity: EditText = binding.quantity
        val calculateButton: Button = binding.calcButton

        val resultText: TextView = binding.resultText

        val invalidText =
            "Informe os Kilometros percorridos e a quantidade de gasolina para continuar."
        val invalidQuantityZero = "Não é possível realizar o calculo com a quantidade igual a Zero"

        calculateButton.setOnClickListener {

            if (quantity.text.isNotEmpty() && kilometers.text.isNotEmpty()) {

                if (quantity.text.toString().toInt() == 0) {
                    Toast.makeText(this, invalidQuantityZero, Toast.LENGTH_LONG).show()
                } else {

                    val valueKilometers = kilometers.text.toString().toDouble()
                    val valueQuantity = quantity.text.toString().toDouble()


                    val result = "${
                        CalculateKilometers().calcKilometersForQuantity(
                            valueKilometers,
                            valueQuantity
                        )
                    } Km/L"

                    resultText.text = result
                }

            } else {
                Toast.makeText(this, invalidText, Toast.LENGTH_LONG).show()
            }
        }
    }
}