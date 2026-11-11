fun main(){
    println("Digite 1 numero")
    val a = scanner.nextInt()
    println("Digite 2 numero")
    val b = scanner.nextInt()
    println("Digite 3 numero")
    val c = scanner.nextInt()

    val maior = scanner.nextInt()

    if (a > b) {
        println("maior <- $a")
    } else {
            println("maior <- $b")
        if (c > maior)
            println("maior <- $c")
        println("Maior: $maior")
    }
}