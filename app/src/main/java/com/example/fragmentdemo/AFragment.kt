package com.example.fragmentdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText


class AFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment cycle","A Fragment: onAttach() is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment cycle","A Fragment: onCreate() is called")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Fragment cycle","A Fragment: onCreateView() is called")

        val view =inflater.inflate(R.layout.fragment_a, container, false)
        val btn :MaterialButton=view.findViewById(R.id.btn_AtoB)
        btn.setOnClickListener {
            val inputText:TextInputEditText=view.findViewById(R.id.fa_inputText)
            val input=inputText.text.toString()

            val bundle=Bundle()
            bundle.putString("data",input)
            val fragB=BFragment()
            fragB.arguments=bundle
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fl_container,fragB).commit()
        }
        return view
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fragment cycle","A Fragment: onViewStateRestored() is called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment cycle","A Fragment: onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment cycle","A Fragment: onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment cycle","A Fragment: onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment cycle","A Fragment: onStop() is called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment cycle","A Fragment: onDestroyView() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment cycle","A Fragment: onDestroy() is called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment cycle","A Fragment: onDetach() is called")
    }
}