package com.example.chalange3.

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simplerecyclerviewapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setToolbar()
        val params = arguments?.getParcelable<Contact>(ListFragment.PARAMS) //'A'
        Log.e("SIMPLEDATASET", params.toString())
        val dataList = params?.let { mutableListOf(params) }
        val adapter = ListContactAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/search?q={$it}"))
            activity?.startActivity(intent)
        }
        dataList?.let { adapter.submitData(dataList) }
        binding.rvListWords.adapter = adapter
        binding.rvListWords.layoutManager = LinearLayoutManager(activity)
    }

    fun setToolbar(){
        binding.toolbar.topAppBar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.toolbar.topAppBar.title = "Detail Content"
        binding.toolbar.topAppBar.menu.clear()
    }
}