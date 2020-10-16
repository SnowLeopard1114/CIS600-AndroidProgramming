package com.example.assignment_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_front_page.*
// The FrontPage Activity
class MainActivity : AppCompatActivity(), FrontPageFragment.fragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frontPageFragment = FrontPageFragment()
        val aboutMeFragment = AboutMeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, frontPageFragment)
            commit()
        }


    }
    // The following methods help me to make sure which button is selected
    override fun selectAboutMe(view: View) {
        if(supportFragmentManager.findFragmentByTag("AboutMe") == null){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, AboutMeFragment(), "AboutMe")
                commit()
            }
        }
        else{
            supportFragmentManager.beginTransaction().apply {
                remove(supportFragmentManager.findFragmentByTag("AboutMe")!!).commit()
            }
        }
    }

    override fun selectMoviePage(view: View) {
        val text : String = findViewById<Button>(view.id).text.toString()
        println(text)
        if(text.equals("MOVIES PAGE VIEW")) {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }
    }

    override fun selectMovieDetail(view: View) {
        val text : String = findViewById<Button>(view.id).text.toString()
        println(text)
        if(text.equals("MOVIES MASTER- DETAIL VIEW")){
            val intent = Intent(this, MasterDetailActivity::class.java)
            startActivity(intent)
        }
    }

}