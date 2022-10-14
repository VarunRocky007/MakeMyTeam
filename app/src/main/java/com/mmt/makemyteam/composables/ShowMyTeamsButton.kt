package com.mmt.makemyteam.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowMyTeamsButton(title: String, onclickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .clickable { onclickAction }
            .fillMaxWidth(0.4f)
            .padding(2.dp)
            .wrapContentHeight(align = Alignment.Top),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = MaterialTheme.colors.background,
    ) {
        Utilities().CardHeaderText(text = title, textAlign = TextAlign.Center)
    }
}