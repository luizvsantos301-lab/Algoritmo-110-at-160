fun main(){
    println("Digite o Valor")
    val valor = readln().toDoubleOrNull()
    if (valor != null) {

        val valorVenda = if (valor < 20.00) {
            valor * 1.45
        } else {
            valor * 1.30
        }
        println("Valor de venda: $valorVenda")
    } else {
        println("Numero inválido")
    }
}