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
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projeto_kotlinTheme {

                val h3 = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    letterSpacing = 0.15.sp
                )

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Box(modifier = Modifier.fillMaxSize()) {

                        Image(painter = painterResource(id = R.drawable.img1), contentDescription = null, modifier = Modifier.align(Alignment.TopStart).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img2), contentDescription = null, modifier = Modifier.align(Alignment.TopEnd).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img3), contentDescription = null, modifier = Modifier.align(Alignment.BottomStart).size(100.dp))

                        Image(painter = painterResource(id = R.drawable.img4), contentDescription = null, modifier = Modifier.align(Alignment.BottomEnd).size(100.dp))

                        Text(
                            text = "Olá Mundo do Kotlin!!",
                            style = h3,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}


/*Text(
text = "Olá mundo!!",
style = MaterialTheme.typography.h3.copy(fontWeight = FontWeight.Bold),
modifier = Modifier.align(Alignment.Center)
)
*/