package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pokypatel: Boolean = true
    var sum: Float = 100f
    if (sum < 10001 && sum > 1000)
    {
        sum = sum - 100
    }
    else
    {
        if (sum > 10000)
        {
            sum = sum * 0.95f
        }
    }

    sum = if (pokypatel) sum * 0.99f else sum
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Сумма с учетом скидок $sum")

}