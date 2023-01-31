package com.example.tankscompose.apisource.model.playerlist

import com.google.gson.annotations.SerializedName

data class PlayerList(
    @SerializedName("account_id")
    val account_id: Int,
    @SerializedName("nickname")
    val nickname: String
)