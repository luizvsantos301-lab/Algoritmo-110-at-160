fun main(){
    println("Digite nome:")
    val nome = scanner.nextInt()
    println("Digite a primeira nota:")
    val nota1 = scanner.nextDouble()
    println("Digite a segunda nota:")
    val nota2 = scanner.nextDouble()

    val media = (nota1 + nota2) / 2
    if (media >= 7)
        println("Resultado")
        println("Nome: $nome")
        println("Nota Pr1: $nota1")
        println("Nota Pr2: $nota2")
        println("Media: $media")

    if (media >= 7.0) {
        println("Situação: Aprovado (AP)")
    } else if (media < 3.0) {
        println("Situação: Reprovado (RP)")
    } else {
        println("Situação: Em Prova Final (PF)")
    }
}



