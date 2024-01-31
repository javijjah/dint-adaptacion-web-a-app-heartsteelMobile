package com.hachatml.hearsteelmobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hachatml.hearsteelmobile.NavbarMioHome
import com.hachatml.hearsteelmobile.NavbarMioMusic
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.exportedComponents.PARANOIAOUTNOWMio
import com.hachatml.hearsteelmobile.exportedComponents.YoutubeScreen
import com.hachatml.hearsteelmobile.mvouttext.MvoutText

@Composable
fun MusicScreen() {
    Column(
        modifier = Modifier.paint(
            painterResource(id = R.drawable.hsmv),
            contentScale = ContentScale.FillHeight,
            alpha = 0.3f
        ),
                verticalArrangement = Arrangement . Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PARANOIAOUTNOWMio()
        YoutubeScreen(videoId = "MDErQ1KTzaI", modifier = Modifier.size(200.dp))
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioMusic()
    }
}