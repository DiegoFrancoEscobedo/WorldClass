package com.example.worldclass.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
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
import com.example.worldclass.ui.theme.MediumDarkGray
import com.example.worldclass.ui.theme.StrongPurple
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Favorite
import com.example.worldclass.ui.theme.Purple


@Composable
fun TwitchInterface(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            topbar1()

            Column(
                modifier = Modifier
                    .weight(1f) // Hace que esta sección ocupe el espacio disponible entre las barras
                    .verticalScroll(rememberScrollState())
            ) {
                FirstContent()
                SecondContent()
                ThirdContent()
                FourthContent()
                FifthContent()
            }

            downbar1()
        }
    }


}


@Preview(showBackground = true)
@Composable
fun topbar1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .padding(start = 17.dp, top = 0.dp, end = 10.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(32.dp) // Tamaño del círculo
                .background(StrongPurple, shape = CircleShape) // Fondo circular
        ) {
            Icon(
                Icons.Filled.Person,
                contentDescription = "Person Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(26.dp)

            )

        }


        Spacer(modifier = Modifier.weight(1f))


        Icon(
            Icons.Filled.PhotoCameraFront,
            contentDescription = "Photo Camera Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(28.dp)
        )

        Spacer(modifier = Modifier.width(22.dp))

        Icon(
            Icons.Filled.MailOutline,
            contentDescription = "Mail Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(27.dp)

        )

        Spacer(modifier = Modifier.width(22.dp))

        Icon(
            Icons.Filled.ChatBubbleOutline,
            contentDescription = "Chat Bubble Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(25.dp)
        )

        Spacer(modifier = Modifier.width(22.dp))

        Icon(
            Icons.Filled.Search,
            contentDescription = "Search Icon",
            tint = Color.Black,
            modifier = Modifier
                .size(27.dp)

        )
    }
}


@Preview(showBackground = true)
@Composable
fun downbar1() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(Color.White)
            .padding(start = 32.dp, top = 5.dp, end = 5.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Heart Icon",
                tint = Purple,
                modifier = Modifier
                    .size(25.dp)
            )

            Text(
                text = "Siguiendo",
                lineHeight = 14.sp,
                fontWeight = FontWeight.W600,
                color = Purple,
                fontSize = 13.sp,
                letterSpacing = (.1).sp,
                modifier = Modifier
                    .padding(top = 2.dp)
            )

        }


        Spacer(modifier = Modifier.width(70.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                Icons.Filled.Explore,
                contentDescription = "Compass Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(25.dp)

            )

            Text(
                text = "Descubrir",
                lineHeight = 14.sp,
                fontWeight = FontWeight.W500,
                color = Color.Black,
                fontSize = 12.sp,
                letterSpacing = (.1).sp,
                modifier = Modifier
                    .padding(top = 2.dp)
            )


        }

        Spacer(modifier = Modifier.width(85.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Icon(
                Icons.Filled.ContentCopy,
                contentDescription = "Content Copy Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(23.dp)
            )

            Text(
                text = "Explorar",
                lineHeight = 14.sp,
                fontWeight = FontWeight.W500,
                color = Color.Black,
                fontSize = 12.sp,
                letterSpacing = (.1).sp,
                modifier = Modifier
                    .padding(top = 2.dp)
            )


        }


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
            fontWeight = FontWeight.W700,
            color = Color.Black,
            fontSize = 36.sp,
            letterSpacing = (.6).sp,
            modifier = Modifier
                .padding(start = 17.dp, top = 10.dp, bottom = 31.dp)
        )



        Text(
            text = "Categorías que sigues",
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            letterSpacing = (.9).sp,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 17.dp, bottom = 18.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
        ) {
            Column() {

                Image(
                    modifier = Modifier
                        .width(101.dp)
                        .height(130.dp),
                    painter = painterResource(R.drawable.pubg),
                    contentDescription = "Imagen de el videojuego PUBG",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "PUBG: BATTLE...",
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (.2).sp,
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 7.dp)

                )



                Row(
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Spacer(modifier = Modifier.height(19.dp))
                    Icon(
                        Icons.Filled.Circle,
                        contentDescription = "Circle Icon",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(11.dp)

                    )
                    Text(
                        text = "10 K",
                        lineHeight = 5.sp,
                        fontWeight = FontWeight.Medium,
                        color = MediumDarkGray,
                        letterSpacing = (-0.1).sp,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)

                    )
                }

            }

            Spacer(modifier = Modifier.width(10.dp))

            Column() {

                Image(
                    modifier = Modifier
                        .width(101.dp)
                        .height(130.dp),
                    painter = painterResource(R.drawable.fortnite),
                    contentDescription = "Imagen de el videojuego Fortnite",
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Fortnite",
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 7.dp)

                )
                Row(
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Spacer(modifier = Modifier.height(19.dp))

                    Icon(
                        Icons.Filled.Circle,
                        contentDescription = "Circle Icon",
                        tint = Color.Red,
                        modifier = Modifier
                            .size(11.dp)

                    )
                    Text(
                        text = "27.9 K",
                        lineHeight = 5.sp,
                        fontWeight = FontWeight.Medium,
                        color = MediumDarkGray,
                        letterSpacing = (-0.1).sp,
                        fontSize = 12.sp,
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

        Spacer(modifier = Modifier.height(height = 40.dp))

        Text(
            text = "Canales recomendados para ti",
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            letterSpacing = (.6).sp,
            fontSize = 21.sp,
            modifier = Modifier
                .padding(start = 17.dp, bottom = 13.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
        ) {

//Imagen de la pre-vista del video
            Box(
                modifier = Modifier
                    .height(75.dp)
            ) {

                Image(
                    modifier = Modifier
                        .width(120.dp)
                        .height(72.dp),
                    painter = painterResource(R.drawable.auron),
                    contentDescription = "Imagen de directo",
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
                            .size(11.dp)
                            .background(Color.Red, shape = CircleShape)
                    )


                    Spacer(modifier = Modifier.width(3.dp))


                    Text(
                        text = "251",
                        color = Color.White,
                        letterSpacing = (-.2).sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
//Descripción del directo de Twitch

            Spacer(modifier = Modifier.width(16.dp))

            Column() {

                Spacer(modifier = Modifier.height(4.dp))

                Row() {
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.auronoffline),
                        contentDescription = "Icono Perfil",
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "auron_offline",
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black,
                        fontSize = 16.sp,
                        letterSpacing = (.3).sp,
                        modifier = Modifier
                            .padding(top = 2.dp)

                    )
                }

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Auronplay Juega Among U...",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Just Chatting",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp

                )


            }

            Spacer(modifier = Modifier.width(12.dp))

            Icon(
                Icons.Filled.MoreVert,
                contentDescription = "MoreVert Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(33.dp)
                    .padding(top = 7.dp)

            )

        }

    }

}


