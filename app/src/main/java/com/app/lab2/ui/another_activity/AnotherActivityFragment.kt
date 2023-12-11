package com.app.lab2.ui.another_activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.app.lab2.R
import com.app.lab2.TabbedActivity
import com.app.lab2.databinding.FragmentAnotherActivityBinding


class AnotherActivityFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent: Intent = Intent(activity, TabbedActivity::class.java)
        startActivity(intent)
    }
}




