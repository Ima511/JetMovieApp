package com.example.jetmovieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetmovieapp.screens.details.DetailsScreen
import com.example.jetmovieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
            startDestination = MovieScreens.HomeScreen.name){

        composable(MovieScreens.HomeScreen.name){
            // Here we pass where should lead us to
             HomeScreen(navController = navController)
        }

        composable(MovieScreens.DetailsScreen.name){
            DetailsScreen(navController = navController)
        }
    }
}
