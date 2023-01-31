package com.example.tankscompose.apisource.model.clanlist

import com.example.tankscompose.apisource.model.BaseListResponse
import com.google.gson.annotations.SerializedName

data class ClansListResponse(
    @SerializedName("status") override val status: String,
    @SerializedName("data") override val data: List<ClanList>
) : BaseListResponse<ClanList>
