package com.example.nairobimycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nairobimycity.data.RecommendationObject
import com.example.nairobimycity.data.recommendationList

@Composable
fun DescriptionPage(recommendationObj: RecommendationObject,modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(recommendationObj.biggerImageResID),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = stringResource(recommendationObj.longDescription)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DescriptionPagePreview() {
    DescriptionPage(recommendationList[0])
}