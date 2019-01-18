package com.sopt.seminar_07.network

import com.google.gson.JsonObject
import com.sopt.seminar_07.get.GetBoardDetailedResponse
import com.sopt.seminar_07.get.GetBoardListResponse
import com.sopt.seminar_07.post.PostLogInResponse
import com.sopt.seminar_07.post.PostSignUpResponse
import com.sopt.seminar_07.post.PostWriteBoardResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface NetworkService{
    //회원가입
    @POST("/users")
    fun postSignUpResponse(
        @Header("Content-Type") content_type : String, //매개변수들
        @Body() body : JsonObject
    ) : Call<PostSignUpResponse> //return type

    //로그인
    @POST("/login")
    fun postLoginResponse(
        @Header("Content-Type") content_type : String,
        @Body() body : JsonObject
    ) : Call<PostLogInResponse>

    //게시판 글쓰기
    @Multipart
    @POST("/contents")
    fun postWriteBoardResponse(
        @Header("Authorization") token : String,
        @Part("title") title : RequestBody,
        @Part("contents") contents : RequestBody,
        @Part photo: MultipartBody.Part? //파일은 소괄호가 없음, 이름이 있어서는 안됨
    ):Call<PostWriteBoardResponse>

    //게시판 글 보기
    @GET("/contents")
    fun getBoardListResponse(
        @Header("Content-Type") content_type : String,
        @Query("offset") offset : Int,
        @Query("limit") limit : Int
    ) : Call<GetBoardListResponse>

    //게시판 글 상세보기
    @GET("/contents")
    fun getBoardDetailedResponse(
        @Header("Content-Type") content_type : String
    ) : Call<GetBoardDetailedResponse>
}