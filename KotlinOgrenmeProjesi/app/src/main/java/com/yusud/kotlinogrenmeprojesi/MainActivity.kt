package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Integer
        println("---------------Int---------------")

        //Tanımlama (Defining)
        val benimIntegerim : Int

        //Bailatma,Değerini atama (Initializing,Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        //Long
        println("---------------Long---------------")

        var benimLong : Long = 100
        benimLong = 3000000000000
        println(benimLong)

        //Float & Double
        println("---------------Float & Double---------------")

        val pi = 3.1415
        println(pi * 2)

        val floatPi : Float = 3.14f
        println(pi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)

        //String
        println("---------------String---------------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Yusufhan "
        val soyisim = "Keleş"

        val tamIsım = isim + soyisim
        println(tamIsım)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString + baskaBirString)

        //Boolean
        println("---------------Boolean---------------")

        var benimBoolean = true
        benimBoolean = false

        println(3>5)
        println(8==8)

        //Veri Tipi Döndürmek (Returning Data Types)
        println("---------------Returning Data Types---------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        println(kullaniciGirdisi.toInt() / 2)
    }
}