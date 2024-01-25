package dev.bogibek.crudwithsheets.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.bogibek.crudwithsheets.data.remote.ApiClient
import dev.bogibek.crudwithsheets.model.Note
import dev.bogibek.crudwithsheets.views.NoteItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun HomeScreen() {


    var notes = remember {
        mutableStateOf<ArrayList<Note>>(ArrayList())
    }

    LaunchedEffect(true) {

    }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "NoteAppSimple",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 24.sp
                )
            )

            Spacer(modifier = Modifier.height(42.dp))


            LazyColumn {
                items(notes.value.size) { position ->
                    NoteItem(
                        modifier = Modifier.padding(10.dp),
                        note = notes.value[position],
                        onEditItem = {},
                        onDeleteItem = {}
                    )
                }
            }


        }

    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}