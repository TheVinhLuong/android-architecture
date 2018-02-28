package com.example.framgialuongthevinh.my_todo_mvp_kotlin.util

/**
 * Created by FRAMGIA\luong.the.vinh on 28/02/2018.
 */
object EspressoIdlingResource {
    private val RESOURCE = "GLOBAL"

    val countingIdlingResource = SimpleCountingIdlingResource(RESOURCE)

    fun increment() {
        countingIdlingResource.increment()
    }

    fun decrement() {
        countingIdlingResource.decrement()
    }
}