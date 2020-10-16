package com.example.assignment_three

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_front_page.*
import kotlinx.android.synthetic.main.fragment_movie_choice.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MovieChoiceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

//The MovieChoiceFragment I need for this Assignment
class MovieChoiceFragment : Fragment() {
    private var tmpListener : MovieChoiceFragment.fragmentListener?= null

    //The onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    //The onCreateView method
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_choice, container, false)
    }
    //The onViewCreated method
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Movie1.setOnClickListener {
            sel(it)
        }
        Movie2.setOnClickListener {
            sel(it)
        }
        Movie3.setOnClickListener {
            sel(it)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MovieChoiceFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
    //The onActivityCreated method
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
    //The onAttach method
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is MovieChoiceFragment.fragmentListener){
            tmpListener = context
        }
    }
    //The onDetach method
    override fun onDetach() {
        super.onDetach()
        tmpListener = null
    }
    //I use this method to handle which listener is selected.
    fun sel(view : View){
        tmpListener?.moviebtn1(view)
    }

    //Interface for handling the button.
    interface fragmentListener{
        fun moviebtn1(view: View)
    }
}