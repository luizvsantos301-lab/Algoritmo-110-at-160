import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Digite 1 numero")
    var a = scanner.nextDouble()
    println("Digite 2 numero")
    var b = scanner.nextDouble()
    println("Digite 3 numero")
    var c = scanner.nextDouble()

    var aux = readln().toDoubleOrNull() ?: 0.0

    if (a > b) {
        aux = a
        a = b
        b = a
    }
    if (a > c) {
        aux = a
        a = b
        b = aux
    }
    if ( b > c) {
        aux = b
        b = c
        c = aux
    }
        println("Ordem Crescente: $a, $b, $c")
    }



