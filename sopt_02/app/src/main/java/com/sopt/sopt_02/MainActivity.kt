package com.sopt.sopt_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE_SIGN_IN = 1004 //onActivityResult에서 activity 구분하기 위해

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sign_in.setOnClickListener {
            toast("로그인")
        }


        btn_sign_up.setOnClickListener {
            val mInputId: String = et_first_id.text.toString()
            //anko version
            startActivityForResult<SignUpActivity>(REQUEST_CODE_SIGN_IN, "id" to mInputId)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_SIGN_IN) {
            if (resultCode == Activity.RESULT_OK) {
                if (data != null) {
                    val id = data.getStringExtra("id")
                    et_first_id.setText(id)
                }
            }
        }
    }
}