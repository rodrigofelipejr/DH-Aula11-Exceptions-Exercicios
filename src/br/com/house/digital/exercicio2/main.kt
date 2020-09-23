package br.com.house.digital.exercicio2

import java.util.ArrayList

fun main() {
//    var listAnimals: ArrayList<String>? = null
    val listAnimals: ArrayList<String>? = ArrayList<String>()
//    listAnimals = ArrayList<String>()

    listAnimals?.addAll(listOf("Pato", "Cachorro", "Gato"))

    println(listAnimals?.get(2))

    try {
        println(listAnimals?.get(5))
    } catch (ex: Exception) {
        println(ex.message)
    }
}