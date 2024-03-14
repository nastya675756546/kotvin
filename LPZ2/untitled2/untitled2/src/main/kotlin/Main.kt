package org.example


fun main() {
    val typeR = "Visa"
    var sumD = 0.00
    var sumM = 0.00
    var sum = 60000.00
    var com = if(sumD > 150_000 || sumM > 6_000_000 || (typeR.equals("Vk Pay") && (sum > 15_000 || sumM > 40_000)))
        "Лимит привышен" else comisia(typeR,sumM, sum)

    sumD = org.example.sumDayOrMonth(sum, sumD)
    sumM = org.example.sumDayOrMonth(sum, sumM)

    println("Сумма коммисии: $com")

}

fun comisia(typeR: String, sumM:Double,sum:Double):Double{
    var com = when(typeR){
        "MasterCard", "Maestro" -> if(sumM < 75_000) 0.0 else sum * 0.006 + 20
        "Visa", "Мир" -> if(sum * 0.0075 < 35) 35.00 else sum * 0.0075
        else -> 0.00
    }
    return com
}

fun sumDayOrMonth(sum:Double, sumDayOrMonth: Double):Double{
    return sumDayOrMonth + sum
}