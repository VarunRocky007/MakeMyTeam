package com.mmt.makemyteam.ui.theme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

class Utilities {
    @Composable
    fun CardHeaderText(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.White,
        fontSize: TextUnit = TextUnit.Unspecified,
        fontStyle: FontStyle? = FontStyle.Normal,
        fontWeight: FontWeight? = FontWeight.Bold,
        fontFamily: FontFamily? = FontFamily.Monospace,
        textAlign: TextAlign? = TextAlign.Start,
    ) {
        Text(
            text = text,
            textAlign = textAlign,
            modifier = modifier,
            color = color,
            fontFamily = fontFamily,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight
        )
    }
}