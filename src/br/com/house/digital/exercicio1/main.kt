package br.com.house.digital.exercicio1

import java.util.ArrayList

fun main() {
    val listAnimals = ArrayList<String>()
    listAnimals.addAll(listOf("Pato", "Cachorro", "Gato"))
    listAnimals.forEach { println(it) }

    try {
        println(listAnimals[3])
    } catch (ex: Exception) {
        println(ex.message)
    }
}