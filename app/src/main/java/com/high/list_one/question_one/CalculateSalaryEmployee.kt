package com.high.list_one.question_one

class CalculateSalaryEmployee {

    fun calcNewSalary(currentSalary: Double, porcent: Double): Double {
        return currentSalary + calcIncrease(currentSalary,porcent)
    }

    fun calcIncrease(currentSalary: Double, porcent: Double): Double {
        return currentSalary * porcent / 100
    }
}