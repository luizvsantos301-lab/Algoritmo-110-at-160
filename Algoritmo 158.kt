fun main() {
    print("digite valor de x: ")
    val input = readln().toDoubleOrNull()

    if (input != null) {
        val x = input
        if (x != 2.0) { // Equivalente a x <> 2
            val fx = 8.0 / (2.0 - x)
            println("f(x)= $fx")
        } else {
            println("NAO PODE SER FEITA")
        }
    } else {
        println("Valor inválido")
    }
    println()
}