package com.pranav.weatherapp.api

//T refers to the weather Model
sealed class NetworkResponse<out T>{
        data class Success<out T>(val data : T) : NetworkResponse<T>()
        data class Error(val message : String) : NetworkResponse<Nothing>()
        data object Loading : NetworkResponse<Nothing>()
}
