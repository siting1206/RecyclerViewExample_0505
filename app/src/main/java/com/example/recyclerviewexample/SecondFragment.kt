package com.example.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val args = SecondFragmentArgs.fromBundle(requireArguments())
        binding.textBall.text = args.selectBall
        if(binding.textBall.text == "Baseball"){
            binding.imageBall.setImageResource(R.drawable.baseball_photo)
        }
        else if(binding.textBall.text == "Basketball"){
            binding.imageBall.setImageResource(R.drawable.basketball_photo)
        }
        else if(binding.textBall.text == "Soccer"){
            binding.imageBall.setImageResource(R.drawable.soccer_photo)
        }
        else if(binding.textBall.text == "Volleyball"){
            binding.imageBall.setImageResource(R.drawable.volleyball_photo)
        }
        else if(binding.textBall.text == "Tennis"){
            binding.imageBall.setImageResource(R.drawable.tennis_photo)
        }
        else if(binding.textBall.text == "Tabletennis"){
            binding.imageBall.setImageResource(R.drawable.tabletennis_photo)
        }
        else if(binding.textBall.text == "Golf"){
            binding.imageBall.setImageResource(R.drawable.golf_photo)
        }
        else if(binding.textBall.text == "Bowling"){
            binding.imageBall.setImageResource(R.drawable.bowling_photo)
        }
        else if(binding.textBall.text == "Football"){
            binding.imageBall.setImageResource(R.drawable.football_photo)
        }
        else if(binding.textBall.text == "Dodgeball"){
            binding.imageBall.setImageResource(R.drawable.dodgeball_photo)
        }
        else if(binding.textBall.text == "Badminton"){
            binding.imageBall.setImageResource(R.drawable.badminton_photo)
        }
        else{
            binding.imageBall.setImageResource(R.drawable.other_photo)
        }
        return binding.root
    }
}