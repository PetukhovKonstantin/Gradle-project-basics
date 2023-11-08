package basics.task1

fun main() {
    val amount = 5000
    val commissionPercent = 0.75
    val minCommission = 35
    val commissionTotal = amount * commissionPercent / 100
    val result = if (commissionTotal < minCommission) minCommission else commissionTotal

    println("При переводе $amount комиссия составит $result")
}