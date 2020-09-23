package br.com.house.digital.exercicio3

class CalculoMatematico {

    fun divisao(num1: Int, num2: Int): Int {
        return if (num2 == 0) {
            throw ArithmeticException("Divisão por ZERO")
        } else {
            num1 / num2
        }
    }
}