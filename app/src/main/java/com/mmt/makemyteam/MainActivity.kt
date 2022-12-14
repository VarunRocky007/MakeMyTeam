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
import com.mmt.makemyteam.model.*
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
                            userInfo =
                            PlayerInfo(
                                userId = 1,
                                profilePicture = null,
                                userName = "Chirag@1",
                                userFirstName = "Chirag",
                                userLastName = "Bhadoria",
                                userContactNumber = 9826211043,
                                userDesignation = "Captain"
                            ),
                            teamInfoList =
                            listOf(
                                TeamInfo(
                                    teamId = 1,
                                    teamProfilePicture = null,
                                    teamName = "MAHAKAL CRICKET CLUB",
                                    teamCaption = null,
                                    teamMembers = null
                                ),
                                TeamInfo(
                                    teamId = 2,
                                    teamProfilePicture = null,
                                    teamName = "BHAWANI CRICKET CLUB",
                                    teamCaption = null,
                                    teamMembers = null
                                ),
                                TeamInfo(
                                    teamId = 3,
                                    teamProfilePicture = null,
                                    teamName = "BHAWANI CRICKET CLUB",
                                    teamCaption = null,
                                    teamMembers = null
                                ),
                                TeamInfo(
                                    teamId = 4,
                                    teamProfilePicture = null,
                                    teamName = "BHAWANI CRICKET CLUB",
                                    teamCaption = null,
                                    teamMembers = null
                                )
                            ),
                            matchInfoList = listOf(
                                MatchInfo(
                                    matchId = 1,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 2,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 3,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 4,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ), MatchInfo(
                                    matchId = 5,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 6,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 7,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                ),
                                MatchInfo(
                                    matchId = 8,
                                    matchDate = null,
                                    matchTime = null,
                                    myTeam = null,
                                    opponentTeam = null
                                )
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
                ),
                listOf(
                    TeamInfo(
                        teamId = 1,
                        teamProfilePicture = null,
                        teamName = "MAHAKAL CRICKET CLUB",
                        teamCaption = null,
                        teamMembers = null
                    )
                ),
                null
            )
        )
    }
}