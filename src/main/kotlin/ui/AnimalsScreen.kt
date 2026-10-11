package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import domain.enums.AnimalSex
import domain.enums.AnimalStatus


@Composable
fun AnimalsScreen() {

    var showRegistrationForm by remember { mutableStateOf(false) }

    var searchInput by remember { mutableStateOf("") }

    val animal = listOf(
        AnimalRow("1", "fox", sex = AnimalSex.MALE, condition = AnimalStatus.SICK, "Pills", "Medication"),
        AnimalRow("2", "fox", sex = AnimalSex.FEMALE, condition = AnimalStatus.SICK, "Pills", "Medication"),
    )


    if (showRegistrationForm) {

        Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text("Registration", color = Color.Black, style = MaterialTheme.typography.headlineMedium)

                Button(
                    onClick = { showRegistrationForm = false }
                ) {
                    Text("Return")
                }
            }


        }

    } else {
        Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text("Registration", color = Color.Black, style = MaterialTheme.typography.headlineMedium)

                Button(
                    onClick = { showRegistrationForm = true }
                ) {
                    Text("Show RegistrationForm")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = searchInput,
                onValueChange = { searchInput = it },
                label = { Text(text = "Reference") },
                placeholder = { "e.g. 1" },
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier.fillMaxWidth().padding(1.dp).background(Color.Black),
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(1.dp)
                ) {
                    TableCell(text = "Id", modifier = Modifier.weight(1f))
                    TableCell(text = "Sex", modifier = Modifier.weight(1f))
                    TableCell(text = "Species", modifier = Modifier.weight(1f))
                    TableCell(text = "Conditions", modifier = Modifier.weight(1f))
                    TableCell(text = "Required Care", modifier = Modifier.weight(1f))
                    TableCell(text = "Assessment", modifier = Modifier.weight(1f))
                }


                animal.forEach { animal ->
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(1.dp)) {
                        TableCell(text = animal.id, modifier = Modifier.weight(1f))
                        TableCell(text = animal.species, modifier = Modifier.weight(1f))
                        TableCell(text = animal.sex.toString(), modifier = Modifier.weight(1f))
                        TableCell(text = animal.condition.toString(), modifier = Modifier.weight(1f))
                        TableCell(text = animal.requiredCare, modifier = Modifier.weight(1f))
                        TableCell(text = animal.assessment, modifier = Modifier.weight(1f))
                    }
                }

            }
        }
    }
}

@Composable
fun TableCell(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.height(50.dp).background(Color.White).padding(12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = Color.Black)
    }
}