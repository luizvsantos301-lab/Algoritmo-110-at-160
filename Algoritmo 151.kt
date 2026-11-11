fun main() {
    print("digite peso: ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0

    print("digite altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val imc = peso / (altura * altura)

    if (imc < 20.0) {
        println("abaixo do peso")
    } else {
        if (imc <= 25.0) {
            println("normal")
        } else {
            if (imc <= 30.0) {
                println("excesso de peso")
            } else {
                if (imc <= 35.0) {
                    println("obesidade")
                } else {
                    println("obesidade mórbida")
                }
            }
        }
    }
}