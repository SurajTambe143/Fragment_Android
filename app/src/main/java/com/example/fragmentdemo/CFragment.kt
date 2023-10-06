package com.example.fragmentdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment cycle","C Fragment: onAttach() is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment cycle","C Fragment: onCreate() is called")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Fragment cycle","C Fragment: onCreateView() is called")
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fragment cycle","C Fragment: onViewStateRestored() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment cycle","C Fragment: onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment cycle","C Fragment: onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment cycle","C Fragment: onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment cycle","C Fragment: onStop() is called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment cycle","C Fragment: onDestroyView() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment cycle","C Fragment: onDestroy() is called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment cycle","C Fragment: onDetach() is called")
    }

}