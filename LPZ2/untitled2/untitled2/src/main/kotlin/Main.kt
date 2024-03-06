package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val typeR = "Vk Pay"
    var sumD = 0.00
    var sumM = 0.00
    var sum = 6000.00
    var com = if(sumD < 150_000 || sumM < 6_000_000 || (typeR.equals("Vk Pay") && (sumD < 150_000 || sumM < 6_000_000)))
        "Лимит привышен" else comisia(typeR,sumM, sum)

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
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