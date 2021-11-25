package com.example.galeriagatos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//CREA ESPACIO DONDE SE ALAMACENARÁN LOS OBJETOS
@ExperimentalMaterialApi
@Composable
fun GaleriadeGatos( nuevaVentana: (Gato) -> Unit){
    val g = Sistema.listaGato//ALMACENA OBJETOS UBICADOS EN SISTEMA.LISTAGATO
    LazyColumn( //LISTA VERTICAL
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp) //PADDING DE LAZYCOLUMN
    ){
        itemsIndexed(
            items= g,
            key={index,item->
                item.hashCode()
            }
        ){index,item->

            val state= rememberDismissState(
                confirmStateChange = {
                    if (it== DismissValue.DismissedToStart){
                        g.remove(item)
                    }
                    true
                }
            )

            //Método eliminar Items.
            SwipeToDismiss(
                state = state,
                background = {
                    val color=when(state.dismissDirection){
                        DismissDirection.StartToEnd -> Color.Transparent
                        DismissDirection.EndToStart -> Color(0XFFEACFBE)
                        null -> Color.Transparent
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color)
                            .padding(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = null,
                            tint= Color.White,
                            modifier = Modifier.align(Alignment.CenterEnd)
                        )
                    }

                },
                dismissContent = {
                    ListaItemsGato(gato = item, nuevaVentana = nuevaVentana)
                },
                directions=setOf(DismissDirection.EndToStart)
            )
            Divider()

        }
    }
}
