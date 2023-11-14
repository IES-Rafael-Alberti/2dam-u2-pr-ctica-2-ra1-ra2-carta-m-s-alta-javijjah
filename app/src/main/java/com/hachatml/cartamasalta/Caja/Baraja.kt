package com.hachatml.cartamasalta.Caja

import com.hachatml.cartamasalta.enums.Naipes
import com.hachatml.cartamasalta.enums.Palos

class Baraja {
    companion object {
        var listaCartas = ArrayList<Carta>()

        fun crearBaraja() {
            for (palo in Palos.values()) {
                for (naipe in Naipes.values()) {
                    val pointsMin: Int
                    val pointsMax: Int
                    val idDrawable: Int
                    when (naipe) {
                        Naipes.AS -> {
                            pointsMin = 1
                            pointsMax = 11
                            idDrawable = 0 //todo "as_${palo.toString().lowercase()}"
                        }

                        Naipes.DOS, Naipes.TRES, Naipes.CUATRO, Naipes.CINCO, Naipes.SEIS,
                        Naipes.SIETE, Naipes.OCHO, Naipes.NUEVE, Naipes.DIEZ -> {
                            pointsMin = naipe.ordinal + 1
                            pointsMax = naipe.ordinal + 1
                            idDrawable = 0 //todo
                        }

                        else -> {
                            pointsMin = 10
                            pointsMax = 10
                            idDrawable = 0 //todo
                        }
                    }
                    val cartaTemp = Carta(naipe, palo, pointsMin, pointsMax, idDrawable)
                    listaCartas.add(cartaTemp)
                }
            }
        }

        fun barajar() {
            listaCartas.shuffle()
        }

        fun dameCarta(): Carta {
            listaCartas.removeAt(listaCartas.size - 1)
            return listaCartas[listaCartas.size - 1]
        }
    }
}