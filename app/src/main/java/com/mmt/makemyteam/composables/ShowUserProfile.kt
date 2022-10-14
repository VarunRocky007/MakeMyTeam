package com.mmt.makemyteam.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mmt.makemyteam.model.UserProfile

@Composable
fun ShowUserProfile(userProfile: UserProfile) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        Scaffold(topBar = {
            TopAppBar(
                title = "MakeMyTeam",
                icon = Icons.Default.AccountBox,
                onClickAction = {/* TODO */ }
            )
        }) {
            Column() {
                ShowProfileCard(userInfo = userProfile.userInfo)
                Spacer(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.1f))
                ShowMyTeamsButton(title = "MyTeams", onclickAction = {})
            }
        }
    }
}