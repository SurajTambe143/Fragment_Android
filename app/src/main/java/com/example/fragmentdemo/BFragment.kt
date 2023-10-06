package com.example.fragmentdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

class BFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment cycle","B Fragment: onAttach() is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment cycle","B Fragment: onCreate() is called")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Fragment cycle","B Fragment: onCreateView() is called")
        val view=inflater.inflate(R.layout.fragment_b, container, false)
        val textView: TextView =view.findViewById(R.id.display_text_A)
        val display=arguments?.let {
            it.getString("data")
        }
        textView.text=display.toString()
        return view
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fragment cycle","B Fragment: onViewStateRestored() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment cycle","B Fragment: onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment cycle","B Fragment: onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment cycle","B Fragment: onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment cycle","B Fragment: onStop() is called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment cycle","B Fragment: onDestroyView() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment cycle","B Fragment: onDestroy() is called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment cycle","B Fragment: onDetach() is called")
    }
}