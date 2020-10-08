package com.iqbooster.app.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun  getEmployee()=apiService.getEmployee();
}