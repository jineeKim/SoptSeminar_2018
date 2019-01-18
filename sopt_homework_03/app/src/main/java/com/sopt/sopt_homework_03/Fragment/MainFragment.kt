package com.sopt.sopt_homework_03.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.sopt_homework_03.Adapter.MyDataRecyclerViewAdapter
import com.sopt.sopt_homework_03.Data.MyItemData
import com.sopt.sopt_homework_03.R
import com.sopt.sopt_homework_03.R.id.rv_main_frag_my_data_list
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.rv_item_my_data.*

class MainFragment : Fragment(){

    lateinit var myDataRectclerRecyclerViewAdapter : MyDataRecyclerViewAdapter

    companion object {
        var mInstance : MainFragment? = null

        @Synchronized
        fun getInstance():MainFragment{
            if(mInstance==null){
                mInstance= MainFragment()
            }
            return mInstance!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setMyRecyclerView()
    }

    private fun setMyRecyclerView(){

        var dataList: ArrayList<MyItemData> = ArrayList()
        dataList.add(MyItemData("1", false))
        dataList.add(MyItemData("2", true))
        dataList.add(MyItemData("3", false))
        dataList.add(MyItemData("4", true))
        dataList.add(MyItemData("5", false))
        dataList.add(MyItemData("6", true))
        dataList.add(MyItemData("7", false))
        dataList.add(MyItemData("8", true))
        dataList.add(MyItemData("9", false))
        dataList.add(MyItemData("10", true))
        dataList.add(MyItemData("11", false))
        dataList.add(MyItemData("12", true))
        dataList.add(MyItemData("13", false))
        dataList.add(MyItemData("14", true))
        dataList.add(MyItemData("15", false))


        myDataRectclerRecyclerViewAdapter = MyDataRecyclerViewAdapter(activity!!, dataList)
        rv_main_frag_my_data_list.adapter=myDataRectclerRecyclerViewAdapter
        rv_main_frag_my_data_list.layoutManager= LinearLayoutManager(context)
    }
}