package com.mmt.makemyteam.model

data class PlayerProfile(
    val userInfo: PlayerInfo,
    val teamInfoList: List<TeamInfo>?,
    val matchInfoList: List<MatchInfo>?
)
