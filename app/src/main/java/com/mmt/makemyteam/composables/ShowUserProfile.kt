package com.mmt.makemyteam.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mmt.makemyteam.model.PlayerProfile

@Composable
fun ShowUserProfile(playerProfile: PlayerProfile) {
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
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                ShowProfileCard(userInfo = playerProfile.userInfo)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.022f)
                )
                ShowMyTeamsBar(title = "My Teams", onclickAction = {})
            }
        }
    }
}