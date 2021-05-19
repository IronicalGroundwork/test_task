package com.ironical_groundwork.test_task.ui.gallery

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
import com.ironical_groundwork.test_task.adapters.GalleryAdapter
import com.ironical_groundwork.test_task.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    private var _binding: FragmentGalleryBinding? = null
    private val adapterGallery = GalleryAdapter()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        galleryViewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
                GalleryViewModel::class.java
            )

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = root.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapterGallery

        when(requireActivity().intent.getIntExtra("sport_id",1))
        {
            1 ->    galleryViewModel.basketball.observe(viewLifecycleOwner, Observer {
                adapterGallery.setData(it)
                adapterGallery.notifyDataSetChanged()
            })

            2 ->    galleryViewModel.boxing.observe(viewLifecycleOwner, Observer {
                adapterGallery.setData(it)
                adapterGallery.notifyDataSetChanged()
            })
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}