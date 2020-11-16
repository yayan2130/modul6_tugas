package com.example.modul6_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul6_tugas.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = adapter(data, { onItem: data -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: data) {
        val showDetailActivityIntent = Intent(this, detail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.hargaJajan)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<data> {
        val rvList = ArrayList<data>()
        rvList.add(
            data(
                R.drawable.pokpok,
                "Pok - Pok",
                "Ayam goreng khas Taiwan yang garing dan pipih juga ada di Surabaya. " +
                        "Jajanan ini memiliki tekstur yang garing di luar dan lembut di dalam karena " +
                        "daging ayamnya. Daging ayam yang dipilih adalah bagian daging dada",
                "Rp 10.000,-"
            )
        )
        rvList.add(
            data(
                R.drawable.waffle,
                "Waffle Pocoyo",
                "Waffle satu ini menjadi jajanan yang sering ditemukan di Surabaya. " +
                        "Pocoyo menawarkan rasa waffle yang beraneka rasa dengan isian yang variatif. " +
                        "Jajanan ini cocok bagi kamu yang ingin camilan yang mengenyangkan." ,
                "Rp 24.000,-"
            )
        )
        rvList.add(
            data(
                R.drawable.sushi,
                "Sushi Jowo",
                "Sekilas, makanan ini tak berbeda dengan lemper. Hanya saja, untuk " +
                        "pembungkusnya mereka tidak menggunakan daun pisang, tetapi nori yakni " +
                        "olahan rumput laut yang berbentuk lembaran. Mereka menamai makanan itu " +
                        "sushi jowo, yakni sushi yang bercitarasa masakan jawa.",
                "Rp 15.000,-"
            )
        )
        rvList.add(
            data(
                R.drawable.seblak,
                "Seblak Keju",
                "Seblak keju adalah seblak seperti biasa dengan taburan keju diatasnya" +
                        "jajanan ini sangat laris dikalangan anak muda karena rasanya yang unik",
                "Rp 20.000,-"
            )
        )
        rvList.add(
            data(
                R.drawable.cincau,
                "Cincau Station",
                "Cincau disini sangat dibuat aneh aneh, ada yang pakai susu, krim, bahkan kopi",
                "Rp 10.000,-"
            )
        )
        rvList.add(
            data(
                R.drawable.kopi,
                "Kopi Dalgona",
                "kopi dalgona ",
                "Rp 20.000,-"
            )
        )
        return rvList
    }
}