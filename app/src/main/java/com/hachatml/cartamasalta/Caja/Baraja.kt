package com.hachatml.cartamasalta.Caja

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import com.hachatml.cartamasalta.enums.Naipes
import com.hachatml.cartamasalta.enums.Palos

class Baraja {
    companion object {
        var baraja = mutableStateOf(Baraja)
        var listaCartas = ArrayList<Carta>()
        @Composable
        fun crearBaraja() {
            for (palo in Palos.values()) {
                for (naipe in Naipes.values()) {
                    val pointsMin: Int
                    val pointsMax: Int
                    val idDrawable: Int = Carta.getDrawableResource(naipe,palo)
                    when (naipe) {
                        Naipes.AS -> {
                            pointsMin = 1
                            pointsMax = 11
                        }

                        Naipes.DOS, Naipes.TRES, Naipes.CUATRO, Naipes.CINCO, Naipes.SEIS,
                        Naipes.SIETE, Naipes.OCHO, Naipes.NUEVE, Naipes.DIEZ -> {
                            pointsMin = naipe.ordinal + 1
                            pointsMax = naipe.ordinal + 1
                        }

                        else -> {
                            pointsMin = 10
                            pointsMax = 10
                        }
                    }
                    val cartaTemp = Carta(naipe, palo, pointsMin, pointsMax, idDrawable)
                    listaCartas.add(cartaTemp)
                }
            }
            barajar()
            //todo poner carta vacía listaCartas.add()
        }

        fun barajar() {
            listaCartas.shuffle()
        }

        fun dameCarta(): Carta {
            var cartaUltima = listaCartas[listaCartas.size-1]
            listaCartas.removeAt(listaCartas.size - 1)
            return cartaUltima
        }
    }
}