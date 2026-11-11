import java.util.Locale

fun main() {
    println("Digite os pontos do primeiro jogador")
    var p1 = scanner.nextInt()
    println("Digite os pontos do segundo jogador")
    var p2 = scanner.nextInt()
    println("Digite os pontos do terceiro jogador")
    var p3 = scanner.nextInt()

    var aux: Int

    if (p1 > p2) {
        aux = p1; p1 = p2; p2 = aux
        if (p1 > p3)
            aux = p1; p1 = p3; p2 = aux
        if (p2 > p3)
            aux = p2; p2 = p3; p3 = aux

        val soma = p1 + p2 + p3
        if (soma > 100) {
            val media = null
            println(String.format(Locale.US, "\nMedia = %.2f", media))
        } else {
            println("\nEquipe desclassificada!")
        }
    }
}


