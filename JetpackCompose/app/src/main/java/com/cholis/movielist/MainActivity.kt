package com.cholis.movielist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.cholis.movielist.model.DataMovie
import com.cholis.movielist.ui.about.AboutScreen
import com.cholis.movielist.ui.detail.MovieDetail
import com.cholis.movielist.ui.listmovie.MovieList
import com.cholis.movielist.ui.theme.MovieListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieListTheme {
                Surface(
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MovieApp()
                }
            }
        }
    }
}

@Composable
fun MovieApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "movieList") {
        composable("movieList") {
            MovieList(
                onMovieClick = {
                    navController.navigate("movieDetail/${it.id}")
                },
                onAboutClick = {
                    navController.navigate("about")
                }
            )
        }
        composable(
            "movieDetail/{movieId}",
            arguments = listOf(navArgument("movieId") { type = NavType.IntType })
        ) { backStackEntry ->
            val movieId = backStackEntry.arguments?.getInt("movieId") ?: 0
            val selectedMovie = DataMovie.dummyMovie.find { it.id == movieId }

            if (selectedMovie != null) {
                MovieDetail(movie = selectedMovie, onBackPress = { navController.popBackStack() })
            } else {
                navController.popBackStack()
            }
        }
        composable("about") {
            AboutScreen(onBackPress = { navController.popBackStack() })
        }
    }
}

