package com.example.assignmenttwo

import android.os.Bundle
import android.provider.Contacts.PresenceColumns.AWAY
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movie.*
import java.lang.Math.abs
import com.example.assignmenttwo.R

class MovieActivity : AppCompatActivity() {
    lateinit var movieList: List<MovieData> //we use this to store movie info
    lateinit var posterTable:MutableMap<String, Int>    //we use this map for mapping the poster and movie title

    var imageHeight : Int = 0
    var imageWidth : Int = 0
    var downX = 0.0F
    var movieIndex = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        setSupportActionBar(child2_toolbar)
        val appBar2 = supportActionBar
        appBar2?.setDisplayHomeAsUpEnabled(true)    //enable home button
        appBar2!!.title = "Now Playing Movies"
        createMovieList()
        loadMovieInfo()

        movieLayout.setOnTouchListener{v, event ->      //set Listener, swift left to right(or right to left) can invoke new movie file
            when(event?.action){
                MotionEvent.ACTION_DOWN ->{
                    downX = event.x
                }
                MotionEvent.ACTION_UP->{
                    val deltaX = downX - event.x

                    if(abs(deltaX) > 20F){
                        if(deltaX > 0){
                            movieIndex++
                            if(movieIndex >= movieList.size){
                                movieIndex = movieList.size - 1
                            }else{
                                loadMovieInfo()
                            }
                        }else{
                            movieIndex--
                            if(movieIndex < 0){
                                movieIndex = 0;
                            }else{
                                loadMovieInfo()
                            }
                        }
                    }
                }
            }
            v?.onTouchEvent(event) ?: true
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {   //set listener for seekbar
            override fun onProgressChanged(SeekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.i("SeekBar", "Progess $progress")

                val newHeight = imageHeight * progress / 50F
                val newWidth = imageWidth * progress / 50F

                Log.i(
                    "ImageView",
                    "($imageHeight, $imageWidth) -> New Height = $newHeight, New Width = $newWidth"
                )

                changeImageViewSize(newHeight.toInt(), newWidth.toInt())    //once we get the newHeight or newWidth, we invoke change func again
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {   //once the seekbar is clicked, the toast message pop up
                Toast.makeText(
                    this@MovieActivity,
                    "progress is " + seekBar?.progress + "%",
                    Toast.LENGTH_LONG
                ).show()
            }
        })

        imageView.setOnClickListener{   //set on the listener, so once the image is clicked, we get the toast message
            Toast.makeText(this, "ImageView is clicked", Toast.LENGTH_LONG).show()
        }

        imageView.setOnLongClickListener{   //set on longClick Listener, the seekbar will return to 50 by dafault
            this.seekBar.progress = 50

            changeImageViewSize(imageHeight, imageWidth)

            true
        }
    }

    private fun loadMovieInfo(){    //This part, we load movie info into the layout

        imageView.setImageResource(posterTable.get(movieList[movieIndex].title)!!)

        movieTitle.text = movieList[movieIndex].title

        movieID.text = movieList[movieIndex].id.toString()

        movieRate.text = movieList[movieIndex].vote_average.toString()

        movieOverview.setText(movieList[movieIndex].overview)

        imageHeight = imageView.drawable.intrinsicHeight
        imageWidth = imageView.drawable.intrinsicWidth

        changeImageViewSize(imageHeight, imageWidth)
    }

    private fun changeImageViewSize(h : Int, w : Int){
        imageView.layoutParams.height = h
        imageView.layoutParams.width = w
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        imageView.requestLayout()
    }

