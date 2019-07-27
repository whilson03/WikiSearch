package com.olabode.wilson.wikisearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.olabode.wilson.wikisearch.fragments.ExploreFragment
import com.olabode.wilson.wikisearch.fragments.FavouriteFragment
import com.olabode.wilson.wikisearch.fragments.HistoryFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val exploreFragment: ExploreFragment
    private val favouriteFragment: FavouriteFragment
    private val historyFragment: HistoryFragment


    init {
        exploreFragment = ExploreFragment()
        favouriteFragment = FavouriteFragment()
        historyFragment = HistoryFragment()
    }


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = supportFragmentManager.beginTransaction()

        // TODO add fade in and out animations
        //transaction.setCustomAnimations(, )

        when (item.itemId) {
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, exploreFragment)
            R.id.navigation_favourites -> transaction.replace(R.id.fragment_container, favouriteFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
        }
        transaction.commit()

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        setSupportActionBar(toolbar)


        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
        transaction.commit()

    }
}
