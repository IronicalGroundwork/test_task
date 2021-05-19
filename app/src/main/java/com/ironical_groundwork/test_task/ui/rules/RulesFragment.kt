package com.ironical_groundwork.test_task.ui.rules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ironical_groundwork.test_task.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {

    private lateinit var rulesViewModel: RulesViewModel
    private var _binding: FragmentRulesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rulesViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(RulesViewModel::class.java)

        _binding = FragmentRulesBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val webView: WebView = binding.webViewRules

        when(requireActivity().intent.getIntExtra("sport_id",1))
        {
            1 ->   rulesViewModel.basketball.observe(viewLifecycleOwner, Observer {
                webView.loadData(it,"text/html; charset=UTF-8",  "utf-8")
            })

            2 ->   rulesViewModel.boxing.observe(viewLifecycleOwner, Observer {
                webView.loadData(it,"text/html; charset=UTF-8",  "utf-8")
            })
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}