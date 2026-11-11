fun main(){
    println("Digite valor de x")
    val x = scanner.nextInt()

    if (x == 5)
        println("O numero é o 5")
    else
        if (x === 200)
       println("O numero é o 200")
       else
    if (x == 400)
        println("O numero é o 400")
    else
        if (x in 500 .. 1000)
            println("Intervalo 500-1000")
    else
        println("Fora do Escopo")
}