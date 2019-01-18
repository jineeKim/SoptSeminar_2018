package com.sopt.seminar_02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().apply{
            postDelayed({

                //anko안쓸때 하는법 시작점,목적지를 매개변수로 넣어 줌
//                val intent:Intent = Intent(this@SplashActivity,MainActivity::class.java)
//                intent.putExtra("data1","헬로우")
//                intent.putExtra("data2","월드")
//                intent.putExtra("data3",1000)
//                startActivity(intent)


                //anko로 하는법
                startActivity<MainActivity>("data1" to "헬로우","data2" to "월드", "data3" to 1000)
                finish()

            },2000)
        }
    }
}
