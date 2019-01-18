package com.sopt.seminar_07.data

data class BoardData(
    val contentIdx: Int,
    val userIdx: Int,
    val photo: PhotoData,
    val body: String,
    val lickCount: Int,
    val createData: String,
    val auth: Boolean,
    val lick: Boolean
)

data class PhotoData(
    val photoIdx: Int,
    val contentIdx: Int,
    val photoUrl: String
)