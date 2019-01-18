package com.sopt.seminar_04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sopt.seminar_04.db.SharedPerferenceController
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setOnBtnClickListener()

        if(SharedPerferenceController.getUserID(this).isNotEmpty()){
            startActivity<MemoActivity>()
            finish()
        }
    }

    private fun setOnBtnClickListener(){
        btn_login_act_sign_in.setOnClickListener{
            val input_id:String=et_login_act_id.text.toString()
            val input_pw:String=et_login_act_pw.text.toString()

            if(input_id.isNotEmpty()&&input_pw.isNotEmpty()){
                SharedPerferenceController.setUserID(this,input_id)
                SharedPerferenceController.setUserPW(this,input_pw)

                startActivity<MemoActivity>()
                finish()
            }
        }
    }
}
