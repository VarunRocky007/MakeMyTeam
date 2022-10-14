package com.mmt.makemyteam.composables

import android.service.autofill.OnClickAction
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
 @Composable
    fun TopAppBar(title: String, icon: ImageVector, onClickAction: ()-> Unit) {
        TopAppBar(
            navigationIcon = {
                Icon(
                    imageVector = icon,
                    "Content Description",
                    modifier = Modifier
                        .padding(horizontal = 12.dp),
                )
            },
            title = { Text(text = title) }
        )
    }