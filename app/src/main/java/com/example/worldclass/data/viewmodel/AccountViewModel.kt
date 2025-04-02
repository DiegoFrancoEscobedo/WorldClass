package com.example.worldclass.data.viewmodel
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.worldclass.data.model.AccountModel
import com.example.worldclass.data.network.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.Response

class AccountViewModel: ViewModel() {
    val api= RetrofitClient.api

    fun getAccounts(onResult: (Response<List<AccountModel>>)-> Unit){
        viewModelScope.launch {
            try{
                val response= api.getAccounts()
                Log.d("debug", response.toString())
                onResult(response)
            }catch (exception: Exception){
                Log.d("debug", "API ERROR: $exception")
            }
            }
        }
}