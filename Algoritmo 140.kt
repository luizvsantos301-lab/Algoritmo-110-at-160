import java.util.Locale

fun main(){
    println("Digite Nome")
    val nome = readln().trim()
    println("Digite valor da conta")
    val vc = readln().toDoubleOrNull() ?: 0.0

    val letraInicial = nome.firstOrNull()?.uppercaseChar()
    if (letraInicial in listOf('A', 'D', 'M', 'S')) {
        val vcd = vc * 0.7
        val valorFormatado = String.format(Locale.US, "%.2f", vcd)
        println("\n$nome, valor da conta com desconto: R$ $valorFormatado")
    } else {
        println("\nQue pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará")
    }

    println()
}