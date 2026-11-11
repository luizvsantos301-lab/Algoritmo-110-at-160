import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun main() {
    print("\nDigite o angulo em graus: ")
    val ang = readln().toDouble()

    // Converte o ângulo de graus para radianos
    val rang = ang * PI / 180.0

    // Verifica se o ângulo está no 2º ou 4º quadrante
    if ((rang > PI / 2 && rang <= PI) || (rang > 3 * PI / 2 && rang <= 2 * PI)) {
        println("\nseno: ${sin(rang)}")
    } else {
        println("\nco-seno: ${cos(rang)}")
    }
}