package com.olabode.wilson.wikisearch.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.wikisearch.R
import com.olabode.wilson.wikisearch.holders.CardHolder

/**
 *   Created by OLABODE WILSON on 2019-07-27.
 */
class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        var cardItem = LayoutInflater.from(parent.context).inflate(R.layout.article_card_item, parent, false)
        return CardHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }

}