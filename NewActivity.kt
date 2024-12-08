package com.example.autismhelperapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new) // تأكد من أنك ستنشئ ملف XML اسمه activity_new
    }
}
