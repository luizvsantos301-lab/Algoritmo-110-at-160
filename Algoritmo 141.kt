fun main(){
    println("Digite 1 nome")
    var n1 = scanner.next()
    println("Digite pontos")
    var p1 = scanner.nextInt()
    println("Digite 2 nome")
    var n2 = scanner.next()
    println("Digite pontos")
    var p2 = scanner.nextInt()
    println("Digite 3 nome")
    var n3 = scanner.next()
    println("Digite pontos")
    var p3 = scanner.nextInt()

    var aux: Int
    var auxn: String

        if (p1 < p2) {
            aux = p1; p1 = p2; p2 = aux
            auxn = n1; n1 = n2; n2 = auxn
        }
    if (p1 < p3) {
        aux = p1; p1 = p3; p3 = aux
        auxn = n1; n1 = n3; n3 = auxn
    }
    if (p2 < p3) {
        aux = p2; p2 = p3; p3 = aux
        auxn = n2; n2 = n3; n3 = auxn
    }

    println("VENCEDOR: $n1 ($p1 pontos)")
    println("SEGUNDO COLOCADO: $n2 ($p2 pontos)")
    println("TERCEIRO COLOCADO: $n3 ($p3 pontos)")
}


