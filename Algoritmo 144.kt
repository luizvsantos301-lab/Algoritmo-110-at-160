import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("\nDigite o saldo médio: ")
    val saldoMedio = scanner.nextDouble()

    val credito: Double = when {
        saldoMedio < 501.0 -> 0.0
        saldoMedio < 1001.0 -> saldoMedio * 0.3
        saldoMedio < 3001.0 -> saldoMedio * 0.4
        else -> saldoMedio * 0.5
    }

    if (credito != 0.0) {
        println("\nComo seu saldo era de: $saldoMedio , seu crédito será de: $credito")
    } else {
        println("\nComo seu saldo era de: $saldoMedio , você não terá nenhum crédito")
    }
    println()
}