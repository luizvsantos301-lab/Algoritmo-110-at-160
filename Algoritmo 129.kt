fun main(){
    println("Digite o Salario")
    val salario = scanner.nextDouble()
    val desconto = scanner.nextDouble()
    if (salario <= 600)
        (desconto < 0)
    else
        if (salario <= 1200)
            (desconto < salario)
    else
        if (salario <= 2000)
            (desconto < salario * 0.25)
    else
            (desconto <= salario * 0.30)
        println(desconto)
        

}