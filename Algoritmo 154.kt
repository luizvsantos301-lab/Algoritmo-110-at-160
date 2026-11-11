fun main() {
    print("digite placa: ")
    val placa = readlnOrNull() ?: ""

    // Pega o último caractere da string (equivalente a strult)
    val p = placa.lastOrNull()

    when (p) {
        '1' -> println("janeiro")
        '2' -> println("fevereiro")
        '3' -> println("marco")
        '4' -> println("abril")
        '5' -> println("maio")
        '6' -> println("junho")
        '7' -> println("julho")
        '8' -> println("agosto")
        '9' -> println("setembro")
        '0', 'O', 'o' -> println("outubro")
        else -> println("opcao invalida")
    }
}