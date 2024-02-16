package com.example.netflixapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.netflixapplication.Fragments.HomeFragment
import com.example.netflixapplication.Fragments.NotificationFragment
import com.example.netflixapplication.Fragments.ProfileFragment
import com.example.netflixapplication.Fragments.SearchFragment
import com.example.netflixapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addFragment(HomeFragment(),"HOME")
        var badge = binding.bottomNavigation.getOrCreateBadge(R.id.nav_notification)
        badge.isVisible = true
        badge.number = 24
        badge.backgroundColor = ContextCompat.getColor(this, R.color.red)
        binding.bottomNavigation.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.nav_home -> {
                    addFragment(HomeFragment(), "HOME")
                    true
                }
                R.id.nav_search -> {
                    addFragment(SearchFragment(), "Search")
                    true
                }
                R.id.nav_notification -> {
                    addFragment(NotificationFragment(), "Noti")
                    true
                }
                R.id.nav_profile -> {
                    addFragment(ProfileFragment(), "PROFILE")
                    true
                }

                else -> false
            }
        }

    }

    private fun addFragment(fragment: Fragment, tag: String) {
        var manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.contener, fragment, tag)
        transaction.commit()
    }


}