package com.example.galeriagatos
//Abigail Chávez
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.galeriagatos.Sistema.gato
import com.example.galeriagatos.Sistema.listaGato
import com.example.galeriagatos.ui.theme.GaleriaGatosTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaGatosTheme {
                //INICIA PROGRAMA INICIAL
                Greeting{
                    startActivity(GatoSeleccionado.seleccion(this, it)) //INICIA NUEVA VENTANA A PARTIR DE LA VENTANA INICIAL
                }
            }
        }
    }
}
@ExperimentalMaterialApi
@Composable
fun Greeting(nuevaVentana: (Gato) -> Unit){ //UNIT-VOID
    Scaffold(
        backgroundColor = Color(0xFFEACFBE), //Color fondo
        content = {
            GaleriadeGatos(nuevaVentana = nuevaVentana) //PASA POR PARÁMETRO (NUEVA VENTANA) PARA INICIARSE SI SE SELECCIONA
        }
    )
}

