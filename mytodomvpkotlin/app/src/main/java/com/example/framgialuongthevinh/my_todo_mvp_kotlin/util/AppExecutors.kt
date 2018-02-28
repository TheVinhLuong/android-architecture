package com.example.framgialuongthevinh.my_todo_mvp_kotlin.util

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

const val THREAD_COUNT = 3

/**
 * Created by FRAMGIA\luong.the.vinh on 28/02/2018.
 */

open class AppExecutors constructor(
        val diskIO: Executor = DiskIOThreadExecutor(),
        val networkIO: Executor = Executors.newFixedThreadPool(THREAD_COUNT),
        val mainThread: Executor = MainThreadExecutor()
) {
    private class MainThreadExecutor : Executor {
        private val mainThreadHander = Handler(Looper.getMainLooper())

        override fun execute(command: Runnable) {
            mainThreadHander.post(command)
        }
    }
}