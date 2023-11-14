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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hachatml.cartamasalta.Caja.Baraja
import com.hachatml.cartamasalta.ui.theme.CartaMasAltaTheme

class MainActivity : ComponentActivity() {
    var idDrawableCarta = mutableStateOf(R.drawable.facedown)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaMasAltaTheme {
                // A surface container using the 'background' color from the theme
                PintarCarta(idDrawableCarta)
                Botonera {}
            }
        }
    }
}

@Composable
fun PintarCarta(idDrawableCarta:MutableState<Int>) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = idDrawableCarta.toString().toInt()),
            contentDescription = "Carta Actual",
            Modifier
                .size(400.dp)
                .padding(40.dp)
        )
        Botonera(callCrearBaraja())
    }
}
@Composable
fun callCrearBaraja():() -> Unit{
   return { Baraja.crearBaraja() }
}
@Composable
fun Botonera(lambda:()-> Unit) {
    Baraja.crearBaraja()
    Row {
        Button(
            onClick = { Baraja.dameCarta() },
            Modifier
                .width(200.dp)
                .height(80.dp)
                .padding(10.dp)
        ) {
            Text(text = "Mostrar carta")
        }
        Button(
            onClick = lambda,
            Modifier
                .width(200.dp)
                .height(80.dp)
                .padding(10.dp)
        ) {
            Text(text = "Reset")
        }
    }

}

