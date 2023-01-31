package com.example.tankscompose.apisource.model.playerlist

import com.example.tankscompose.apisource.model.BaseListResponse
import com.google.gson.annotations.SerializedName

data class PlayerListResponse(
    @SerializedName("status") override val status: String,
    @SerializedName("data") override val data: List<PlayerList>
) : BaseListResponse<PlayerList>
