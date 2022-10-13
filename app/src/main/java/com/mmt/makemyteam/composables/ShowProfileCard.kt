package com.mmt.makemyteam.composables

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.mmt.makemyteam.R
import com.mmt.makemyteam.model.UserInfo

@Composable
fun ShowProfileCard(userInfo: UserInfo) {
    Card(Modifier.fillMaxWidth(.9f).padding(2.dp)) {
        Row {
            if (!userInfo.profilePicture.isNullOrEmpty())
                Image(
                    painter = rememberAsyncImagePainter(model = userInfo.profilePicture),
                    contentDescription = "User Profile Pic"
                )
            else
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Stock image"
                )
            Spacer(modifier = Modifier.width(2.dp))
            Column {
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
                    Text(text = userInfo.userDesignation,
                    modifier = Modifier.padding(2.dp),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Light,
                    fontSize = 10.sp
                    )
                }
            }
        }
    }
}