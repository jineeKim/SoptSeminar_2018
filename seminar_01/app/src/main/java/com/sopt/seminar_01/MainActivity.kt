package com.sopt.seminar_01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListener()
    }

    private fun setClickListener(){
        btn_main_act_part_ok.setOnClickListener(){
            var mPartName : String = et_main_act_what_id_yout_part.text.toString()
            et_main_act_what_id_yout_part.text.clear()
            toast(mPartName)
        }
    }
}
