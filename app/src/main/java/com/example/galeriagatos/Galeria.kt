package com.example.galeriagatos

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
//CREA ESPACIO DONDE SE ALAMACENARÁN LOS OBJETOS
@Composable
fun GaleriadeGatos(nuevaVentana: (Gato) -> Unit){
    val gatos = remember{ Sistema.listaGato} //ALMACENA OBJETO UBICADOS EN SISTEMA.LISTAGATO
    LazyColumn( //LISTA VERTICAL
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp) //PADDING DE LAZYCOLUMN
    ){
        items(  //ITEMS PROPIOS DEL LAZYCOLUMN
            items = gatos, //SE ASIGNAN LOS OBJETOS RECODIGOS EN GATOS A ITEMS
            itemContent= {
                ListaItemsGato(gato=it, nuevaVentana) //IT: OMITE DECLARACIÓN DEL PARÁMETRO PASADO , YA QUE SE SABE CÚAL SE ESPERA.

            }
        )
    }
}