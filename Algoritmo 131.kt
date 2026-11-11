fun main(){
    println("Digite Nome")
    val nome = scanner.nextLine().trim()
    val primeiraLetra = nome.firstOrNull()?.uppercaseChar()
    when (primeiraLetra) {
        in 'A'..'K' -> println("\n$nome - Sala: 101 (Bloco F)")
        in 'L'..'N' -> println("\n$nome - Sala: 102 (Bloco F)")
        in 'O'..'Z' -> println("\n$nome - Sala: 103 (Bloco F)")
        else -> println("\nNOME INVÁLIDO")
    }
}


