package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val kolsekynd: Int = 56855
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println(agoToText(kolsekynd))

}

fun agoToText(kolsekynd: Int): String
{
    val str = "был(а) в сети"
    return when{
        kolsekynd > 0 && kolsekynd < 61 -> "$str только что"
        kolsekynd > 60 && kolsekynd < 60 * 60 + 1 -> "$str " + kolsekynd / 60 + " ${minOrChac(kolsekynd)} назад"
        kolsekynd > 60 * 60 && kolsekynd < 24 * 60 * 60 + 1 -> "$str " + kolsekynd / 60 /60 + " ${minOrChac(kolsekynd)} назад"
        kolsekynd > 24 * 60 * 60 && kolsekynd < 2 * 24 * 60 * 60 + 1 -> "$str вчера"
        kolsekynd > 2 * 24 * 60 * 60 && kolsekynd < 3 * 24 * 60 * 60 + 1 -> "$str позавчера"
        else -> "$str давно"
    }
}

fun minOrChac(sekynd: Int) : String{
    if (sekynd < 60 * 60 + 1)
    {
        val s = sekynd / 60
       return if (s != 11) when(s % 10){
           1 -> "минуту"
           2,3,4 -> "минуты"
           else -> "минут"
       } else "минут"
    }
    else
    {
        val ch = sekynd / 60 / 60
        return if (ch != 11) when(ch % 10){
            1 -> "час"
            2,3,4 -> "часа"
            else -> "часов"
        } else "часов"
    }

}