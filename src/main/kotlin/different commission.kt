class `different commission` {
}
fun main() {
    val cardType = "Vk Pay"
    val sumLastTransfers = 0
    val currentTransfer = 11_000_00

    val test = getComission(cardType, sumLastTransfers, currentTransfer)
    if (test == -1) println("Превышен лимит") else println("Комиссия составит: $test копеек")
}

fun getComission (cardType: String, sumLastTransfers: Int, currentTransfer: Int): Int {
    return when (cardType) {
        "Maestro", "Mastercard" -> if (sumLastTransfers in 0..600_000_00 && currentTransfer in 0..150_000_00)
            comissionMaestroMastercard(currentTransfer)
            else -1
        "Visa", "Мир" -> if (sumLastTransfers in 0..600_000_00 && currentTransfer in 0..150_000_00)
            comissionVisaMir(currentTransfer, minCommission)
            else -1
        "Vk Pay" -> if (sumLastTransfers in 0..40_000_00 && currentTransfer in 0..15_000_00) 0 else -1
        else -> -1
    }
}

val minCommission = 35_00
fun comissionVisaMir (currentTransfer: Int, minCommission: Int) =
    if ((currentTransfer * 0.0075) > minCommission)
            (currentTransfer * 0.0075).toInt()
        else minCommission


fun comissionMaestroMastercard (currentTransfer: Int) =
        if (currentTransfer > 75_000_00)
            (currentTransfer * 0.006 + 20_00).toInt()
        else 0



