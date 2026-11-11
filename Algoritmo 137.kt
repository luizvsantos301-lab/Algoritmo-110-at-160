import kotlin.math.sqrt

fun main() {
    println("Entre com valor de a")
    val a = scanner.nextInt()
    println("Entre com valor de b")
    val b = scanner.nextInt()
    println("Entre com valor de c")
    val c = scanner.nextInt()

    if (a == 0) {
        println("Não é equação do Segundo Grau")
    } else {
        val d = (b * b) - (4 * a * c)
        if (d >= 0) {
            val RAIZd = sqrt(d.toDouble())
            val x1 = (-b + RAIZd) / (2 * a)
            val x2 = (-b - RAIZd) / (2 * a)
            println("X1 = $x1")
            println("X2 = $x2")
        } else {
            println("Não há raízes reais")
        }
    }
}


