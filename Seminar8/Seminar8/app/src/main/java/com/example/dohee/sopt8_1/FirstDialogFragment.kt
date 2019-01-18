package com.example.dohee.sopt8_1

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.dialog_one.*

class FirstDialogFragment : DialogFragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_one, container,false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn_one_dialog_ok.setOnClickListener {
            if(activity is MainActivity){
                (activity as MainActivity).showMainActToastMessage()
               // val str : String = (activity as MainActivity).myString
                //

            }
            dismiss()
        }
    }
}