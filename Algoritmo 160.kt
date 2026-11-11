import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("\ndigite valor de x: ")
    val x = scanner.nextDouble()

    val y = when {
        x <= 1.0 -> 1.0
        x <= 2.0 -> 2.0
        x <= 3.0 -> x * x // ou Math.pow(x, 2.0)
        else -> x * x * x // ou Math.pow(x, 3.0)
    }

    println("\nvalor de f(x): $y")
    println("\n")
}