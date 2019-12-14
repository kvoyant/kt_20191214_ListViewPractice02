package com.yhkim.kt_20191217_listviewpractice02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.yhkim.kt_20191217_listviewpractice02.adapters.GameAdapter
import com.yhkim.kt_20191217_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var gameAdapter:GameAdapter? = null
    val gameList = ArrayList<GameData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        gameListView.setOnItemLongClickListener { parent, view, position, id ->

            val clickeGameData = gameList.get(position)
            Toast.makeText(mContext, "${clickeGameData.title} 을 삭제 하려고 함", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener false
        }

        gameListView.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(mContext, "${position}번 줄 클릭", Toast.LENGTH_SHORT).show()

            val clickedGameData = gameList.get(position)
            Toast.makeText(mContext, "${clickedGameData.title} 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(mContext, GameDetailActivity::class.java)
            intent.putExtra("gameData", clickedGameData)
            startActivity(intent)
        }
    }

    override fun setValues() {

        addGames()

        gameAdapter = GameAdapter(mContext, R.layout.game_list_item, gameList)
        gameListView.adapter = gameAdapter
    }

    fun addGames() {
        gameList.add(GameData("아스팔트 8 : 에어본", "Gameloft"))
        gameList.add(GameData("MineCraft - Pocket Edition", "Mojang"))
        gameList.add(GameData("아스팔트 7 : 히트", "Gameloft"))
        gameList.add(GameData("팔라독(Paladog)", "FazeCat"))
        gameList.add(GameData("Plants Vs. Zombie", "EA Swiss Sarl"))
        gameList.add(GameData("스왐피 (Swampy)", "Disney"))
    }

}
