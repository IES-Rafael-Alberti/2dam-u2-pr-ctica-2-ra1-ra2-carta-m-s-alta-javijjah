package com.hachatml.cartamasalta.Caja

import android.R
import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import com.hachatml.cartamasalta.enums.Naipes
import com.hachatml.cartamasalta.enums.Palos

/**
 * Este objeto
 */
class Carta(
    var nombre: Naipes,
    var palo: Palos,
    var puntosMin: Int,
    var puntosMax: Int,
    var idDrawable: Int
) {

    companion object {
        @Composable
        fun getDrawableResource(naipe: Naipes, palo: Palos):Int {
            var nombreRes:String = ""
            nombreRes+=palo
            nombreRes+="_"
            when(naipe){
                Naipes.AS,Naipes.VALET,Naipes.DAME,Naipes.ROI -> {
                    nombreRes+=naipe
                }
                Naipes.DOS,Naipes.TRES,Naipes.CUATRO,Naipes.CINCO,Naipes.SEIS,Naipes.SIETE,Naipes.OCHO,
                    Naipes.NUEVE,Naipes.DIEZ -> {
                        nombreRes+= naipe.ordinal+1
                    }
            }
            return LocalContext.current.resources.getIdentifier(nombreRes,"drawable", LocalContext.current.packageName)
        }//todo
    }
}