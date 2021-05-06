package com.example.recyclerviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    //data source
    private val ballList = ArrayList<Balls>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
        //val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, R.layout.fragment_first,container,false)

        binding = FragmentFirstBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        //setup our initial data
        initBallList()
        //configure the recyclerview
        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerview.layoutManager = layoutManager
        val adapter = BallAdapter(ballList) //pass by reference 
        binding.recyclerview.adapter = adapter
        binding.recyclerview.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))  //add a divider line

        return binding.root
    }

    private fun initBallList(){
        ballList.add(Balls("Baseball",R.drawable.baseball))
        ballList.add(Balls("Basketball",R.drawable.basketball))
        ballList.add(Balls("Soccer",R.drawable.soccer))
        ballList.add(Balls("Volleyball",R.drawable.volleyball))
        ballList.add(Balls("Tennis",R.drawable.tennis))
        ballList.add(Balls("Tabletennis",R.drawable.tabletennis))
        ballList.add(Balls("Golf",R.drawable.golf))
        ballList.add(Balls("Bowling",R.drawable.bowling))
        ballList.add(Balls("Football",R.drawable.football))
        ballList.add(Balls("Dodgeball",R.drawable.dodgeball))
        ballList.add(Balls("Badminton",R.drawable.badminton))
        ballList.add(Balls("Other",R.drawable.other))
    }
}