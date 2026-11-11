import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite o 1º lado: ")
    val a = scanner.nextDouble()

    print("Digite o 2º lado: ")
    val b = scanner.nextDouble()

    print("Digite o 3º lado: ")
    val c = scanner.nextDouble()

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double

        if (a > b && a > c) {
            maior = a.pow(2)
            lados = b.pow(2) + c.pow(2)
        } else if (b > c) {
            maior = b.pow(2)
            lados = a.pow(2) + c.pow(2)
        } else {
            maior = c.pow(2)
            lados = a.pow(2) + b.pow(2)
        }

        if (maior == lados) {
            println("Triângulo Retângulo")
        } else if (maior > lados) {
            println("Triângulo Obtusângulo")
        } else {
            println("Triângulo Acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}