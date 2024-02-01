package com.hachatml.hearsteelmobile.navhost

sealed class Routes(val route:String) {
    object WelcomeScreen : Routes("welcome")
    object SplashScreen : Routes("splash")
    object MeetTheBoysScreen : Routes("meet")
    object MusicScreen : Routes("music")
    object MerchScreen : Routes("merch")
    object ContactScreen : Routes("contact")
    object Ksante : Routes("ksante")
    object Kayn : Routes("kayn")
    object Yone : Routes("yone")
    object Sett : Routes("sett")
    object Ezreal : Routes("ezreal")
    object Aphelios : Routes("aphelios")
}