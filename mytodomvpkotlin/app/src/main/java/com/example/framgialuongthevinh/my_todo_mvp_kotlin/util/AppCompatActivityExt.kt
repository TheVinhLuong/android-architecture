package com.example.framgialuongthevinh.my_todo_mvp_kotlin.util

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

/**
 * Created by FRAMGIA\luong.the.vinh on 28/02/2018.
 */

fun AppCompatActivity.replaceFragmentInActivity(fragment: Fragment, @IdRes frameId: Int ){
    supportFragmentManager.transact {
        replace(frameId, fragment)
    }
}

fun AppCompatActivity.addFragmentToActivity(fragment: Fragment, tag: String){
    supportFragmentManager.transact {
        add(fragment, tag)
    }
}

private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit){
    beginTransaction().apply{
        action()
    }.commit()
}