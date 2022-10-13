package com.mmt.makemyteam.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mmt.makemyteam.R
import com.mmt.makemyteam.model.UserInfo

@Composable
fun ShowProfileCard(userInfo: UserInfo) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .wrapContentHeight(align = Alignment.Top),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = Color.DarkGray,

        ) {
        Row {

            Card(
                shape = CircleShape,
                modifier = Modifier.size(65.dp),
                backgroundColor = Color.Gray,
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.DarkGray,
                )
            ) {
                val customPainter = if (!userInfo.profilePicture.isNullOrEmpty()) {
                    rememberAsyncImagePainter(model = userInfo.profilePicture)
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
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = userInfo.userFirstName + " " + userInfo.userLastName,
                    modifier = Modifier.padding(2.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    text = userInfo.userContactNumber.toString(),
                    modifier = Modifier.padding(2.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp
                )
                if (!userInfo.userDesignation.isNullOrEmpty()) {
                    Text(
                        text = userInfo.userDesignation,
                        modifier = Modifier.padding(2.dp),
                        color = Color.White,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Light,
                        fontSize = 10.sp
                    )
                }
            }

            Card(
                shape = CircleShape,
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.CenterVertically),
                backgroundColor = Color.Gray,
                border = BorderStroke(
                    width = 0.5.dp,
                    color = Color.DarkGray,
                )
            ) {
                val customPainterResource = if (false) {
                    painterResource(id = R.drawable.ic_green_tick)
                } else {
                    painterResource(id = R.drawable.ic_red_cross)
                }
                Image(
                    painter =
                    customPainterResource,
                    contentDescription = "Player accepted/reject request",
                    modifier = Modifier
                        .size(40.dp)
                        .fillMaxSize()
                        .clickable { /* TODO */ },
                    alignment = Alignment.Center,
                )
            }
        }
    }
}