fun main(){
    println("Digite sua idade")
    val idade = readln().toInt()

    if( idade < 16)
        println("Não eleitor")
    else
        if (idade > 65)
            println("Eleitor facultativo")
    else
        println("Eleitor Obrigatorio")
}