package ru.netology

import kotlin.math.ceil

const val VALUE_COMMISSION: Double = 35.0
const val PERCENT_COMMISSION: Double = 0.75

fun main() {
    println("Програма для перевода денежных средств.")
    print("Введите сумму в копейках ")
    val money = readLine()?.toInt() ?: return

    if (money <= 0) {
        println("Вы ввели неверную сумму. Сумма должна быть больше 0")
        return
    } else {
        var commissionMoney: Double = money / 100 * PERCENT_COMMISSION
        val amount = if (commissionMoney > VALUE_COMMISSION) {
            money + commissionMoney
        } else {
            commissionMoney = VALUE_COMMISSION
            (money + VALUE_COMMISSION)
        }
        println("Комиссия сотавила ${ceil(commissionMoney).toInt()} копеек")
        println("Сумма перевода с учетом комиссии сотавит ${ceil(amount).toInt()} копеек")
    }
}

