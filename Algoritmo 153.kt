fun main() {
    print("Digite o indice de poluicao: ")
    val indice = readln().toDouble()

    if (indice >= 0.5) {
        println("\nSuspender atividades as industrias dos grupos 1, 2 e 3")
    } else if (indice >= 0.4) {
        println("\nSuspender atividades as industrias dos grupos 1 e 2")
    } else if (indice >= 0.3) {
        println("\nSuspender atividades as industrias dos grupos 1")
    } else {
        println("\nIndice de poluicao aceitavel para todos os grupos")
    }
}