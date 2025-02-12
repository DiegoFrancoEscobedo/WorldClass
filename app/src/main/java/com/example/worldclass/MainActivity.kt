package com.example.worldclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldclass.ui.theme.WorldClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //enableEdgeToEdge()
        //Que contenido visual tiene nuestra app
        setContent {
            WorldClassTheme {
                Column(){

                    Column(){
                        TextComposable("Roberto")
                        TextComposable()
                        TextComposable()
                        TextComposable()
                    }
                    Row(){
                        TextComposable()
                        TextComposable()
                        TextComposable()
                        TextComposable()
                    }
                    Column(){

                        ModifierExample1()

                    }
                }


            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun TextComposable(name:String = "Empty"){
        Text("Welcome")
        Text(name)
    }
    @Preview(showBackground = true)
        @Composable
        fun ModifierExample(){
            Column(modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .clickable(onClick = { clickAction()})
            ){
//Estas funciones sirven para hacer ajustes al tamaño de los cuadros
                // .fillMaxWidth().fillMaxSize().fillMaxHeight()
                Text("Hello World")
            }


        }
    fun clickAction(){
        println("Column Clicked")
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample1(){
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
//Ajustar el texto
            .background(Color.Cyan)
//Color del fondo
            .border(width = 2.dp, color = Color.Black)
//Color del borde y la anchura del mismo
            .width(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
//Funciones para centrar el texto

        ){

            TextComposable("1")
            TextComposable("2")
            TextComposable("3")
            TextComposable("4")
        }


    }
}

