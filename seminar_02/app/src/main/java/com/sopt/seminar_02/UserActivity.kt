package com.sopt.seminar_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        btn_user_act_close.setOnClickListener{
            (it as Button).text="닫기"
            val intetn:Intent=Intent()
            intent.putExtra("resultData","User에서 보내는 결과 데이터")
            setResult(Activity.RESULT_OK,intetn) //onActivityResult가 호출됨
            finish()

        }
    }
}
