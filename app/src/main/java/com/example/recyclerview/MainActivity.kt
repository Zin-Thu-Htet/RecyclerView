package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.FlowerAdapter
import com.example.recyclerview.model.Flower
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Daisy",32.0,R.drawable.photoimg))
        flowerList.add(Flower("Rose",32.0,R.drawable.photoimgheart))

        var flowerAdapter = FlowerAdapter(flowerList)
        flowerRecycler.layoutManager = LinearLayoutManager(this)
        //flowerRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        //flowerRecycler.layoutManager = GridLayoutManager(this,2)

        flowerRecycler.adapter = flowerAdapter
    }
}
