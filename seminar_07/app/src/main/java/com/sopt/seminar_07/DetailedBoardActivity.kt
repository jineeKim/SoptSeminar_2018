package com.sopt.seminar_07

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.sopt.seminar_06.get.GetBoardDetailedResponse
import com.sopt.seminar_07.data.BoardDetailedData
import com.sopt.seminar_07.network.ApplicationController
import com.sopt.seminar_07.network.NetworkService
import kotlinx.android.synthetic.main.activity_board.*
import kotlinx.android.synthetic.main.activity_detailed_board.*
import kotlinx.android.synthetic.main.activity_write.*
import kotlinx.android.synthetic.main.rv_item_board.*
import org.jetbrains.anko.image
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailedBoardActivity : AppCompatActivity() {
    val networkService: NetworkService by lazy {
        ApplicationController.instance.networkService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_board)

        setOnBtnClickListener()
        getBoardResponse()
    }

    var imageURI: String = ""

    private fun getBoardResponse() {
        val getBoardResponse = networkService.getBoardDetailedResponse("application/json")
        getBoardResponse.enqueue(object : Callback<GetBoardDetailedResponse> {
            override fun onFailure(call: Call<GetBoardDetailedResponse>, t: Throwable) {
                Log.e("board list fail", t.toString())
            }

            override fun onResponse(
                call: Call<GetBoardDetailedResponse>,
                response: Response<GetBoardDetailedResponse>
            ) {
                if (response.isSuccessful) {
                    val id: Int = intent.getIntExtra("b_id", 0)
                    val temp: ArrayList<BoardDetailedData> = response.body()!!.data

                    for (i in 0..(temp.size - 1))
                        if (temp[i].b_id == id) {
                            et_board_title.setText(temp[i].b_title)
                            et_board_content.setText(temp[i].b_contents)
                            //Glide을 사진 URI를 ImageView에 넣은 방식. 외부 URI가 아니라 굳이 Glide을 안써도 되지만 ㅎㅎ!
                            Glide.with(this@DetailedBoardActivity)
                                .load(temp[i].b_photo)
                                .thumbnail(0.1f)
                                .into(iv_board_image)
                        }
                }
            }
        })
    }

    private fun setOnBtnClickListener() {
        btn_back.setOnClickListener {
            startActivity<BoardActivity>()
            finish()
        }
    }

}
