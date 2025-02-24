package com.example.worldclass.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.worldclass.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.PhotoCameraFront


@Composable
fun TwitchInterface(navController: NavHostController) {
    topbar1()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp, 60.dp, 0.dp, 0.dp)
            .verticalScroll(rememberScrollState())


    ) {
        FirstContent()
    }

}

@Preview(showBackground = true)
@Composable
fun topbar1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.White)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically // C

    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp) // Tamaño del círculo
                .background(Color.Gray, shape = CircleShape) // Fondo circular
        ) {
            Icon(
                Icons.Filled.Person,


                contentDescription = "Person Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(30.dp)

            )

        }


        Spacer(modifier = Modifier.weight(1f))

        Icon(
            Icons.Filled.PhotoCameraFront,
            contentDescription = "Photo Camera Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(45.dp)

        )

        Spacer(modifier = Modifier.width(15.dp))

        Icon(
            Icons.Filled.MailOutline,
            contentDescription = "Mail Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(45.dp)

        )

        Spacer(modifier = Modifier.width(15.dp))

        Icon(
            Icons.Filled.ChatBubbleOutline,
            contentDescription = "Chat Bubble Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(45.dp)

        )

        Spacer(modifier = Modifier.width(15.dp))

        Icon(
            Icons.Filled.Search,
            contentDescription = "Search Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(45.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun FirstContent() {
    Card(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(5.dp)
    ) {

        Row() {
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(100.dp),
                painter = painterResource(R.drawable.si),
                contentDescription = "Imagen Random",
                contentScale = ContentScale.Crop
            )
            Column() {
                Text(
                    text = "This is a title",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    stringResource(R.string.sample_text2),
                    textAlign = TextAlign.Justify,
                    lineHeight = 14.sp,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        }
    }


}

