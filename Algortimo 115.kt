import kotlin.math.sqrt
import kotlin.math.pow
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Algoritmo 115")

    print("Digite o valor de x: ")
    val x = scanner.nextDouble()

    print("Digite o valor de y: ")
    val y = scanner.nextDouble()

    if (x > y) {
        println("Maior (x): $x | Menor (y): $y")
        println("Quadrado de y: ${y.pow(2.0)}")
        if (x >= 0) {
            println("Raiz quadrada de x: ${sqrt(x)}")
        } else {
            println("Não é possível calcular a raiz quadrada de x (número negativo).")
        }
    } else if (y > x) {
        println("Maior (y): $y | Menor (x): $x")
        println("Quadrado de x: ${x.pow(2.0)}")
        if (y >= 0) {
            println("Raiz quadrada de y: ${sqrt(y)}")
        } else {
            println("Não é possível calcular a raiz quadrada de y (número negativo).")
        }
    } else {
        println("Números iguais.")
    }

    println("Fim do programa.")
}

