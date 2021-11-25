package com.example.galeriagatos

import androidx.compose.runtime.mutableStateListOf

//CREAR OBJETOS DE TIPO DE GATO
object Sistema{
    val gato =
        Gato(
            id = 1,
            raza = "Gato persa",
            info= "El Persa es una raza de gato caracterizada por tener una cara ancha y plana y un gran abundante pelaje de variados colores. Son considerados comúnmente como gatos aristocráticos.",
            imagenId = R.drawable.gatopersa
        )
    //LISTA DE GATOS TIPO MUTABLELIST
    val listaGato = mutableStateListOf(
        gato,
        Gato(
            id= 2,
            raza = "Gato siamés",
            info = "El siamés es una raza de gato. Dentro de dicha raza se distinguen dos variedades: por un lado el siamés moderno, y por otro el siamés tradicional o Thai.",
            imagenId = R.drawable.gatosiames
        ),
        Gato(
            id= 3,
            raza = "Ragdoll",
            info = "El ragdoll es una raza de gato característica por su gran docilidad. Los Ragdolls adoran a sus dueños humanos y no les gusta estar solos.",
            imagenId = R.drawable.ragdoll
        ),
        Gato(
            id= 4,
            raza = "British Shorthair",
            info = "El Británico de pelo corto o British Shorthair es una raza de gato que desciende del cruce entre los gatos que llevaron a Britania los romanos y los nativos de la isla. Estos gatos se protegen muy bien del clima británico por su pelaje doble e impermeable.",
            imagenId = R.drawable.bshorthair
        ),
        Gato(
            id= 5,
            raza = "Scottish Fold",
            info = "El Fold escocés es una raza de gato originaria de Escocia, Reino Unido, de una estructura ósea mediana y una gran musculatura. Posee pies redondos y una cola gruesa de tamaño medio. Su cabeza es muy redondeada, con las pequeñas orejas plegadas.",
            imagenId = R.drawable.scotishfold
        ),
        Gato(
            id= 6,
            raza = "Sphynx",
            info = "El Sphynx o gato esfinge es una raza de gato. Pertenece a la familia de los félidos y al género Felis. La característica más llamativa de esta raza es la aparente ausencia de pelaje y su aspecto delgado y esbelto.",
            imagenId = R.drawable.sphynx
        ),
        Gato(
            id= 7,
            raza = "Bengala",
            info = "El bengala es una raza de gato doméstica desarrollada para parecerse a los felinos salvajes exóticos tales como son los leopardos, ocelotes, margays, etc.",
            imagenId = R.drawable.bengala
        ),
        Gato(
            id= 8,
            raza = "Munchkin",
            info = "El munchkin es una raza de gato surgida por una mutación genética natural, mantenida por cruzamientos selectivos, que da lugar a gatos con patas más cortas de lo normal.",
            imagenId = R.drawable.munchkin
        ),
        Gato(
            id= 9,
            raza = "Angora turco",
            info = "Los angora son la raza más antigua, originaria de la región de Anatolia. Pese a ello, el término angora ha sido aplicado para designar a cualquier gato de pelo largo, negro y lacio, sin importar su origen o raza.",
            imagenId = R.drawable.angora
        ),
        Gato(
            id= 10,
            raza = "Gato común europeo",
            info = "El gato común europeo es descendiente del gato montés africano y del gato de la jungla. Fue reconocido como raza el 1 de enero de 1983. Los felinos de esta raza son fuertes y cuentan con un sólido sistema inmunológico.",
            imagenId = R.drawable.gatoeuropeo
        ),
        Gato(
            id= 11,
            raza = "Sagrado de Birmania",
            info = "El Gato Birmano o Sagrado de Birmania es una raza de gato de pelo semilargo. Se caracteriza por sus guantes que han de ser de un color blanco inmaculado, sus ojos azul zafiro, su pelo de color claro con zonas de tonalidades más oscuras.",
            imagenId = R.drawable.sbirmania
        ),
        Gato(
            id= 12,
            raza = "Cymric",
            info = "El Cymric es un gato de tamaño medio de complexión fuerte y huesos robustos. Puede parecer más grande de lo que es y es posible no ser consciente de lo pesado que puede llegar a ser una vez alcanzada la plena madurez.",
            imagenId = R.drawable.cymric
        )
    )
}