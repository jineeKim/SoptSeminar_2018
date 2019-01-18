package com.example.dohee.sopt8_1

import android.app.PendingIntent.getActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_one.*
import kotlinx.android.synthetic.main.dialog_two.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(MyFragment.getInstance("제목", "내용"))
        setOnBtnClickListener()
//addFrgment함수 쓰기
    }

    private fun addFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }

    private fun setOnBtnClickListener(){
        btn_main_act_show_first_dialog.setOnClickListener {
            var xposition = it.x
            var yposition = it.y
            Toast.makeText(this, xposition.toString(), Toast.LENGTH_SHORT).show()
            val firstDlg: FirstDialogFragment = FirstDialogFragment()
            firstDlg.show(supportFragmentManager,"first dialog")
        }
        btn_main_act_show_second_dialog.setOnClickListener {
            val secondDlg: SecondDialogFragment = SecondDialogFragment(this)
            secondDlg.show()
        }
    }
    fun showMainActToastMessage() {
        toast("메인엑티비티 함수 호출")
    }
}
