package com.hachatml.hearsteelmobile.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
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
import com.hachatml.hearsteelmobile.merchitem.jetBrainsMono
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
        val uriHandler = LocalUriHandler.current
        SplashScreenText(modifier = Modifier.size(330.dp, 130.dp))
        //todo arreglar boton login
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { uriHandler.openUri("https://www.youtube.com/watch?v=y_mbhMJfbrs") },
            shape = RoundedCornerShape(20),
            modifier = Modifier.size(180.dp, 40.dp),
            colors = ButtonDefaults.buttonColors(Color.Yellow)
        ) {
            Row(horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = "Skins Trailer",
                    color = Color.Black,
                    fontFamily = jetBrainsMono
                )
                Spacer(modifier = Modifier.size(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.ytlogo),
                    contentDescription = "Logo de Youtube",
                    modifier = Modifier.size(50.dp,20.dp)
                )
            }
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioHome(navController)
    }
}