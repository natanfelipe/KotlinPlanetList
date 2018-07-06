package br.com.natanfelipe.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val planets = listOfPlanets()

        rv.adapter = ListPlanetsAdapter(planets,this)
        val layoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager

    }

    fun listOfPlanets() : List<Planets>{
        return listOf<Planets>(Planets("Mercury"),
                               Planets("Venus"),
                               Planets("Earth"),
                               Planets("Mars"),
                               Planets("Jupiter"),
                               Planets("Saturn"),
                               Planets("Uranus"),
                               Planets("Pluto"))
    }
}
