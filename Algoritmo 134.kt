fun main(){
    println("Entre com a Idade")
    val idade = readln().toInt()

    if(idade < 5)
        println("Não existe categoria para essa idade")
    else
        if (idade <= 7)
            println("Categoria Infantil A")
    else
        if (idade <= 10)
            println("Categoria Infantil B")
    else
        if (idade <= 13)
            println("Categoria Juvenil A")
    else
        if (idade <= 17)
            println("Categoria Juvenil B")
    else
        println("Categoria Senior")
}