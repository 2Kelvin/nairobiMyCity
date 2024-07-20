package com.example.nairobimycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nairobimycity.R

// category card (img + text)
@Composable
fun CategoryCard(cardText: String, imageID: Int, modifier: Modifier = Modifier) {
    ElevatedCard(
        onClick = { /*TODO*/ },
        modifier = modifier
            .height(60.dp)
            .fillMaxWidth()
    ) {
        Row {
            Image(
                painter = painterResource(id = imageID),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(90.dp)
                    .padding(end = 15.dp)
                    .fillMaxSize()
            )
            Text(
                text = cardText,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}

// top app bar + list view of all category cards
@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            items(5) {
                CategoryCard(
                    cardText = "Category 1",
                    imageID = R.drawable.cjs
                )
            }
        }
    }
}

/* Previews */
// One category card
@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard(
        cardText = "Category 1",
        imageID = R.drawable.cjs
    )
}

// homepage
@Preview(showBackground = true)
@Composable
fun HomepagePreview() {
    HomePage()
}