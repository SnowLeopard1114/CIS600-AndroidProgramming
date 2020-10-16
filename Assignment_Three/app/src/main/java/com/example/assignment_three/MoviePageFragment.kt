package com.example.assignment_three

import android.graphics.Movie
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_view_pager.*
import kotlinx.android.synthetic.main.fragment_movie_page.*
import java.io.Serializable
private const val ARG_MOV1 = "para1"
//The MoviePageFragment I used in this assignment
class MoviePageFragment : Fragment(R.layout.fragment_movie_page) {

    private var movieinfo : MovieInfo?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            movieinfo = it.getSerializable(ARG_MOV1) as MovieInfo
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_movie_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Picasso.get().load("https://image.tmdb.org/t/p/w342" + movieinfo!!.poster_path).into(imageView)
        movieTitle.text= movieinfo!!.title
        var points = (movieinfo!!.vote_average / 2)
        ratingBar.rating = (points).toFloat()
        rating.text = movieinfo!!.vote_average.toString()
        voteCount.text = movieinfo!!.vote_count.toString()
        description.text = movieinfo!!.overview
        year.text = movieinfo!!.release_date
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: MovieInfo) =
            MoviePageFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_MOV1, param1 as Serializable)
                }
            }
    }
}