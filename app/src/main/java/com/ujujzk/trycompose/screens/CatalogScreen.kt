package com.ujujzk.trycompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CatalogScreen(){

    Column(
        Modifier
            .background(Color.Cyan)
            .fillMaxSize()
    ) {

        Text(text = "Catalog", modifier = Modifier.padding(24.dp), fontSize = 24.sp)

    }

}