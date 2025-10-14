package com.example.mobil_uygulama_gelistirme_dersi.ui.theme

fun main() {
    // Array => ikinci dersin hatırlatması
    val dizi1 = arrayOf(2, 3, 1, 14)
    val diziboyutu = dizi1.size
    println("Dizi boyutu: $diziboyutu")

    // SET: diziler gibidir ancak içerideki her bir değer unique yani benzersizdir. Yani burda tekrar yapılamaz
    val set1 = setOf<Int>(2, 3, 6, 8, 4, 5, 4)
    val setboyutu = set1.size
    println("Set boyutu: $setboyutu") // normalde setin içinde 7 elaman vardı ama iki adet tekrar eden değer (4) olduğu için sadece bir tane yazdı.
    println("Set'in ikinci elemanı: ${set1.elementAt(1)}") // istenilen indexteki veriyi döndürür
    //println("Set'in 7. elemanı: ${set1.elementAt(6)}") // uzunluk hatası alırız çünkü set çıktısı => [2, 3, 6, 8, 4, 5]

    // Any tipinde örnek (herhangibir tipte veri alabilir)
    val set2 = setOf<Any>(2, 3, 6, 8, 4, 5, 4, "test")
    val set2boyutu = set1.size
    println("Set boyutu: $set2boyutu") // normalde setin içinde 7 elaman vardı ama iki adet tekrar eden değer (4) olduğu için sadece bir tane yazdı.
    println("Set'in ikinci elemanı: ${set2.elementAt(1)}")


    // forEach() komutu
    set1.forEach { println(it) } // her bir iterasyonu yazdırır yani sayaç gibi düşünebiliriz. it for döngüsü içerisinde 0 daan başlayarak sonuncu elemana kadar gezer.

    //HASHSET - set ile aynı işi yapar ancak sıralama burada bizim ekleme sıramıza göre değildir.
    val hashSet1 = HashSet<String>()
    hashSet1.add("Trambüs")
    hashSet1.add("Otobüs")
    hashSet1.add("Araba")
    hashSet1.add("Gemi")
    hashSet1.add("Metro")
    hashSet1.add("Dolmuş")
    hashSet1.add("Minibüs")
    hashSet1.add("Trambüs") //bu tekrarlanan bir değer olduğu için bunu yazdırmayacak
    println(hashSet1)


    val sehirler = arrayOf("Malatya", "Antalya", "İstanbul", "Ankara")
    val plakalar = arrayOf(44, 7, 34, 6)
    println("Şehrimiz ${sehirler[0]} ve plakamız ${plakalar[0]}")
    println("Şehrimiz ${sehirler[1]} ve plakamız ${plakalar[1]}")
    println("Şehrimiz ${sehirler[2]} ve plakamız ${plakalar[2]}")
    println("Şehrimiz ${sehirler[3]} ve plakamız ${plakalar[3]}")

    //HASHMAP - anahtar değer çiftleri
    val hashMap1 = HashMap<String, Int>()
    hashMap1.put("Malatya", 44)
    hashMap1.put("Antalya", 7)
    hashMap1.put("İstanbul", 34)
    hashMap1.put("Ankara", 6)
    hashMap1["Ordu"] = 52
    // put ile ya da direkt anahtar verip değerini tanımlayarak ekleyebiliriz hashmape
    println(hashMap1["Ordu"])
    println(hashMap1)


    //HASHMAP Oluşturmanın Diğer Bir Yolu, burada veriler tek satırda girilir
    val hashMap2 =
        hashMapOf<String, Int>("Malatya" to 44, "Afyon" to 3, "Elazığ" to 23, "Kars" to 36)
    println(hashMap2)

    // OPERATÖRLER
    var sayi1 = 10

    // Toplama yöntemleri
    sayi1 = sayi1 + 1
    println(sayi1)
    sayi1++
    println(sayi1)
    sayi1 += 1
    println(sayi1)

    // Çıkarma yöntemleri
    sayi1 = sayi1 - 1
    println(sayi1)
    sayi1--
    println(sayi1)
    sayi1 -= 1
    println(sayi1)

    // blooen, == (denk mi?), != (denk değil mi?), < , > (küçük mü,  büyük mü?), <=, >= (büyük eşit mi? küçük eşit mi?)
    println(10 == 12)
    println(sayi1 == 10)
    println(sayi1 != 10)
    println(4 < 20)
    println(4 > 20)
    // ör while kullanımı


    // ve / veya
    println(4<6 && 10<12) // and işlemi
    println(14<6 || 10<12) // or işlemi

    // ( % ) mod alma
    println(45%5) // sonuç 0
    println(46%6) // sonuç 1
    println(46%10) // sonuç 6


    // HATIRLATMA!! Kotlin null konusunda hassas olduğu için null değer gelebilecek durumlarda ? kullanılmalı
    var sayi111: Int? = null
    // println(sayi111 * 2 ) // burada null gelme durumu var bu nedenle işlemi yapmıyor
    var sayi112: Int? = 6
    println(sayi112!! * 6) // burada ise !! ile bu değerin null gelmeyeceğine dair teminat vermiş oluruz ve işlem gerçekleşir
    

    //Uzunluk Bulma
    var yemek = "Icli Kofte"
    println("Yemek değişkeninin uzunluğu: ${yemek.length}") // karakter sayısını buluruz
    println("Yemek değişkeninin uzunluğu:" + yemek.length) // istersek değişkeni string içerisinde kullanırken + işlemini de kullanabiliriz.


}
