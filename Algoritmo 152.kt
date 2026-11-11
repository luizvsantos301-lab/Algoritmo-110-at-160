fun main() {
    print("Digite o peso: ")
    val peso = readln().toDouble()

    print("Digite a idade: ")
    val idade = readln().toInt()

    // O medicamento possui 500mg por ml, e cada ml corresponde a 20 gotas
    val gotasPorMl = 20.0
    val mgPorMl = 500.0
    val mgPorGota = mgPorMl / gotasPorMl // 500 / 20 = 25 mg por gota

    if (peso <= 0) {
        println("Não pode tomar o remédio porque não tem peso. Consulte médico.")
    } else {
        val dosagemMg: Double = if (idade >= 12) {
            if (peso >= 60.0) {
                1000.0
            } else {
                875.0
            }
        } else {
            if (peso <= 9.0) {
                125.0
            } else if (peso <= 16.0) {
                250.0
            } else if (peso <= 24.0) {
                375.0
            } else if (peso <= 30.0) {
                500.0
            } else {
                750.0
            }
        }

        // Calcula a quantidade de gotas
        val totalGotas = dosagemMg / mgPorGota
        println("Tomar ${totalGotas.toInt()} gotas")
    }
}