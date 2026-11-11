fun main() {
    print("digite palavra: ")
    val pal = readln()
    val tam = pal.length

    val letra = pal.firstOrNull() ?: ' '

    val pall: String
    if (letra == 'l' || letra == 'L' || letra == 'd' || letra == 'D') {
        val part1 = pal.take(2)
        val pal2 = pal.last().toString()
        pall = part1 + pal2
    } else {
        pall = pal.drop(1)
    }

    println("palavra: $pall")
}