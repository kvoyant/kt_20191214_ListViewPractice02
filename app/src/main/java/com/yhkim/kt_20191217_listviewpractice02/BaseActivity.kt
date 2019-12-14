package com.yhkim.kt_20191217_listviewpractice02

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    //코틀린 상속 문법 :

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}