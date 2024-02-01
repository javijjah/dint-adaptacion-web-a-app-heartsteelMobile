package com.hachatml.hearsteelmobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.hachatml.hearsteelmobile.navhost.Routes

@Composable
fun NavbarMioDefault(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon1), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}
@Composable
fun NavbarMioHome(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon4), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon1), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}@Composable
fun NavbarMioUser(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon3), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon1), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}@Composable
fun NavbarMioMusic(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon2), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon1), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}@Composable
fun NavbarMioCart(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon1), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon1), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}@Composable
fun NavbarMioEmail(navController: NavController){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(color = Color(0xFF2D2424), shape = RoundedCornerShape(size = 25.dp)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(painter = painterResource(id = R.drawable.navbar_home_icon), contentDescription = "Home logo",modifier = Modifier.clickable {navController.navigate(Routes.SplashScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_user_icon), contentDescription = "User logo",modifier = Modifier.clickable {navController.navigate(Routes.MeetTheBoysScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_music_icon), contentDescription = "Music logo",modifier = Modifier.clickable {navController.navigate(Routes.MusicScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_cart_icon), contentDescription = "Cart logo",modifier = Modifier.clickable {navController.navigate(Routes.MerchScreen.route)})
        Image(painter = painterResource(id = R.drawable.navbar_email_icon), contentDescription = "Email logo",modifier = Modifier.clickable {navController.navigate(Routes.ContactScreen.route)})
    }
}