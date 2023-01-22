package com.example.midpracticle1

import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private countrylist : ArrayList<country>) : RecyclerView.Adapter<MyAdapter.MyviewHolder> {

    class MyviewHolder(itemview : view) : RecyclerView.viewHolder(itemview)
}