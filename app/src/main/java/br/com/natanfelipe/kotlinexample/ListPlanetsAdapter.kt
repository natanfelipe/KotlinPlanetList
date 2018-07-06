package br.com.natanfelipe.kotlinexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_planet.view.*


class ListPlanetsAdapter(private val listPlanetsK: List<Planets>, private val context: Context) : RecyclerView.Adapter<ListPlanetsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_planet,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPlanetsK.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val planet = listPlanetsK[position]
        holder.name.text = planet.name
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.textView
    }
}

