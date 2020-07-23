package com.example.carrosrecycleview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Chevrolet", "Camaro" , R.drawable.chevroletcamaro1))
        arrayList.add(Model("Chevrolet", "Cruze" , R.drawable.chevroletcruze2))
        arrayList.add(Model("Chevrolet", "Tracker" , R.drawable.chevrolettracker3))
        arrayList.add(Model("Toyotta", "Corolla" , R.drawable.corolla1))
        arrayList.add(Model("Toyotta", "Etios" , R.drawable.etios3))
        arrayList.add(Model("Toyotta", "Yaris" , R.drawable.yaris2))
        arrayList.add(Model("Wolkswagen", "Jetta" , R.drawable.volks1jetta))
        arrayList.add(Model("Wolkswagen", "Golf" , R.drawable.volks2golf))
        arrayList.add(Model("Wolkswagen", "GolQuadrado" , R.drawable.volks3golquadrado))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}