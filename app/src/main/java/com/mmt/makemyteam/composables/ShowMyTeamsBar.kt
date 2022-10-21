package com.mmt.makemyteam.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mmt.makemyteam.model.TeamInfo
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowMyTeamsBar(teamInfoList: List<TeamInfo>, onclickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.CenterVertically)
            .height(200.dp)
    ) {
        Column(
            modifier = Modifier
                .clickable { onclickAction }
                .width(width = 250.dp)
                .wrapContentHeight(align = Alignment.Top)
                .background(Color.DarkGray)
                .padding(start = 1.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Utilities().CardHeaderText(
                    text = "MY Teams",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 4.dp, end = 2.dp),
                    fontSize = 28.sp
                )
                ShowGreenPlusIcon {
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(12.dp)
            )

            Column(
                Modifier
                    .wrapContentHeight()
                    .height(136.dp)
                    .verticalScroll(rememberScrollState())
            ) {

                teamInfoList.forEach { teamInfo ->
                    ShowTeamNameBar(teamInfo = teamInfo) {}
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(5.dp)
                    )
                }
            }
        }
    }
}