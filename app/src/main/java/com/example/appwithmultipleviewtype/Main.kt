package com.example.appwithmultipleviewtype

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Main : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataList = ArrayList<Dataclass>()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val image1= ArrayList<String>()
        val image2= ArrayList<String>()
        val image3= ArrayList<String>()
        val image4= ArrayList<String>()
        val image5= ArrayList<String>()
        for (i in 1..500)
        {
            image1.add("https://picsum.photos/150/150?random=$i")
        }
        for (i in 1..500)
        {
            image2.add("https://picsum.photos/150/150?random=$i+1")
        }
        for (i in 1..500)
        {
            image3.add("https://picsum.photos/150/150?random=$i+2")
        }
        for (i in 1..500)
        {
            image4.add("https://picsum.photos/150/150?random=$i+3")
        }
//        for (i in 1..50)
//        {
//            image5.add("https://picsum.photos/150/150?random=$i+4")
//        }
        for (i in 1..50)
        {

            dataList.add(Dataclass(RecyclerViewAdapter.VIEW_TYPE_ONE, image1))
            dataList.add(Dataclass(RecyclerViewAdapter.VIEW_TYPE_TWO, image2))
            dataList.add(Dataclass(RecyclerViewAdapter.VIEW_TYPE_THREE, image3))
            dataList.add(Dataclass(RecyclerViewAdapter.VIEW_TYPE_FOUR, image4))
        }
        val adapter = RecyclerViewAdapter(this, dataList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}