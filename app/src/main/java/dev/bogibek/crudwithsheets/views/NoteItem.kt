package dev.bogibek.crudwithsheets.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.bogibek.crudwithsheets.model.Note

@Composable
fun NoteItem(
    modifier:Modifier=Modifier,
    note: Note, onEditItem: (String) -> Unit, onDeleteItem: (String) -> Unit
) {

    val context = LocalContext.current

    Card(
        modifier = modifier
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = note.title,
                    style = TextStyle(
                        fontSize = 20.sp,
                    )
                )

                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "",
                    modifier = Modifier.clickable {
                        onEditItem(note.id)
                    },
                    tint = Color.Blue
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "",
                    modifier = Modifier.clickable {
                        onDeleteItem(note.id)
                    },
                    tint = Color.Red
                )
            }

            Text(
                text = note.description, style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            )
        }

    }

}


@Preview
@Composable
fun Preview() {
    NoteItem(
        note = Note("1", "Title", "Desc skdfhkjdshjfhds"), onEditItem = {}
    ) {}
}


