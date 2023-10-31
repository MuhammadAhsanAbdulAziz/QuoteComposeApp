package com.example.quotecomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotecomposeapp.models.Quote

@Composable
fun QuoteListScreen(data : Array<Quote>,onClick : (quote : Quote)->Unit){
    Column {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f)
        )
        Quotelist(data = data,onClick)
    }
}