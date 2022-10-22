package com.mmt.makemyteam.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mmt.makemyteam.R
import com.mmt.makemyteam.model.TeamInfo
import com.mmt.makemyteam.ui.theme.Utilities

@Composable
fun ShowTeamNameBar(teamInfo: TeamInfo, onclickAction: () -> Unit) {
    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
                .shadow(shape = RoundedCornerShape(2.dp), elevation = 1.dp)
                .background(Color.DarkGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Card(
                    shape = CircleShape,
                    modifier = Modifier.size(65.dp),
                    backgroundColor = Color.Gray,
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color.DarkGray,
                    )
                ) {
                    val customPainter = if (!teamInfo.teamProfilePicture.isNullOrEmpty()) {
                        rememberAsyncImagePainter(model = teamInfo.teamProfilePicture)
                    } else {
                        painterResource(id = R.drawable.ic_caption_dhoni)
                    }
                    Image(
                        painter = customPainter,
                        contentDescription = "User Profile Pic",
                        modifier = Modifier
                            .size(50.dp)
                            .fillMaxSize()
                            .fillMaxHeight(),
                        alignment = Alignment.CenterStart,
                    )
                }
                Spacer(modifier = Modifier.width(2.dp))
                Utilities().CardHeaderText(
                    text = teamInfo.teamName.take(20).uppercase(),
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .padding(
                            start = 4.dp,
                            end = 2.dp
                        )
                        .clickable { onclickAction }
                )
            }
        }
    }
}