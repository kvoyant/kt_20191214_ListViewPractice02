package com.yhkim.kt_20191217_listviewpractice02

import android.os.Bundle
import com.yhkim.kt_20191217_listviewpractice02.adapters.BookAdapter
import com.yhkim.kt_20191217_listviewpractice02.datas.BookData
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : BaseActivity() {

    val bookList = ArrayList<BookData>()
    var bookAdapter:BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
        addBooks()

        bookAdapter = BookAdapter(mContext, R.layout.game_list_item, bookList)
        bookListView.adapter = bookAdapter
    }

    fun addBooks() {
        bookList.add(BookData("드래곤볼", "일본"))
        bookList.add(BookData("해리포터", "영국"))
        bookList.add(BookData("반지의제왕", "미국"))
    }

}
