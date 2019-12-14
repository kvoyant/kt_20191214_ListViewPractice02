package com.yhkim.kt_20191217_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BookListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }

}
