package com.iqbooster.app.data.api

import com.iqbooster.app.data.model.Data
import com.iqbooster.app.data.model.Empolyee
import retrofit2.http.GET

interface ApiService {

    @GET("employees")
    suspend fun getEmployee(): Empolyee

}