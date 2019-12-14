package com.yhkim.kt_20191217_listviewpractice02.datas

import java.io.Serializable

//class GameData(title:String, companyName:String, companyEmail:String?) :Serializable {
class GameData(title:String, companyName:String) :Serializable {
    var title = title
    var companyName = companyName
//    var companyEmail = companyEmail
}