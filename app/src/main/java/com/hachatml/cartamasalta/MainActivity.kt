package com.hachatml.cartamasalta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hachatml.cartamasalta.ui.theme.CartaMasAltaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaMasAltaTheme {
                // A surface container using the 'background' color from the theme
                PintarCarta()
            }
        }
    }
}

@Composable
fun PintarCarta() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.facedown),
            contentDescription = "cartaBocaAbajo",
            Modifier
                .size(400.dp)
                .padding(40.dp)
        )
        botonera()
    }
}

@Composable
fun botonera() {
    Row {
        Button(onClick = { /*TODO*/ },
            Modifier
                .width(200.dp)
                .height(80.dp)) {
            Text(text = "Mostrar carta")
        }
        Button(onClick = {/*TODO*/ },
            Modifier
                .width(200.dp)
                .height(80.dp)) {
            Text(text = "Reset")
        }
    }

}

