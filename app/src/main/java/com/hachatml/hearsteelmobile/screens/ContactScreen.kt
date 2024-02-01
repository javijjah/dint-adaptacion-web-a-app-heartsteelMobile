package com.hachatml.hearsteelmobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hachatml.hearsteelmobile.NavbarMioEmail
import com.hachatml.hearsteelmobile.NavbarMioUser
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.contactmaintext.FollowUs
import com.hachatml.hearsteelmobile.contacts.Contacts
import com.hachatml.hearsteelmobile.contacts.Property1
import com.hachatml.hearsteelmobile.footer.Footer

@Composable
fun ContactScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Footer(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp))
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.kaynsocial),
                alignment = Alignment.Center,
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FollowUs(modifier = Modifier.size(444.dp,119.dp))
        Column(
            modifier = Modifier.size(350.dp, 400.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Contacts(Modifier.size(337.dp,50.dp),Property1.Email)
            Contacts(Modifier.size(337.dp,50.dp),Property1.Instagram)
            Contacts(Modifier.size(337.dp,50.dp),Property1.Twitter)
            Contacts(Modifier.size(337.dp,50.dp),Property1.Tiktok)
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioEmail(navController)
    }
}