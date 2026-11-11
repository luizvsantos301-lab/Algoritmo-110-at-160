import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numeros = mutableListOf<Int>()

    // Lendo os 5 números
    for (i in 1..5) {
        print("Digite o $i número: ")
        val n = scanner.nextInt()
        numeros.add(n)
    }

    // Verifica se todos os números são diferentes (tamanho do Set igual a 5)
    if (numeros.toSet().size == 5) {
        val maior = numeros.maxOrNull()
        val menor = numeros.minOrNull()

        println("\nMaior: $maior")
        println("Menor: $menor")
    } else {
        println("\nOs valores devem ser diferentes.")
    }
}