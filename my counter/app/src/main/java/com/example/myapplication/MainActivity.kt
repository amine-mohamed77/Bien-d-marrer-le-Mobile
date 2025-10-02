package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.MainScreen
import com.example.myapplication.ui.theme.HelloCounterTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCounterTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun App() {
    MaterialTheme {
        MainScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    App()
}