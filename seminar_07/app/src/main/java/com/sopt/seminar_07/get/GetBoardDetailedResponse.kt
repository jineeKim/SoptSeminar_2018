package com.sopt.seminar_07.get

import com.sopt.seminar_07.data.BoardDetailedData

data class GetBoardDetailedResponse (
    val status : Int,
    val message : String,
    val data : ArrayList<BoardDetailedData>
)