package com.example.saba.smsTsu.domain.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.saba.smsTsu.domain.database.daos.RepoDao
import com.example.saba.smsTsu.domain.model.dbModels.RepoModel

@Database(entities = [RepoModel::class],
        version = 2,
        exportSchema = false)
abstract class RepoDatabase : RoomDatabase() {

    abstract fun repoDao():RepoDao

}
