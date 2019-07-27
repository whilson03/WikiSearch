package com.olabode.wilson.wikisearch.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.wikisearch.R
import com.olabode.wilson.wikisearch.adapters.ArticleListItemRecyclerAdapter

/**
 * A simple [Fragment] subclass.
 *
 */
class HistoryFragment : Fragment() {

    var historyRecyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_history, container, false)

        historyRecyclerView = view.findViewById(R.id.history_recycler_view)

        historyRecyclerView!!.layoutManager = LinearLayoutManager(context)
        historyRecyclerView!!.adapter = ArticleListItemRecyclerAdapter()

        return view
    }


}
