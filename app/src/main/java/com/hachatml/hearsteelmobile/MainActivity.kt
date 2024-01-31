package com.hachatml.hearsteelmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hachatml.hearsteelmobile.screens.ApheliosMeetScreen
import com.hachatml.hearsteelmobile.screens.EzrealMeetScreen
import com.hachatml.hearsteelmobile.screens.KaynMeetScreen
import com.hachatml.hearsteelmobile.screens.KsanteMeetScreen
import com.hachatml.hearsteelmobile.screens.MeetTheBoysScreen
import com.hachatml.hearsteelmobile.screens.MusicScreen
import com.hachatml.hearsteelmobile.screens.SettMeetScreen
import com.hachatml.hearsteelmobile.screens.SplashScreen
import com.hachatml.hearsteelmobile.screens.WelcomeScreen
import com.hachatml.hearsteelmobile.screens.YoneMeetScreen
import com.hachatml.hearsteelmobile.ui.theme.HearsteelMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HearsteelMobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MeetTheBoysScreen()
                }
            }
        }
    }
}
