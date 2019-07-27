package com.olabode.wilson.wikisearch.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.wikisearch.R
import com.olabode.wilson.wikisearch.holders.ListItemHolder

/**
 *   Created by OLABODE WILSON on 2019-07-27.
 */
class ArticleListItemRecyclerAdapter : RecyclerView.Adapter<ListItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        var listItem = LayoutInflater.from(parent.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

    }

}