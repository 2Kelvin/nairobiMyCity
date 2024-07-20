package com.example.nairobimycity.ui.reusables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nairobimycity.data.CategoryObject
import com.example.nairobimycity.data.RecommendationObject
import com.example.nairobimycity.data.categoryList
import com.example.nairobimycity.data.recommendationList

// category card
@Composable
fun CategoryCard(objectParam: CategoryObject, modifier: Modifier = Modifier) {
    ElevatedCard(
        onClick = { /*TODO*/ },
        modifier = modifier
            .height(60.dp)
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = objectParam.imageResID),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(90.dp)
                    .padding(end = 15.dp)
                    .fillMaxSize()
            )
            Text(
                text = stringResource(id = objectParam.text),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}

// recommendation card
@Composable
fun RecommendationCard(objectParam: RecommendationObject, modifier: Modifier = Modifier) {
    ElevatedCard(
        onClick = { /*TODO*/ },
        modifier = modifier
            .height(60.dp)
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = objectParam.imageResID),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(90.dp)
                    .padding(end = 15.dp)
                    .fillMaxSize()
            )
            Text(
                text = stringResource(id = objectParam.text),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}


// top app bar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Nairobi My City",
                maxLines = 1, // don't go over one line
                overflow = TextOverflow.Ellipsis
            )
        }
        // navigationIcon param -> render conditionally
        // has back button except homepage
    )
}

/* Previews */
// category card
@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard(categoryList[0])
}
// Recommendation card
@Preview(showBackground = true)
@Composable
fun RecommendationPreview() {
    RecommendationCard(recommendationList[0])
}