package com.ujujzk.trycompose

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.ujujzk.trycompose.screens.Screen


@Composable
fun NavBar(routes: List<Screen>, navController: NavController){
    BottomNavigation {
        routes.onEach {
            BottomNavigationItem(
                selected = navController.currentBackStackEntry?.destination?.route == it.route,
                onClick = {

                    if (navController.currentBackStackEntry?.destination?.route != it.route) {

                        navController.navigate(it.route){

                            // Pop up to the start destination of the graph to
                            // avoid building up a large stack of destinations
                            // on the back stack as users select items
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            // Avoid multiple copies of the same destination when
                            // reselecting the same item
                            launchSingleTop = true
                            // Restore state when reselecting a previously selected item
                            restoreState = true
                        }
                    }
                },
                icon = {
                    Text(text = it.title)
                }
            )
        }
    }
}
