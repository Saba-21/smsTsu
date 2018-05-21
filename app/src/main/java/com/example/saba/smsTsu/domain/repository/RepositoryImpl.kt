package com.example.saba.smsTsu.domain.repository

import com.example.saba.smsTsu.domain.dataProvider.global.GlobalDataProvider
import com.example.saba.smsTsu.domain.dataProvider.local.LocalDataProvider

class RepositoryImpl(private val globalDataProvider: GlobalDataProvider,
                     private val localDataProvider: LocalDataProvider) : Repository
