package com.olabode.wilson.wikisearch.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.wikisearch.R

/**
 *   Created by OLABODE WILSON on 2019-07-27.
 */
class ListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById(R.id.result_icon)
    private val articleTextView: TextView = itemView.findViewById(R.id.result_title)

}