package com.yhkim.kt_20191217_listviewpractice02

import android.os.Bundle
import com.yhkim.kt_20191217_listviewpractice02.datas.GameData

class MainActivity : BaseActivity() {

    val gameList = ArrayList<GameData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {

        addGames()
    }

    fun addGames() {
        gameList.add( GameData(title:"아스팔트 8 : 에어본", companyName:"fdfafd") )
    }

}
