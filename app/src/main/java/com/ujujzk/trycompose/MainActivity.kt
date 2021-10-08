package com.ujujzk.trycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ujujzk.trycompose.screens.DicParent
import com.ujujzk.trycompose.screens.Screen
import com.ujujzk.trycompose.screens.VocParent
import com.ujujzk.trycompose.ui.theme.TryComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            val navController = rememberNavController()

            TryComposeTheme {
                Scaffold(
                    bottomBar = {
                        NavBar(navController = navController, routes = listOf(Screen.DicParent, Screen.VocParent))
                    },
                    backgroundColor = Color.Blue
                ) {

                    Column(
                        modifier = Modifier
                            .padding(2.dp)
                            .background(Color.LightGray)
                    ) {

                        Text(text = "Main", Modifier.height(36.dp), fontSize = 24.sp)

                        NavHost(
                            navController = navController,
                            startDestination = Screen.DicParent.route,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            composable(Screen.DicParent.route) { DicParent() }
                            composable(Screen.VocParent.route) { VocParent() }
                        }
                    }
                }

            }
        }
    }
}

