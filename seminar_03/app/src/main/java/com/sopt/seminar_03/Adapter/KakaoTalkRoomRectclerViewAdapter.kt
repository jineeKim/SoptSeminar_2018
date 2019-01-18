package com.sopt.seminar_03.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.sopt.seminar_03.Data.KakaoTalkRoomData
import com.sopt.seminar_03.MainActivity
import com.sopt.seminar_03.R
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class  KakaoTalkRoomRectclerViewAdapter (val ctx:Context, var dataList : ArrayList<KakaoTalkRoomData>)
    : RecyclerView.Adapter<KakaoTalkRoomRectclerViewAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_kakao_talk_room,parent,false)
        return Holder(view)

    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text=dataList[position].title
        holder.content.text=dataList[position].content
        holder.person_cnt.text=dataList[position].person_cnt.toString()
        holder.time.text=dataList[position].time

        holder.item_btn.setOnClickListener {
            ctx.toast("메인 엑티비티로~")
            ctx.startActivity<MainActivity>()
        }
    }

    inner class Holder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val title : TextView = itemView.findViewById(R.id.tv_rv_item_kakao_talk_room_title) as TextView
        val content : TextView = itemView.findViewById(R.id.tv_rv_item_kakao_talk_room_content) as TextView
        val person_cnt : TextView = itemView.findViewById(R.id.tv_rv_item_kakao_talk_room_person_cnt) as TextView
        val time : TextView = itemView.findViewById(R.id.tv_rv_item_kakao_talk_room_time) as TextView

        val item_btn : RelativeLayout = itemView.findViewById(R.id.btn_rv_item_kakao_talk_room) as RelativeLayout

    }

}