package com.iqbooster.app.ui.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.iqbooster.app.data.repository.MainRepository
import com.iqbooster.app.uitls.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(val mainRepository: MainRepository) : ViewModel() {
    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getEmployee().data))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}