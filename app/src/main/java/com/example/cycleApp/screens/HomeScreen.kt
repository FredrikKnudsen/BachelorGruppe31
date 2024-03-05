package com.example.cycleApp.screens

import BottomNavBar
import Screen
import TopNavBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cycleApp.model.HomeViewModel


class HomeScreen : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            HomeScreenLayout(navController = navController, viewModel = viewModel)
        }
    }


}

@Composable
fun HomeScreenLayout(navController: NavController, viewModel: HomeViewModel){
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
    TopNavBar(
        nameString = "Home",
        onHamburgerMenuClick = {
            navController.navigate(Screen.Home.route)
        },
        onProfilePictureClick = {
            navController.navigate(Screen.Home.route)
        }
    )

    Spacer(modifier = Modifier.weight(1f))

    BottomNavBar(
        onForYouClick = {
            navController.navigate(Screen.Home.route)
        },
        onSearchClick = {
            navController.navigate(Screen.Home.route)
        },
        onSavedClick = {
            navController.navigate(Screen.Home.route)
        },
        onSettingsClick = {
            navController.navigate(Screen.Home.route)
        }
    )
}
}