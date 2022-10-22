package com.mmt.makemyteam.model

import com.google.gson.annotations.SerializedName
import java.sql.Time
import java.util.*

data class MatchInfo (
    @SerializedName("matchId")  val matchId: Int,
    @SerializedName("matchDate")  val matchDate: Date?,
    @SerializedName("userId") val matchTime: Time?,
    @SerializedName("userId") val myTeam: TeamInfo?,
    @SerializedName("userId") val opponentTeam: TeamInfo?,

    )