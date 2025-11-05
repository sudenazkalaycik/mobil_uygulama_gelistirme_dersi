package com.example.ders.ui.theme

fun main() {

//  if else koşulu
/*
    val yas = 28
    if (yas < 18) {
        println("18 yas altı giremez")
    } else {
        println("buyrun gecebilirsiniz")
    }
*/

    /*
    val vize = 35
    val final = 55
    val ortalama = vize * 0.4 + final * 0.6
    if (ortalama < 45) {
        println("Dersten kaldınız")
    } else if (ortalama > 45 && ortalama <= 55) {
        println("Şartlı geçtiniz")
    } else {
        println("Geçtiniz")
    }

*/

/*
    val yas = 45
    if (yas < 18 && yas > 65) {
        println("disarı cıkamazsın")
    } else {
        println("dişarı cıkabilirsiniz")
    }

*/

/*
    val day1 = 1
    if (day1 == 1)
        println("pazatesi")
    else if (day1 == 2)
        println("salı")
    else if (day1 == 3)
        println("carsamba")
    else if (day1 == 4)
        println("per")
    else if (day1 == 5)
        println("cuma")
    else if (day1 == 6)
        println("c.tesi")
    else {
        println("pazar")
    }

    val day2 = 2
    when (day2) {
        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("carsamba")
        else -> println("diger gunler")
    }
*/


    val dizi1 = arrayOf(2, 4, 5, 6, 10)
    println(dizi1[0])
    println(dizi1[1])
    println(dizi1[2])

    for (i in dizi1)
        println(" " + (i * 5))

    val dizi2 = arrayOf("pzt", "salı", "crsb", "per")

    for (i in dizi2) {
        println(" " + i)
    }


    // 1. Döngü: 1'den 6'ya kadar (6 hariç)
    for (j in 1 until 6)
        print(" " + j)

    println()

// 2. Döngü: 1'den 6'ya kadar (6 dahil), 2'şer atlayarak
    for (m in 1..6 step 2)
        println(" " + m)

    println()

// 3. Döngü: 6'dan 0'a kadar (0 dahil), 2'şer geri atlayarak
    for (k in 6 downTo 0 step 2)
        println(" " + k)

    dizi1.forEach { print(it) }
    println()
    dizi1.forEach { sayac -> print(sayac) }
}