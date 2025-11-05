// https://www.geeksforgeeks.org/android/button-in-kotlin/   buna bakabilirsin
package com.example.mobil_uygulama_gelistirme_dersi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
//import com.example.besinci_ders.ui.theme.Besinci_DersTheme
//import com.example.mobil_uygulama_gelistirme_dersi.ui.theme.Besinci_DersTheme

import kotlin.toString

class BesinciDers: ComponentActivity() {
    // onCreate fonksiyonunun içerisine yazmamız lazım.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.besinci_ders)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            insets
        }

        val vizeEditText = findViewById<EditText>(R.id.vizeEditText)
        val finalEditText = findViewById<EditText>(R.id.finalEditText)
        val hesaplaButton = findViewById<Button>(R.id.hesaplaButton)
        val sonucText = findViewById<TextView>(R.id.sonucText)

        hesaplaButton.setOnClickListener {
            val vizeNotu = vizeEditText.text.toString().toIntOrNull()
            val finalNotu = finalEditText.text.toString().toIntOrNull()

            if (vizeNotu != null && finalNotu != null) {
                val ortalama = vizeNotu * 0.4 + finalNotu * 0.6
                val durum = if (ortalama >= 50) "GEÇTİN 🎉" else "KALDIN ❌"
                sonucText.text = "Ortalama: %.2f\nDurum: %s".format(ortalama, durum)
            } else {
                sonucText.text = "Lütfen geçerli sayılar girin!"
            }
        }
    }
}


