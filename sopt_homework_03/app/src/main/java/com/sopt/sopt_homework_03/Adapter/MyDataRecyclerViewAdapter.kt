package com.sopt.sopt_homework_03.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.sopt.sopt_homework_03.Data.MyItemData
import com.sopt.sopt_homework_03.MainActivity
import com.sopt.sopt_homework_03.R
import org.jetbrains.anko.image
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MyDataRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<MyItemData>) : RecyclerView.Adapter<MyDataRecyclerViewAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_my_data, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.counter.text = dataList[position].counter

        if (!dataList[position].isLike) {
            holder.like_img.visibility = View.GONE
        }

        holder.counter.setOnClickListener() {
            ctx.toast(holder.counter.text)
        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val counter: TextView = itemView.findViewById(R.id.tv_rv_data) as TextView
        val like_img: ImageView = itemView.findViewById(R.id.im_rv_heart) as ImageView

    }
}
