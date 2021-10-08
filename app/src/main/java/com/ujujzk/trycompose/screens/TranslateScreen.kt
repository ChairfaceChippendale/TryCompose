package com.ujujzk.trycompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun TranslateScreen(router: NavController){
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
    ) {
        Text(text = "Translate", modifier = Modifier.padding(12.dp), fontSize = 24.sp)
        LazyColumn {
            item { Text(text = "List screen 1", modifier = Modifier
                .padding(24.dp)
                .background(Color.Magenta)
                .clickable { router.navigate(Screen.Catalog.route) }) }
            item { Text(text = "List screen 2", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen 3", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen 4", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
            item { Text(text = "List screen", modifier = Modifier
                .padding(24.dp)
                .background(Color.Magenta)
                .clickable { router.navigate(Screen.Catalog.route) }) }
            item { Text(text = "List screen", modifier = Modifier.padding(24.dp)) }
        }
    }
}