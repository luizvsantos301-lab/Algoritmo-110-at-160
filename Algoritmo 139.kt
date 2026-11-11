import scanner

fun main(){
    println("Digite o Nome do Municipio")
    val nome = scanner.nextLine()
    println("Numero de Eleitores aptos")
    val ne = scanner.nextInt()
    println("Numero de votos do candidato mais votado")
    val votos = scanner.nextInt()

    if(ne > 20000 && votos <= ne / 2)
        println("Terá segundo turno")
    else
        println("Não terá segundo turno")
}