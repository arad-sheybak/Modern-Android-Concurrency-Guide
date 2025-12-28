package com.aradsheybak.threading.basics

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleThreadingExample() {

    val logs = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Button(onClick = {
            runSimpleThreadExample(
                onLog = { message ->
                    logs.add(message)
                    Log.d("SimpleThreading", message)
                }
            )
        }) {
            Text("Run Simple Thread Example")
        }

        Divider()

        logs.forEach { log ->
            Text(text = log)
        }
    }
}
