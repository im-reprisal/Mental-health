package com.application.mentalhealth.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.application.mentalhealth.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_meditate.*
import kotlinx.android.synthetic.main.fragment_meditate.imaggif
import kotlinx.android.synthetic.main.fragment_meditate.testing
import kotlinx.android.synthetic.main.fragment_sleep.*
import kotlinx.android.synthetic.main.meditatedialgoue.view.*
import kotlinx.android.synthetic.main.meditatedialgoue.view.btnclose
import kotlinx.android.synthetic.main.sleepdialgoue.view.*

class SleepFragment : Fragment(R.layout.fragment_sleep) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        testing.setOnClickListener {
            dialgoue()
        }

        Glide.with(imaggif).load(R.raw.splash).into(imaggif)
    }

    private fun dialgoue() {
        val mDialog = LayoutInflater.from(context).inflate(R.layout.sleepdialgoue, null)
        val mBuilder = AlertDialog.Builder(activity).setView(mDialog)
        val mAlertDialog = mBuilder.show()

        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        mDialog.btnclose.setOnClickListener {
            mAlertDialog.dismiss()
        }

        mDialog.sleepprime.setOnClickListener {
            sleeps.visibility = View.VISIBLE
            testing.visibility = View.INVISIBLE
            imaggif.visibility = View.INVISIBLE
            dummytext.visibility = View.INVISIBLE
            mAlertDialog.dismiss()
            Toast.makeText(activity, "Thank you for being the prime member ", Toast.LENGTH_SHORT).show()
        }
    }

}