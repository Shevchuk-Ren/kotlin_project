package ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun AnimalsScreen() {

    var searchInput by remember { mutableStateOf("") }

    val animal = listOf(
        AnimalRow("1", "fox"),
        AnimalRow("2", "wolf"),
    )



    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text(text = "Animals", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = searchInput,
            onValueChange = { searchInput = it },
            label = { Text(text = "Reference") },
            placeholder = { "e.g. 1" },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(modifier = Modifier.height(8.dp))

        animal.forEach { animal ->
            Row(modifier = Modifier.fillMaxWidth()) {
                TableCell(text = animal.id, modifier = Modifier.weight(1f))
                TableCell(text = animal.species, modifier = Modifier.weight(1f))
            }
        }

    }
}

@Composable
fun TableCell(text: String, modifier: Modifier = Modifier) {
    Text(text = text, modifier = modifier.border(1.dp, Color(0xFF986B42)).padding(12.dp))
}