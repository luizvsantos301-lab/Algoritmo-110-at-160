import java.util.Locale
import java.util.Scanner

fun main() {
    // Configura o Scanner para aceitar ponto (.) como separador decimal
    val scanner = Scanner(System.`in`).useLocale(Locale.US)

    print("\nDigite o nome do produto: ")
    val nomep = scanner.nextLine()

    print("\nDigite o valor da compra: ")
    val vcompra = scanner.nextDouble()

    // Calcula o valor de venda usando a estrutura 'when' (equivalente aos 'se/senao' aninhados)
    val vvenda = when {
        vcompra < 10.0 -> vcompra * 1.7
        vcompra < 30.0 -> vcompra * 1.5
        vcompra < 50.0 -> vcompra * 1.4
        else -> vcompra * 1.3
    }

    // Formata o valor para 2 casas decimais e imprime o resultado
    val valorFormatado = String.format(Locale("pt", "BR"), "%.2f", vvenda)
    println("\n$nomep será vendido por R$ $valorFormatado\n")
}