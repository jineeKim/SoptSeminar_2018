package com.sopt.seminar_06.get

import com.sopt.seminar_06.data.BoardData
import com.sopt.seminar_06.data.BoardDetailedData

data class GetBoardDetailedResponse (
    val status : Int,
    val message : String,
    val data : ArrayList<BoardDetailedData>
)