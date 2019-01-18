package com.sopt.seminar_07.data

data class BoardDetailedData (
    val commentIdx : Int,
    val userIdx : Int,
    val body : String,
    val likeCount : Int,
    val createDate : Boolean,
    val contentIdx : Int,
    val auth : Boolean,
    val like : Boolean
)