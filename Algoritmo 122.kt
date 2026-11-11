fun main(){
    println("Digite o primeiro lado")
    val a = readln().toDoubleOrNull() ?: 0.0
    println("Digite o segundo lado")
    val b = readln().toDoubleOrNull() ?: 0.0
    println("Digite o terceiro lado")
    val c = readln().toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo")
    } else {
        println("Não podem ser lados de um triângulo")
    }
}


