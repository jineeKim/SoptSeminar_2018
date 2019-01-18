package com.sopt.sopt_homework_03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.sopt_homework_03.Adapter.MyDataRecyclerViewAdapter
import com.sopt.sopt_homework_03.Data.MyItemData
import com.sopt.sopt_homework_03.Fragment.MainFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myDataRectclerRecyclerViewAdapter : MyDataRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Loads animals into the ArrayList
        addDataList()


//        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//            return inflater.inflate(R.layout.fragment_main, container, false)
//        }
//
//        override fun onActivityCreated(savedInstanceState: Bundle?) {
//            super.onActivityCreated(savedInstanceState)
//            setMyRecyclerView()
//        }
    }



    fun addDataList(){

        var dataList: ArrayList<MyItemData> = ArrayList()

        for(i in 1..15){
            if(i%2==0)
                dataList.add(MyItemData(i.toString(),true))
            else
                dataList.add(MyItemData(i.toString(),false))
        }

        rv_main_my_data_list.layoutManager = GridLayoutManager(this,3)
        rv_main_my_data_list.adapter = MyDataRecyclerViewAdapter( this, dataList )


//        myDataRectclerRecyclerViewAdapter = MyDataRecyclerViewAdapter(activity!!, dataList)
//        rv_main_frag_my_data_list.adapter=myDataRectclerRecyclerViewAdapter
//        rv_main_frag_my_data_list.layoutManager= LinearLayoutManager(context)
    }
}
