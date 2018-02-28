package com.example.framgialuongthevinh.my_todo_mvp_kotlin.util

import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by FRAMGIA\luong.the.vinh on 28/02/2018.
 */
class DiskIOThreadExecutor: Executor {
    private val diskIO = Executors.newSingleThreadExecutor();

    override fun execute(command: Runnable){
        diskIO.execute(command)
    }
}