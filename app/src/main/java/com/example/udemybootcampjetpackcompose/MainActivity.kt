package com.example.udemybootcampjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemybootcampjetpackcompose.ui.theme.AnaRenk
import com.example.udemybootcampjetpackcompose.ui.theme.UdemyBootcampJetpackComposeTheme
import com.example.udemybootcampjetpackcompose.ui.theme.Yazı1
import com.example.udemybootcampjetpackcompose.ui.theme.Yazı2
import com.example.udemybootcampjetpackcompose.ui.theme.pacifico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UdemyBootcampJetpackComposeTheme {
                Anasayfa()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Pizza", fontFamily = pacifico) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AnaRenk,
                    titleContentColor = Yazı1
                )
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = stringResource(R.string.pizzaBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp
            )

            Image(
                painter = painterResource(R.drawable.pizza_resim),
                contentDescription = "",
                modifier = Modifier.size(150.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = Yazı1
                    )
                ) {
                    Text(stringResource(R.string.peynirYazi))

                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = Yazı1
                    )
                ) {
                    Text(stringResource(R.string.sucukYazi))

                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = Yazı1
                    )
                ) {
                    Text(stringResource(R.string.zeytinYazi))

                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = Yazı1
                    )
                ) {
                    Text(stringResource(R.string.biberYazi))

                }

            }
            Text(
                text = stringResource(R.string.teslimatSure),
                color = Yazı2,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(R.string.teslimatBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(R.string.pizzaAciklama),
                color = Yazı2,
                fontSize = 22.sp,
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.fiyatYazi),
                    color = AnaRenk,
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = Yazı1
                    )
                ) {
                    Text(
                        text = stringResource(R.string.buttonYazi),
                        fontSize = 18.sp
                    )
                }

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UdemyBootcampJetpackComposeTheme {
        Anasayfa()
    }
}