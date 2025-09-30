package com.example.mobil_uygulama_gelistirme_dersi.ui.theme

fun main() {
    println("Birinci ders") // println kendinden sonraya bir alt satıra geçer
    println("print komutu ile ekrana yazdır")

    /*
    * çoklu
    * yorum
    * satırı
    */

    var sayi1 = 3 // değişen değişken
    val sayi2 = 6 // değişmeyen değişken
    val sonuc = sayi2 + sayi1
    println(sayi2 + sayi1)
    println(sonuc)
    // sonuc = 0 val ile tanımlandığından sonradan değiştiremeyiz
    val kelime = "merhaba"
    println(kelime)
    println("kelime")
    println("bu islemin sonucu: \$sonuc")
    println("bu islemin sonucu: $sonuc")
    var sayi3: Int = 3
    var sayi4: Double = 8.5
    println(sayi4)
    var sayi5: Float = 4.5f // floatta sayının yanına f yazmamız gerek, yoksa doubledan ayır edemez
    val sayi6: Boolean = true
    var kelime5: String = "Sudenaz"
    var karakter1: Char = 'a'
    var sayi7: Int = sayi4.toInt() // int e dönüştürmede sadece tam sayı kısmı alınır gerisi silinir -> veri kaybı yaşanır
    println(sayi7)
    var kelime6: String = "25"
    var sayi8 = kelime6.toInt()
    println(kelime6)  // string
    println(sayi8) // integer
    println(sayi8*5)





    //NOT: Karakter yazarken '' kullanırken, string yazarken "" kullanırız.
}