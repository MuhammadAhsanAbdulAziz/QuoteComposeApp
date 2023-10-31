package com.example.quotecomposeapp

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.quotecomposeapp.models.Quote
import com.google.gson.Gson
import java.nio.charset.Charset

object DataManager {

    var data = emptyArray<Quote>()
    var currentPage = mutableStateOf(MainActivity.Pages.LISTING)
    var currentQuote : Quote? = null
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }

    fun switchPages(quote : Quote?){
        if(currentPage.value == MainActivity.Pages.LISTING){
            currentQuote = quote
            currentPage.value = MainActivity.Pages.DETAIL
        }
        else{
            currentPage.value = MainActivity.Pages.LISTING
        }
    }
}