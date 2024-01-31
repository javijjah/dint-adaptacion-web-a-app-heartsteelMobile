package com.hachatml.hearsteelmobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hachatml.hearsteelmobile.exportedComponents.MeetTextMio
import com.hachatml.hearsteelmobile.exportedComponents.Meetboysmio
import com.hachatml.hearsteelmobile.exportedComponents.Subtitle
import com.hachatml.hearsteelmobile.meetbuttons.MeetButtons
import com.hachatml.hearsteelmobile.meetbuttons.Property1
import com.hachatml.hearsteelmobile.meetdescription.MeetDescription
import com.hachatml.hearsteelmobile.meetdescription.TheSensibleOne
import com.hachatml.hearsteelmobile.meettheboys.Meetboys
import com.hachatml.hearsteelmobile.meettheboys.Meettheboys
import com.hachatml.hearsteelmobile.meettitle.KSante

@Preview(device = Devices.PIXEL_3)
@Composable
fun MeetTheBoysScreen(){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Ezreal)
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Aphelios)
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Sett)
        }
        Column{
            Meetboysmio()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Kayn)
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Ksante)
            MeetButtons(modifier = Modifier.size(125.dp,152.dp), property1 = Property1.Yone)
        }
    }

}
