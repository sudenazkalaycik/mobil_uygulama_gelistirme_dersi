package com.example.mobil_uygulama_gelistirme_dersi.ui.theme


fun main() {

    // null safety:
// detayl� bilgi: https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-nullable-types
// baz� yap�lar�n null olma ihtimal� vard�r, ya da o de�er �u an i�in null de�erindedir.
// bu nedenle o yap�n�n null de�er alabilece�ini belirtmemiz gerekir bunu da ? ile yapar�z
    // �r:
    var sayi1: Int? = null // do�ru kullan�m  - null ve integer de�er alabilir
    //var sati2: Int = null // yanl�� kullan�m hata al�r�z
    println("deger atama yapmadan: $sayi1")
    sayi1 = 3
    println("deger atama yapdiktan sonra: $sayi1")

    // !! verinin null olmayaca��n� tahattut
    // var giris2 = readLine()!!  // bu i�aret !! verinin null olmayaca��n� tahattut eder


// diziler(array):  detayl� d�k�man https://kotlinlang.org/docs/strings.html#create-arrays
// veri tutmak i�in kulland���m�z yap�lard�r
    var dizi1 = arrayOf(2,3,4,5,"Sudenaz",5)
    print(dizi1)
    // haf�zadaki referans�n� verir:
    // [Ljava.lang.Object;@66a298842, 3, 4, 5, Sudenaz, 5
    //[ ? Bu bir dizi (array) oldu�unu g�sterir.
    // L ? Bu, dizinin referans t�r� (Object, String, vb.) i�erdi�ini belirtir.
    //java.lang.Object; ? Dizinin eleman t�r� Object.
    //@66a298842 ? Bu, dizinin hash kodudur (rastgele bir say�, bellekteki adresine kar��l�k gelir).

    // dizi elemanlar�n� yazd�rma
    println(dizi1.joinToString()) // dizinin i�ini yazd�r�r�z
    println("Sifirinci index:" + dizi1[0])

    // listeye eleman ekleme
    dizi1 = dizi1 + 9
    println(dizi1.joinToString())

    // set komutu
    var yeni1 = dizi1.set(1,5) // 1. indexteki de�erin yerine 5 yaz  komutunu verdik
    println(yeni1)

    print("L�tfen bir sayi giriniz: ")
    var giris = readLine()
    println("Yazd���m�z deger: $giris")

    // kullan�c�dan bir say� al�p 5 ile �arp�p ekrana yazd�raca��z

    println("5 ile �arp�lmas�n� istedi�iniz say�y� giriniz: ")
    var giris2 = readLine()!!  // bu i�aret !! verinin null olmayaca��n� tahattut eder

    println("Sonucunuz: ${giris2.toInt() * 5}")


    // kullan�c�dan iki say� al�p ortalamas�n� d�nd�relim
    println("L�tfen ortalamas� al�nacak ilk say�s� giriniz: ")
    var giris3 = readLine()!!.toInt()
    println("L�tfen ortalamas� al�nacak ikinci say�s� giriniz: ")
    var giris4 = readLine()!!.toInt()

    println("Sonucunuz: ${(giris3 + giris4)/2}")


    // dizi listeler
    var liste1 = ArrayList<Any>() // buradaki Any = Anything -> Herhangibir de�er alabilir
    liste1.add(10) // ekleme fonksiyonu
    liste1.add(20)
    liste1.add(30)
    liste1.add(40)
    liste1.add(50)
    liste1.add(60)
    println(liste1)

    println(liste1[2]) // 3. s�radaki eleman� yazd�r
    liste1.set(1,6) // 2. eleman� 6 olarak de�i�tir.
    println(liste1)
    liste1[3] = 7 // 2. eleman� 7 olarak de�i�tirmenin ba�ka bir yolu
    println(liste1)

    println(liste1)
    liste1.add("kelime")
    println(liste1)

    // liste boyutu g�sterme
    val listeBoyutu = liste1.size
    println("Liste1 listesinin eleman say�s�: $listeBoyutu")

    // liste boyutunu 2 ile �arpal�m
    println("Liste boyunun 2 kat�: ${listeBoyutu * 2} ")

}