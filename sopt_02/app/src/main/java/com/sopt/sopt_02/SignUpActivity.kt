package com.sopt.sopt_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast

class SignUpActivity : AppCompatActivity() {

    val REQUEST_CODE_SIGN_IN = 1004 //onActivityResult에서 activity 구분하기 위해

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setInitText()
        setOnBtnClickListener()

    }

    private fun setInitText() {
        val id: String? = intent.getStringExtra("id")
        if (id != null) {
            et_second_id.setText(id)
        }

    }

    private fun setOnBtnClickListener() {
        btn_close.setOnClickListener {
            finish()
        }

        btn_complete.setOnClickListener {
            val intent: Intent = Intent()
            intent.putExtra("id", et_second_id.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

}
