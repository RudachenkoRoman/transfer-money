package ru.netology

import kotlin.math.ceil

const val VALUE_COMMISSION = 35
const val PERCENT_COMMISSION: Double = 0.75

fun main(){
    printDelim()
    val money = readLine()?.toInt() ?: return

    if (money > 0) {
        val commissionMoney: Double = money / 100 * PERCENT_COMMISSION
        val commission = if(commissionMoney > VALUE_COMMISSION) {commissionMoney}
        else {VALUE_COMMISSION}
        val amount = if (commissionMoney > VALUE_COMMISSION) {money + commissionMoney}
        else {(money + VALUE_COMMISSION).toDouble()}
        println("Комиссия сотавила ${commission.toInt()} копеек")
        println("Сумма перевода с учетом комиссии сотавит ${ceil(amount).toInt()} копеек")
    }else {
        println("Вы ввели неверную сумму. Сумма должна быть больше 0")
    }
}

fun printDelim() {
    println("Програма для перевода денежных средств.")
    print("Введите сумму в копейках ")
}

