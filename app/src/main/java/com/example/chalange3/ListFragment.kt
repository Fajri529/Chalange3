package com.example.chalange3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplerecyclerviewapp.R
import com.example.simplerecyclerviewapp.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupRecyclerView()
    }

    fun setupToolbar() {
        binding.toolbar.topAppBar.setNavigationIcon(null)
        binding.toolbar.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.changeLayout -> {
                    binding.rvList.layoutManager = GridLayoutManager(activity, 3)
                }
            }
            false
        }
    }

        fun setupRecyclerView(){
        val adapter = LetterAdapter {

        }
        adapter.submitData(alphabets)
        binding.rvList.adapter = adapter
        binding.rvList.layoutManager = LinearLayoutManager(activity)
    }
    companion object {
        const val PARAMS = "PARAMS"
    }

}