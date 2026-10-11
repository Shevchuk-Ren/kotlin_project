package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun App() {
    var selectedTab by remember {
        mutableIntStateOf(0) }
    MaterialTheme {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Wildlife Management System",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                textAlign = TextAlign.Center)
            TabRow(selectedTabIndex = selectedTab) {
                Tab(selected = selectedTab == 0, onClick = { selectedTab = 0 }, text = { Text("Rescue Cases") })
                Tab(selected = selectedTab == 1, onClick = { selectedTab = 1 }, text = { Text("Animals") })
            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopStart) {
                when (selectedTab) {
                    0 -> CaseScreen()
                    1 -> AnimalsScreen()
                }

            }

        }
    }

}