package com.example.projeto_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projeto_kotlin.ui.theme.Projeto_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_kotlinTheme {

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Box(modifier = Modifier.fillMaxSize()) {

                        Image(painter = painterResource(id = R.drawable.img1), contentDescription = null, modifier = Modifier.align(Alignment.TopStart).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img2), contentDescription = null, modifier = Modifier.align(Alignment.TopEnd).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img3), contentDescription = null, modifier = Modifier.align(Alignment.BottomStart).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img4), contentDescription = null, modifier = Modifier.align(Alignment.BottomEnd).size(100.dp))
                    }
                }
            }
        }
    }
}
