package com.example.assignmentorufy.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.assignmentorufy.ui.theme.history.HistoryScreen
import com.example.assignmentorufy.ui.theme.home.HomeScreen
import com.example.assignmentorufy.ui.theme.webview.WebViewScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object WebView : Screen("webview/{url}")
    object History : Screen("history")
}
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(Screen.Home.route) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.WebView.route,
            arguments = listOf(
                navArgument("url") { type = NavType.StringType }
            )
        ) {
            WebViewScreen(navController)
        }

        composable(Screen.History.route) {
            HistoryScreen(navController)
        }
    }
}
