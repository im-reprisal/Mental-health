package com.application.mentalhealth.splashandonboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.application.mentalhealth.R
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class ThirdScreen : Fragment(R.layout.fragment_third_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnNext3.setOnClickListener {
            findNavController().navigate(R.id.action_thirdScreen_to_fourthScreen)
        }
    }
}