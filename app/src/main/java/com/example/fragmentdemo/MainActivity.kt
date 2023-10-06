package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("fragment cycle","Activity :onCreate()")

        val btn_a=findViewById<Button>(R.id.btn_A)
        val btn_b=findViewById<Button>(R.id.btn_B)
        val btn_c=findViewById<Button>(R.id.btn_C)

        replaceFragment(AFragment(),0)

        btn_a.setOnClickListener {
            replaceFragment(AFragment(),1)
        }

        btn_b.setOnClickListener {
            replaceFragment(BFragment(),1)
        }
        btn_c.setOnClickListener {
            replaceFragment(CFragment(),1)
        }

    }
    private fun replaceFragment(frag:Fragment,flag:Int){
        val fm=supportFragmentManager
        val ft=fm.beginTransaction()
        if (flag==0) ft.add(R.id.fl_container,frag)
        else ft.replace(R.id.fl_container,frag)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment cycle","Activity :onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment cycle","Activity :onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.d("fragment cycle","Activity :onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment cycle","Activity :onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("fragment cycle","Activity :onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment cycle","Activity :onDestroy()")
    }
}