fun main() {
    var ano: Int
    var mes: Int
    var dia: Int
    var vd: Int

    print("\ndigite dia: ")
    dia = readln().toInt()

    print("\ndigite mes: ")
    mes = readln().toInt()

    print("\ndigite ano: ")
    ano = readln().toInt()

    if (ano >= 1) {
        vd = 1
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
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
}