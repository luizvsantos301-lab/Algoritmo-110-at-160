fun main() {
    println("Digite o primeiro lado")
    val a = scanner.nextDouble()
    println("Digite o segundo lado")
    val b = scanner.nextDouble()
    println("Digite o terceiro lado")
    val c = scanner.nextDouble()
    if (a < b + c && b < a + c && c < a + b) {


    if (a == b && a == c) {
        println("Triangulo equilatero")
    } else if (a == b || a == c || b == c) {
            println("Triangulo Isoceles")
        } else {
            println("Triangulo Escaleno")
            }
        } else {
            println("As Medidas não formam um triangulo")
        }
    }

