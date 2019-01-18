package com.example.dohee.sopt8_1

import android.app.PendingIntent.getActivity
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.dialog_two.*

class SecondDialogFragment(val ctx:Context) :AlertDialog(ctx){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_two)



        btn_second_dialog_ok.setOnClickListener {
            var xposition = it.x
            var yposition = it.y
            if(ctx is MainActivity){
                Toast.makeText(context, xposition.toString(),Toast.LENGTH_SHORT).show()
                ctx.showMainActToastMessage()
                dismiss()
            }

        }

    }


}