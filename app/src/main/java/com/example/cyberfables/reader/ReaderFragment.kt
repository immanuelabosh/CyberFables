package com.example.cyberfables.reader

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.cyberfables.MainActivity
import com.example.cyberfables.R
import com.example.cyberfables.entities.Fable
import kotlinx.android.synthetic.main.fragment_reader.view.*

class ReaderFragment : Fragment(){
    private val TAG = "ReaderFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_reader, container, false)

        //todo change hardcode
        val fable = (activity as MainActivity).fables[0]

        // Instantiate a ViewPager2 and a PagerAdapter.
        val viewPager = root.readerPager
        // The pager adapter, which provides the pages to the view pager widget.
        val readerAdapter = ReaderAdapter(fable)
        viewPager.adapter = readerAdapter


        // Inflate the layout for this fragment
        return root
    }

    //todo change hardcode
    fun navigateToInteractive() {
        Log.d(TAG, "navigateToInteractive")

        (activity as MainActivity).navController.navigate(R.id.action_readerFragment_to_littleredInteractive1Fragment)
    }


}