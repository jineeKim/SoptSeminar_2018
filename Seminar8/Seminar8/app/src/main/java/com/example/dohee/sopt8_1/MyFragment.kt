package com.example.dohee.sopt8_1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.*

class MyFragment:Fragment(){
    companion object {
        private var instance : MyFragment? = null
        fun getInstance(title:String, content:String):MyFragment{
            if(instance==null){
                instance=MyFragment().apply{
                    //초기화와 동시에 어떤 작업을 해주기 위해 apply 사용
                    arguments = Bundle().apply{
                        putString("title",title)
                        putString("content",content)
                    }
                }

            }
            return instance!!
        }
    }

    //꺼내주는 작업
    var title: String? = null
    var content: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //argument가 null이면 let{}이 실행이 안됨.
        //argument가 null이 아닐 때만 실행할 코드
        arguments?.let{
            title = it.getString("title")
            content = it.getString("content")
        }

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater.inflate(R.layout.fragment_my,container,false)

        return view
    }

    //위에는 뷰 붙이는 코딩
    //여기서부터 뷰에 대한 코딩 시작
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_my_fragment_title.text = title
        tv_my_fragment_content.text = content
    }
}