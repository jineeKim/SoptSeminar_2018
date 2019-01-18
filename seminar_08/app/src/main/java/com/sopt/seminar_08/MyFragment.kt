package com.sopt.seminar_08

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.my_fragment.*

class MyFragment : Fragment(){

    companion object {
        private var instance : MyFragment? = null

        @Synchronized
        fun getInstance(title:String, content: String): MyFragment{
            if (instance == null){
                instance = MyFragment().apply {
                    arguments=Bundle().apply {
                        putString("title", title)
                        putString("content", content)
                    }
                }
            }
            return instance!!
        }

    }

    var title:String?=null
    var content:String?=null


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString("title")
            content = it.getString("content")
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.my_fragment, container, false)
        return view
    }

    override fun onAtivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        tv_my_fragment_title.text=title
        tv_my_fragment_content.text=content

    }
}