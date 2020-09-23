package br.com.house.digital.exercicio3

fun main() {
    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch (e: ArithmeticException) {
        println(e.localizedMessage)
    }
}