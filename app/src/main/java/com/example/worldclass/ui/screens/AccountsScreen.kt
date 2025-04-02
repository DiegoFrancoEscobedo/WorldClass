package com.example.worldclass.ui.screens

import com.example.worldclass.data.viewmodel.AccountViewModel
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.worldclass.data.model.AccountModel
import com.example.worldclass.ui.components.AccountCardComponent
import com.example.worldclass.ui.components.TopBarComponent

@Composable
fun AccountsScreen(
    navController: NavController,
    viewModel: AccountViewModel = viewModel()
) {
    var accounts by remember { mutableStateOf<List<AccountModel>>(emptyList()) }
    Column() {
        TopBarComponent("Accounts")
        LaunchedEffect(Unit) {
            viewModel.getAccounts { response ->
                if (response.isSuccessful){
                    accounts = response.body()?: emptyList()
                }else{
                    Log.d("debug", "Failed to load data")
                }

            }
        }

    }

    //AccountCardComponent(1, "Name", "user@gmail.com", "")
}

