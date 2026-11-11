fun main(){
    println("Digite 1 Numero")
    val a = scanner.nextDouble()
    println("Digite 2 Numero")
    val b = scanner.nextDouble()
    println("Digite 3 Numero")
    val c = scanner.nextDouble()

    val maior: Double
    val intermediario: Double
    val menor: Double

    if (a > b) {
        if (c > a) {
            maior = c
            intermediario = a
            menor = b
        } else {
            if (c > b) {
                maior = a
                intermediario = c
                menor = b
            } else {
                maior = a
                intermediario = b
                menor = c
            }
        }
    } else {
        if (c > b) {
            maior = c
            intermediario = b
            menor = a
        } else {
            if (c > a) {
                maior = b
                intermediario = c
                menor = a
            } else {
                maior = b
                intermediario = a
                menor = c
            }
        }
    }

    println("maior: $maior")
    println("intermediario: $intermediario")
    println("menor: $menor")
}