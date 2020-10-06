package com.example.join

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 가입하기 버튼을 눌렀을 때 회원가입화면으로 이동하게 버튼 클릭이벤트 만들기
        joinBtn.setOnClickListener {

            // 가입하기 버튼을 누르면 들어오는 로직
            // 회원가입 화면으로 이동하게 Intent 사용
            val myIntent = Intent(this, JoinActivity::class.java)

            //startActvity를 해야 화면이동
            startActivity(myIntent)
        }
    }//onCreate
}