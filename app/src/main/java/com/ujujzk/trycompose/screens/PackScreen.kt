package com.ujujzk.trycompose.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun PackScreen(router: NavController) {

    Column(
        Modifier
            .background(Color.Green)
            .fillMaxSize()
    ) {

        Text(text = "Pack screen", modifier = Modifier.padding(24.dp), fontSize = 24.sp)

        Button(
            modifier = Modifier.padding(12.dp),
            onClick = { router.navigate(Screen.Learn.route) }
        ) {
            Text("Learn")
        }

        Button(
            modifier = Modifier.padding(12.dp),
            onClick = { router.navigate(Screen.EditPack.route) }
        ) {
            Text("Edit Pack")
        }

        Button(
            modifier = Modifier.padding(12.dp),
            onClick = { }
        ) {
            Text("Open Catalog")
        }

    }

}