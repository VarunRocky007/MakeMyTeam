package com.mmt.makemyteam.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mmt.makemyteam.model.MatchInfo
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowMatchBar(matchInfo: MatchInfo, onClickAction: () -> Unit) {
    Row() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
                .shadow(shape = RoundedCornerShape(2.dp), elevation = 1.dp)
                .background(Color.DarkGray)
                .clickable { onClickAction },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Spacer(modifier = Modifier.width(2.dp))
                Utilities().CardHeaderText(
                    text = "Match ${matchInfo.matchId}",
                    textAlign = TextAlign.Center,
                    fontSize = 28.sp,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .padding(
                            start = 4.dp,
                            end = 2.dp
                        )
                )
            }
        }
    }
}