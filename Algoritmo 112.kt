fun main(){
    println("Digite o primeiro numero")
    val a = readln().toDoubleOrNull() ?: 0.0
    println("Digite o segundo numero")
    val b = readln().toDoubleOrNull() ?: 0.0

    if(a < b) {
        println("Menor: $a")
    } else {
        println("Menor: $b")
    }
}