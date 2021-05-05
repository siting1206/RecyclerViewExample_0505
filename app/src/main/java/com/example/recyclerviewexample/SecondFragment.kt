package com.example.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.recyclerviewexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
       // Inflate the layout for this fragment
       //return inflater.inflate(R.layout.fragment_second, container, false)

       val args = SecondFragmentArgs.fromBundle(requireArguments())
       binding.showBall.text = args.selectBall
       //Toast.makeText(context, "The selection is ${args.selectBall}.", Toast.LENGTH_LONG).show()

       return binding.root
    }
}