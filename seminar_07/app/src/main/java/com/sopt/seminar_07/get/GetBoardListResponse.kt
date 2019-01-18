package com.sopt.seminar_07.get

import com.sopt.seminar_07.data.BoardData

data class GetBoardListResponse(
    val status : Int,
    val message : String,
    val data : ArrayList<BoardData>
)