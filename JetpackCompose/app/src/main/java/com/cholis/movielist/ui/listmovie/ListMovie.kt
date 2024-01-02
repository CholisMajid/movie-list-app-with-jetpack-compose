package com.cholis.movielist.ui.listmovie

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cholis.movielist.model.DataMovie
import com.cholis.movielist.model.Movie

@Composable
fun SearchView(searchText: String, onSearchTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = searchText,
        onValueChange = { onSearchTextChanged(it) },
        label = { Text("Search") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Composable
fun MovieItem(movie: Movie, onMovieClick: (Movie) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onMovieClick(movie) }
    ) {
        Image(
            painter = painterResource(id = movie.foto),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = movie.judul,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = movie.genre,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Gray
        )
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieList(onMovieClick: (Movie) -> Unit, onAboutClick: () -> Unit) {
    val scaffoldState = rememberScaffoldState()
    var searchText by remember { mutableStateOf("") }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Movie List",
                        style = MaterialTheme.typography.h5.copy(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 24.sp
                        )
                    )
                },
                backgroundColor = Color.White,
                actions = {
                    IconButton(onClick = { onAboutClick() }) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "about_page")
                    }
                }
            )

        }
    ) {
        LazyColumn {
            item {
                SearchView(
                    searchText = searchText,
                    onSearchTextChanged = { searchText = it }
                )
            }

            items(
                items = DataMovie.dummyMovie.filter {
                    it.judul.contains(searchText, ignoreCase = true) ||
                            it.genre.contains(searchText, ignoreCase = true)
                },
                key = { it.id }
            ) { movie ->
                MovieItem(movie = movie) {
                    onMovieClick(it)
                }
            }
        }
    }
}
