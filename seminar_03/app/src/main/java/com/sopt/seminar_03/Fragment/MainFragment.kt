package com.sopt.seminar_03.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.seminar_03.Adapter.KakaoTalkRoomRectclerViewAdapter
import com.sopt.seminar_03.Data.KakaoTalkRoomData
import com.sopt.seminar_03.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(){

    lateinit var kakaoTalkRoomRectclerViewAdapter : KakaoTalkRoomRectclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    private fun setMyRecyclerView(){

        var dataList: ArrayList<KakaoTalkRoomData> = ArrayList()
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] 안드로이드파트", "인터뷰 하자~~!!!", 53, "오후 6:53"))
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] iOS파트", "승수!!!", 36, "오후 4:43"))
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] 서버파트", "배다슬!!!", 55, "오후 3:03"))
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] 기획파트", "나성수!!!", 42, "오후 2:33"))
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] 디자인파트", "승미!!!", 39, "오후 1:13"))
        dataList.add(KakaoTalkRoomData("[DoIT_SOPT] 23대 운영진", "회의요!", 10, "오전 5:53"))
        dataList.add(KakaoTalkRoomData("23기 버디버디조", "코다차야?!", 10, "오전 6:53"))
        dataList.add(KakaoTalkRoomData("23기 상반기 엠티조", "디제잉 시작한다!!!", 10, "오전 7:53"))
        dataList.add(KakaoTalkRoomData("나에게","손시려워",1,"어제"))


        kakaoTalkRoomRectclerViewAdapter = KakaoTalkRoomRectclerViewAdapter(activity, dataList)
        rv_main_frag_kakao_talk_room_list.adapter=kakaoTalkRoomRectclerViewAdapter
        rv_main_frag_kakao_talk_room_list.layoutManager=LinearLayoutManager(context)
    }
}