fun main(){
    println("Entre com Nome")
    val nome = readln().toString()
    println("Entre para o idade")
    val idade = readln().toInt()
    if(idade <= 10)
        println("$nome pagara R$ 30,00")
    else
        if (idade <= 29)
            println("$nome pagara R$ 60,00")
    else
        if (idade <= 45)
            println("$nome pagara R$ 120,00")
    else
        if (idade <= 59)
            println("$nome pagara R$ 150,00")
    else
        if (idade <= 65)
            println("$nome pagara R$ 250,00")
    else
        println("$nome pagara R$ 400,00")

}