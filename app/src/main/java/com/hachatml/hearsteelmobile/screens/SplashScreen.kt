package com.hachatml.hearsteelmobile.screens

import android.annotation.SuppressLint
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
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hachatml.hearsteelmobile.NavbarMioDefault
import com.hachatml.hearsteelmobile.NavbarMioHome
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.buttonbaseprimaryhower.ButtonBasePrimaryHower
import com.hachatml.hearsteelmobile.exportedComponents.*
import com.hachatml.hearsteelmobile.splashscreentext.SplashScreenText

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.prestigeyone),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SplashScreenText()
        //todo arreglar boton login
        ButtonBasePrimaryHower()
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavbarMioHome(navController)
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioHome(navController)
    }
}