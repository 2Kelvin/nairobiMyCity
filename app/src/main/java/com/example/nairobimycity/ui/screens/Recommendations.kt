package com.example.nairobimycity.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nairobimycity.data.recommendationList
import com.example.nairobimycity.ui.reusables.RecommendationCard

@Composable
fun RecommendationsPage(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        LazyColumn {
            items(recommendationList) {
                // it represents each recommendation object from recommendationsList
                RecommendationCard(objectParam = it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationsPagePreview() {
    RecommendationsPage()
}