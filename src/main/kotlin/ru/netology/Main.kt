package ru.netology

const val VALUE_COMMISSION = 35
const val PERCENT_COMMISSION: Double = 0.75

fun main() {
    printDelim()
    val money = readLine()?.toInt() ?: return
    val commissionMoney: Double = money / 100 * PERCENT_COMMISSION
    calculationOfTheAmount(money, commissionMoney)
}

fun printDelim() {
    println("Програма для перевода денежных средств.")
    println("Введите сумму в копейках")
}

fun calculationOfTheAmount(money: Int, commissionMoney: Double) {
    val amount: Double
    if (money > 0) {
        if (commissionMoney < VALUE_COMMISSION) {
            amount = (money + VALUE_COMMISSION).toDouble()
            println("Комиссия сотавила $VALUE_COMMISSION копеек")
            println("Сумма перевода сотавит ${amount.toInt()} копеек")
        } else {
            amount = money + commissionMoney
            println("Комиссия сотавила $commissionMoney копеек")
            println("Сумма перевода сотавит $amount копеек")
        }
    } else {
        println("Вы ввели неверную сумму. Сумма должна быть больше 0")
    }
}
