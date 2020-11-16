package com.example.modul6_tugas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajan.*

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajan)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgJ = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameJ =intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskJ = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var hargaJ = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            image_detail.setImageResource(imgJ)
            tv_name_detail.text = nameJ
            tv_desc_detail.text = deskJ
            tv_short_detail.text = hargaJ
        }
    }
}