package com.hachatml.hearsteelmobile.exportedComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.google.relay.compose.BoxScopeInstance.columnWeight
import com.google.relay.compose.BoxScopeInstance.rowWeight
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable
import com.hachatml.hearsteelmobile.R
import com.hachatml.hearsteelmobile.chevronbottomnormal.Union1
import com.hachatml.hearsteelmobile.meettitle.jomhuria
import com.hachatml.hearsteelmobile.merchtext.LootBag
import com.hachatml.hearsteelmobile.merchtext.MERCH
import com.hachatml.hearsteelmobile.merchtext.Orb
import com.hachatml.hearsteelmobile.merchtext.TopLevel
import com.hachatml.hearsteelmobile.navhost.Routes
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

@Composable
fun MeetTextMio(
    title: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = title,
        fontSize = 200.0.sp,
        fontFamily = jomhuria,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        textAlign = TextAlign.Center,
        maxLines = -1,
        shadow = Shadow(
            color = Color(
                alpha = 255,
                red = 0,
                green = 0,
                blue = 0
            ),
            offset = Offset(
                x = 0.0f,
                y = 4.0f
            ),
            blurRadius = 4.0f
        ),
        modifier = modifier
    )
}
@Composable
fun Subtitle(
    subtitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = subtitle,
        fontSize = 90.0.sp,
        fontFamily = com.hachatml.hearsteelmobile.meetdescription.jomhuria,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
    )
}
@Composable
fun PARANOIAOUTNOWMio(modifier: Modifier = Modifier) {
    RelayText(
        content = "PARANOIA OUT NOW",
        fontSize = 90.0.sp,
        fontFamily = com.hachatml.hearsteelmobile.mvouttext.jomhuria,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        maxLines = -1,
        modifier = modifier
    )
}

@Composable
fun YoutubeScreen(
    videoId: String,
    modifier: Modifier
) {
    val ctx = LocalContext.current
    AndroidView(factory = {
        var view = YouTubePlayerView(it)
        val fragment = view.addYouTubePlayerListener(
            object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    super.onReady(youTubePlayer)
                    youTubePlayer.loadVideo(videoId, 0f)
                }
            }
        )
        view
    })
}

@Composable
fun Meetboysmio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Meet the boys.",
        fontSize = 120.0.sp,
        fontFamily = com.hachatml.hearsteelmobile.meettheboys.jomhuria,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        maxLines = -1,
        modifier = Modifier
    )
}
@Preview
@Composable
fun MerchTextMio(modifier: Modifier = Modifier) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        OrbMio(Modifier.size(120.dp))
        MERCHMio()
        LootBagMio(Modifier.size(120.dp))
    }
}
@Composable
fun MERCHMio(modifier: Modifier = Modifier) {
    RelayText(
        content = "MERCH",
        fontSize = 150.0.sp,
        fontFamily = com.hachatml.hearsteelmobile.merchtext.jomhuria,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        maxLines = -1,
        shadow = Shadow(
            color = Color(
                alpha = 127,
                red = 0,
                green = 0,
                blue = 0
            ),
            offset = Offset(
                x = 0.0f,
                y = 4.0f
            ),
            blurRadius = 4.0f
        ),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        )
    )
}

@Composable
fun OrbMio(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.merch_text_orb),
        contentScale = ContentScale.Fit,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        )
    )
}

@Composable
fun LootBagMio(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.merch_text_loot_bag),
        contentScale = ContentScale.Fit,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        )
    )
}
@Composable
fun ChevronBottomNormalMio(modifier: Modifier = Modifier,navController: NavController) {
    com.hachatml.hearsteelmobile.chevronbottomnormal.TopLevel(modifier = modifier) {
        Union1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.BottomCenter,
                offset = DpOffset(
                    x = -0.33333396911621094.dp,
                    y = -57.0.dp
                )
            ).clickable {
            navController.navigate(Routes.SplashScreen.route)
            }
        )
    }
}