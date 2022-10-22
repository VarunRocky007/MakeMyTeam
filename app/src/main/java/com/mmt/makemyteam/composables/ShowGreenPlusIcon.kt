package com.mmt.makemyteam.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShowGreenPlusIcon(onClickAction: () -> Unit) {
    OutlinedButton(
        onClick = { onClickAction },
        modifier = Modifier.size(30.dp),
        shape = CircleShape,
        border = BorderStroke(4.dp, Color(0xFF1B3629)),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Blue)
    ) {
        // Adding an Icon "Add" inside the Button
        Icon(
            Icons.Default.Add,
            contentDescription = "content description",
            tint = Color(0xFF1D4934)
        )
    }

}