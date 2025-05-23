package com.example.worldclass

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.worldclass.data.database.AppDatabase
import com.example.worldclass.data.database.DatabaseProvider
import com.example.worldclass.ui.screens.AccountsScreen
import com.example.worldclass.ui.screens.AppScreen
import com.example.worldclass.ui.screens.BiometricScreen
import com.example.worldclass.ui.screens.CameraScreen
import com.example.worldclass.ui.screens.ComponentsScreen
import com.example.worldclass.ui.screens.FavoriteAccountsScreen
import com.example.worldclass.ui.screens.HomeScreen
import com.example.worldclass.ui.screens.LoginScreen
import com.example.worldclass.ui.screens.MainMenuScreen
import com.example.worldclass.ui.screens.ManageAccountScreen
import com.example.worldclass.ui.screens.NotificationScreen
import com.example.worldclass.ui.screens.TestScreen
import com.example.worldclass.ui.screens.TwitchInterface
import com.example.worldclass.ui.theme.WorldClassTheme

class MainActivity : FragmentActivity() {
    lateinit var database: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try{
            database = DatabaseProvider.getDatabase(this)
            Log.d("debug-db", "Database loaded successfully")
        }catch(exception:Exception){
            Log.d("debug-db", "ERROR: $exception")
        }
        val destination = intent?.getStringExtra("destination")


        //enableEdgeToEdge()
        //Que contenido visual tiene nuestra app
        setContent {
            WorldClassTheme {
                ComposeMultiScreenApp(startDestination = destination)

            }
        }
    }


}

@Composable
fun ComposeMultiScreenApp(startDestination: String?) {
    val navController = rememberNavController()
    SetupNavGraph(navController, startDestination ?: "main_menu")
}


@Composable
fun SetupNavGraph(navController: NavHostController, startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable("main_menu") { MainMenuScreen(navController) } //Se importa la clase
        composable("home_screen") { HomeScreen(navController) }
        composable("test_screen") { TestScreen(navController) }
        composable("twitch_interface") { TwitchInterface(navController) }
        composable("components_screen") { ComponentsScreen(navController) }
        composable("login_screen") { LoginScreen(navController) }
        composable("accounts_screen") { AccountsScreen(navController) }
        composable("manage_account_screen") { ManageAccountScreen(navController) }
        composable(
            route = "manage_account_screen/{id}",
            arguments = listOf(navArgument("id") { defaultValue = -1 })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: -1
            ManageAccountScreen(
                navController = navController,
                accountId = id
            )
        }
        composable("favorite_accounts_screen") { FavoriteAccountsScreen(navController) }
        composable("camera_screen") { CameraScreen(navController) }
        composable("app_screen") { AppScreen(navController) }
        composable("notification_screen") { NotificationScreen(navController) }
        composable("biometric_screen"){
            val context = LocalContext.current
            BiometricScreen(navController, onAuthSuccess = {
                Toast.makeText(context, "Authentication successful", Toast.LENGTH_SHORT).show()
            })
        }




    }

}




