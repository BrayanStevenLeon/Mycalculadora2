package com.example.mycalculadora2


import androidx.appcompat.app.AppCompatActivity
import org.junit.Test
import org.junit.Assert.*

class CalculadoraTest {

    @Test
    fun testSuma() {
        val calculadora = Calculadora()
        val resultado = calculadora.sumar(2.0, 3.0)
        assertEquals(5.0, resultado, 0.001)
    }

    @Test
    fun testResta() {
        val calculadora = Calculadora()
        val resultado = calculadora.restar(5.0, 3.0)
        assertEquals(2.0, resultado, 0.001)
    }

    @Test
    fun testMultiplicacion() {
        val calculadora = Calculadora()
        val resultado = calculadora.multiplicar(2.0, 3.0)
        assertEquals(6.0, resultado, 0.001)
    }

    @Test
    fun testDivision() {
        val calculadora = Calculadora()
        val resultado = calculadora.dividir(6.0, 3.0)
        assertEquals(2.0, resultado, 0.001)
    }

    @Test
    fun testFactorial() {
        val calculadora = Calculadora()
        val resultado = calculadora.factorial(5)
        assertEquals(120, resultado)
    }

    @Test
    fun testFibonacci() {
        val calculadora = Calculadora()
        val resultado = calculadora.fibonacci(6)
        assertEquals(8, resultado)
    }
}
