package com.example.galeriagatos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import com.example.galeriagatos.ui.theme.GaleriaGatosTheme

//NUEVA VENTANA SELECCIONADA
@Composable
fun ventanaGato(gato: Gato){
    val st = rememberScrollState()
    Column(modifier = Modifier.fillMaxWidth()) {
        BoxWithConstraints {
            Surface{
                Column(modifier = Modifier.fillMaxSize().verticalScroll(st)) {//DISEÑO DE NUEVA VENTANA
                    encabezado(gato = gato, alt = this@BoxWithConstraints.maxHeight) //EN EL ENCABEZADO SE ENCUENTRA LA IMAGEN
                    contenido(gato = gato, alt = this@BoxWithConstraints.maxHeight) //EN EL CONTENIDO SE ENCUENTRA EL TEXTO
                }
            }
        }
    }
}

//FUNCIÓN MUESTRA EN NUEVA VENTANA GATO SELECCIONADO CON SU RESPECTIVA IMAGEN EN EL ENCABEZADO
@Composable
private fun encabezado(gato: Gato, alt: Dp){
    Image(modifier = Modifier.heightIn(max = alt / 2).fillMaxWidth(), painter = painterResource(id = gato.imagenId),
        contentScale = ContentScale.Crop, contentDescription = null)
}

//FUNCIÓN MUESTRA EN NUEVA VENTANA GATO SELECCIONADO CON SU RESPECTIVO COTENIDO
@Composable
private fun contenido (gato: Gato, alt: Dp){
    Column {
        raza(gato = gato) //RAZA DE GATO SELECCIONADO
        vistas(label = stringResource(id = R.string.Descripcion), value = gato.info) //DESCRIPCION DE GATO SELECCIONADO
        Spacer(modifier = Modifier.height((alt - 320.dp).coerceAtLeast(0.dp)))
    }
}

//MUESTRA RAZA DE GATO SELECCIONADO
@Composable
private fun raza (gato: Gato){
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text=gato.raza, style = MaterialTheme.typography.h5, fontWeight = FontWeight.Bold)
    }
}

//MUESTRA DESCRIPCION DE GATO SELECCIONADO
@Composable
private fun vistas (label: String, value: String){
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(text = label, modifier = Modifier.height(24.dp), style = MaterialTheme.typography.caption) //LABEL:DESCRIPCION
        Text(text = value, modifier = Modifier.height(100.dp), style = MaterialTheme.typography.body1, overflow = TextOverflow.Visible) //DESCRIPCON DE GATO SELECCIONADO
    }
}
