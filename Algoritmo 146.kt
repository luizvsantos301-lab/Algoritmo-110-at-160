fun main(){
    println("Digite tipo de carro(A/B/C):")
    val tipo = readln().trim().uppercase()
    println("Digite percurso")
    val percurso  = readln().toDoubleOrNull() ?: 0.0

    val consumo: Double = when (tipo) {
        "C" -> percurso / 12.0
        "D" -> percurso / 10.0
        "A" -> percurso / 8.0
        else -> 0.0
    }

    if(consumo > 0.0) {
        val consumoFormatado = String.format("%.2f", consumo)
        println("Consumo estimado em Litros: $consumoFormatado")
    }else {
            println("Modelo inexistente")
    }





}