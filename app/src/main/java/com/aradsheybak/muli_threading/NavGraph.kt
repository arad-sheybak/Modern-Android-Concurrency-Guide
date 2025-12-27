package com.aradsheybak.muli_threading

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aradsheybak.muli_threading.screens.CoroutineScreen
import com.aradsheybak.muli_threading.screens.FlowScreen
import com.aradsheybak.muli_threading.screens.MainScreen
import com.aradsheybak.muli_threading.screens.ThreadingScreen

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Screen.main.route,
        modifier = modifier
    ) {
        composable(Screen.main.route) {
            MainScreen(navController = navController)
        }

        composable (Screen.threading.route){
            ThreadingScreen(navController = navController)
        }
        composable(Screen.coroutine.route) {
            CoroutineScreen(navController = navController)
        }

        composable (Screen.flow.route){
            FlowScreen(navController = navController)
        }
    }
}