package com.example.galeriagatos

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

//LISTA DE LOS GATOS
@Composable
fun ListaItemsGato(gato: Gato, nuevaVentana: (Gato) -> Unit){
    Card ( //DISEÑO DE TIPO TARJETAS (VENTANA INICIAL)
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(), elevation = 2.dp,
                                    backgroundColor= Color.White, //Color fondo de los items de la lista
                                    shape = RoundedCornerShape(corner = CornerSize(16.dp)) //MODIFIER: CARACTERÍSTICAS QUE SE LE DA, EN ES TE CASO A LAS TARJETAS
    ){
        Row (
            Modifier.clickable { nuevaVentana(gato) } //ADMITE CLICK SOBRE OBJETO AÑADIDO EN LA TARJETA
                ){
            GatoImagen(gato = gato) //IMAGEN DE GATO EN VENTANA INICIAL
            Column(
                modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.CenterVertically) //CARACTERÍSTICAS ENTRE OBJETOS AÑADIDOS
            ) {
                //TEXTO QUE SALE EN CADA FILA DE LOS GATOS EN VENTANA INICIAL
                Text(text = gato.raza, style = typography.h6, color = Color(0xFFEACFBE)) //RAZA GATO
                Text(text = "MÁS INFORMACIÓN", style = typography.caption, color = Color.Gray) //MÁS INFORMACIÓN
            }
        }
    }
}

//FUNCIÓN DE IMAGEN DEL GATO EN LA LISTA (VENTANA INICIAL)
@Composable
private fun GatoImagen(gato: Gato){
    //CARACTERÍSTICAS DE IMÁGENES AÑADIDADES EN LA LISTA (VENTANA INICAL)
    Image(painter = painterResource(id = gato.imagenId), contentDescription = null, contentScale = ContentScale.Crop,
            modifier = Modifier.padding(8.dp).size(84.dp).clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}