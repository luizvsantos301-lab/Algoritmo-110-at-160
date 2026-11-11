

fun main(){
    println("Digite valor em reais a ser convertido")
    val r = scanner.nextDouble()
    println("digite f - franco suico l - libra esterlina d - dolar m - marco alemao")
    val moeda = scanner.next().lowercase()
    if (moeda == "f" || moeda == "F") {
        println("Digite valor de um franco suico em reais:")
        val f = scanner.nextDouble()
        val total = f / moeda
        println("Total de francos suicos: $total")
    }else {
            if(moeda == "l" || moeda == "L") {
                println("Digite valor de uma libra esterlina em reais:")
                val l = scanner.nextDouble()
                val total = l / moeda
                println("Total de libra es: $total")
            }else {
                    if(moeda == "d" || moeda == "D") {
                        println("Digite valor de um dolar um dolar em reais:")
                        val d = scanner.nextDouble()
                        val total = d / moeda
                        println("Total de Dolar: $total")
                    } else {
                        if (moeda == "m" || moeda == "M") {
                            println("Digite valor de um marco alemao em reais:")
                            val m = scanner.nextDouble()
                            val total = m / moeda
                            println("Total de M: $total")
                        }else{
                            println("Moeda desconhecida")
                        }

                    }
            }
            }
    }

private operator fun Double.div(moeda: String) {
    TODO("Not yet implemented")
}
