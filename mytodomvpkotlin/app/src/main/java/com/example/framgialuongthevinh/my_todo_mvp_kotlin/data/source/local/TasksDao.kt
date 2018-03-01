package com.example.framgialuongthevinh.my_todo_mvp_kotlin.data.source.local

import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.example.framgialuongthevinh.my_todo_mvp_kotlin.data.Task

/**
 * Created by FRAMGIA\luong.the.vinh on 01/03/2018.
 */
interface TasksDao {
    @Query("SELECT * FROM Tasks")
    fun getTasks(): List<Task>

    @Query("SELECT * FROM Tasks WHERE entryid = :taskId")
    fun getTaskById(taskId: String): Task?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task): Int

    @Query("UPDATE tasks SET completed = :completed WHERE entryid = :taskId")
    fun updateCompleted(taskId: String, completed: Boolean)

    @Query("DELETE FROM Tasks WHERE entryid = :taskId")
    fun deleteTaskById(taskId: String): Int

    @Query("DELETE FROM Tasks")
    fun deleteTasks()

    @Query("DELETE FROM Tasks WHERE completed = 1")
    fun deleteCompletedTasks(): Int
}