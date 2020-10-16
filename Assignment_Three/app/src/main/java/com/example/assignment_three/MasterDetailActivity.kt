package com.example.assignment_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import kotlinx.android.synthetic.main.activity_view_pager.*
import java.io.Serializable
//The Activity I need for Master-Detail Task.
class MasterDetailActivity : AppCompatActivity(), MovieChoiceFragment.fragmentListener {
        var isTablet: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_detail)
        val movieChoiceFragment = MovieChoiceFragment()

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, movieChoiceFragment)
                commit()
            }
        }

        if(findViewById<FrameLayout>(R.id.container3) != null){
            isTablet = true
        }



    }
    //The method is used for handling the button issue
    override fun moviebtn1(view: View) {
        val idx : Int = findViewById<Button>(view.id).text.toString().split(' ')[1].toInt() - 1
        val gson = GsonBuilder().create()
        val Json = gson.fromJson(JsonData.movies, JsonObj::class.java)
        val results : Array<MovieInfo> = Json.results
        val jsonRes = results
        println(idx)

        if(isTablet == false) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, MoviePageFragment.newInstance(jsonRes[idx]), "btn")
                commit()
            }
        }
        else{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container3, MoviePageFragment.newInstance(jsonRes[idx]), "btn")
                commit()
            }
        }
    }

    override fun onBackPressed() {
        if(supportFragmentManager.findFragmentByTag("btn") != null && isTablet == false){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, MovieChoiceFragment())
                commit()
            }
        }
        else{
            super.onBackPressed()
        }
    }
}

