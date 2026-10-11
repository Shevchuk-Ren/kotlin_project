package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun App() {
    var selectedTab by remember {
        mutableIntStateOf(0)
    }
    MaterialTheme {

        Column(
            modifier = Modifier.fillMaxSize().background(color = Color(0xFFFFFFFF))
        ) {
            Text(
                text = "Wildlife Management System",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                textAlign = TextAlign.Center
            )
            PrimaryTabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color(0xFFFFFFFF),
                contentColor = Color(0xFF986B42),
                modifier = Modifier.padding(horizontal = 12.dp),
                divider = {},
                indicator = {}) {

                listOf("Rescue Cases", "Animals").forEachIndexed { index, title ->
                    val isSelected = selectedTab == index

                    val tabColor = if (isSelected) Color(0xFF2E7D55) else Color(0xFFDEEBDD)

                    Tab(
                        selected = isSelected,
                        onClick = { selectedTab = index },
                        modifier = Modifier.padding(horizontal = 4.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(color = tabColor)
                            .border(width = 2.dp, color = Color(237, 234, 232), shape = RoundedCornerShape(12.dp)),
                        text = {
                            Text(
                                text = title,
                                color = Color(0xFFFFFFFF)
                            )
                        }
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxSize().padding(24.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                when (selectedTab) {
                    0 -> CaseScreen()
                    1 -> AnimalsScreen()
                }

            }

        }
    }

}