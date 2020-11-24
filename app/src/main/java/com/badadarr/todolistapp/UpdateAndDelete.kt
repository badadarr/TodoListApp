package com.badadarr.todolistapp

interface UpdateAndDelete {

    fun modifyItem(itemUID : String, isDone :Boolean)
    fun onItemDelete(itemUID: String)
}