package com.application.mentalhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setviewPagerAdaptor()
    }

    private fun setviewPagerAdaptor() {
        val pagerAdapter = PagerAdaptor(supportFragmentManager, lifecycle)
        viewPager.setAdapter(pagerAdapter)
        TabLayoutMediator(tabLayout, viewPager
        ) { tab, position ->
            if (position == 0) {
                tab.text = "Sign up"
            }else {
                tab.text = "Log In"
            }
        }.attach()
    }
}