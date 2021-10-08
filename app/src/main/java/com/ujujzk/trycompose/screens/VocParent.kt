package com.ujujzk.trycompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun VocParent(){

    val vocRouter = rememberNavController()

    Column(
        Modifier
            .background(Color.Red)
            .fillMaxSize()
    ) {

        Text(text = "Vocabulary", Modifier.height(36.dp), color = Color.White, fontSize = 24.sp)

        NavHost(navController = vocRouter, startDestination = Screen.Pack.route, modifier = Modifier.padding(8.dp)) {
            composable(Screen.Pack.route) {
                PackScreen(router = vocRouter)
            }
            composable(Screen.Learn.route) {
                LearnScreen()
            }
            composable(Screen.EditPack.route) {
                EditPackScreen()
            }
        }

    }

}