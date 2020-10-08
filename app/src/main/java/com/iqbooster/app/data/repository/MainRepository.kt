package com.iqbooster.app.data.repository

import com.iqbooster.app.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getEmployee() = apiHelper.getEmployee()
}