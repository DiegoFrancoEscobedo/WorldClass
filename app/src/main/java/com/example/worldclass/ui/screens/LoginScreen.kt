package com.example.worldclass.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsContext
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.worldclass.data.model.UserModel
import com.example.worldclass.data.viewmodel.UserViewModel

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        LoginForm(navController)
    }
}

@Composable
fun LoginForm(
    navController: NavController,
    viewModel: UserViewModel = viewModel()

){
    val context = LocalContext.current
    Card (
        colors = CardDefaults.cardColors(
            contentColor = Color.White,
            containerColor = MaterialTheme.colorScheme.surface
        ),
        modifier = Modifier
            .padding(40.dp, 0.dp)
    ){
        Column (
            modifier = Modifier
                .padding(20.dp)
        ){
            var user by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }

            AsyncImage(
                model = "https://m.media-amazon.com/images/S/pv-target-images/af5111c370669ce3f1d6fc3fc2d693794bc1c1a3d100fae22aad9b9c5249598f.jpg",
                contentDescription = "Arcane Image",
                contentScale = ContentScale.Fit
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = user,
                maxLines = 1,
                onValueChange = { user = it },
                label = { Text("User") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = MaterialTheme.colorScheme.onSurface,
                    focusedBorderColor = MaterialTheme.colorScheme.secondary,
                    unfocusedContainerColor = Color.Transparent,
                    unfocusedTextColor = MaterialTheme.colorScheme.onSurface,
                    focusedTextColor = MaterialTheme.colorScheme.secondary
                )

            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = password,
                maxLines = 1,
                onValueChange = { password = it },
                label = { Text("Password") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = MaterialTheme.colorScheme.onSurface,
                    focusedBorderColor = MaterialTheme.colorScheme.secondary,
                    unfocusedContainerColor = Color.Transparent,
                    unfocusedTextColor = MaterialTheme.colorScheme.onSurface,
                    focusedTextColor = MaterialTheme.colorScheme.secondary
                )

            )

            FilledTonalButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                shape = CutCornerShape(4.dp),
                onClick = { TryLogin(user, password, context, viewModel, navController) }
            ) {
                Text("LOG IN")
            }

            OutlinedButton (
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                shape = CutCornerShape(4.dp),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary),

                        onClick = {
                    navController.navigate("manage_account_screen")
                }
            ) {
                Text("CREATE ACCOUNT")
            }




        }

    }
}


fun TryLogin(
    user:String,
    password:String,
    context:Context,
    viewModel: UserViewModel,
    navController: NavController
){
    if (user == "" || password == ""){
        Toast.makeText(
            context,
            "User or Password cannot be empty",
            Toast.LENGTH_SHORT //the message will show for a shorter times pan
        ).show()
    }else{
        val user_model = UserModel(0, "", user, password)
        viewModel.loginAPI(user_model){
            jsonResponse ->
            val loginStatus = jsonResponse?.get("login")?.asString
            Log.d("debug", "LOGIN STATUS: $loginStatus")
            if (loginStatus == "success") {
                navController.navigate("accounts_screen")
            }
        }
    }

}