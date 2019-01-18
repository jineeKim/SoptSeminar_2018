package com.sopt.seminar_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import com.sopt.seminar_02.fragment.HomeFragment
import com.sopt.seminar_02.fragment.UserFragment
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

//    var data3: Int = 0
//    var data1: String? = null
//    var data2: String? = null

//    val REQUEST_CODE_USER_ACTIVITY = 1004 //onActivityResult에서 activity 구분하기 위해

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn_main_act_go_to_sub.setOnClickListener{
//            //버튼을 눌렀을 때 수행할 로직 작성
//
//            //anko 버전
//            startActivityForResult<UserActivity>(REQUEST_CODE_USER_ACTIVITY, "data1" to "안녕하세요!")
//
//            //anko 아닌 버전
//            val intent : Intent = Intent(this, UserActivity::class.java)
//            intent.putExtra("data1","안녕하세요!")
//            startActivityForResult(intent, REQUEST_CODE_USER_ACTIVITY)
//
//
//        }

//        data1 = intent.getStringExtra("data1")
//
//        intent.getStringExtra("data2")?.let {
//            data2 = it //null 체크
//        }
//
//        data3 = intent.getIntExtra("data3", 0)

        addFragment(HomeFragment().getInstance())

        btn_main_act_home_frag.setOnClickListener{
            replaceFragment(HomeFragment())
        }

        btn_main_act_user_frag.setOnClickListener{
            replaceFragment(UserFragment())
        }

    }


    private fun addFragment(fragment:Fragment){
        val transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }

    private fun replaceFragment(fragment:Fragment){
        val transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(requestCode==1004){
//            if(resultCode == RESULT_OK){
//                toast("결과 코드 RESULT_OK!")
//            }
//        }
//    }

//    val data1 = intent.getStringExtra("data1")
//    val data2 = intent.getStringExtra("data2")
//    data3 = intent.getIntExtra("data3")


}
