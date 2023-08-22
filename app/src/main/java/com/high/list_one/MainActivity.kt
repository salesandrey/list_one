package com.high.list_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.high.list_one.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.questionOne.setOnClickListener{
            val intent = Intent(this,CalculateSalaryQuestionOne::class.java)
            startActivity(intent)
        }

        binding.questionTwo.setOnClickListener{
            val intent = Intent(this,BoxQuestionTwo::class.java)
            startActivity(intent)
        }

        binding.questionThree.setOnClickListener{
            val intent = Intent(this,CalculateAgeQuestionThree::class.java)
            startActivity(intent)
        }

        binding.questionFour.setOnClickListener{
            val intent = Intent(this,CalculeCarGasQuestionFour::class.java)
            startActivity(intent)
        }

        binding.questionFive.setOnClickListener{
            val intent = Intent(this,CalculateMediaStudentQuestionFive::class.java)
            startActivity(intent)
        }

        binding.questionSix.setOnClickListener{
            val intent = Intent(this,ConvertTemperatureQuestionSix::class.java)
            startActivity(intent)
        }

        binding.questionSeven.setOnClickListener{
            val intent = Intent(this, CilinderCanQuestionSeven::class.java)
            startActivity(intent)
        }
    }
}