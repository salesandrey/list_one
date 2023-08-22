package com.high.list_one.question_three

import java.time.LocalDateTime

class CalculateYears {

    private val lessYear = 1900

    private val currentYear get() = LocalDateTime.now().year

    fun calcYears(year:Int): Int {
        return currentYear - year;
    }

    fun checkYear(year:Int): Boolean {
        return when(year) {
            currentYear, lessYear -> true
            else -> false
        }
    }
}