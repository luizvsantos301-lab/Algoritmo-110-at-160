import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite 1 numero: ")
    var a = scanner.nextDouble()

    print("Digite 2 numero: ")
    var b = scanner.nextDouble()

    print("Digite 3 numero: ")
    var e = scanner.nextDouble()

    var aux: Double

    if (a > b) {
        aux = a
        a = b
        b = aux
    }

    if (a > e) {
        aux = a
        a = e
        e = aux
    }

    if (b > e) {
        aux = b
        b = e
        e = aux
    }

    println("Ordem Crescente: $a, $b, $e")
}