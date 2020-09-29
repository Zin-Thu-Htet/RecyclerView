package com.example.recyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.recyclerview.R
import com.example.recyclerview.adapter.FlowerAdapter
import com.example.recyclerview.model.Flower
import kotlinx.android.synthetic.main.fragment_flowerfragment.*

class Flowerfragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flowerfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Daisy",32.0,R.drawable.photoimg))
        flowerList.add(Flower("Rose",32.0,R.drawable.photoimgheart))

        var flowerAdapter = FlowerAdapter(flowerList)
        flowerRecycler.layoutManager = LinearLayoutManager(context)
        //flowerRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        //flowerRecycler.layoutManager = GridLayoutManager(this,2)

        flowerRecycler.adapter = flowerAdapter
    }
}
