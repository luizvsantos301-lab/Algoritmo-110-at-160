

fun main() {
    println("Digite uma palavra: ")
    val pal = readlnOrNull()?.trim() ?: ""

    if (pal.isEmpty()) {
        println("\nNenhuma palavra foi digitada.")
        return
    }

    val tamanho = pal.length

    // Caso o número de caracteres seja PAR
    if (tamanho % 2 == 0) {
        val n1 = tamanho / 2
        val n2 = n1 - 1

        // Pega os dois caracteres centrais e os junta em uma String
        val p1 = pal[n1].toString()
        val p2 = pal[n2].toString()
        val p3 = p2 + p1 // Ou simplesmente: pal.substring(n2, n1 + 1)

        if (p3 == "rr" || p3 == "ss") {
            println("\nE rr OU ss")
        } else {
            println("\nNAO E rr OU ss")
        }
    }
    // Caso o número de caracteres seja ÍMPAR
    else {
        val n1 = tamanho / 2
        val p1 = pal[n1].toString()

        if (p1 == "a" || p1 == "e" || p1 == "i" || p1 == "o" || p1 == "u") {
            println("\nE VOGAL")
        } else {
            println("\nNAO E VOGAL")
        }
    }
    println()
}