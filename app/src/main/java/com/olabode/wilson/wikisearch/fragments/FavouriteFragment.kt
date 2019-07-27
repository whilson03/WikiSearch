package com.olabode.wilson.wikisearch.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.wikisearch.R
import com.olabode.wilson.wikisearch.adapters.ArticleCardRecyclerAdapter


/**
 * A simple [Fragment] subclass.
 *
 */
class FavouriteFragment : Fragment() {

    var favouriteRecycler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_favourite, container, false)


        favouriteRecycler = view.findViewById(R.id.favourite_recycler_view)


        favouriteRecycler!!.layoutManager = LinearLayoutManager(context)
        favouriteRecycler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
