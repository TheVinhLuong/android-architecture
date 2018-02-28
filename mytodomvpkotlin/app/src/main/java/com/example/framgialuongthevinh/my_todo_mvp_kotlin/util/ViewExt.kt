package com.example.framgialuongthevinh.my_todo_mvp_kotlin.util

import android.support.design.widget.Snackbar
import android.view.View

/**
 * Created by FRAMGIA\luong.the.vinh on 28/02/2018.
 */
fun View.showSnackBar(message: String, duration: Int){
    Snackbar.make(this, message, duration).show()
}