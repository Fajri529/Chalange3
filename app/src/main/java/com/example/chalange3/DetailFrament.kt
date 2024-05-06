package com.example.chalange3;

import android.view.LayoutInflater;
import com.example.simplerecyclerviewapp.databinding.FragmentDetailBinding;

class DetailFragment : Fragment(){

private var _binding:FragmentDetailBinding?=null
private val binding get()=_binding!!

        override fun onCreateView(
        inflater:LayoutInflater,container:ViewGroup?,
        savedInstanceState:Bundle?
        ):View?{
        // Inflate the layout for this fragment
        _binding=FragmentDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
        }
        }
