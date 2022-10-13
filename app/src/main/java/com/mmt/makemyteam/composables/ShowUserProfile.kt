package com.mmt.makemyteam.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.mmt.makemyteam.model.UserProfile

@Composable
fun ShowUserProfile(userProfile: UserProfile) {
    Row{
        ShowProfileCard(userInfo = userProfile.userInfo)
    }
}