package com.hachatml.cartamasalta.Caja

import com.hachatml.cartamasalta.enums.Naipes
import com.hachatml.cartamasalta.enums.Palos

class Carta(
    var nombre: Naipes,
    var palo: Palos,
    var puntosMin: Int,
    var puntosMax: Int,
    var idDrawable: Int
) {

    companion object {
        fun getDrawableResource(naipe: Naipes, palo: Palos) {
        }//todo
    }
}