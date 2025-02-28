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
import androidx.compose.foundation.layout.offset
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
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PhotoCameraFront
import androidx.compose.ui.draw.clip
import com.example.worldclass.ui.theme.StrongPurple


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
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically // C

    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp) // Tamaño del círculo
                .background(StrongPurple, shape = CircleShape) // Fondo circular
        ) {
            Icon(
                Icons.Filled.Person,
                contentDescription = "Person Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(30.dp)

            )

        }


        Spacer(modifier = Modifier.weight(1f))

        Box(
            contentAlignment = Alignment.Center,

        ) {
            Icon(
                Icons.Filled.PhotoCameraFront,
                contentDescription = "Photo Camera Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(45.dp)

            )
            Box(
                modifier = Modifier
                    .size(15.dp) // Ajusta el tamaño para que cubra bien
                    .background(Color.White)
                    .offset(y = 30.dp)
            )


        }

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

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Siguiendo",
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 22.sp,
            modifier = Modifier
                .padding(start = 10.dp, top = 10.dp, bottom = 15.dp)
        )



        Text(
            text = "Categorías que sigues",
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(start = 10.dp, bottom = 10.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
            Column() {

                Image(
                    modifier = Modifier
                        .width(75.dp)
                        .height(110.dp),
                    painter = painterResource(R.drawable.pubg),
                    contentDescription = "Imagen de el videojuego PUBG",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "PUBG: BATTLE...",
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 9.sp,
                    modifier = Modifier

                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Circle,
                        contentDescription = "Circle Icon",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(8.dp)
                    )
                    Text(
                        text = "10 K",
                        lineHeight = 5.sp,
                        color = Color.DarkGray,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)

                    )
                }

            }

            Spacer(modifier = Modifier.width(10.dp))

            Column() {

                Image(
                    modifier = Modifier
                        .width(75.dp)
                        .height(110.dp),
                    painter = painterResource(R.drawable.fortnite),
                    contentDescription = "Imagen de el videojuego Fortnite",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Fortnite",
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 9.sp,
                    modifier = Modifier

                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Circle,
                        contentDescription = "Circle Icon",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(8.dp)

                    )
                    Text(
                        text = "27.9 K",
                        lineHeight = 5.sp,
                        color = Color.DarkGray,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)

                    )
                }


            }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun SecondContent() {

    Column() {

        Spacer(modifier = Modifier.height(height = 1.dp))

        Text(
            text = "Canales recomendados para ti",
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(10.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
        ) {
//Imagen de la pre-vista del video
            Box(
                modifier = Modifier
                    .height(110.dp)
            ) {

                Image(
                    modifier = Modifier
                        .width(175.dp)
                        .height(110.dp),
                    painter = painterResource(R.drawable.si),
                    contentDescription = "Imagen de fondo",
                    contentScale = ContentScale.Crop,

                )


                Row(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .size(14.dp)
                            .background(Color.Red, shape = CircleShape)
                    )


                    Spacer(modifier = Modifier.width(4.dp))


                    Text(
                        text = "251",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
//Descripción del directo de Twitch
            Column() {

                Row() {
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.pubg),
                        contentDescription = "Imagen de el videojuego PUBG",
                        contentScale = ContentScale.Crop
                    )

                    Text(
                        text = "auron_offline",
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 9.sp,
                        modifier = Modifier

                    )
                }

                Text(
                    text = "Auronplay Juega Among U...",
                    lineHeight = 5.sp,
                    color = Color.DarkGray,
                    fontSize = 8.sp,
                    modifier = Modifier
                        .padding(horizontal = 2.dp)

                )

                Text(
                    text = "Just Chatting",
                    lineHeight = 5.sp,
                    color = Color.DarkGray,
                    fontSize = 8.sp,
                    modifier = Modifier
                        .padding(horizontal = 2.dp)

                )


            }

            Icon(
                Icons.Filled.MoreVert,
                contentDescription = "MoreVert Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(8.dp)

            )

            }

            Spacer(modifier = Modifier.width(10.dp))

            Column() {

                Image(
                    modifier = Modifier
                        .width(75.dp)
                        .height(110.dp),
                    painter = painterResource(R.drawable.fortnite),
                    contentDescription = "Imagen de el videojuego Fortnite",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Fortnite",
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 9.sp,
                    modifier = Modifier

                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Circle,
                        contentDescription = "Circle Icon",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(8.dp)

                    )
                    Text(
                        text = "27.9 K",
                        lineHeight = 5.sp,
                        color = Color.DarkGray,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)

                    )
                }


            }


        }

    }





