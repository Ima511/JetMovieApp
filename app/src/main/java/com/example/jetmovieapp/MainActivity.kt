package com.example.jetmovieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetmovieapp.ui.theme.JetMovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MyApp {
                    MainContent()
                }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){
    JetMovieAppTheme {
        Scaffold(topBar = {
            TopAppBar(backgroundColor = Color.Magenta,
                elevation = 5.dp) {
                Text(text = "Movies")
            }
        }){
                content()
        }
    }
}

@Composable
fun MainContent(){
    Surface(color = MaterialTheme.colors.background) {
        Text(text = "Hello")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        MyApp {
            MainContent()
        }
}