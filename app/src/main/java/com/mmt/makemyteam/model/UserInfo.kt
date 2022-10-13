package com.mmt.makemyteam.model

data class UserInfo(
    val userId : Int,
    val profilePicture : String?,
    val userName : String,
    val userFirstName : String,
    val userLastName : String,
    val userDesignation : String?,
    val userContactNumber : Long
)
