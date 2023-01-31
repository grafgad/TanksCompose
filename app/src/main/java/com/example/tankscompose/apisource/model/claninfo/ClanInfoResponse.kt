package com.example.tankscompose.apisource.model.claninfo

import com.example.tankscompose.apisource.model.BaseDetailResponse
import com.google.gson.annotations.SerializedName

data class ClanInfoResponse(
    @SerializedName("status") override val status: String,
    @SerializedName("data") override val data: ClanInfo,
    ) : BaseDetailResponse<ClanInfo>
