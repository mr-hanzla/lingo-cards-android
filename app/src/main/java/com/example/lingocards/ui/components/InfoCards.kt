package com.example.lingocards.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lingocards.ui.screens.HomeScreen
import com.example.lingocards.ui.theme.LingoCardsTheme
import com.example.lingocards.data.CardData

@Composable
fun InfoCards(
    cards: List<CardData>,
    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val cardWidth = screenWidth * 0.8f // 80% of screen width

    LazyRow(
        modifier = modifier.fillMaxWidth().padding(start = 8.dp, bottom = 8.dp)
    ) {
        items(cards) { card ->
            Card(
                modifier = Modifier
                    .padding(end = 8.dp)
                    .width(cardWidth)
                    .fillMaxHeight(),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp), // Add padding inside the card
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Top Section: English Sentence
                    Text(
                        text = card.englishSentence,
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                        color = MaterialTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(12.dp)) // Add spacing before the divider

                    // Horizontal Line Separator
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp), // Add more horizontal padding
                        thickness = 2.dp, // Slightly thicker divider
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f) // Semi-transparent line
                    )

                    Spacer(modifier = Modifier.height(12.dp)) // Add spacing after the divider

                    // Bottom Section: Finnish Translation
                    Text(
                        text = card.finnishTranslation,
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                        color = MaterialTheme.colorScheme.onSurface,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

//@Composable
//fun InfoCards(
//    cards: List<CardData>,
//    modifier: Modifier = Modifier
//) {
//    val configuration = LocalConfiguration.current
//    val screenWidth = configuration.screenWidthDp.dp
//    val cardWidth = screenWidth * 0.8f // 80% of screen width
//
//    LazyRow(
//        modifier = modifier.fillMaxWidth()
//    ) {
//        items(cards) { card ->
//            Card(
//                modifier = Modifier
//                    .padding(end = 8.dp)
//                    .width(cardWidth)
//                    .fillMaxHeight(),
//                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
//                shape = RoundedCornerShape(16.dp)
//            ) {
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    // Top Section: English Sentence
//                    Text(
//                        text = card.englishSentence,
//                        style = MaterialTheme.typography.headlineSmall,
//                        color = MaterialTheme.colorScheme.onSurface,
//                        textAlign = TextAlign.Center
//                    )
//
//                    Spacer(modifier = Modifier.height(8.dp)) // Add spacing before the divider
//
//                    // Horizontal Line Separator
//                    HorizontalDivider(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(horizontal = 16.dp), // Add horizontal padding
//                        thickness = 1.dp,
//                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f) // Semi-transparent line
//                    )
//
//                    Spacer(modifier = Modifier.height(8.dp)) // Add spacing after the divider
//
//                    // Bottom Section: Finnish Translation
//                    Text(
//                        text = card.finnishTranslation,
//                        style = MaterialTheme.typography.headlineSmall,
//                        color = MaterialTheme.colorScheme.onSurface,
//                        textAlign = TextAlign.Center
//                    )
//                }
//            }
//        }
//    }
//}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LingoCardsTheme {
//        InfoCards()
    }
}
