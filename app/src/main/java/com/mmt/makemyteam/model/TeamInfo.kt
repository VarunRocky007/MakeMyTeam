package com.mmt.makemyteam.model

import com.google.gson.annotations.SerializedName

class TeamInfo (
    @SerializedName("teamId") val teamId: Int,
    @SerializedName("teamProfilePicture") val teamProfilePicture: String?,
    @SerializedName("teamName") val teamName: String,
    @SerializedName("teamCaption") val teamCaption: String?,
)