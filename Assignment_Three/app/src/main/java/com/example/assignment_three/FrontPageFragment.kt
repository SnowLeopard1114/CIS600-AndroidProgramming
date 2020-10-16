package com.example.assignment_three

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_front_page.*




//The frontPageFragment I need for this assignment
class FrontPageFragment : Fragment(R.layout.fragment_front_page) {
    private var tmpListener : fragmentListener ?= null
    //The listener I need for this assignment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_front_page, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        AboutMe.setOnClickListener {
            recall(it)
        }
        Page.setOnClickListener {
            recall2(it)
        }
        MasterDetail.setOnClickListener {
            recall3(it)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FrontPageFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
    // The onAttach method
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is fragmentListener){
            tmpListener = context
        }
    }
    //The onDetach method
    override fun onDetach() {
        super.onDetach()
        tmpListener = null
    }

    //The following methods are recall method I used for making sure which button is selected
    fun recall(view : View){
        tmpListener?.selectAboutMe(view)
    }

    fun recall2(view : View){
        tmpListener?.selectMoviePage(view)
    }

    fun recall3(view: View){
        tmpListener?.selectMovieDetail(view)
    }

    //The interface I need
    interface fragmentListener{
        fun selectAboutMe(view: View)

        fun selectMoviePage(view:View)

        fun selectMovieDetail(view:View)
    }



}