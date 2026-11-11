import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("data no formato ddmmaaaa: ")
    val data = scanner.nextInt()

    val dia = data / 1000000
    val mes = (data % 1000000) / 10000
    val ano = data % 10000

    var vd = 1

    if (ano >= 1) {
        if (mes > 12 || dia < 1 || dia > 31) {
            vd = 0
        } else {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                vd = 0
            } else {
                if (mes == 2) {
                    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                        if (dia > 29) {
                            vd = 0
                        }
                    } else {
                        if (dia > 28) {
                            vd = 0
                        }
                    }
                }
            }
        }
    } else {
        vd = 0
    }

    if (vd == 0) {
        println("\nDATA INVALIDA")
    } else {
        println("\nDATA VALIDA")
    }
    println()
}