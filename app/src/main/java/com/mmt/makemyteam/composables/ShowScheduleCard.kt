package com.mmt.makemyteam.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
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
import com.mmt.makemyteam.model.MatchInfo
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowScheduleCard(matchInfoList: List<MatchInfo>, onclickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentHeight(),
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
                .shadow(shape = RoundedCornerShape(2.dp), elevation = 1.dp)
                .background(MaterialTheme.colors.background),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Utilities().CardHeaderText(
                    text = "My Matches",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 4.dp, end = 2.dp)
                        .clickable { onclickAction },
                    fontSize = 28.sp,
                    color = MaterialTheme.colors.onBackground
                )
                ShowGreenPlusIcon {
                    onclickAction
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                Modifier
                    .fillMaxHeight()
                    .wrapContentHeight()
                    .verticalScroll(rememberScrollState())
            ) {

                matchInfoList.forEach { matchInfo ->
                    ShowMatchBar(matchInfo = matchInfo) {}
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(3.dp)
                    )
                }
            }
        }
    }
}
