package com.example.mobil_uygulama_gelistirme_dersi.ui.theme

fun main() {

    // null safety:
// detaylý bilgi: https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-nullable-types
// bazý yapýlarýn null olma ihtimalý vardýr, ya da o deðer þu an için null deðerindedir.
// bu nedenle o yapýnýn null deðer alabileceðini belirtmemiz gerekir bunu da ? ile yaparýz
    // ör:
    var sayi1: Int? = null // doðru kullaným  - null ve integer deðer alabilir
    //var sati2: Int = null // yanlýþ kullaným hata alýrýz
    println("deger atama yapmadan: $sayi1")
    sayi1 = 3
    println("deger atama yapdiktan sonra: $sayi1")

    // !! verinin null olmayacaðýný tahattut
    // var giris2 = readLine()!!  // bu iþaret !! verinin null olmayacaðýný tahattut eder


// diziler(array):  detaylý döküman https://kotlinlang.org/docs/strings.html#create-arrays
// veri tutmak için kullandýðýmýz yapýlardýr
    var dizi1 = arrayOf(2,3,4,5,"Sudenaz",5)
    print(dizi1)
    // hafýzadaki referansýný verir:
    // [Ljava.lang.Object;@66a298842, 3, 4, 5, Sudenaz, 5
    //[ ? Bu bir dizi (array) olduðunu gösterir.
    // L ? Bu, dizinin referans türü (Object, String, vb.) içerdiðini belirtir.
    //java.lang.Object; ? Dizinin eleman türü Object.
    //@66a298842 ? Bu, dizinin hash kodudur (rastgele bir sayý, bellekteki adresine karþýlýk gelir).

    // dizi elemanlarýný yazdýrma
    println(dizi1.joinToString()) // dizinin içini yazdýrýrýz
    println("Sifirinci index:" + dizi1[0])

    // listeye eleman ekleme
    dizi1 = dizi1 + 9
    println(dizi1.joinToString())

    // set komutu
    var yeni1 = dizi1.set(1,5) // 1. indexteki deðerin yerine 5 yaz  komutunu verdik
    println(yeni1)

    print("Lütfen bir sayi giriniz: ")
    var giris = readLine()
    println("Yazdýðýmýz deger: $giris")

    // kullanýcýdan bir sayý alýp 5 ile çarpýp ekrana yazdýracaðýz

    println("5 ile çarpýlmasýný istediðiniz sayýyý giriniz: ")
    var giris2 = readLine()!!  // bu iþaret !! verinin null olmayacaðýný tahattut eder

    println("Sonucunuz: ${giris2.toInt() * 5}")


    // kullanýcýdan iki sayý alýp ortalamasýný döndürelim
    println("Lütfen ortalamasý alýnacak ilk sayýsý giriniz: ")
    var giris3 = readLine()!!.toInt()
    println("Lütfen ortalamasý alýnacak ikinci sayýsý giriniz: ")
    var giris4 = readLine()!!.toInt()

    println("Sonucunuz: ${(giris3 + giris4)/2}")


    // dizi listeler
    var liste1 = ArrayList<Any>() // buradaki Any = Anything -> Herhangibir deðer alabilir
    liste1.add(10) // ekleme fonksiyonu
    liste1.add(20)
    liste1.add(30)
    liste1.add(40)
    liste1.add(50)
    liste1.add(60)
    println(liste1)

    println(liste1[2]) // 3. sýradaki elemaný yazdýr
    liste1.set(1,6) // 2. elemaný 6 olarak deðiþtir.
    println(liste1)
    liste1[3] = 7 // 2. elemaný 7 olarak deðiþtirmenin baþka bir yolu
    println(liste1)

    println(liste1)
    liste1.add("kelime")
    println(liste1)

    // liste boyutu gösterme
    val listeBoyutu = liste1.size
    println("Liste1 listesinin eleman sayýsý: $listeBoyutu")

    // liste boyutunu 2 ile çarpalým
    println("Liste boyunun 2 katý: ${listeBoyutu * 2} ")

}