package com.hachatml.hearsteelmobile.screens

import android.media.FaceDetector.Face
import android.widget.Space
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.biglogo.BigLogo
import com.hachatml.hearsteelmobile.chevronbottomnormal.ChevronBottomNormal
import com.hachatml.hearsteelmobile.exportedComponents.ChevronBottomNormalMio
import com.hachatml.hearsteelmobile.facefirst.FaceFirst
import com.hachatml.hearsteelmobile.mainscreenlogos.MainScreenLogos
import com.hachatml.hearsteelmobile.mainscreenlogos.WelcomeTo
import com.hachatml.hearsteelmobile.navhost.Routes

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.hsstartbackground),
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //WelcomeTo(modifier = Modifier.size(500.dp,100.dp))
        BigLogo(modifier = Modifier.size(500.dp, 200.dp))
        FaceFirst(modifier = Modifier.size(415.dp, 70.dp))
    }
    var scrollable = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(0.dp, 200.dp, 0.dp, 0.dp)
            .verticalScroll(scrollable),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (scrollable.isScrollInProgress){
            navController.navigate(Routes.SplashScreen.route)
        }
        //todo animar esto
        ChevronBottomNormalMio(modifier = Modifier.size(100.dp, 100.dp), navController)
    }
}

