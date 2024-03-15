package com.example.projeto_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projeto_kotlin.ui.theme.Projeto_kotlinTheme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_kotlinTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    desenha_tela()
                }
            }
        }
    }
}

val h3 = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 30.sp,
    letterSpacing = 0.15.sp
)

@Composable
fun desenha_tela() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img1),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 16.dp)
                .size(100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img2),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 16.dp, top = 16.dp)
                .size(100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img3),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, bottom = 16.dp)
                .size(100.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img4),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 16.dp)
                .size(100.dp)
        )

        var texto by remember { mutableStateOf("Olá Mundo do Kotlin!!") }

        Text(
            text = texto,
            style = h3,
            modifier = Modifier.align(Alignment.Center)
        )

        Button(
            onClick = { texto = "Hello World" },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 300.dp)
        ) {
            Text(text = "Botão Mágico")
        }
    }
}
