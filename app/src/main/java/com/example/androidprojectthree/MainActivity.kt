package com.example.androidprojectthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("United States")

        detailsList.add("This is the United Kingdom flag")
        detailsList.add("This is the German flag")
        detailsList.add("This is the United States flag")

        imageList.add(R.drawable.uk)
        imageList.add(R.drawable.de)
        imageList.add(R.drawable.us)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adapter



    }
}