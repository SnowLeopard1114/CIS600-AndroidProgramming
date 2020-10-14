package com.example.assignmenttwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(myToolbar)

        val appBar = supportActionBar   //set up the actionBar(menu bar)

        appBar!!.title = "HW2"  //set up the title

        appBar.subtitle = "User Interaction"    //set up the subtitle

        appBar.setDisplayShowHomeEnabled(true)
        appBar.setDisplayUseLogoEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){ //This func is designed to start other activities in the menu bar.
            R.id.action_SimpleCalculator -> {   //once the item in the menu bar is clicked, the new activity will show up.
                val intent = Intent(this, CalculatorActivity::class.java)

                startActivity(intent)
            }
            R.id.action_Movie -> {
                val intent = Intent(this, MovieActivity::class.java)

                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}