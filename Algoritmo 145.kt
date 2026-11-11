fun main(){
    var livro: String = ""
    var tipo: String = ""
    var dia: Int = 0
    println("Digite nome do Livro")
    livro = readln()
    println("Digite: Professor / aluno:")
    tipo = readln()

    if ( tipo == "professor" || tipo == "Professor" || tipo == "PROFESSOR"){
    dia = 10
    } else if(tipo == "Aluno" || tipo == "AlUNO") {
       dia = 3
    } else {
        dia = 0
    }

    if (dia == 0) {
    println("Tipo de usuario desconhecido")
    }else{
    println("Nome do Livro: $livro")
    println("Nome tipo de usuario: $tipo")
    println("Total de dias: $dia")
        }
}