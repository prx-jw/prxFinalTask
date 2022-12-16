package com.example.prxfinaltask.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.prxfinaltask.model.database.Post
import com.example.prxfinaltask.model.database.PostDao

@Database(entities = [Post::class], version = 1)
abstract class PostDatabase: RoomDatabase() {
    abstract fun getDao(): PostDao
}