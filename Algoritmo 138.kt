fun main(){
    println("Digite vumnumero de 1 - 12")
    val num = readln().toInt()

    if (num == 1)
        println("Janeiro")
    else
        if (num == 2)
            println("Fevereiro")
    else
        if (num == 3)
            println("Março")
    else
        if (num == 4)
            println("Abril")
    else
        if (num == 5)
            println("Maio")
    else
        if (num == 6)
            println("Junho")
    else
        if (num == 7)
            println("Julho")
    else
        if (num == 8)
            println("Agosto")
    else
        if (num == 9)
            println("Setembro")
    else
        if (num == 10)
            println("Outubro")
    else
        if (num == 11)
            println("Novembro")
    else
        if (num == 12)
            println("Dezembro")
    else
        println("Não existe mês correspodente")
}