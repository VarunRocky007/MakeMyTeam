package com.mmt.makemyteam.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowMyTeamsBar(title: String, onclickAction: () -> Unit) {
    Row() {
        Column(
            modifier = Modifier
                .background(Color.DarkGray)
                .clickable { onclickAction }
                .fillMaxWidth(0.4f)
                .wrapContentHeight()
                .padding(start = 1.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Utilities().CardHeaderText(
                    text = title,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 4.dp, end = 2.dp)
                )
                ShowGreenPlusIcon {
                }
            }
        }
    }
}