package com.ironical_groundwork.test_task.ui.players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ironical_groundwork.test_task.R
import com.ironical_groundwork.test_task.adapters.PlayersAdapter
import com.ironical_groundwork.test_task.databinding.FragmentPlayersBinding

class PlayersFragment : Fragment() {

    private lateinit var playersViewModel: PlayersViewModel
    private var _binding: FragmentPlayersBinding? = null
    private val adapterPlayers = PlayersAdapter()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        playersViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(PlayersViewModel::class.java)

        _binding = FragmentPlayersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapterPlayers

        when(requireActivity().intent.getIntExtra("sport_id",1))
        {
            1 ->    playersViewModel.basketball.observe(viewLifecycleOwner, Observer {
                adapterPlayers.setData(it)
                adapterPlayers.notifyDataSetChanged()
            })

            2 ->    playersViewModel.boxing.observe(viewLifecycleOwner, Observer {
                adapterPlayers.setData(it)
                adapterPlayers.notifyDataSetChanged()
            })
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}