package com.mmt.makemyteam.model

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import okio.IOException

data class UserInfo(
    @SerializedName("userId") val userId: Int,
    @SerializedName("profilePicture")  val profilePicture: String?,
    @SerializedName("userName") val userName: String,
    @SerializedName("userFirstName")  val userFirstName: String,
    @SerializedName("userLastName") val userLastName: String,
    @SerializedName("userDesignation") val userDesignation: String?,
    @SerializedName("userContactNumber") val userContactNumber: Long
)

fun getMockData(context: Context, fileName: String): String {
    val jsonString: String
    try {
        jsonString =
            context.assets.open("/sampledata/default.json").bufferedReader().use { it.readText() }
    } catch (e: IOException) {
        e.printStackTrace()
        return ""
    }
    return jsonString
}
fun parseJsonString(jsonString: String, fileName: String, context: Context){
    //val jsonFileString = getJsonDataFromAsset(context, fileName)
    var userInfo = Gson().fromJson(jsonString, UserInfo::class.java)
    Log.i("data", jsonString)
}
