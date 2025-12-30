package com.aradsheybak.muli_threading.screens.threading

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aradsheybak.muli_threading.R
import com.aradsheybak.muli_threading.Screen
import com.aradsheybak.muli_threading.ui.theme.Pink40

@Composable
fun ThreadingScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.simpleThreadExample.route)
                }
                .fillMaxWidth(0.8f)
                .height(120.dp)
                .background(color = Pink40, shape = RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Simple Thread Example",
                color = colorResource(R.color.white),
                fontSize = 26.sp,
                fontWeight = FontWeight.W600
            )
        }

        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.manyThreadExample.route)
                }
                .fillMaxWidth(0.8f)
                .height(120.dp)
                .background(color = Pink40, shape = RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Many Thread Example",
                color = colorResource(R.color.white),
                fontSize = 26.sp,
                fontWeight = FontWeight.W600
            )
        }

        Box(
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.executerExample.route)
                }
                .fillMaxWidth(0.8f)
                .height(120.dp)
                .background(color = Pink40, shape = RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Executer Example",
                color = colorResource(R.color.white),
                fontSize = 26.sp,
                fontWeight = FontWeight.W600
            )
        }

    }
}