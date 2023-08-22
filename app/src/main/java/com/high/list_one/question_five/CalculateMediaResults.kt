package com.high.list_one.question_five

class CalculateMediaResults {

    fun calcMedia(resultOne:Double,resultTwo:Double,resultThree:Double,resultFour:Double): Double{
        return (resultOne + resultTwo + resultThree + resultFour) / 4
    }

    fun isValidValue(result:Double): Boolean {
        return when {
            result < 0 -> true
            result > 10 -> true
            else -> false
        }
    }

}