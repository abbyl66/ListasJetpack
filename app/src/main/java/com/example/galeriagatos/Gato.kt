package com.example.galeriagatos

import java.io.Serializable

//CONSTRUCTOR DE GATO
data class Gato(
    val id: Int,
    val raza: String,
    val info: String,
    val imagenId: Int=0
): Serializable
