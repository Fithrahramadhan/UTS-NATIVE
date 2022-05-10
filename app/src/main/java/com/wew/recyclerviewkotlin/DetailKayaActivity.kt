package com.wew.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKayaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kaya)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val kaya = intent.getParcelableExtra<kaya>(MainActivity.INTENT_PARCELABLE)

        val imgKaya = findViewById<ImageView>(R.id.img_item_photo)
        val nameKaya = findViewById<TextView>(R.id.tv_item_name)
        val descKaya = findViewById<TextView>(R.id.tv_item_description)

        imgKaya.setImageResource(kaya?.imgKaya!!)
        nameKaya.text = kaya.nameKaya
        descKaya.text = kaya.descKaya

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}