package com.example.galeriagatos
//Abigail Chávez
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.galeriagatos.ui.theme.GaleriaGatosTheme

class MainActivity : ComponentActivity() {
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

@Composable
fun Greeting(nuevaVentana: (Gato) -> Unit){ //UNIT-VOID
    Scaffold(
        backgroundColor = Color(0xFFEACFBE), //Color fondo
        content = {
            GaleriadeGatos(nuevaVentana = nuevaVentana) //PASA POR PARÁMETRO (NUEVA VENTANA) PARA INICIARSE SI SE SELECCIONA
        }

    )
}