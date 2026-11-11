import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\ndigite valor de x: ")
    val x = readlnOrNull()?.toDoubleOrNull()

    if (x != null) {
        if (x > 4.0 || x < -4.0) {
            val fx = (5 * x + 3) / sqrt(x.pow(2) - 16)
            println("\nf(x)= $fx")
        } else {
            println("\nNAO PODE SER FEITA ")
        }
        println()
    } else {
        println("\nEntrada inválida.")
    }
}
