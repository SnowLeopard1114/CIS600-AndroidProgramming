package com.example.assignment_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName
import kotlinx.android.synthetic.main.activity_view_pager.*
import java.io.Serializable
//The ViewPagerActivity
class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Using gson to handle with data
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        val gson = GsonBuilder().create()
        val Json = gson.fromJson(JsonData.movies, JsonObj::class.java)
        val results : Array<MovieInfo> = Json.results
        viewP3.adapter =
            MoviePagerAdapter(supportFragmentManager, Json, results.size)
        viewP3.currentItem = 0
        viewP3.offscreenPageLimit = 0

        val jsonRes = results
        //Iterate the whole jsonRes
        for(idx in jsonRes.indices){
            val movie_title : String  = jsonRes[idx].title
            tabMovies.addTab(tabMovies.newTab().setText(movie_title))
        }

        tabMovies.tabGravity = TabLayout.GRAVITY_FILL
        viewP3.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabMovies))

        //add Listener for the tabMovies
        tabMovies.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewP3.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })
    }
}

//The Adapter I used for this assignment
class MoviePagerAdapter (fm: FragmentManager, jo : JsonObj, num : Int) : FragmentPagerAdapter(fm){
    val tmp : Int = num
    val tmp_jo : JsonObj = jo
    override fun getItem(position: Int): Fragment {
        return MoviePageFragment.newInstance(tmp_jo.results[position])
    }

    override fun getCount(): Int {
        return tmp
    }

}
//Serialize the result array
class JsonObj(
    @SerializedName("results")val results : Array<MovieInfo>
) : Serializable

//Serialize the movie data
class MovieInfo(
    @SerializedName("vote_average")val vote_average : Float,
    @SerializedName("poster_path")val poster_path : String,
    @SerializedName("title")val title: String,
    @SerializedName("release_date")val release_date : String,
    @SerializedName("overview")val overview : String,
    @SerializedName("vote_count") val vote_count: Int?
) : Serializable
