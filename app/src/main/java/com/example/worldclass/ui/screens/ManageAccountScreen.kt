package com.example.worldclass.ui.screens

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.worldclass.data.model.AccountModel
import com.example.worldclass.data.viewmodel.AccountViewModel
import com.example.worldclass.ui.components.TopBarComponent

@Composable
fun ManageAccountScreen(
    navController: NavController,
    viewModel: AccountViewModel = viewModel()
) {
    val account = remember { mutableStateOf(AccountModel()) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(10.dp)
            .fillMaxSize()
    ) {
        TopBarComponent("Add Account", navController, "manage_account_screen")

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = account.value.name,
            maxLines = 1,
            onValueChange = { account.value = account.value.copy(name = it) },
            label = { Text("Account Name") }
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = account.value.username,
            maxLines = 1,
            onValueChange = { account.value = account.value.copy(username = it) },
            label = { Text("Account Username") }
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = account.value.password,
            maxLines = 1,
            onValueChange = { account.value = account.value.copy(password = it) },
            label = { Text("Account Password") },

            )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = account.value.description,
            maxLines = 1,
            onValueChange = { account.value = account.value.copy(description = it) },
            label = { Text("Account Description") }

        )

        FilledTonalButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 10.dp),
            onClick = {
                TryCreateAccount(account, context, viewModel)
            }
        ) {
            Text("Save Account")
        }
    }

}

fun TryCreateAccount(
    accountState: MutableState<AccountModel>,
    context: Context,
    viewModel: AccountViewModel
) {
    try {
        val acc = accountState.value
        if (
            acc.name.isEmpty() ||
            acc.username.isEmpty() ||
            acc.password.isEmpty() ||
            acc.description.isEmpty()
        ) {
            Log.d("debug", "ERROR")
            Toast.makeText(
                context,
                "None of the fields can be empty",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            viewModel.createAccount(acc) { jsonResponse ->
                val createAcStatus = jsonResponse?.get("store")?.asString
                Log.d("debug", "CREATE ACCOUNT STATUS: $createAcStatus")
                Log.d("debug", "SUCCESS")
                if (createAcStatus == "success") {
                    Toast.makeText(
                        context,
                        "Account created successfully",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Log.d("debug", "CREATE ACCOUNT STATUS: $createAcStatus")
                    Log.d("debug", "ERROR")
                    Toast.makeText(
                        context,
                        "Error creating account",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    } catch (exception: Exception) {
        Log.d("debug", "ERROR: $exception")
    }

}