@Preview(showBackground = true)
@Composable
fun ThirdContent() {

    Column() {

        Spacer(modifier = Modifier.height(height = 20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
        ) {

//Imagen de la pre-vista del video
            Box(
                modifier = Modifier
                    .height(75.dp)
            ) {

                Image(
                    modifier = Modifier
                        .width(120.dp)
                        .height(72.dp),
                    painter = painterResource(R.drawable.robots),
                    contentDescription = "Imagen de directo",
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
                            .size(11.dp)
                            .background(Color.Red, shape = CircleShape)
                    )


                    Spacer(modifier = Modifier.width(3.dp))


                    Text(
                        text = "475",
                        color = Color.White,
                        letterSpacing = (-.2).sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
//Descripción del directo de Twitch

            Spacer(modifier = Modifier.width(16.dp))

            Column() {

                Spacer(modifier = Modifier.height(4.dp))

                Row() {
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.cuevana),
                        contentDescription = "Icono Perfil",
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Cuevana3Tv",
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black,
                        fontSize = 16.sp,
                        letterSpacing = (.3).sp,
                        modifier = Modifier
                            .padding(top = 2.dp)

                    )
                }

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "\uD83C\uDF7FPELICULAS para reaccio...",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Anime Squad",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp

                )


            }

            Spacer(modifier = Modifier.width(10.dp))

            Icon(
                Icons.Filled.MoreVert,
                contentDescription = "MoreVert Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(33.dp)
                    .padding(top = 7.dp)

            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun FourthContent() {
    Column() {

        Spacer(modifier = Modifier.height(height = 20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
        ) {

//Imagen de la pre-vista del video
            Box(
                modifier = Modifier
                    .height(75.dp)
            ) {

                Image(
                    modifier = Modifier
                        .width(120.dp)
                        .height(72.dp),
                    painter = painterResource(R.drawable.malcolm),
                    contentDescription = "Imagen de directo",
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
                            .size(11.dp)
                            .background(Color.Red, shape = CircleShape)
                    )


                    Spacer(modifier = Modifier.width(3.dp))


                    Text(
                        text = "246",
                        color = Color.White,
                        letterSpacing = (-.2).sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
//Descripción del directo de Twitch

            Spacer(modifier = Modifier.width(16.dp))

            Column() {

                Spacer(modifier = Modifier.height(4.dp))

                Row() {
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.iconomalcmolm),
                        contentDescription = "Icono Perfil",
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Malcom_esp",
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black,
                        fontSize = 16.sp,
                        letterSpacing = (.3).sp,
                        modifier = Modifier
                            .padding(top = 2.dp)

                    )
                }

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Malcolm el de en medio",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Just Chatting",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp

                )


            }

            Spacer(modifier = Modifier.width(42.dp))

            Icon(
                Icons.Filled.MoreVert,
                contentDescription = "MoreVert Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(33.dp)
                    .padding(top = 7.dp)

            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun FifthContent() {
    Column() {

        Spacer(modifier = Modifier.height(height = 20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 17.dp)
        ) {

//Imagen de la pre-vista del video
            Box(
                modifier = Modifier
                    .height(75.dp)
            ) {

                Image(
                    modifier = Modifier
                        .width(120.dp)
                        .height(72.dp),
                    painter = painterResource(R.drawable.gta),
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
                            .size(11.dp)
                            .background(Color.Red, shape = CircleShape)
                    )


                    Spacer(modifier = Modifier.width(3.dp))


                    Text(
                        text = "3.1k",
                        color = Color.White,
                        fontSize = 12.sp,
                        letterSpacing = (-.2).sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
//Descripción del directo de Twitch

            Spacer(modifier = Modifier.width(16.dp))

            Column() {

                Spacer(modifier = Modifier.height(4.dp))

                Row() {
                    Image(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.vegetta),
                        contentDescription = "Icono Perfil",
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Vegetta777",
                        lineHeight = 14.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black,
                        fontSize = 16.sp,
                        letterSpacing = (.3).sp,
                        modifier = Modifier
                            .padding(top = 2.dp)

                    )
                }

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Vegetta juega GTAV",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = "Entra y disfruta",
                    lineHeight = 5.sp,
                    fontWeight = FontWeight.Medium,
                    color = MediumDarkGray,
                    letterSpacing = (.5).sp,
                    fontSize = 12.sp

                )


            }

            Spacer(modifier = Modifier.width(62.dp))

            Icon(
                Icons.Filled.MoreVert,
                contentDescription = "MoreVert Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(33.dp)
                    .padding(top = 7.dp)

            )

        }

    }

}

