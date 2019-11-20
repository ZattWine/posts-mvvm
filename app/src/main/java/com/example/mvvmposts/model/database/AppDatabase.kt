package com.example.mvvmposts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmposts.model.Post
import com.example.mvvmposts.model.PostDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun postDao(): PostDao
}