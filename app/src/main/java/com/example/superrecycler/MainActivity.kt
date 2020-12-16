package com.example.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.superrecycler.adapters.PaisAdapter
import com.example.superrecycler.modelo.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.miRecycler)

        val listaPaises = ArrayList<Pais>()

        listaPaises.add(Pais(nombre = "México", imagen = "https://bit.ly/2UAJnh0"))
        listaPaises.add(Pais(nombre = "EUA", imagen = "https://bit.ly/32QjRck"))
        listaPaises.add(Pais(nombre = "Perú", imagen = "https://bit.ly/35EnpQN"))
        listaPaises.add(Pais(nombre = "Argentina", imagen = "https://bit.ly/3mn4cbn"))

        miRecycler!!.layoutManager = GridLayoutManager(this,1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listaPaises,this)
    }
}