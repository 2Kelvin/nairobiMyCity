package com.example.nairobimycity.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nairobimycity.data.categoryList
import com.example.nairobimycity.ui.reusables.CategoryCard

// top app bar + list view of all category cards
@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            items(categoryList) {
                // it represents each category object from categoriesList
                CategoryCard(it)
            }
        }
    }
}

// homepage
@Preview(showBackground = true)
@Composable
fun HomepagePreview() {
    HomePage()
}