package com.yhkim.kt_20191217_listviewpractice02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.yhkim.kt_20191217_listviewpractice02.R
import com.yhkim.kt_20191217_listviewpractice02.datas.BookData

class BookAdapter(context:Context, resId:Int, list:ArrayList<BookData>) : ArrayAdapter<BookData>(context, resId, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        //convertView: View? => convertView가 널 일수 있다.!
        //let 을 이용한 널처리 방법

        tempRow?.let {
            //tempRow가 null 이 아니면
        }.let {
            //tempRow가 null 이면
            tempRow = inf.inflate(R.layout.book_list_item, null)
        }

        val row = tempRow!!

        val data = mList.get(position)

        val bookTitleTxt = row.findViewById<TextView>(R.id.bookTitleTxt)
        val bookCompanyTxt = row.findViewById<TextView>(R.id.bookCompanyTxt)

        bookTitleTxt.text = data.title
        bookCompanyTxt.text = data.companyName

        return row

    }

}