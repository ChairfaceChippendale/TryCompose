package com.ujujzk.trycompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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


@Composable
fun DicParent() {

    val dicRouter = rememberNavController()

    Column(Modifier.background(color = Color.Blue)) {

        Text(text = "Dictionary", Modifier.height(36.dp), color = Color.White, fontSize = 24.sp)

        NavHost(
            navController = dicRouter,
            startDestination = Screen.Translate.route,
            modifier = Modifier.padding(8.dp)
        ) {
            composable(Screen.Translate.route) { TranslateScreen(router = dicRouter) }
            composable(Screen.Catalog.route) { CatalogScreen() }
        }

    }

}