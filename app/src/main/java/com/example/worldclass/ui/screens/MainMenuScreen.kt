package com.example.worldclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainMenuScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()


    ){
        Text("Main Menu")
        Button(
            onClick = { navController.navigate("home_screen")}
        ) {
            Text("Go to Home Screen")
        }
        Button(
            onClick = { navController.navigate("test_screen")}
        ) {
            Text("Go to Test Screen")
        }
        Button(
            onClick = { navController.navigate("twitch_interface")}
        ) {
            Text("Go to Twitch Interface")
        }
        Button(
            onClick = { navController.navigate("components_screen")}
        ) {
            Text("Go to Components Screen")
        }
        Button(
            onClick = { navController.navigate("login_screen")}
        ) {
            Text("Go to Login Screen")
        }
        Button(
            onClick = { navController.navigate("accounts_screen")}
        ) {
            Text("Go to Accounts Screen")
        }
        Button(
            onClick = { navController.navigate("manage_account_screen")}
        ) {
            Text("Go to Manage Account Screen")
        }
        Button(
            onClick = { navController.navigate("camera_screen")}
        ) {
            Text("Go to Camera Screen")
        }
        Button(
            onClick = { navController.navigate("app_screen")}
        ) {
            Text("Go to App Screen Calendar")
        }
        Button(
            onClick = { navController.navigate("notification_screen")}
        ) {
            Text("Go to Notification Screen")
        }
        Button(
            onClick = { navController.navigate("biometric_screen")}
        ) {
            Text("Go to Biometric Screen")
        }


    }

}