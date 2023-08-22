package com.high.list_one.question_six

class CalculateTemperature {

    fun convertToFahrenheit(valueCelsios:Double):Double {
        return (9*valueCelsios + 160)/5
    }

    fun checkNegativeValue(result:Double,isNegative: Boolean):Double {
        if(isNegative) {return -result }

        return result
    }

}