package com.example.wisatapati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_LOKASI = "extra_lokasi"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_DETAIL = "extra_detail"
    }
    private lateinit var tvLokasi : TextView
    private lateinit var tvDetail : TextView
    private lateinit var imgWisata : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvLokasi = findViewById(R.id.tv_lokasi)
        tvDetail = findViewById(R.id.tv_detail)
        imgWisata = findViewById(R.id.img_wisata)

        val name= intent.getStringExtra(EXTRA_NAMA)
        val lokasi= intent.getStringExtra(EXTRA_LOKASI)
        val detail= intent.getStringExtra(EXTRA_DETAIL)
        val photo= intent.getIntExtra(EXTRA_IMAGE,0)

        supportActionBar?.title =name
        tvLokasi.text = lokasi
        tvDetail.text = detail
        Glide.with(this)
            .load(photo)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(imgWisata)

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, detail)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}