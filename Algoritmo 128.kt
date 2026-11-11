
fun main() {
    print("Digite um verbo: ")
    val entrada = readlnOrNull()?.trim() ?: ""

    // Converte para minúsculas para facilitar a verificação
    val verbo = entrada.lowercase()

    // Verifica se tem pelo menos 2 caracteres e termina com 'r' (infinitivo)
    if (verbo.length >= 2 && verbo.endsWith('r')) {
        val penultimaLetra = verbo[verbo.length - 2]

        when (penultimaLetra) {
            'a' -> println("verbo da 1ª-conjugação")
            'e' -> println("verbo da 2ª-conjugação")
            'i' -> println("verbo da 3ª-conjugação")
            else -> println("verbo não está no infinitivo")
        }
    } else {
        println("verbo não está no infinitivo")
    }
}