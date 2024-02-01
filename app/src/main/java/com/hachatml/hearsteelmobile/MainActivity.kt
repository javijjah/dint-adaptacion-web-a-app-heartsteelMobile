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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hachatml.hearsteelmobile.navhost.Routes
import com.hachatml.hearsteelmobile.screens.ApheliosMeetScreen
import com.hachatml.hearsteelmobile.screens.ContactScreen
import com.hachatml.hearsteelmobile.screens.EzrealMeetScreen
import com.hachatml.hearsteelmobile.screens.KaynMeetScreen
import com.hachatml.hearsteelmobile.screens.KsanteMeetScreen
import com.hachatml.hearsteelmobile.screens.MeetTheBoysScreen
import com.hachatml.hearsteelmobile.screens.MerchScreen
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
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Routes.WelcomeScreen.route
                    ) {
                        composable(Routes.WelcomeScreen.route) { WelcomeScreen(navController) }
                        composable(Routes.SplashScreen.route) { SplashScreen(navController) }
                        composable(Routes.MeetTheBoysScreen.route) { MeetTheBoysScreen(navController) }
                        composable(Routes.MusicScreen.route) { MusicScreen(navController) }
                        composable(Routes.MerchScreen.route) { MerchScreen(navController) }
                        composable(Routes.ContactScreen.route) { ContactScreen(navController) }
                        composable(Routes.Ksante.route) { KsanteMeetScreen(navController) }
                        composable(Routes.Kayn.route) { KaynMeetScreen(navController) }
                        composable(Routes.Yone.route) { YoneMeetScreen(navController) }
                        composable(Routes.Sett.route) { SettMeetScreen(navController) }
                        composable(Routes.Ezreal.route) { EzrealMeetScreen(navController) }
                        composable(Routes.Aphelios.route) { ApheliosMeetScreen(navController) }
                    }
                }
            }
        }
    }
}
