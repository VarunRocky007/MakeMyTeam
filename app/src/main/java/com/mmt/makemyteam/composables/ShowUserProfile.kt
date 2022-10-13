package com.mmt.makemyteam.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mmt.makemyteam.model.UserProfile

@Composable
fun ShowUserProfile(userProfile: UserProfile) {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top
    ) {
        ShowProfileCard(userInfo = userProfile.userInfo)
    }
}