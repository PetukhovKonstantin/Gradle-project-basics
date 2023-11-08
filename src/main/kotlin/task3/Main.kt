package basics.task3

fun main() {
    val regularCustumer = true
    val additionalDiscountInPercent = 1
    val discountInRubles = 100
    val discountInPercent = 5

    val amount = 10_001

    var totalCost = amount
    if (amount > 1_000 && amount <= 10_000)
        totalCost -= discountInRubles
    else if (amount > 10_000)
        totalCost -= (totalCost * discountInPercent / 100).toInt()
    if (regularCustumer)
        totalCost -= (totalCost * additionalDiscountInPercent / 100).toInt()

    println("У Вас товаров на $amount руб., сумма покупки после применения скидок составляет $totalCost")
}