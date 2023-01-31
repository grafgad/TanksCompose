package com.example.tankscompose.apisource.model

interface BaseDetailResponse<T : Any> {
    val status: String
    val data: T
}