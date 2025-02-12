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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        ModifierExample()
                        //ModifierExample1()
                        ModifierExample2()
                        CustomText()

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
                .clickable(onClick = {clickAction()}) //Hace al texto clickeable
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

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample2(){
        Box(modifier = Modifier
            .background(Color.Blue)
            .padding(10.dp)
            .height(300.dp)
            .width(300.dp)){

            Text("1", Modifier.align(Alignment.TopStart))
            Text("2", Modifier.align(Alignment.TopCenter))
            Text("3", Modifier.align(Alignment.TopEnd))
            Text("4", Modifier.align(Alignment.CenterStart))
            Text("5", Modifier.align(Alignment.Center))
            Text("6", Modifier.align(Alignment.CenterEnd))
            Text("7", Modifier.align(Alignment.BottomStart))
            Text("8", Modifier.align(Alignment.BottomCenter))
            Text("9", Modifier.align(Alignment.BottomEnd))

//Permite mover el texto a tu conveniencia

        }

    }

    @Preview(showBackground = true)
    @Composable
    fun CustomText(){
        Column(){
            Text(
                stringResource(R.string.sample_text),
                color = colorResource(R.color.teal_700),
                fontSize = 20.sp, //Tamaño de la letra
                fontStyle = FontStyle.Italic, //Estilo de la letra
                fontWeight = FontWeight.ExtraBold //Grososr de la letra

            )
            val gradiantColors = listOf(Color.Cyan, Color.Blue, Color.Red, Color.Green, Color.LightGray, Color.Green)
            Text(
                stringResource(R.string.sample_text), //Manda a llamar el texto de la carpeta strings.xml
                style = TextStyle(brush = Brush.linearGradient(colors = gradiantColors)) //Estilo de degradado de colores
            )
        }

}
}

