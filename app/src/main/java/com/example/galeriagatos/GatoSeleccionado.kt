package com.example.galeriagatos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.galeriagatos.ui.theme.GaleriaGatosTheme
//GATO SELECCIONADO EN LA VENTANA INICIAL
class GatoSeleccionado : ComponentActivity() {

    private val gato: Gato by lazy {
        intent?.getSerializableExtra(idGato) as Gato //OBTIENE VALOR DEL ID SELECCIONADO EN OTRA ACTIVIDAD
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            GaleriaGatosTheme {
                ventanaGato(gato = gato) //NUEVA VENTANA INICIADA
            }
        }
    }

    //COMPONE LA INFORMACIÓN DE LOS OBEJTOS
    companion object{
        private const val idGato = "IDGATO"
        fun seleccion (context: Context, gato: Gato)=Intent(context, GatoSeleccionado::class.java).apply{
            putExtra(idGato, gato)
        }
    }
}