package org.example

data class MenuData(val name: String, val price: Int)

data class OrderData(val customerName: String?, val menuNum: Int)

data class ManagerData(val name:String, val type:String)