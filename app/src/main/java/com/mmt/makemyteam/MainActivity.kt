package com.mmt.makemyteam

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mmt.makemyteam.composables.ShowUserProfile
import com.mmt.makemyteam.model.PlayerInfo
import com.mmt.makemyteam.model.PlayerProfile
import com.mmt.makemyteam.model.getMockData
import com.mmt.makemyteam.model.parseJsonString
import com.mmt.makemyteam.ui.theme.MakeMyTeamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userInfo: PlayerInfo? = parseJsonString(getMockData(applicationContext, "default.json"))
        setContent {
            MakeMyTeamTheme(darkTheme = true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowUserProfile(
                        PlayerProfile(
                            PlayerInfo(
                                userId = 1,
                                profilePicture = null,
                                userName = "Chirag@1",
                                userFirstName = "Chirag",
                                userLastName = "Bhadoria",
                                userContactNumber = 9826211043,
                                userDesignation = "Captain"
                            )
                        )
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MakeMyTeamTheme {
        ShowUserProfile(
            PlayerProfile(
                PlayerInfo(
                    userId = 1,
                    profilePicture = null,
                    userName = "Chirag@1",
                    userFirstName = "Chirag",
                    userLastName = "Bhadoria",
                    userContactNumber = 9826211043,
                    userDesignation = "Captain"
                )
            )
        )
    }
}