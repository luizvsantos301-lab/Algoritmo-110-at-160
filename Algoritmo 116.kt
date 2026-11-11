fun main(){
    println("Digite 1 numero:")
    val a = scanner.nextInt()
    println("Digite 2 numero:")
    val b = scanner.nextInt()
    println("Digite 3 numero:")
    val c = scanner.nextInt()

    if(a > b) {

        if (a > c)
            println("Maior: $a")
        else
            println("Maior: $c")
    }
        else
    {
            if (b > c)
                println("Maior: $b")
        else
            println("Maior: $c")


    }
}