package com.example.wisatapati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvWisata : RecyclerView
    private val list : ArrayList<Wisata> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showRecycleGrid()
    }

    private fun showSelectedWisata(wisata: Wisata) {
        val moveIntent = Intent(this, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_NAMA,wisata.name)
        moveIntent.putExtra(DetailActivity.EXTRA_DETAIL,wisata.detail)
        moveIntent.putExtra(DetailActivity.EXTRA_IMAGE,wisata.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_LOKASI,wisata.lokasi)
        startActivity(moveIntent)
    }

    private fun  showRecycleGrid(){
        rvWisata.layoutManager = GridLayoutManager(this,1)
        val gridWisataAdapter = WisataAdapter(list)
        rvWisata.adapter = gridWisataAdapter

        gridWisataAdapter.setOnItemClickCallback(object : WisataAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Wisata) {
                showSelectedWisata(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.about_me -> {
                val moveIntent = Intent(this, AboutActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }
}