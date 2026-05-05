package com.example.udemybootcampjetpackcompose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.udemybootcampjetpackcompose.ui.theme.AnaRenk
import com.example.udemybootcampjetpackcompose.ui.theme.AnaRenkDark
import com.example.udemybootcampjetpackcompose.ui.theme.Yazı1

@Composable
fun Chip(contents : String,darkTheme: Boolean = isSystemInDarkTheme()){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = if (darkTheme) AnaRenkDark else AnaRenk,
            contentColor = Yazı1
        )
    ) {
        Text(contents)

    }
}