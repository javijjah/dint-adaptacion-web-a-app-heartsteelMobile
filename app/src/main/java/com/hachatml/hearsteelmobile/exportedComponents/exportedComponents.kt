package com.hachatml.hearsteelmobile.exportedComponents

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.relay.compose.RelayText
import com.hachatml.hearsteelmobile.meettitle.jomhuria
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
        fontSize = 70.0.sp,
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
