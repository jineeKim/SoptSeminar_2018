package com.sopt.seminar_02.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.seminar_02.R


class HomeFragment : Fragment(){

    companion object {
        var mInstance : HomeFragment? = null

        @Synchronized
        fun getInstance():HomeFragment{
            if(mInstance==null){
                mInstance= HomeFraglment()
            }
            return mInstance!!
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view:View = inflater!!.inflate(R.layout.fragment_home,container,false)

        return view
    }
}