    private fun createMovieList(){
        val movies = """[
    {
      "popularity": 15.179,
      "vote_count": 785,
      "video": false,
      "poster_path": "/pci1ArYW7oJ2eyTo2NMYEKHHiCP.jpg",
      "id": 724089,
      "adult": false,
      "backdrop_path": "/jtAI6OJIWLWiRItNSZoWjrsUtmi.jpg",
      "original_language": "en",
      "original_title": "Gabriel's Inferno Part II",
      "genre_ids": [
        10749
      ],
      "title": "Gabriel's Inferno Part II",
      "vote_average": 9.1,
      "overview": "Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?",
      "release_date": "2020-07-31"
    },
    {
      "popularity": 230.495,
      "vote_count": 378,
      "video": false,
      "poster_path": "/zGVbrulkupqpbwgiNedkJPyQum4.jpg",
      "id": 592350,
      "adult": false,
      "backdrop_path": "/9guoVF7zayiiUq5ulKQpt375VIy.jpg",
      "original_language": "ja",
      "original_title": "僕のヒーローアカデミア THE MOVIE ヒーローズ：ライジング",
      "genre_ids": [
        28,
        16
      ],
      "title": "My Hero Academia: Heroes Rising",
      "vote_average": 8.7,
      "overview": "Class 1-A visits Nabu Island where they finally get to do some real hero work. The place is so peaceful that it's more like a vacation … until they're attacked by a villain with an unfathomable Quirk! His power is eerily familiar, and it looks like Shigaraki had a hand in the plan. But with All Might retired and citizens' lives on the line, there's no time for questions. Deku and his friends are the next generation of heroes, and they're the island's only hope.",
      "release_date": "2019-12-20"
    },
    {
      "popularity": 17.662,
      "vote_count": 2361,
      "video": false,
      "poster_path": "/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
      "id": 19404,
      "adult": false,
      "backdrop_path": "/svYzz6A6xleZv5toTLAhigXd1DX.jpg",
      "original_language": "hi",
      "original_title": "दिलवाले दुल्हनिया ले जायेंगे",
      "genre_ids": [
        35,
        18,
        10749
      ],
      "title": "Dilwale Dulhania Le Jayenge",
      "vote_average": 8.7,
      "overview": "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.",
      "release_date": "1995-10-20"
    },
    {
      "popularity": 54.092,
      "id": 238,
      "video": false,
      "vote_count": 12962,
      "vote_average": 8.7,
      "title": "The Godfather",
      "release_date": "1972-03-14",
      "original_language": "en",
      "original_title": "The Godfather",
      "genre_ids": [
        18,
        80
      ],
      "backdrop_path": "/41xIKcLiM5ryfz4C9sZFcBOJGsK.jpg",
      "adult": false,
      "overview": "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.",
      "poster_path": "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"
    },
    {
      "popularity": 39.312,
      "vote_count": 10300,
      "video": false,
      "poster_path": "/t7xhP8SQTVanzecvn1oQRVWCXTI.jpg",
      "id": 424,
      "adult": false,
      "backdrop_path": "/loRmRzQXZeqG78TqZuyvSlEQfZb.jpg",
      "original_language": "en",
      "original_title": "Schindler's List",
      "genre_ids": [
        18,
        36,
        10752
      ],
      "title": "Schindler's List",
      "vote_average": 8.6,
      "overview": "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.",
      "release_date": "1993-11-30"
    },
    {
      "popularity": 127.983,
      "vote_count": 6342,
      "video": false,
      "poster_path": "/q719jXXEzOoYaps6babgKnONONX.jpg",
      "id": 372058,
      "adult": false,
      "backdrop_path": "/mMtUybQ6hL24FXo0F3Z4j2KG7kZ.jpg",
      "original_language": "ja",
      "original_title": "君の名は。",
      "genre_ids": [
        16,
        18,
        10749
      ],
      "title": "Your Name.",
      "vote_average": 8.6,
      "overview": "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.",
      "release_date": "2016-08-26"
    },
    {
      "popularity": 41.849,
      "id": 240,
      "video": false,
      "vote_count": 7691,
      "vote_average": 8.6,
      "title": "The Godfather: Part II",
      "release_date": "1974-12-20",
      "original_language": "en",
      "original_title": "The Godfather: Part II",
      "genre_ids": [
        18,
        80
      ],
      "backdrop_path": "/poec6RqOKY9iSiIUmfyfPfiLtvB.jpg",
      "adult": false,
      "overview": "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.",
      "poster_path": "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg"
    },
    {
      "popularity": 93.213,
      "vote_count": 10147,
      "video": false,
      "poster_path": "/2TeJfUZMGolfDdW6DKhfIWqvq8y.jpg",
      "id": 129,
      "adult": false,
      "backdrop_path": "/mSDsSDwaP3E7dEfUPWy4J0djt4O.jpg",
      "original_language": "ja",
      "original_title": "千と千尋の神隠し",
      "genre_ids": [
        16,
        14,
        10751
      ],
      "title": "Spirited Away",
      "vote_average": 8.5,
      "overview": "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.",
      "release_date": "2001-07-20"
    },
    {
      "popularity": 166.717,
      "vote_count": 9208,
      "video": false,
      "poster_path": "/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
      "id": 496243,
      "adult": false,
      "backdrop_path": "/ApiBzeaa95TNYliSbQ8pJv4Fje7.jpg",
      "original_language": "ko",
      "original_title": "기생충",
      "genre_ids": [
        35,
        18,
        53
      ],
      "title": "Parasite",
      "vote_average": 8.5,
      "overview": "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
      "release_date": "2019-05-30"
    },
    {
      "popularity": 7.432,
      "vote_count": 264,
      "video": false,
      "poster_path": "/zGGWYpiKNwjpKxelPxOMqJnUgDs.jpg",
      "id": 42269,
      "adult": false,
      "backdrop_path": "/bh6yfB6I1N1WuMiX6K5HxGVZnja.jpg",
      "original_language": "it",
      "original_title": "C'eravamo tanto amati",
      "genre_ids": [
        35,
        18
      ],
      "title": "We All Loved Each Other So Much",
      "vote_average": 8.5,
      "overview": "Gianni, Nicola and Antonio become close friends in 1944 while fighting the Nazis. After the end of the war, full of illusions, they settle down. The movie is a the story of the life of these three idealists and how they deal with the inevitable disillusionments of life.",
      "release_date": "1974-12-21"
    },
    {
      "popularity": 42.018,
      "vote_count": 421,
      "video": false,
      "poster_path": "/h1B7tW0t399VDjAcWJh8m87469b.jpg",
      "id": 556574,
      "adult": false,
      "backdrop_path": "/uWVkEo9PWHu9algZsiLPi6sRU64.jpg",
      "original_language": "en",
      "original_title": "Hamilton",
      "genre_ids": [
        18,
        36,
        10402
      ],
      "title": "Hamilton",
      "vote_average": 8.5,
      "overview": "Presenting the tale of American founding father Alexander Hamilton, this filmed version of the original Broadway smash hit is the story of America then, told by America now.",
      "release_date": "2020-07-03"
    },
    {
      "popularity": 44.163,
      "vote_count": 10922,
      "video": false,
      "poster_path": "/velWPhVMQeQKcxggNEU8YmIo52R.jpg",
      "id": 497,
      "adult": false,
      "backdrop_path": "/xMIyotorUv2Yz7zpQz2QYc8wkWB.jpg",
      "original_language": "en",
      "original_title": "The Green Mile",
      "genre_ids": [
        80,
        18,
        14
      ],
      "title": "The Green Mile",
      "vote_average": 8.5,
      "overview": "A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution.",
      "release_date": "1999-12-10"
    }
  ]""".trimIndent()
        this.movieList = Gson().fromJson(movies, Array<MovieData>::class.java).asList()
        posterTable = mutableMapOf()
        posterTable["The Green Mile"] = R.drawable.miles
        posterTable["Hamilton"] = R.drawable.ham
        posterTable["We All Loved Each Other So Much"] = R.drawable.wewe
        posterTable["Parasite"] = R.drawable.para
        posterTable["Spirited Away"] = R.drawable.awaya
        posterTable["The Godfather: Part II"] = R.drawable.godtwo
        posterTable["Your Name."] = R.drawable.name
        posterTable["Schindler's List"] = R.drawable.shan
        posterTable["The Godfather"] = R.drawable.god
        posterTable["Dilwale Dulhania Le Jayenge"] = R.drawable.thaio
        posterTable["My Hero Academia: Heroes Rising"] = R.drawable.hero
        posterTable["Gabriel's Inferno Part II"] = R.drawable.gab

    }
}