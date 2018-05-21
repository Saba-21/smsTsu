package com.example.saba.smsTsu.domain.model.dbModels

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "repo")
data class RepoModel(@PrimaryKey val id: Int)