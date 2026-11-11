fun main() {
    println("Entre com a Altura:")
    val h = readln()?.toDoubleOrNull() ?: 0.0
    println("Entre com o sexo M / F")
    val sexo = readln()?.trim()
    val peso = when (sexo) {
        "M", "m" -> (72.7 * h) - 58
        else -> (62.1 * h) -44.7
}
        println("Seu peso ideal: $peso")

}