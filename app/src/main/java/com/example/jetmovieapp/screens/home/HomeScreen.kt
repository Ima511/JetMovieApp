package com.example.jetmovieapp.screens.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetmovieapp.MovieRow
import com.example.jetmovieapp.navigation.MovieScreens

@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Magenta,
            elevation = 5.dp) {
            Text(text = "Movies")
        }
    }){
        MainContent(navController = navController)
    }
}


@Composable
fun MainContent(
    navController: NavController,
    movieList: List<String> = listOf("Avataar",
    "300",
    "Harry Porter",
    "Life",
    "Happiness...",
    "Cross the Line...",
    "Happy Feet...",
    "DDLJ...",
    "3-Idiots..",
    "Pyaar ki ye ek Kahani...",
    "Himalayan...",
    "Lecturar...",
    "Hustle Breaker..."
)){
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn{
            items(items = movieList){
                MovieRow(movie = it){movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name)
//                    Log.d("TAG", "MainContent: $movie")

                }
            }
        }
    }
}