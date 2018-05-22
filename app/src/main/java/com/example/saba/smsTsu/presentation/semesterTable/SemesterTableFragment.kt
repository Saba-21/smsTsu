package com.example.saba.smsTsu.presentation.semesterTable

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.saba.smsTsu.R

class SemesterTableFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_semester_table, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SemesterTableFragment()
    }
}
