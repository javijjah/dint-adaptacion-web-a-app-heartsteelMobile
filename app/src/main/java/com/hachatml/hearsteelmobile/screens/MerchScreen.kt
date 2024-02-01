package com.hachatml.hearsteelmobile.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.relay.compose.RelayColumn
import com.google.relay.compose.RelayContainer
import com.hachatml.hearsteelmobile.NavbarMioCart
import com.hachatml.hearsteelmobile.NavbarMioUser
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.exportedComponents.Meetboysmio
import com.hachatml.hearsteelmobile.exportedComponents.MerchTextMio
import com.hachatml.hearsteelmobile.meetbuttons.MeetButtons
import com.hachatml.hearsteelmobile.meetbuttons.Property1
import com.hachatml.hearsteelmobile.merchitem.MerchItem
import com.hachatml.hearsteelmobile.merchitem.ShopItem
import com.hachatml.hearsteelmobile.merchtext.MERCH
import com.hachatml.hearsteelmobile.merchtext.MerchText


@Composable
fun MerchScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.hssplashart),
                alignment = Alignment.Center,
                contentScale = ContentScale.FillHeight,
                alpha = 0.3f
            )
            .padding(0.dp, 0.dp, 0.dp, 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center
        ) {
            MerchText(modifier = Modifier.size(344.dp, 178.dp))
        }
        RelayColumn(
            modifier = Modifier.size(500.dp, 700.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var uriHandler = LocalUriHandler.current
            MerchItem(
                modifier = Modifier
                    .size(153.dp, 155.dp)
                    .clickable { uriHandler.openUri("https://merch.riotgames.com/en-us/product/heartsteel-sett-beanie/") })
            MerchItem(modifier = Modifier.size(153.dp, 155.dp).clickable { uriHandler.openUri("https://merch.riotgames.com/en-sg/product/heartsteel-earrings/") }, shopItem = ShopItem.Earrings)
            MerchItem(modifier = Modifier.size(153.dp, 155.dp).clickable { uriHandler.openUri("https://merch.riotgames.com/en-sg/product/heartsteel-necklace/") }, shopItem = ShopItem.Necklace)
        }
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavbarMioCart(navController)
    }
}