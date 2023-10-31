package com.example.quotecomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotecomposeapp.models.Quote

@Composable
fun Quotelist(data : Array<Quote>,onClick : (quote : Quote)-> Unit){
    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it,onClick)
        }
    })
}