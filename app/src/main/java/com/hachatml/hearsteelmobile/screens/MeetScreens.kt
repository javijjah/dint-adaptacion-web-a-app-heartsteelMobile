package com.hachatml.hearsteelmobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hachatml.hearsteelmobile.NavbarMioHome
import com.hachatml.hearsteelmobile.NavbarMioUser
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.exportedComponents.MeetTextMio
import com.hachatml.hearsteelmobile.exportedComponents.Subtitle

@Composable
fun KsanteMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_ksante_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "K'sante")
            Subtitle(subtitle = "The sensible one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}
@Composable
fun KaynMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_kayn_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "Kayn")
            Subtitle(subtitle = "The bad one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}@Composable
fun SettMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_sett_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "Sett")
            Subtitle(subtitle = "The tough one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}
@Composable
fun YoneMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_yone_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "Yone")
            Subtitle(subtitle = "The rich one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}
@Composable
fun EzrealMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_ezreal_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "Ezreal")
            Subtitle(subtitle = "The cute one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}
@Composable
fun ApheliosMeetScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.meet_buttons_aphelios_button_img),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
    ){}
        Column(
            modifier = Modifier.padding(0.dp,100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            MeetTextMio(title = "Aphelios")
            Subtitle(subtitle = "The quiet one")
        }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioUser()
    }
}