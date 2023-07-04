package com.example.splashscreenanimation

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashscreenanimation.ui.theme.SplashScreenAnimationTheme
import com.example.splashscreenanimation.ui.view.Home
import com.example.splashscreenanimation.ui.view.SplashScreenAnimate


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenAnimationTheme {
                NavigatePage()
            }
        }
    }
}


@Preview(showBackground = true, device = "id:Nexus One")
@Composable
fun NavigatePage() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "splash") {
        composable("splash") { SplashScreenAnimate(navHostController) }
        composable("home") { Home() }
    }

}