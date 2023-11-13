package com.hachatml.cartamasalta.Caja

class Baraja
{
    companion object{
        var listaCartas = ArrayList<Carta>()

        fun crearBaraja(){
            listaCartas = ArrayList<Carta>()
            //todo
        }
        fun barajar(){
            listaCartas.shuffle()
        }
        fun dameCarta():Carta{
            listaCartas.removeAt(listaCartas.size - 1)
            return listaCartas[listaCartas.size-1]
        }
    }
}